class User:
   user_count = 0

   @classmethod
   def display_active_users(cls):
      print(f"There are currently active users {cls.user_count}")

   @classmethod
   def from_string(cls, data_str):
      first, last, age = data_str.split(',')
      return cls(first, last, age)

   def __init__(self, first, last, age) -> None:
      self.first=first
      self.last=last
      self.age=age
      User.user_count += 1

   # TODO
   def __repr__(self) -> str:
      return f"{self.first} is {self.age}"

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

user = User('Alex', "Joe", 33)
user2 = User('John', 'Doe', 44)
User.display_active_users()

john = User.from_string('John, Doe, 45')

print(john) #TODO

