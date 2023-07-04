package com.sukesh.functional.string;

import com.sukesh.functional.algorithms.string.ReverseWordsInAString;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringTest {

    private ReverseWordsInAString uut = new ReverseWordsInAString();

    @Test
    public void itTestsTheWordsAreINReverseOrderWhenEmpty(){
        String a = "";
        String reversed = uut.reverseWordsInAString(a);
        Assert.assertEquals(reversed ,"");
    }

    @Test
    public void itTestsTheWordsAreINReverseOrder(){
        String a = "Coffee is amazing  ";
        String reversed = uut.reverseWordsInAString(a);
        String expected = "amazing is Coffee";
        Assert.assertEquals(expected ,reversed);
    }

    @Test
    public void itTestsTheWordsAreINReverseOrderWithSpecialChars(){
        String a = "Coffee is amazing I !";
        String reversed = uut.reverseWordsInAString(a);
        String expected = "! I amazing is Coffee";
        Assert.assertEquals(expected ,reversed);
    }

    @Test
    public void itTestsTheWordsAreINReverseOrderWithSpecialCharsEven(){
        String a = "Coffee is amazing and good !";
        String reversed = uut.reverseWordsInAString(a);
        String expected = "! good and amazing is Coffee";
        Assert.assertEquals(expected ,reversed);
    }
}
