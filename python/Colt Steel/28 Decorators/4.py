from random import choice

def make_laugh_func(person):
   def get_laugh():
      l = choice(('HAHAHAHA', 'lol', 'tehehe'))
      return f'{person} {l}'
   return get_laugh

laugh = make_laugh_func('Anna')
print(laugh())