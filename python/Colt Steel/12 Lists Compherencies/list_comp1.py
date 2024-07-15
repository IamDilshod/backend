nums = [1,2,3,4,5]

[print(x*10) for x in nums]


print('------------------------')

doubled_numbers = []
[doubled_numbers.append(a*2) for a in nums]
print(doubled_numbers)


print('------------------------')


doubled_numbers1 = []
doubled_numbers1.append([a*2 for a in nums])
print(doubled_numbers1)


print('------------------------')


name = "colt"
[print(char.upper()) for char in name]


print('------------------------')


friends = ['alex', 'helena', 'fredrik']
[print(friend.upper()) for friend in friends]


print('------------------------')


with_vowels = 'This is so much!'
without_vowels = [''.join(x for x in with_vowels if x not in 'aouei')]
print(without_vowels)

