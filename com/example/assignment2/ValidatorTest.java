package com.example.assignment2;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class ValidatorTest {

    private Validator Vali = new Validator();
    @Test
    public void test1() {
        assertFalse(Vali.check_password("PASSWORD") ) ;
    }
    @Test
    public void test2() {
        assertTrue((Vali.check_password("huashfdsf2hWS")));
    }
    @Test
    public void test3() {
        assertTrue((Vali.check_password("Hsdascd9999")));
    }
    @Test
    public void test4() {
        assertFalse((Vali.check_password("sdfhsuzhfW@2")));
    }
    @Test
    public void test5() {
        assertTrue((Vali.check_password("VJSDUwhyef2f")));
    }
}



