dic1 = dict(a=1, b=2, c=3, d=4, e=5)
print(dic1)


print('--------------------------')
# popitem() methodi dictionarydan key ni randomly o'chiradi va o'ziga parameter olmaydi
print(dic1.popitem()) 
print(dic1)

dic1.update({})
print(dic1)