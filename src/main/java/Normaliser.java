package main.java;

import main.java.jobs.*;

import java.util.LinkedList;
import java.util.List;

public class Normaliser implements Normalizable{


    private Job getJobWithHighScore(List<Job> list){
        Job result = null;
        for (Job job: list) {
            if (result == null || job.matchScore > result.matchScore) {
                result = job;
            } else {
                if(result.matchScore > 0 && job.matchScore == result.matchScore){
                    return new Job();
                }
            }
        }
        return result;
    }

    @Override
    public String normalise(String jt) {
        String [] splitedJt = jt.split(" ");
        List<Job> list = new LinkedList<>();
        SoftwareEngineer softwareEngineer = new SoftwareEngineer(splitedJt);
        list.add(softwareEngineer);
        Architect architect = new Architect(splitedJt);
        list.add(architect);
        QuantitySurveyor quantitySurveyor = new QuantitySurveyor(splitedJt);
        list.add(quantitySurveyor);
        Accountant accountant = new Accountant(splitedJt);
        list.add(accountant);
        return getJobWithHighScore(list).getNormalizeJob();
    }
}
