import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {


    @Test
    public void testCreateStudent () {
        Student dani = new Student(1L,"dani");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(dani);
    }

    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());

    }

    @Test
    public void testAddGrade () {
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }
    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);

    }
}
