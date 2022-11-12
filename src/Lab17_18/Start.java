package Lab17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) {
        String reg ="[a-z][A-Z]:[a-z][A-Z]:[a-z][A-Z]:\\d{2}:\\d{2}:\\d{2}";


        System.out.println(Pattern.matches(reg,"aE:dC:cA:56:76:54"));
        System.out.println(Pattern.matches(reg,"01:23:45:67:89:Az"));
        System.out.println(Pattern.matches(reg,"aE:dC:cA:"));
        System.out.println(Pattern.matches(reg,"aE:dC:cA:56:76:54:cA:56"));
        System.out.println(Pattern.matches(reg,"aEdCcA567654cA56"));

    }
}
