package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar obj ;
    @Before
    public void setUp() throws Exception {
        obj = new ReplaceChar();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void replaceChars_CorrectInput_CorrectOuput() {
        assertEquals("Check your function, replacement not done properly","faity fry",obj.replaceChars("daily dry"));
        assertEquals("Check your function , replacement not done properly","ftftftf",obj.replaceChars("dldldld"));
    }
    @Test
    public void replaceChars_CorrectInput_CorrectOuputFailure() {
        assertNotEquals("Check your function, replacement not done properly","faity fryqw",obj.replaceChars("daily dry"));
        assertNotEquals("Check your function , replacement not done properly","ftftftfww",obj.replaceChars("dldldld"));
        assertNotNull("Check your function , Null returned!!!",obj.replaceChars("Delhi belly"));
    }
    @Test(expected = InputMismatchException.class)
    public void replaceChars_InCorrectInput_ThrowInputMisMatchException(){
        obj.replaceChars("");
        obj.replaceChars(null);
    }
}