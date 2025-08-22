import java.util.Scanner;

public class Parking {
    int[] parkingSpots;
    int Numcar;

public Parking() {
parkingSpots = new int[20];
Numcar = 1;
        for (int index = 0; index < 20; index++) {
parkingSpots[index] = 0;
}
}

 public void showCarParking() {
  System.out.println("Parking lot:");
        for (int index = 0; index < 20; index++) {
  System.out.print("Spot " + (index + 1) + ": ");
   
if (parkingSpots[index] == 0) {
  System.out.println("No car");
} else {
    System.out.println("Car " + parkingSpots[index]);
}
}
}
    public void parkCar() {
        for (int index = 0; index < 20; index++) {
            if (parkingSpots[index] == 0) {
                parkingSpots[index] = Numcar;
       System.out.println("Car " + Numcar + " parked in spot " + (index + 1));
                Numcar++;
                return;
}
}

        System.out.println("Parking lot is full");
}

    public void takeOutCar(int spot) {
        if (spot < 1 || spot > 20) {
            System.out.println("Pick a number from 1 to 20");
            return;
}
        if (parkingSpots[spot - 1] == 0) {
            System.out.println("Spot " + spot + " is already empty");
            return;
}
        int car = parkingSpots[spot - 1];
        parkingSpots[spot - 1] = 0;
        System.out.println("Car " + car + " left spot " + spot + "!");
}

    private boolean isPositiveInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false;
}
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
}
}
        return true;
}

    public static void main(String[] args) {
        Parking parking = new Parking();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Park a car");
            System.out.println("2. Take a car out");
            System.out.println("3. Look at the parking lot");
            System.out.println("4. Stop playing");
            System.out.print("Pick a number: ");

String input = scanner.nextLine();
  if (!parking.isPositiveInteger(input)) {
       System.out.println("Please pick a number like 1, 2, 3, or 4!");
                continue;
}

 int choice = Integer.parseInt(input);
      if (choice < 1 || choice > 4) {
   System.out.println("Pick a number from 1 to 4!");
                continue;
}

if (choice == 1) {
   parking.parkCar();
        parking.showCarParking();
} else if (choice == 2) {
   System.out.print("Which spot (1 to 20)? ");
         String spotInput = scanner.nextLine();
if (!parking.isPositiveInteger(spotInput)) {
   System.out.println("Please pick a number like 1 or 2!");
 continue;
}
int spot = Integer.parseInt(spotInput);
    if (spot < 1 || spot > 20) {
        System.out.println("Pick a number from 1 to 20!");
continue;
}
parking.takeOutCar(spot);
     parking.showCarParking();
} else if (choice == 3) {
     parking.showCarParking();
} else if (choice == 4) {
System.out.println("Thanks for playing");
 break;
}
}
}
}