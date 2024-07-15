str1 = "hello"
str2 = "world"
str3 = str1+ " " +str2
print(str3)

one = "hello"
two = "world"
x = 3
# another = one + " " + x + " " + two
# print(another)

y=100
print(f"I hav told you {y} times already!")

z=45
formatted = f'I am {z} years old!' # bu => f"...{}..." ko'rinishdagi string formati
# faqat Python3.6 dan boshlab ishlaydi.
print(formatted)


formatted = "I am {} years old".format(z) # bu => .format(z) ko'rinishdagi string formati
# faqat Python3.6 dan pastdagi versiyalarida ham ishlaydi.
print(formatted)
