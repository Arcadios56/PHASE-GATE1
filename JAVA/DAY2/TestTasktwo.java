import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTasktwo {
    @Test
    public void testNoOneLikes() {
        String[] names = new String[] {};
        String expected = "No one likes this";
        assertEquals(expected, Tasktwo.likes(names));
    }

    @Test
    public void testOnePersonLikes() {
        String[] names = new String[] {"Peter"};
        String expected = "Peter likes this";
        assertEquals(expected, Tasktwo.likes(names));
    }

    @Test
    public void testTwoPeopleLike() {
        String[] names = new String[] {"Jacob", "Alex"};
        String expected = "Jacob and Alex like this";
        assertEquals(expected, Tasktwo.likes(names));
    }

    @Test
    public void testThreePeopleLike() {
        String[] names = new String[] {"Max", "John", "Mark"};
        String expected = "Max, John and Mark like this";
          }

    @Test
    public void testMoreThanThreePeopleLike() {
        String[] names = new String[] {"Max", "John", "Mark", "Peter"};
        String expected = "Max, John and 2 others like this";
        assertEquals(expected, Tasktwo.likes(names));
    }
}
