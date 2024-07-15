def my_for(iterable):
   iterator = iter(iterable)
   while True:
      try:
         print(next(iterator))
      except StopIteration:
         print('END OF ITERATOR!')
         break

my_for([1,2,3,4,5])