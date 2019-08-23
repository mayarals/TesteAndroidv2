package com.example.testeaccenture;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean emailValidation(String email) {

        boolean isEmailValid = false;
        if (email != null && email.length() > 0) {

            String regexEmail = "\\A[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@\n" +
                    "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\z";
            Pattern pattern = Pattern.compile(regexEmail, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                isEmailValid = true;
            }
        }
        return isEmailValid;
    }

//    public static boolean cpfValidation (String cpf) {
//
//    }

    public static boolean passwordValidation (String password) {
        if (password.length() < 6) return false;

        boolean numero = false;
        boolean simbolo = false;
        boolean maiuscula = false;
        boolean minuscula = false;

        for (char caracter : password.toCharArray()) {
            if (caracter >= '0' && caracter <= '9') {
                numero = true;
            } else if (caracter >= 'A' && caracter <= 'Z') {
                maiuscula = true;
            } else if (caracter >= 'a' && caracter <= 'z') {
                minuscula = true;
            } else {
                simbolo = true;
            }
        }
        return numero && maiuscula && minuscula && simbolo;
    }

}