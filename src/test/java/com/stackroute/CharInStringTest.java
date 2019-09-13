package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class CharInStringTest {

    CharInString obj;
    @Before
    public void setUp() throws Exception {
        obj = new CharInString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void charFreqString_CorrectInput_CorrectOutput() {
        assertEquals("Check your function, not returning correct Count value",10,obj.charFreqString("Java is java again java again",'a'));
        assertEquals("Check your function, not returning correct Count value",0,obj.charFreqString("Java is Simple, valare simple aanu",'z'));
    }

    @Test
    public void charFreqString_CorrectInput_CorrectOutputFailure() {
        assertEquals("Check your function, not returning correct Count value",2,obj.charFreqString("Java is Simple, valare simple aanu",'z'));
    }

    @Test(expected = InputMismatchException.class)
    public void charFreqString_InCorrectInput_ThrowInputMisMatchException() {
        obj.charFreqString("",'a');
        obj.charFreqString("Abcd",'\0');
    }
}