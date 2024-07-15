friends = ["Andrei", "Alex", "Anna"]
print(friends)
friends.append("Helena")
print(friends)
friends.append("one")

friends.append([1,2,3,4])
friends.extend([1,2,3,4])
print(friends)

print('------------------------------------')
first_list = [1,2,3,4]
first_list.insert(2, "Hi")
print(first_list)
first_list.insert(-1, "Hello")
print(first_list)
