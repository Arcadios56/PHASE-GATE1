import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTaskone {

@Test
public void testCalculateYearsInThePast() {
int fatherAge = 40;
int sonAge = 30;
int expected = 20;
        assertEquals(expected, Taskone.calculateYears(fatherAge, sonAge));
}

@Test
public void testCalculateYearsInTheFuture(){
int fatherAge = 45;
int sonAge = 15;
int expected = 15;
	assertEquals(expected, Taskone.calculateYears(fatherAge, sonAge));
}

@Test
public void testCalculateYearsCurrently() {
int fatherAge = 40;
int sonAge = 20;
int expected = 0;
	assertEquals(expected, Taskone.calculateYears(fatherAge, sonAge));
}

@Test
public void testCalculateYearsEqualAges() {
int fatherAge = 40;
int sonAge = 40;
int expected = 40;
	assertEquals(expected, Taskone.calculateYears(fatherAge, sonAge));
}

@Test
public void testCalculateYearsForZeroAges() {
int fatherAge = 0;
int sonAge = 0;
int expected = 0;
	assertEquals(expected, Taskone.calculateYears(fatherAge, sonAge));

}
}


