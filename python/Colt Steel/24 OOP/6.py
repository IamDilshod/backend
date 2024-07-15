class Pet:
   allowed = ['cat', 'dog', 'fish', 'rat']
   def __init__(self, name, species) -> None:
      self.name=name
      self.species=species
      if species not in Pet.allowed:
         raise ValueError(f'You cannot have a {species} pet!') 

cat = Pet('Blue', 'cat')
dog = Pet('Wyatt', 'dog')

print(Pet.allowed)
print(cat.allowed)
print(dog.allowed)

print('-------------------')
cat.allowed = ['apple', 'banana']

print(Pet.allowed)
print(cat.allowed)
print(dog.allowed)
