def shout(fn):
   def wrapper(*args, **kvargs):
      return fn(*args, **kvargs).upper()
   return wrapper

@shout
def greet(name):
   return f'Hi my name is {name}'

@shout
def order(main, side):
   return f'Hi, I would like the {main}, with a side of {side}, please'

@shout
def lol():
   return 'lol'
   
print(greet('Alex'))
print(order('One ', 'Two'))
print(lol())
