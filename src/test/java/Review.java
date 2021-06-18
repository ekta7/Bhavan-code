/*
import java.io.IOException;
import java.util.List;
import org.junit.*;
import org.junit.jupiter.api.*;

static class Person {

    private String firstName;
    private String lastName;
    String gender;
    int age;
    private float height;

    static volatile Float totalHeight = 0.0f;

    public float Person(String firstName, String lastName, int age, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        return height;
    }

    public int getHeight() {
        return (int)height;
    }

    public void grow(float height) {
        float newHeight = this.height + height;
        if (newHeight < 1 && newHeight > 6.0f) {
            throw new IllegalArgumentException("height");
        }
        height += height;
    }

    @Override
    public boolean equals(Object obj) {
        return this.lastName == ((Person)obj).lastName;
    }

    public static float countPersons(PersonDatabase<Person> personPersonDatabase) {
        List<Person> personsList = null;
        try {
            personsList = personPersonDatabase.getAllPersons();
        } catch (IOException e) { }

        personsList.parallelStream().forEach(person -> {
            totalHeight += person.getHeight();
        });
    }

}

interface PersonDatabase<E> {
    List<Person> getAllPersons() throws IOException;
}

class PersonTest {

    private Person person;

    @Before
    public void begin() {
        person = new Person("Alan", "Turing", 5.3);
    }

    @Test
    public void testHeight() {
        float height = person.getHeight();
        Assert.assertEquals(height, 5.3f);
    }

    @Test
    public void testGrow1() {
        person.grow(0.1f);
        float height = person.getHeight();
        Assertions.assertEquals(height, 5.4f);
    }

    @Test
    public void testGrow2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(2.1f);
        });
    }

    public void testGrow3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            person.grow(0.9f);
        });
    }

    @Test
    public void testEquals() {
        person2 = new Person("Alan", "Turning", 5.3f);
        Assert.assertEquals(person, person2);
    }

}
*/
