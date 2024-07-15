def count_up(max):
   count = 0
   while count < max:
      yield count
      count+=1

count = count_up(5)
print(next(count))
print(next(count))
print(next(count))
print(next(count))
print(next(count))
print(next(count))
print(next(count))