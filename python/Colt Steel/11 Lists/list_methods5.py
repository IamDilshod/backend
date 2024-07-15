# index(elem, start, end) method listdan berilgan elementni postionini qaytaradi.
numbers1 = [5,6,7,8,9,10]
print(numbers1.index(6)) # 1
print(numbers1.index(9)) # 4


print('------------------------------')
numbers2 = [5,6,7,8,9,10,8,6,6,2]
print(numbers2.index(6, 5)) # 7 Bu 5-indexdan bohlab "6" ni qidirish
print(numbers2.index(8, 4, 8)) # 6 Bu 4-index bilan 8-index orasidan "8" ni qidirish
