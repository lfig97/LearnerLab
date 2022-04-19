import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //Given
        long expectedId = 0;
        String expectedName = "luis";

        //When
        Person person = new Person(expectedId,expectedName);

        //Then
        long actualId = person.getId();
        String actualName = person.getName();
        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actualName);
    }
    @Test
    public void testSetName(){
        String expectedName = "luis";

        Person person = new Person();
        person.setName(expectedName);

        String actualName = person.getName();
        Assert.assertEquals(expectedName,actualName);
    }

}
