package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
    }
    @Test
    public void testSettingJobId() {
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());

    }

    @Test
    public void testJobsForEquality() {
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        /*assertEquals(job4.getName(), job5.getName());
        assertEquals(job4.getEmployer().toString(), job5.getEmployer().toString());
        assertEquals(job4.getLocation().toString(), job5.getLocation().toString());
        assertEquals(job4.getPositionType().toString(), job5.getPositionType().toString());
        assertEquals(job4.getCoreCompetency().toString(), job5.getCoreCompetency().toString());
        assertNotEquals(job4.getId(), job5.getId());*/


    }

}
