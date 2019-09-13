package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordMultipleOccurrencesTest {
    WordMultipleOccurrences W;
    @Before
    public void setUp() throws Exception {
        W = new WordMultipleOccurrences();
    }

    @After
    public void tearDown() throws Exception {
        W = null;
    }

    @Test
    public void getWordMultipleOccurrences() {
        assertEquals("Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 – 29\n",W.getWordMultipleOccurrences("She sells seashells by the seashore","se"));
        assertEquals("Found at: 4 - 7\n",W.getWordMultipleOccurrences("She sells seashells by the seashore","sel"));
        assertEquals("Not Found\n",W.getWordMultipleOccurrences("She sells seashells by the seashore","select"));
    }
    @Test
    public void getWordMultipleOccurrencesFailure() {
        assertEquals("Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 – 28\n",W.getWordMultipleOccurrences("She sells seashells by the seashore","se"));
        assertNotNull(W.getWordMultipleOccurrences("She sells seashells by the seashore","select"));
    }
    @Test
    public void getWordMultipleOccurrences_WrongInput_ReturnNotFound(){
        assertEquals("Not Found\n",W.getWordMultipleOccurrences("","se"));
        assertEquals("Not Found\n",W.getWordMultipleOccurrences("hello i am",""));

    }
}