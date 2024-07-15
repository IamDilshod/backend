f = open('story.txt')
f.read()
f.close()
print(f.closed)

print('----------------------------')

with open('story.txt') as file:
   file.read()
print(file.closed)