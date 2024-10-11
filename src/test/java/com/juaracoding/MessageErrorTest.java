package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/11/2024 9:55 PM
@Last Modified 10/11/2024 9:55 PM
Version 1.0
*/

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MessageErrorTest {
    MessageError messageError;

    @BeforeClass
    public void setUp() {
        messageError = new MessageError();
    }

    @Test
    public void testTxtMessageError() {
        boolean actual = messageError.textMessage("Invalid credentials");
        Assert.assertTrue(actual);
    }

    @Test
    public void testTxtMessageError2() {
        boolean actual = messageError.textMessage("Invlid credentials");
        Assert.assertFalse(actual); //jika ingin hasilnya salah
    }

    @Test
    public void testTxtMessageError3() {
        boolean actual = messageError.textMessage2("Invalid credentials");
        Assert.assertTrue(actual);
    }
}
