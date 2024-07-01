package chapter8; // Chapter 8 Homework

import java.util.Scanner;

public class PasswordValidator {

    private static final Scanner scanner = new Scanner(System.in);

    // requirements
    private static final String user = "username";
    private static final String old = "OldPassword";
    private static final int length = 8;
    private static String checkError = "";

    public static void main(String[] args) {
        var password = buildPassword();

        if (checkPassword(password)) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Please choose another password!");
        }
    }

    public static String buildPassword() {
        System.out.println("Make a password that isn't your old password 'OldPassword', or your username 'username'.");
        System.out.println("It also must be at least 8 characters long, contain an uppercase letter, and contain a special character.");

        return scanner.next();
    }

    public static boolean checkPassword(String pass) {
        if (checkLength(pass) && checkUppercase(pass) && checkSpecial(pass) && checkUser(pass) && checkOld(pass)) {
            return true;
        } else {
            System.out.println(checkError);
            return false;
        }
    }

    public static boolean checkLength(String pass) {
        int passLength = pass.length();

        if (passLength == length || passLength > length) {
            return true;
        } else {
            checkError = "Your password must be at least 8 characters";
            return false;
        }
    }

    public static boolean checkUppercase(String pass) {
        int passLength = pass.length();
        boolean uppercase = false;

        uppercase = !pass.equals(pass.toLowerCase());

        if (!uppercase) {
            checkError = "Your password must have an uppercase letter";
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkSpecial(String pass) {
        int passLength = pass.length();
        boolean special = false;

        special = !pass.matches("[a-zA-Z0-9 ]*");

        if (special) {
            return true;
        } else {
            checkError = "Your password doesn't include a special character";
            return false;
        }
    }

    public static boolean checkUser(String pass) {
        if (!(pass.equals(user))) {
            return true;
        } else {
            checkError = "Your password is the same as your username.";
            return false;
        }
    }

    public static boolean checkOld(String pass) {
        if (!(pass.equals(old))) {
            return true;
        } else {
            checkError = "Your password is the same as your old password";
            return false;
        }
    }
}
