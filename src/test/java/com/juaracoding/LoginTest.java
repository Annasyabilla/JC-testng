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

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    Login login;

    @BeforeClass
    public void setUp() {
        login = new Login();
    }

    //test positive
    @Test
    public void testLoginPositive() {
        boolean actual = Login.loginAkun("anna@gmail.com","inipassword");
        Assert.assertTrue(actual);
    }

    //test negative
    @Test
    public void testLoginNegative() {
        boolean actual = Login.loginAkun("annamail.com","inipssword");
        Assert.assertFalse(actual);
    }

    //Contoh menggunakan if else dan method string
    @Test
    public void testLoginStringPositive() {
        String actual = Login.setLogin2("anna@gmail.com","inipassword");
        String expected = "Login berhasil";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testLoginStringNegative() {
        String actual = Login.setLogin2("annagmail.com","inipasword");
        String expected = "Login gagal";
        Assert.assertEquals(actual,expected);
    }

}
