package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMultipleOccurrences {
    public String getWordMultipleOccurrences(String str,String word){
        if (str=="" || word=="")
            return null;
        Pattern pattern = Pattern.compile(word);
        Matcher m = pattern.matcher(str);
        int flag=-1;
        String strAns = "";
        while (m.find()){
            flag=1;
            strAns += "Found at: "+m.start()+" - "+m.end()+"\n";
        }
        if (flag==-1)
            return "Not Found\n";
        return strAns;
    }
}
