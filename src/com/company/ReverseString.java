package com.company;

public class ReverseString {

    String str = "We have a large inventory of things in our warehouse falling in "
            + "the category:apperal and the slightly "
            + "more in demand category:makeup along with the category:furniture and ... .";

    public void printInReverseOrder(String word) {
        for (int i = word.length() - 1; i >=0; i--) {
            String reverse = "";
            reverse = reverse + word.charAt(i);
            System.out.println(reverse);
        }
    }
}
