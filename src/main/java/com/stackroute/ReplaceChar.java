package com.stackroute;

import java.util.InputMismatchException;

public class ReplaceChar {
    public String replaceChars(String str){
        if(str=="" || str==null)
            throw new InputMismatchException();
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i] == 'd'){
                charArr[i] = 'f';
            }else if(charArr[i] == 'l')
                charArr[i] = 't';
        }
        str = new  String(charArr);
        return str;
    }
}
