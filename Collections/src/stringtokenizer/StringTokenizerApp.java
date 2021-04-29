package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {

    public static void main(String[] args) {
        String fullName = "Farhan Tanvir: Utshaw";

        StringTokenizer stringTokenizer = new StringTokenizer(fullName, ":");

        System.out.println(stringTokenizer.countTokens()); // total tokens: 2
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("---------------------------------------------------------");

        // better to use split method
        String[] nameSplit = fullName.split(":");
        System.out.println(nameSplit.length);
        for(String name: nameSplit) {
            System.out.println(name);
        }
    }
}
