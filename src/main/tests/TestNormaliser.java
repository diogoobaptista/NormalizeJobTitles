package main.tests;

import static org.junit.Assert.*;

import main.java.Normaliser;
import org.junit.Test;

public class TestNormaliser {

    private Normaliser normaliser = new Normaliser();

    @Test
    public void testSoftwareEngineer1(){
        String jt = "Java engineer";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Software engineer");
    }
    @Test
    public void testSoftwareEngineer2(){
        String jt = "C# engineer";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Software engineer");
    }
    @Test
    public void testAccountant(){
        String jt = "Chief Accountant";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Accountant");
    }
    @Test
    public void testArchitect(){
        String jt = "Chief Architect";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Architect");
    }
    @Test
    public void testQuantitySurveyor1(){
        String jt = "Chief Quantity";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Quantity Surveyor");
    }
    @Test
    public void testQuantitySurveyor2(){
        String jt = "Chief Surveyor";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "Quantity Surveyor");
    }
    @Test
    public void testNotFound1(){
        String jt = "Chief Architect Accountant";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "No Job Found");
    }
    @Test
    public void testNotFound2(){
        String jt = "Chief";
        String normalisedTitle = normaliser.normalise(jt);
        assertEquals(normalisedTitle, "No Job Found");
    }
}
