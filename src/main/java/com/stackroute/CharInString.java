package com.stackroute;

import java.util.InputMismatchException;

public class CharInString {
    public int charFreqString(String str,char ch){
        if(str==null || str=="" || ch=='\0')
            throw new InputMismatchException();
        return str.length()-str.replaceAll(String.valueOf(ch),"").length();
    }
}
