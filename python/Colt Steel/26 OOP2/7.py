from os import name


class A:
   def __init__(self, name) -> None:
      self.name = name
      print('class init A')
   
   def swim(self):
      return f'{self.name} is swimming'

   def greet(self):
      return f'Hello {self.name} on the A'

class B:
   def __init__(self, name) -> None:
      self.name = name
      print('class init B')
      
   def walk(self):
      self.name=name
      return f'{self.name} is walking'

   def greet(self):
      return f'Hello {self.name} on the B'

class C(A,B):
   def __init__(self, name) -> None:
       super().__init__(name=name)
       print('class init C')

c = C('C')
print(c.greet())

