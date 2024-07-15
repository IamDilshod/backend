list1 = [1,2,3,4,5,1,2,2,6,7]
print(list1)

list1.remove(1) # remove() methodi berilgan elementni o'chiradi listdan.
# Agar topa olmasa error beradi
print(list1)


print('--------------------------------')
list1.remove(2) # Agar listda bir xil element takrorlangan bo'lsa, remove() methodi
# faqat 1-uchraganini oladi
print(list1)


list1.pop