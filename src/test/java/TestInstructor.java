import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        double expectedTotalStudyTime = 5.0;

        Instructor instructor = new Instructor();
        Student student = new Student();
        instructor.teach(student,5.0);
        double actualTotalStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0.1);
    }
    @Test
    public void testLecture(){
        double expectedTotalStudyTime = 5.0;

        Instructor instructor = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] students = new Student[]{student1,student2};
        instructor.lecture(students,5.0);
        double totalStudyTime = 0.0;
        for(Student student:students){
            totalStudyTime += student.getTotalStudyTime();
        }
        double actualTotalStudyTime = totalStudyTime;
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0.1);
    }
}
