nums = [1,2,3,4,5]

doubles = list(map(lambda x: x*x, nums))
print(doubles)


print('---------------------------')

def doubleNums(num):
   return num**2

print(list(map(doubleNums, nums)))