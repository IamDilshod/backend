def divide(a, b):
   try:
      result =  a/b
   except (ZeroDivisionError, TypeError) as err:
      print('Something went wrong!')
      print(err)
   else:
      print(f"{a} divided by {b} is {result}")

print(divide(5, 4))
print(divide(5, 0))
print(divide(5, 'r'))
