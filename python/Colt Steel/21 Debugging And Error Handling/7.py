def divide(a, b):
   try:
      result =  a/b
   except ZeroDivisionError:
      print('Something went wrong!')
   except TypeError as err:
      print('a and b must be int or float')
      print(err)
   else:
      print(f"{a} divided by {b} is {result}")

print(divide(5, 4))
print(divide(5, 0))
print(divide(5, 'r'))