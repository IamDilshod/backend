midterms = [80,91,78]
finals = [98,89,53]
students = ['dan', 'ang', 'kate']

final_grades = [max(pair) for pair in zip(midterms, finals)]
print(final_grades)

print('------------------------')

final_g = {t[0]: max(t[1], t[2]) for t in zip(students, midterms, finals)}
print(final_g)

print('------------------------')

with_map = dict(zip(students, map(lambda x: max(x), zip(midterms, finals)) ))
print(with_map)

print('------------------------')

def interleave(s1, s2):
   l = list(zip(s1, s2))
   return ''.join(''.join(i) for i in l)

print(interleave('hi', 'ha'))