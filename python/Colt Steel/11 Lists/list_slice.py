list1 = [1,2,3,4,5,6,7]
print(list1)


print('------------------------')
print(list1[0:]) # [1,2,3,4,5,6,7]
print(list1[2:]) # [3,4,5,6,7]
print(list1[4:]) # [5, 6, 7]


print('------------------------')
# Son o'qidagi "X" bilan bir xil ishlaydi. Negativda qiymat -1 dan boshlanadi
print(list1[-1:]) # [7]
print(list1[:-1]) # [1, 2, 3, 4, 5, 6]
print(list1[-3:]) # [5, 6, 7]


print('------------------------')
list2 = list1[:] # list1[:] bilan list1[0:] bir xil!!!
print(list2)
print(list1)
print(list1 == list2)
print(list1 is list2)
