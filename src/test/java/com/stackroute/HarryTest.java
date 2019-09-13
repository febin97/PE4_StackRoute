package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {
    Harry H;
    @Before
    public void setUp() throws Exception {
        H = new Harry();
    }

    @After
    public void tearDown() throws Exception {
        H = null;
    }

    @Test
    public void isHarryHere_CorrectInput_CorrectOutput() {
        assertTrue("Wrong Function",H.isHarryHere("Hello, i am Harry"));
        assertTrue(H.isHarryHere("Hello i am harry"));
        assertTrue(H.isHarryHere("iamharry"));
    }
    @Test
    public void isHarryHere_CorrectInput_CorrectOutputFailure() {
        assertFalse("Wrong Function",H.isHarryHere("Hello, i am Henry"));
        assertFalse(H.isHarryHere("Hello i am febin"));
        assertFalse(H.isHarryHere("iamfebin"));
    }
    @Test
    public void isHarryHere_NoInput_ReturnFalse(){
        assertFalse(H.isHarryHere(""));
        assertFalse(H.isHarryHere(null));
    }
}