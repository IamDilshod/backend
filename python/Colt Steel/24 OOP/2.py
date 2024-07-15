# _name
# __name
# __name__

class Person:
   def __init__(self) -> None:
      self.name="Tony"
      self._secret='hi'
      self.__msg='I like turtles'
      self.__lol='HAHAHAHA'
   
person = Person()
print(person.name)
print(person._secret)
# print(dir(person))
print(person._Person__msg)