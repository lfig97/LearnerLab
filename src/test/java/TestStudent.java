import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        boolean expectedIsLearner = true;

        Student student = new Student();

        boolean actualIsLearner = student instanceof Learner;
        Assert.assertEquals(expectedIsLearner,actualIsLearner);
    }
    @Test
    public void testInheritance(){
        boolean expectedIsPerson = true;

        Student student = new Student();

        boolean actualIsPerson = student instanceof Person;
        Assert.assertEquals(expectedIsPerson,actualIsPerson);
    }
    @Test
    public void testLearn(){
        double expectedTotalStudyTime = 5.0;

        Student student = new Student();
        student.learn(5.0);

        double actualTotalStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedTotalStudyTime,actualTotalStudyTime,0.1);
    }
}
