package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/10/2024 4:47 PM
@Last Modified 10/10/2024 4:47 PM
Version 1.0
*/

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calc;

    @BeforeClass //instance object baru bisa dimasukkan ke dalam sini
    public void setUp() {
        calc = new Calculator(); //memanggil class Calculator
    }

    @Test
    public void testAdd() {

        //khusus return, void tidak bisa
        //Melakukan test berdasarkan masing masing fungsi(fungsi yang membalikkan nilai(return))


        //menguji add
        int actual = calc.add(1, 2);
        int expected = 3;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testSubtract() {
        //menguji subtract
        int actual2 = calc.subtract(2, 1);
        int expected2 = 1;
        Assert.assertEquals(actual2, expected2);
    }

}
