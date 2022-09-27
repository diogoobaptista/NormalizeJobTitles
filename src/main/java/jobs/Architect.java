package main.java.jobs;

import java.util.List;

public class Architect extends Job {

    private final String NORMALIZE_JOB = "Architect";

    public String getNormalizeJob() {
        if (matchScore > 0 ){
            return NORMALIZE_JOB;
        } else {
            return super.getNormalizeJob();
        }
    }

    public Architect(String[] arrayInput) {
        List<String> keyWords = super.getKeywords(NORMALIZE_JOB);
        super.countScore(arrayInput, keyWords, 1.0);
    }
}
