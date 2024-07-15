class User:
   user_count = 0
   def __init__(self, first, last, age) -> None:
      self.first=first
      self.last=last
      self.age=age
      User.user_count += 1

   def logout(self):
      User.user_count -= 1
      return f'{self.first} has logged out'

   def full_name(self):
      return f'{self.first} {self.last}'

   def initials(self):
      return f"{self.first[0], self.last[0]}"

   def likes(self, thing):
      return f"{self.first} likes {thing}"

   def brithday(self):
      self.age+=1

print(User.user_count)
user = User('Alex', "Joe", 33)
user2 = User('John', 'Doe', 44)
print(User.user_count)
user.logout()
print(User.user_count)
