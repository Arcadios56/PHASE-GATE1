class GroceryListManager:
    items = []

    def add_item(self):
        item = input("ENTER AN ITEM TO ADD: ")
        self.items.append(item)
        print(f"{item} added successfully")
        self.run()

    def remove_item(self):
        if len(self.items) == 0:
            print("NO ITEMS ARE AVAILABLE.")
            self.run()
            return
        print("LIST OF ALL AVAILABLE ITEMS:")
        for index, item in enumerate(self.items):
            print(f"{index + 1}. {item}")
        index = input("ENTER THE NUMBER OF THE ITEM TO REMOVE: ")
        if index.isdigit() and 0 < int(index) <= len(self.items):
            removed_item = self.items.pop(int(index) - 1)
            print(f"{removed_item} removed successfully")
        else:
            print("INVALID ITEM NUMBER!")
        self.run()

    def show_items(self):
        if len(self.items) == 0:
            print("NO ITEMS ARE AVAILABLE")
        else:
            print("Available items:")
            for index, item in enumerate(self.items):
                print(f"{index + 1}. {item}")
        self.run()

    def run(self):
        while True:
            prompt = """ WELCOME TO YOUR GROCERY LIST MANAGER
Press: 
1 -> Add item
2 -> Remove item
3 -> Show all items
0 -> Exit """
            print(prompt)
            choice = input("Kindly enter a choice: ")
            if choice == "1":
                self.add_item()
                break
            elif choice == "2":
                self.remove_item()
                break
            elif choice == "3":
                self.show_items()
                break
            elif choice == "0":
                print("NOW EXITING...")
                break
            else:
                print("INVALID CHOICE SELECTION!")

    def start(self):
        self.run()

manager = GroceryListManager()
manager.start()