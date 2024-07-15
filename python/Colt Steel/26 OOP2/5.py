class User:
   user_count = 0
   def __init__(self, first, last, age) -> None:
      self.first=first
      self.last=last
      self.age=age
      User.user_count += 1
   
   @classmethod
   def display_active_users(cls):
      return f'Count of active users {cls.user_count}'

   def logout(self):
      User.user_count -= 1
      return f'{self.first} has logged out'

   def full_name(self):
      return f'{self.first} {self.last}'

   def initials(self):
      return f"{self.first[0], self.last[0]}"

   def likes(self, thing):
      return f"{self.first} likes {thing}"

   def is_senior(self):
      return self.age >= 65

   def brithday(self):
      self.age+=1
      return f'Happy {self.age}th, {self.first}'

class Moderator(User):
   total_mods = 0
   def __init__(self, first, last, age, community) -> None:
       super().__init__(first, last, age)
       self.community = community
       Moderator.total_mods += 1

   @classmethod
   def display_active_moderators(cls):
      return f'Count of active moderator users {cls.total_mods}'

   def remove_post(self):
      return f'{self.full_name()} removed a post from the {self.community} community'

u1 = User('Tom', 'Garcia', 45)
u2 = User('Tom', 'Garcia', 45)
u3 = User('Tom', 'Garcia', 45)

jasmine = Moderator('Jasmin', 'Honnor', 32, 'Piano')
jasmine2 = Moderator('Jasmin', 'Honnor', 32, 'Piano')


print(User.display_active_users())
print(Moderator.display_active_moderators())


# class Person:
#   def __init__(self, fname, lname):
#     self.firstname = fname
#     self.lastname = lname
#     print('salom')

#   def printname(self):
#     print(self.firstname, self.lastname)

# class Student(Person):
#   def __init__(self, fname, lname, year):
#     super().__init__(fname, lname)
#     self.graduationyear = year

# x = Student("Mike", "Olsen", 2019)
# print(x.graduationyear)
