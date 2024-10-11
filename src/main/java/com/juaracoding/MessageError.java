package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/11/2024 9:49 PM
@Last Modified 10/11/2024 9:49 PM
Version 1.0
*/

public class MessageError {

    //method pada boolean
    public boolean textMessage(String message){
        return message.equals("Invalid credentials");
    }

    public boolean textMessage2(String message){
        return message.contains("Invalid");
    }
}
