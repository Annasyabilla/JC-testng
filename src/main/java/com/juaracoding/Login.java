package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/11/2024 10:28 PM
@Last Modified 10/11/2024 10:28 PM
Version 1.0
*/

public class Login {

    static boolean loginAkun(String email, String password) {
        return email.equals("anna@gmail.com") && password.equals("inipassword");
    }

    //Contoh menggunakan if else dan method string
    static String setLogin2(String email, String password) {
        if (email.equals("anna@gmail.com") && password.equals("inipassword")){
            return "Login berhasil";
        } else {
            return "Login gagal";
        }
    }
}
