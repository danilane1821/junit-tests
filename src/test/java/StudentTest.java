import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student studentWithOneGrade;
    Student studentWithtwoGrades;

    @Before
    public void setup () {
        studentWithOneGrade = new Student(1L,"dani");
        studentWithtwoGrades = new Student(2L,"fer");
    }

    @Test
    public void testCreateStudent () {
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(studentWithOneGrade);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, studentWithOneGrade.getId());
        assertSame("fer", studentWithOneGrade.getName());
        assertSame(0, studentWithOneGrade.getGrades().size());

    }

    @Test
    public void testAddGrade () {
        studentWithOneGrade.addGrade(100);
        assertSame(100, studentWithOneGrade.getGrades().get(0));
        studentWithOneGrade.addGrade(80);
        assertSame(80, studentWithOneGrade.getGrades().get(1));
    }
    @Test
    public void testAverageGrade(){

        studentWithOneGrade.addGrade(100);
        studentWithtwoGrades.addGrade(80);
        studentWithtwoGrades.addGrade(90);

        assertEquals(100, studentWithOneGrade.getGradeAverage(), 0);
        assertEquals(85, studentWithtwoGrades.getGradeAverage(), 0);

    }
}
