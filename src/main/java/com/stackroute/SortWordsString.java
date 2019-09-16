package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

public class SortWordsString {
    public List<String> sortWordsString(String str){
        if (str==null || str=="")
            throw new InputMismatchException();
        String[] strArr = str.split(" ");
        List<String> strList = new ArrayList<>();
        for (int i=0;i<strArr.length;i++){
            strList.add(strArr[i]);
        }
        Collections.sort(strList);
        return strList;
    }
}
