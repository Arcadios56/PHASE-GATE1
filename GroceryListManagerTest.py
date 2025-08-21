import unittest

class GroceryListManager:
    def __init__(self):
        self.items = []

    def addItem(self, item):
        self.items.append(item)

    def removeItem(self, index):
        if index >= 0 and index < len(self.items):
            del self.items[index]

    def getItemsList(self):
        return self.items

class TestGroceryListManager(unittest.TestCase):

    def testAddItem(self):
        manager = GroceryListManager()
        manager.addItem("rice")
        manager.addItem("millet")
        items = manager.getItemsList()
        self.assertEqual(2, len(items))
        self.assertIn("rice", items)
        self.assertIn("millet", items)

    def testRemoveItem(self):
        manager = GroceryListManager()
        manager.addItem("rice")
        manager.addItem("millet")
        manager.removeItem(0)
        items = manager.getItemsList()
        self.assertEqual(1, len(items))
        self.assertNotIn("rice", items)
        self.assertIn("millet", items)

    def testShowItemsFromEmptyList(self):
        manager = GroceryListManager()
        items = manager.getItemsList()
        self.assertEqual(0, len(items))

    def testShowItemsWithStuffs(self):
        manager = GroceryListManager()
        manager.addItem("rice")
        manager.addItem("millet")
        items = manager.getItemsList()
        self.assertEqual(2, len(items))
        self.assertEqual("rice", items[0])
        self.assertEqual("millet", items[1])

