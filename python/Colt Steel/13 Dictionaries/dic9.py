numbers = dict(first=1, second=2, third=3)
squared_numbers = { key: value**2 for key,value in numbers.items()}

print(squared_numbers)


print('-------------------')
print({value:value*10 for value in [1,2,3,4,5]})


print('-------------------')
nums = [1,2,3,4,5,6]
print({num: ('even' if num%2==0 else 'odd') for num in range(1,10) })


print('-------------------')
list1 = ["CA", "NJ", "RI"]
list2 = ["California", "New Jersey", "Rhode Island"]

# make sure your solution is assigned to the answer variable so the tests can work!

answer = {list1[num]:list2[num]  for num in range(3)}
print(answer)


print('-------------------')
person = [["name", "Jared"], ["job", "Musician"], ["city", "Bern"]]
answer = {kv[0]:kv[1] for kv in person}
print(answer)


print('-------------------')
# {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0}
answer = {}.fromkeys('aeiou', 0)
print(answer)

