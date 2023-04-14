package Beispiele;

import java.util.Arrays;

public class WordCountMain {
    public static void main(String[] args) {

        String str = "Hallo Welt";
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo Welt Hallo, hier";
        WordCount wordCount = new WordCount(str2);
        wordCount.convertTextToMap();
        System.out.println(wordCount.getWordCount());



    }
}
