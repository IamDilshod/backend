class User:
   def __init__(self, first, last, age) -> None:
      self.first=first
      self.last=last
      self.age=age

   def full_name(self):
      return f'{self.first} {self.last}'

   def initials(self):
      return f"{self.first[0], self.last[0]}"

   def likes(self, thing):
      return f"{self.first} likes {thing}"

   def brithday(self):
      self.age+=1

user = User('Alex', "Joe", 33)
user2 = User('John', 'Doe', 44)
print(user.full_name())
print(user.initials())
print(user.likes('candy'))
user.brithday()
print(user.age)