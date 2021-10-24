package com.company.oopLocals;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class Local {
    public static void main(String[] args) {
        java.util.Locale locale = java.util.Locale.getDefault();
        System.out.println(locale.getLanguage() +" "+ locale.getCountry());
        System.out.println(locale.getDisplayLanguage() +" "+ locale.getDisplayCountry());
        double d = 3;
        String s = String.format("%5.2f",d);
        System.out.println(s);
        java.util.Locale locale2 = new java.util.Locale("us","US");
        s = String.format(locale2,"%5.2f",d);
        System.out.println(s);
        //////////////////////////////////////////////
        Properties props = System.getProperties();
        for (Object key : props.keySet())
          //  System.out.println(key +" "+ props.getProperty((String) key));
            if (key.equals("user.country"))
                System.out.println(key+": "+props.getProperty((String) key));
        ///////////////////////////////////////////////
        Map<String, String> map = System.getenv();
        for (String i : map.keySet())
            // if (key.equals("JAVA_HOME"))
            System.out.println(i+" "+map.get(i));
    }
}

