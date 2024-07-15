class Animal:
   def __init__(self, name, species) -> None:
      self.name = name
      self.species = species

   def __repr__(self) -> str:
       return f"{self.name} is a {self.species}"

   def make_sound(self, sound):
      print(f"this animal says {sound}")

class Cat(Animal):
   def __init__(self, name, species, breed, toy) -> None:
      # self.name = name
      # self.species = species

      # Animal.__init__(self, name, species) # yoki bu bilan
      super().__init__(name, species='Cat')  # yoki bu bilan

      self.breed = breed
      self.toy = toy

   def play(self):
      print(f"{self.name} plays with {self.toy}")

blue = Cat('Blue', 'Cat', 'Scotish Fold', 'String')
print(blue)
blue.play()
