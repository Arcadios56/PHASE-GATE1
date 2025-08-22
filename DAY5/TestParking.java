import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestParking {

@Test
    public void testParking() {
        Parking parking = new Parking();
	parking.parkCar();
}

@Test
    public void testParkCarWhenFull() {
        Parking parking = new Parking();
        for (int i = 0; i < 20; i++) {
            parking.parkCar();
 }

@Test
    public void testShowCarParking() {
        Parking parking = new Parking();
        parking.parkCar(1);
        parking.parkCar(2);
        parking.showCarParking();
        parking.takeOutCar(1);
        parking.showCarParking();
}
}