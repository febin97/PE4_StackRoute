package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsStringTest {
    SortWordsString S;
    @Before
    public void setUp() throws Exception {
        S = new SortWordsString();
    }

    @After
    public void tearDown() throws Exception {
        S = null;
    }

    @Test
    public void sortWordsString_CorrectInput_CorrectOutput() {
        List<String> str=new ArrayList<String>(
                Arrays.asList(
                        "America", "Australia", "England", "India", "Pakistan"
                )                                                   // return Sorted List
        );
        assertEquals("Sorting is not correct",str,S.sortWordsString("India Australia America England Pakistan"));
        assertEquals("Sorting is not correct",str,S.sortWordsString("India Australia America Pakistan England"));
    }
    @Test
    public void sortWordsString_CorrectInput_CorrectOutputFailure() {
        List<String> str=new ArrayList<String>(
                Arrays.asList(
                        "America", "Australia", "England", "Pakistan","India"
                )                                                   // return Sorted List
        );
        assertEquals("Sorting is not correct",str,S.sortWordsString("India Australia America England Pakistan"));
        assertNotNull("Null returned!!!",S.sortWordsString("India Australia America Pakistan England"));
    }
    @Test(expected = InputMismatchException.class)
    public void sortWordsString_InCorrectInput_ThrowsInputMismatchException(){
        S.sortWordsString("");
        S.sortWordsString(null);
    }
}