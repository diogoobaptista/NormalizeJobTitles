package main.java.jobs;

import java.util.List;

public class SoftwareEngineer extends Job {

    private final String NORMALIZE_JOB = "Software engineer";


    public String getNormalizeJob() {
        if (matchScore > 0 ){
            return NORMALIZE_JOB;
        } else {
            return super.getNormalizeJob();
        }
    }

    public SoftwareEngineer(String[] arrayInput) {
        List<String> keyWords = super.getKeywords(NORMALIZE_JOB);
        super.countScore(arrayInput, keyWords, 0.5);
    }
}
