package com.example.assignment2;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class ValidatorTest {

    private Validator Vali = new Validator();
    @Test
    public void test1() {
        assertFalse(Vali.check_password("PASSWORD") ) ;
    }
    @Test
    public void test2() {
        assertFalse((Vali.check_password("26233")));
    }
    @Test
    public void test3() {
        assertFalse((Vali.check_password("password")));
    }
}



