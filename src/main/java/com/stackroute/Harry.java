package com.stackroute;

public class Harry {
    public boolean isHarryHere(String str){
       if(str==""||str==null)
           return false;
       return str.toLowerCase().contains("harry");
    }
}
