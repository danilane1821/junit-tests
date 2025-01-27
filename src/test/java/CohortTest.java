import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort emptyCohort;
    Cohort oneStudentCohort;
    Cohort manyStudentCohorts;



    @Before
    public void setup () {
     emptyCohort = new Cohort();

     oneStudentCohort = new Cohort();
     Student one = new Student(2L,"dani");
     one.addGrade(80);
     one.addGrade(75);
     oneStudentCohort.addStudent(one);

     manyStudentCohorts = new Cohort();
     Student two = new Student(3L,"bob");
     two.addGrade(90);
     two.addGrade(100);

     Student three = new Student(4L,"sally");
     three.addGrade(75);
     three.addGrade(100);

     Student four = new Student(5L,"jack");
     four.addGrade(98);
     four.addGrade(87);
     manyStudentCohorts.addStudent(two);
     manyStudentCohorts.addStudent(three);
     manyStudentCohorts.addStudent(four);

    }
    @Test
    public void testIfWeCanAddStudent () {
        assertEquals(0,emptyCohort.getStudents().size());
        assertNotEquals(3,oneStudentCohort.getStudents().size());
        assertEquals(1,oneStudentCohort.getStudents().size());
        assertEquals(3,manyStudentCohorts.getStudents().size());
    }

    @Test
    public void testIfWeGetListOfStudents () {
       assertEquals("dani",oneStudentCohort.getStudents().get(0).getName());
        assertNotEquals("bob",oneStudentCohort.getStudents().get(0).getName());
        assertEquals("sally",manyStudentCohorts.getStudents().get(1).getName());


    }

    @Test
    public void testIfWeGetAverageAndItsCorrect () {
        //fers way
//        oneStudentCohort.getStudents().get(0).addGrade(80);
//        assertEquals(85,oneStudentCohort.getCohortAverage(),0);
        //my way
        assertEquals(77.5,oneStudentCohort.getCohortAverage(),0);

    }


}
