class Human:
   def __init__(self, first, last, age) -> None:
      self.first = first
      self.last = last

      if age >= 0:
         self._age = age #  "_age" private field hisoblanadi
      else:
         self._age = 0

   @property
   def age(self):
      return self._age

   @age.setter
   def age(self, new_age):
      if new_age >= 0:
         self._age = new_age
      else:
         raise ValueError('age can not be negative')

   @property
   def full_name(self):
      return f'{self.first} {self.last}'

   @full_name.setter
   def full_name(self, name):
      self.first, self.last = name.split(' ')


jane = Human('Jane', 'Doe', 2)
print(jane.age)

jane.age = 34
print(jane.age)
print(jane.full_name)
jane.full_name = "Alex Dunk"
print(jane.full_name)
