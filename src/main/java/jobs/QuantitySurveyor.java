package main.java.jobs;

import java.util.List;

public class QuantitySurveyor extends Job{

    private final String NORMALIZE_JOB = "Quantity Surveyor";


    public String getNormalizeJob() {
        if (matchScore > 0 ){
            return NORMALIZE_JOB;
        } else {
            return super.getNormalizeJob();
        }
    }

    public QuantitySurveyor(String[] arrayInput) {
        List<String> keyWords = super.getKeywords(NORMALIZE_JOB);
        super.countScore(arrayInput, keyWords, 0.5);
    }
}
