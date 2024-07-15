instructor = {
   "name":'Colt',
   "owns_dog": True,
   "num_courses": 4,
   "favorite_language": "Python"
}

# print(instructor.values())
# print(instructor.keys())
# print(instructor.items())

for value in instructor.values():
   print(value)


print('-------------------------')


for key in instructor.keys():
   print(key)


print('-------------------------')


for [key, value] in instructor.items():
   print('key = ' + key )
   print('value = ', value)
   print('***********')