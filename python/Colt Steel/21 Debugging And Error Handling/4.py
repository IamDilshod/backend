try:
   num = int(input('Please enter a number: '))
except:
   print('Thats is not a numbr!')
else:
   print('I\'m in the ELSE')
finally:
   print('Runs no matter. FINALLY')