d = dict(a=1, b=2, c=3)
print(d)


print('-------------------------------')
print(d['a'])
print(d.get('b'))


print('-------------------------------')
# d[i] bilan d.get('i') ni asosiy farqi bu, d[i] da shu key-value bo'lmasa error beradi,
# d.get('i') da esa None qaytaradi.
print(d['i'])
print(d.get('i'))