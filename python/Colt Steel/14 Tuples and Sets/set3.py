set1 = {1, 2, 3, 4, 5}
print(set1)


print('---------------------')
set1.remove(3)
print(set1)


print('---------------------')
set1.remove(8) # Agar set da element yo'q bo'lsa, uni o'chirib bo'lmaydi va KeyError
# qaytaradi. Lekin discard() methodi bilan element topilmasa ham error qaytarmaydi. 
# remove() bilan discard() ni asosiy farqi shunda
set1.discard(8)