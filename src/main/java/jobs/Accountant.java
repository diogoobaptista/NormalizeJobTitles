package main.java.jobs;

import java.util.List;

public class Accountant extends Job {

        private final String NORMALIZE_JOB = "Accountant";

        public String getNormalizeJob() {
            if (matchScore > 0 ){
                return NORMALIZE_JOB;
            } else {
                return super.getNormalizeJob();
            }
        }

        public Accountant(String[] arrayInput) {
            List<String> keyWords = super.getKeywords(NORMALIZE_JOB);
            super.countScore(arrayInput, keyWords, 1.0);
        }
}
