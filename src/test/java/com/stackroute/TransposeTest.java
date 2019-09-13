package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose T;
    @Before
    public void setUp() throws Exception {
        T = new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        T = null;
    }

    @Test
    public void getTranspose_CorrectInput_CorrectOutput() {
        assertEquals("Transpose not done properly","a kciuq nworb xof spmuj revo eht yzal god",
                                                                T.getTranspose("a quick brown fox jumps over the lazy dog"));
        assertEquals("Transpose not done properly","malayalam",
                                                    T.getTranspose("malayalam"));
    }
    @Test
    public void getTranspose_CorrectInput_CorrectOutputFailure() {
        assertNotEquals("Transpose not done properly","a quick nworb xof spmuj revo eht yzal god",
                T.getTranspose("a quick brown fox jumps over the lazy dog"));
        assertNotNull("Transpose not done properly",
                T.getTranspose("aaaaaaa"));
    }
    @Test
    public void getTranspose_NoInput_ReturnNull() {

        assertNull("Transpose not done properly",
                T.getTranspose(""));
    }


}