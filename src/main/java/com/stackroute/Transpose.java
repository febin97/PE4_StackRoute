package com.stackroute;

public class Transpose {
    public String getTranspose(String str){
        if (str=="")
            return null;
        String strAns = new String("");
        String[] strArr = str.split(" ");
        StringBuilder toRev ;
        for (int i=0;i<strArr.length;i++){
            toRev = new StringBuilder();
            toRev.append(strArr[i]);
            toRev.reverse();
            strArr[i] = new String();
            strArr[i] = toRev.toString();
            strAns += strArr[i]+" ";
        }
        return strAns.trim();
    }
}
