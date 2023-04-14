package Beispiele;

import java.util.HashMap;


public class WordCount {
    private String text;

    public WordCount(String text, HashMap<String, Integer> wordCount) {
        this.text = text;
        this.wordCount = wordCount;
    }

    private HashMap<String, Integer> wordCount = new HashMap<>();

    public WordCount(String text) {
        this.text = text;
    }

    public void convertTextToMap() {
        String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (wordCount.get(splitText[i]) == null) {
                wordCount.put(splitText[i], 1);
            } else {
                wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
            }
        }

    }

    public String getText() {
        return text;
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }
}
