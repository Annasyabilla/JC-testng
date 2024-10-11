package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/10/2024 5:45 PM
@Last Modified 10/10/2024 5:45 PM
Version 1.0
*/

import org.testng.annotations.*;

public class ProcedureTest {
    //macam-macam anotasi
    
    @BeforeClass
    public void setUp() {
        System.out.println("Before Class");
        //akan dijalankan sekali paling awal sebelum melakukan testing
        //biasanya untuk instance object baru contoh membuka browser
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Before Method");
        //akan menjalankan sebanyak jumlah method test yang ada sebelumnya
        //untuk membaca scenario test
    }

    @Test (priority = 2) //"enable = false" untuk skip test
    public void testone() {
        System.out.println("Test");
    }

    @Test(priority = 1) //mengatur urutaan
    public void testtwo() {
        System.out.println("Test2");
    }

    @AfterMethod
    public void aftreMethod() {
        System.out.println("After Method");
        //akan menjalankan  sebanyak jumlah method test yang ada setelahnya
        //menyimpan screenshot setelah test
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
        //akan dijalankan sekali paling akhir setelah melakukan testing
        //biasanya untuk menutup browser
    }
}
