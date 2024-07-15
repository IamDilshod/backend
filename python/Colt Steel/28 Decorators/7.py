def shout(fn):
   def wrapper(name):
      return fn(name).upper()
   return wrapper

@shout
def greet(name):
   return f'Hi my name is {name}'

print(greet('Alex'))
