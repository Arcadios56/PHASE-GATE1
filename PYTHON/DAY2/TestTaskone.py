import unittest

class TestTaskOne(unittest.TestCase):
    def test_calculate_years_in_the_past(self):
        father_age = 40
        son_age = 30
        expected = 20
        self.assertEqual(expected, TestTaskone.calculate_years(fatherAge, sonAge))

    def test_calculate_years_in_the_future(self):
        father_age = 45
        son_age = 15
        expected = 15
        self.assertEqual(expected, TestTaskone.calculate_years(fatherAge, sonAge))

    def test_calculate_years_currently(self):
        father_age = 40
        son_age = 20
        expected = 0
        self.assertEqual(expected, TestTaskone.calculate_years(fatherAge, sonAge))

    def test_calculate_years_equal_ages(self):
        father_age = 0
        son_age = 0
        expected = 0
        self.assertEqual(expected, TestTaskone.calculate_years(fatherAge, sonAge))
    
    def test_calculate_years_for_zero_ages(self):
        father_age = 0
        son_age = 0
        expected = 0
        self.assertEqual(expected, TestTaskone.calculate_years(fatherAge, sonAge))
