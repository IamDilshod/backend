nums = [1,2,3,4,5]

def doubleNum(x):
   return x*x


doubles = map(lambda x: x*x, nums) # "lambda" bilan yozilishi
doubles2 = map(doubleNum, nums)    # oddiy funksiya bilan yozilishi

for i in doubles:
   print(i)

print('-------------------')

for i in doubles2:
   print(i)