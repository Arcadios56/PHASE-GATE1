class Parking:
    def __init__(self):
        self.parking_spots = [0] * 20
        self.num_car = 1

    def show_car_parking(self):
        print("Parking lot:")
        for index in range(20):
            print(f"Spot {index + 1}: ", end="")
            if self.parking_spots[index] == 0:
                print("No car")
            else:
                print(f"Car {self.parking_spots[index]}")

    def park_car(self):
        for index in range(20):
            if self.parking_spots[index] == 0:
                self.parking_spots[index] = self.num_car
                print(f"Car {self.num_car} parked in spot {index + 1}")
                self.num_car += 1
                return
        print("Parking lot is full")

    def take_out_car(self, spot):
        if spot < 1 or spot > 20:
            print("Pick a number from 1 to 20")
            return
        if self.parking_spots[spot - 1] == 0:
            print(f"Spot {spot} is already empty")
            return
        car = self.parking_spots[spot - 1]
        self.parking_spots[spot - 1] = 0
        print(f"Car {car} left spot {spot}!")

    def is_positive_integer(self, input_str):
        return input_str.isdigit() and int(input_str) > 0

    def get_parked_car_count(self):
        return sum(1 for spot in self.parking_spots if spot != 0)

def main():
    parking = Parking()
    while True:
        print("1. Park a car")
        print("2. Take a car out")
        print("3. Look at the parking lot")
        print("4. Stop playing")
        choice_input = input("Pick a number: ")

        if not parking.is_positive_integer(choice_input):
            print("Please pick a number from 1 to 4")
            continue

        choice = int(choice_input)
        if choice < 1 or choice > 4:
            print("Pick a number from 1 to 4!")
            continue

        if choice == 1:
            parking.park_car()
            parking.show_car_parking()
        elif choice == 2:
            spot_input = input("Which spot (1 to 20)? ")
            if not parking.is_positive_integer(spot_input):
                print("Please pick a number like 1 or 2!")
                continue
            spot = int(spot_input)
            if spot < 1 or spot > 20:
                print("Pick a number from 1 to 20!")
                continue
            parking.take_out_car(spot)
            parking.show_car_parking()
        elif choice == 3:
            parking.show_car_parking()
        elif choice == 4:
            print("Thanks for playing")
            break
        main()
