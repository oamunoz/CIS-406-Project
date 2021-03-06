package cis406.security;

import cis406.Database;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class User {

    int securityLevel;
    String fName;
    String lName;
    String password = "";
    String username;
    String security_answer = "";
    String security_question = "";
    int question_id;
    int status;
    int id;
    boolean firstLogon;

    public User(int securityLevel, String fName, String lName,
            String password, String username, int status) {
        this.securityLevel = securityLevel;
        this.fName = fName;
        this.lName = lName;
        this.password = password;
        this.username = username;
        this.status = status;

    }

    public User() {

    }

    /**
     * Create a new user, all of the user's info will be loaded from the database.
     * @param username The username you want to load
     */
    public User(String username) {
        this.username = username;
        try {
            ResultSet rs = cis406.Database.execute("select * from users where user_name = '" + username + "'");
            while (rs.next()) {
                this.securityLevel = rs.getInt("clearance_id");
                this.fName = rs.getString("first_name");
                this.lName = rs.getString("last_name");
                this.password = rs.getString("password");
                this.status = rs.getInt("status_id");
                this.question_id = rs.getInt("question_key_id");
                this.security_answer = rs.getString("answer");

                // convert 1 or 0 to boolean that represents if it would be their first logon
                if (rs.getInt("has_logged_on") == 0) {
                    firstLogon = true;
                }

                // set their security question
                ResultSet question = cis406.Database.execute("select question from question_key where question_key_id = " + question_id);
                while (question.next()) {
                    security_question = question.getString("question");
                }
            }
        } catch (Exception e) { System.out.println(e.getMessage()); };
    }

    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return id;
    }

    public void setUserID(int id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean setUsername(String username) {
        String email = ".+@.+\\.[a-z]+";
        if (username.matches(email)) {
            this.username = username;
            return true;
        }
        else {
            return false;
        }
    }

    public int getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getSecurityAnswer() {
        return security_answer;
    }

    public void setSecurityAnswer(String answer) {
        this.security_answer = answer;
    }

    public String getSecurityQuestion() {
        return security_question;
    }

    public void setSecurityQuestionID(String question) {
        try {
            ResultSet rs = Database.execute("select question_key_id from question_key where question = '" + question + "'");

            while (rs.next()) {
                int q_id = rs.getInt("question_key_id");
                this.question_id = q_id;
            }
        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
        }
    }

    public void setPassword(char[] password) {
        String strPassword = "";
        for (int i = 0; i < password.length; i++){
            strPassword += password[i];
        }
        String hash = "";
        try {
            hash = byteArrayToHexString(computeHash(strPassword));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.password = hash;
    }

    public boolean setAndCheckPassword(char[] password1, char[] password2) {
        String strPassword1 = "";
        for (int i = 0; i < password1.length; i++){
            strPassword1 += password1[i];
        }

        String strPassword2 = "";
        for (int i = 0; i < password2.length; i++){
            strPassword2 += password2[i];
        }

        if (!(strPassword1.equals(strPassword2))) {
            JOptionPane.showMessageDialog(null, "The passwords you entered do not match.");
            return false;
        }

        
        int requiredLength = cis406.MainApp.settings.getPassword_length();

        // Make sure password meets requirements
        String lowercase = "((?=.*[a-z]).{" + requiredLength + ",})";
        String uppercase = "((?=.*[A-Z]).{" + requiredLength + ",})";
        String numbers = "((?=.*\\d).{" + requiredLength + ",})";
        String complexchars = "((?=.*[\\W]).{" + requiredLength + ",})";
        Integer complexityCount = 0;

        if (strPassword1.matches(lowercase)) { complexityCount++; }
        if (strPassword1.matches(uppercase)) { complexityCount++; }
        if (strPassword1.matches(numbers)) { complexityCount++; }
        if (strPassword1.matches(complexchars)) { complexityCount++; }

        if (complexityCount < 3)
        {
            JOptionPane.showMessageDialog(null, "Change your password, it doesn't meet CSU Pomona's password complexity requirements:\n\n" +
                                                "Your password should contain 3 of the following: a lowercase letter, uppercase letter, number, or special character (@#$ etc).\n" +
                                                "Your password should be at least " + requiredLength + " characters long.");
            return false;
        }

        // fail if password equals username
        if (strPassword1.equals(username)) {
            JOptionPane.showMessageDialog(null, "Your password cannot match your username");
            return false;
        }
        
        String hash = byteArrayToHexString(computeHash(strPassword1));

        if (password.equals(hash)) {
            JOptionPane.showMessageDialog(null, "Your new password cannot be the same as your current password");
            return false;
        }

        this.password = hash;
        return true;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public boolean setfName(String fName) {
        String firstName = "[A-Z][a-zA-Z]*";

        if (fName.matches(firstName)) {
            this.fName = fName;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setlName(String lName) {
        String lastName = "[A-Z][a-zA-Z]*";

        if (lName.matches(lastName)) {
            this.lName = lName;
            return true;
        }
        else {
            return false;
        }
    }
    
    // </editor-fold>

    /**
     * Use this method to create a new user in the database
     * after using the set methods in this class to add user
     * information
     */
    public void addUser() {
        if (!exists(username)) {
            try {
                Database.executeWrite("INSERT INTO users (first_name, user_name, status_id, last_name, clearance_id, password) VALUES ('" + fName + "', '" + username + "', " + 1 + ", '" + lName + "', " + securityLevel + ", '" + byteArrayToHexString(computeHash("P@ssw0rd")) + "')");
                SecurityLog.addEntry("User created: " + username + ".");
                JOptionPane.showMessageDialog(null, "User created successfully.");
            } catch (Exception e) {
                System.out.println("Failed to add the user");
                System.out.println(e.getMessage());
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Username already exists.");
        }
    }

    /**
     * Update row in the database for the user you just instantiated
     */
    public void updateUser() {
            Database.executeWrite("UPDATE users SET password = '"
                    + password + "', status_id = " + status + ", first_name = '" + fName
                    + "', last_name = '" + lName + "', clearance_id = " + securityLevel
                    + ", question_key_id = " + question_id + ", answer = '" + security_answer + "' WHERE user_name = '" + username + "'");
            SecurityLog.addEntry("Password and user information updated for " + username + ".");
    }

    /**
     * Update password and security question and
     * answer after a user logs in for the first time
     */
    public void firstLoginUpdate() {
            Database.executeWrite("UPDATE users SET password = '"
                    + password + "', status_id = " + status + ", first_name = '" + fName
                    + "', last_name = '" + lName + "', clearance_id = " + securityLevel
                    + ", question_key_id = " + question_id + ", answer = '" + security_answer + "', has_logged_on = 1 WHERE user_name = '" + username + "'");
            SecurityLog.firstLoginEntry(username);
    }

    /**
     * Checks if a user has ever logged on
     * @param username Username to check
     * @return Boolean that represents whether they have ever logged on
     */
    public static boolean getFirstLogon(String username) {
        boolean firstLogon = false;

        if (exists(username)) {
            try {
                ResultSet rs = Database.execute("select has_logged_on from users where user_name = '" + username + "'");

                while (rs.next()) {
                    if (rs.getInt("has_logged_on") == 0) {
                        firstLogon = true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Failed to add the user");
                System.out.println(e.getMessage());
            }
        }
        return firstLogon;
    }

    /**
     * Disable or enable a user (you should never delete a user)
     * @param username The user_name in the users database that you want to change the status of
     * @param value 0 for disable, 1 for enable, 2 for disabled for too many unsuccessful login attempts
     */
    public static void changeStatus(String username, int value){
        Database.executeWrite("update users set status_id = " + value + " where user_name = '" + username + "'");
    }

    /**
     * Attempt to login with a username and password, result is returned as boolean
     * @param username The username you want try to login with
     * @param password The password you want to try to login wtih
     * @return True for success, false for failure
     */
    public static boolean login(String username, String password) {
        String hash = "";
        Boolean result = false;

        if (User.getFailedLogins(username) > cis406.MainApp.settings.getLoginAttempts() - 1){
            return false;
        }

        try {
            hash = byteArrayToHexString(computeHash(password));
            Database db = new Database("users");
            db.and("user_name", username);
            db.and("password", hash);
            ResultSet rs = db.select();
            while (rs.next()) {
                if (!(User.getStatus(username) == 1)) {
                    return false;
                }
                result = true;
                User.resetFailedLogons(username);
            }
        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Returns an integer that represents the security level of the account
     * @param username The username to look up
     * @return 0 for administrator, 1 for coordinator, 2 for assistant
     */
    public static int getSecurityClearance(String username){
        int clearance = 0;

        try
        {
            ResultSet rs = Database.execute("select clearance_id from users where user_name = '" + username + "'");
            while (rs.next())
            {
                clearance = rs.getInt("clearance_id");
            }

        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
        }

        return clearance;
    }

    /**
     * Update database for a failed login
     * @param username The username of the user that failed to login
     */
    public static void failedLogin(String username){
        SecurityLog.failedLoginEntry(username);
        int failedLogins = getFailedLogins(username) + 1;
        int allowedAttempts = cis406.MainApp.settings.loginAttempts;

        if (failedLogins < allowedAttempts){
        Database.executeWrite("update users set failed_logon_attempts = " + failedLogins + " where user_name = '" + username + "'");
        JOptionPane.showMessageDialog(null, "You have " + failedLogins + " failed logins, after " + allowedAttempts + " your account will be disabled");
        }
        else {
            Database.executeWrite("update users set failed_logon_attempts = " + failedLogins + "where user_name = '" + username + "'");
            User.changeStatus(username, 2);

            if (failedLogins == allowedAttempts){
                SecurityLog.addEntry("User (" + username + ") disabled for failed logon attempts (" + failedLogins + ").");
            }
            
            JOptionPane.showMessageDialog(null, "You have " + failedLogins + " failed login attempts and your account has been disabled, use the 'RECOVER PASSWORD' button on the login screen.");
        }
    }

    /**
     * Returns amount of consecutive failed logins by a user
     * @param username The user whose failed logins you want to look up
     * @return The number of times a user has failed to login in a row
     */
    public static int getFailedLogins(String username){
        int failedLogonAttempts = 0;
        try
        {
            ResultSet rs = Database.execute("select failed_logon_attempts from users where user_name = '" + username + "'");
            while (rs.next())
            {
                failedLogonAttempts = rs.getInt("failed_logon_attempts");
            }

        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
        }

        return failedLogonAttempts;
    }
    /**
     * Reset the number of consecutive failed logins a user has made
     * @param username The username to reset the failed login count for
     */
    public static void resetFailedLogons(String username) {
        Database.executeWrite("update users set failed_logon_attempts = 0 where user_name = '" + username + "'");
    }

    /**
     * Check if a user_name is present in the users table
     * @param username The user_name in the users table you want to check for
     * @return Returns true or false based on whether the user exists
     */
    public static boolean exists(String username){
        boolean userExists = false;
        try
        {
            ResultSet rs = Database.execute("select users_id from users where lower(user_name) = '" + username.toLowerCase() + "'");
            while (rs.next())
            {
                userExists = true;
            }
        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
        }

        return userExists;
    }

    /**
     *
     * @param username The username you want to look up the status for
     * @return Returns an integer for a users status.  0 for disabled, 1 for
     * enabled, 2 for disabled because of unsuccessful login attempts
     */
    public static int getStatus(String username) {
        try
        {
            ResultSet rs = Database.execute("select status_id from users where user_name = '" + username + "'");
            while (rs.next())
            {
                int status = rs.getInt("status_id");
                if (status == 2) {
                    return 2;
                }
                else if (status == 1) {
                    return 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Could not execute query");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /**
     * Change a users password after creating a new user object and setting username and password
     */
    public void recoverPassword() {
        Database.executeWrite("update users set password = '" + password + "' where user_name = '" + username + "'");
    }

    /**
     * For hashing a user password before storing it in the database.
     * Returns the byte array of a password in string form
     * @param x The password to be hashed, in string form
     * @return The byte array of a password
     */
    public static byte[] computeHash(String x) {
        java.security.MessageDigest d = null;

        try{
            d = java.security.MessageDigest.getInstance("SHA-1");
            d.reset();
            d.update(x.getBytes());
        }
        catch (Exception e) { System.out.println(e.getMessage()); }
        
        return d.digest();
    }

    /**
     * Returns a hashed password in string format
     * @param b The byte array to be hashed
     * @return A string of a password hash
     */
    public static String byteArrayToHexString(byte[] b) {
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
}
