list1 = [1,2,3,4,5,6,7]
print(list1)


print('---------------------')
print(list1[:1]) # [1]
print(list1[:3]) # [1, 2, 3]
print(list1[0:3]) # [1, 2, 3]
print(list1[2:6]) # [3, 4, 5, 6]


print('---------------------')
print(list1[:-1]) # [1, 2, 3, 4, 5, 6]
print(list1[:-3]) # [1, 2, 3, 4]
print(list1[-4:-1]) # [4, 5, 6]


print('---------------------')
print(list1[0:6:2]) #  [1, 3, 5]
print(list1[1:6:2]) #  [2, 4, 6]