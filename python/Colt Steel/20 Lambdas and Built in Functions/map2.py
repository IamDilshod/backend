names = [
   {"first": 'Rusty', 'last': 'Steele'},
   {"first": 'Colt', 'last': 'Steele'},
   {"first": 'Andrew', 'last': 'Steele'},
]

x = map(lambda x: x['first'], names)
print(list(x))


print('--------------------')


def getItem(item):
   return dict(item)

y = map(getItem, names)
print(list(y))
