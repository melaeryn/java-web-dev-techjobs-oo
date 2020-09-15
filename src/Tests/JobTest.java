package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobOne;
    Job jobTwo;
    Job jobWithData;
    Job jobWithData2;

    @Before
    public void createJobs(){
         jobOne = new Job();
         jobTwo = new Job();
         jobWithData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         jobWithData2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId(){
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(jobWithData.getId(),26);

        assertEquals(jobWithData.getCoreCompetency().getValue(),"Persistence");
        assertNotNull(jobWithData.getCoreCompetency());

        assertEquals(jobWithData.getName(),"Product tester");
        assertNotNull(jobWithData.getName());

        assertEquals(jobWithData.getEmployer().getValue(),"ACME");
        assertNotNull(jobWithData.getEmployer());

        assertEquals(jobWithData.getLocation().getValue(),"Desert");
        assertNotNull(jobWithData.getLocation());

        assertEquals(jobWithData.getPositionType().getValue(),"Quality control");
        assertNotNull(jobWithData.getPositionType());
    }

    @Test
    public void testJobsForEquality(){
        assertNotEquals(jobWithData, jobWithData2);
    }

    @Test
    public void testToStringForEmptyJob(){
        String compare1 = jobOne.toString();
        String compare2 = "OOPS! This job does not seem to exist.";
        assertEquals(compare1, compare2);
    }

    @Test
    public void testToStringForJobWithIDAndName(){
        Job job = new Job();
        job.setName("myJob");
        assertEquals(job.toString(), "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" + "Employer: Data not available\n" +
                "Location: Data not available\n" + "Position Type: Data not available\n" +
                "Core Competency: Data not available\n");
    }

    @Test
    public void testToStringForJobWithIDNameEmployer(){
        Job job = new Job();
        job.setName("Burger Flipper");
        job.setEmployer(new Employer("McDonalds"));
        assertEquals(job.toString(), "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" + "Employer: " + job.getEmployer().toString() + "\n" +
                "Location: Data not available\n" + "Position Type: Data not available\n" +
                "Core Competency: Data not available\n");
    }

    @Test
    public void testToStringForJobWithIDNameEmployerLocation(){
        Job job = new Job();
        job.setName("Burger Flipper");
        job.setEmployer(new Employer("McDonalds"));
        job.setLocation(new Location("St. Louis"));
        assertEquals(job.toString(), "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" + "Employer: " + job.getEmployer().toString() + "\n" +
                "Location: " + job.getLocation().toString() + "\n" + "Position Type: Data not available\n" +
                "Core Competency: Data not available\n");
    }

    @Test
    public void testToStringForJobWithIDNameEmployerLocationType(){
        Job job = new Job();
        job.setName("Burger Flipper");
        job.setEmployer(new Employer("McDonalds"));
        job.setLocation(new Location("St. Louis"));
        job.setPositionType(new PositionType("Culinary"));
        assertEquals(job.toString(), "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" + "Employer: " + job.getEmployer().toString() + "\n" +
                "Location: " + job.getLocation().toString() + "\n" + "Position Type: " + job.getPositionType().toString() + "\n" +
                "Core Competency: Data not available\n");
    }

    @Test
    public void testToStringComplete(){

        assertEquals(jobWithData.toString(), "\nID: " + jobWithData.getId() + "\n" +
                "Name: Product tester\n" + "Employer: ACME\n" +
                "Location: Desert\n" + "Position Type: Quality control\n" +
                "Core Competency: Persistence\n");
    }
}
