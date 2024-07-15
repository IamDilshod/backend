# all
names = ['alex', 'ashley', 'alina']
p = all([names])
print(p)


print('----------------------')

p1 = all([n[0]=='a' for n in names])
print(p1)

print('----------------------')

# any
print(any([0,1,2,3]))
print(any([c[0]=='a' for c in names]))
print(any([x % 2 == 0] for x in [12, 33, 56, 98]))
print(any([x % 2 == 0 for x in [33, 45, 67]]))