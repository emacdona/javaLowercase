package javaLowercase;

import java.util.Locale;

public class App {

    public static final String CAPITAL_ESZETT = "\u1E9E";
    
    public static void main(String[] args) {
        System.out.println(CAPITAL_ESZETT);
        System.out.println(CAPITAL_ESZETT.toLowerCase(new Locale("de", "DE")));
        System.out.println(CAPITAL_ESZETT.toLowerCase(new Locale("de", "CH")));
    }
}
