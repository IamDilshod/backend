import keyword

def contains_keyword(*args):
   for i in args:
      if keyword.iskeyword(i):
         return True
   return False

print(contains_keyword('if', 'aod', 'dplasd'))