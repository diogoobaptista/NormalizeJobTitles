package main.java.jobs;

import java.util.Arrays;
import java.util.List;

public class Job {

    public double matchScore = 0;

    public void countScore(String [] inputArray, List<String> keywordsToSearch, double toBeIncrement) {
        double result = 0;
        for (String input : inputArray) {
            if(keywordsToSearch.contains(input.toUpperCase())) {
                result += toBeIncrement;
            }
        }
        matchScore = result;
    }

    public String getNormalizeJob() {
        return "No Job Found";
    }

    public List<String> getKeywords(String keyword){
        String [] keyWords = keyword.split(" ");
        for (int i = 0; i < keyWords.length; i++) {
            String auxKeyword = keyWords[i].toUpperCase();
            keyWords[i] = auxKeyword;
        }
        return Arrays.stream(keyWords).toList();
    }
}
