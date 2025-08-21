import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class GroceryListManagerTest {
    @Test
    public void testAddItem() {
        GroceryListManager manager = new GroceryListManager();
       
 	// Adding items
        manager.addItem("rice");
        manager.addItem("millet");

        // Checking items that were added
        ArrayList<String> items = manager.getItemsList();
        assertEquals(2, items.size());
        assertTrue(items.contains("rice"));
        assertTrue(items.contains("millet"));
    }

    @Test
    public void testRemoveItem() {
        GroceryListManager manager = new GroceryListManager();
        
	// Adding items
        manager.addItem("rice");
        manager.addItem("millet");

        // Remove an item (index 0 remove first item)
        manager.removeItem(0);

        // Check item that is removed
        ArrayList<String> items = manager.getItemsList();
        assertEquals(1, items.size());
        assertFalse(items.contains("rice"));
        assertTrue(items.contains("millet"));
    }

    @Test
    public void testShowItemsFromEmptyList() {
        GroceryListManager manager = new GroceryListManager();

        // Checking for empty list
        ArrayList<String> items = manager.getItemsList();
        assertEquals(0, items.size());
    }

    @Test
    public void testShowItemsWithStuffs() {
        GroceryListManager manager = new GroceryListManager();

        // Adding items
        manager.addItem("rice");
        manager.addItem("millet");

        // Check items that are present
        ArrayList<String> items = manager.getItemsList();

        // List should contain 2 items
        assertEquals(2, items.size());

        // First item should be rice
        assertEquals("rice", items.get(0));

        // Second item should be millet
        assertEquals("millet", items.get(1));
    }
}


public class GroceryListManager {
   private ArrayList<String> items;

public GroceryListManager () {
   manager.addItem = new ArrayList<>();
}

public void addItem(String item){
   manager.add(item);
}

public void removeItem(int index) {
if(index > 0 && index <= items.size()) {
	manager.removeItem(index);
}
}

public ArrayList<String> getItemsList() {
	return items;
}
}



