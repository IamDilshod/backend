def display_name(first, second):
   print('first => ' + first)
   print('second => ' + second)
   return f"{first} says hello to {second}"

names = {"first":"Colt", "second": 'Rusty'}

print(display_name(**names))