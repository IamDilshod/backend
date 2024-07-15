while True:
   try:
      num = int(input('Please enter a number: '))
   except ValueError:
      print('Thats is not a numbr!')
   else:
      print('I\'m in the ELSE')
      break
   finally:
      print('Runs no matter. FINALLY')

print('End Of Game Logic')
