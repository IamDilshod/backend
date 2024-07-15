'''
multiple_letter_count("awesome") # {'a': 1, 'e': 2, 'm': 1, 'o': 1, 's': 1, 'w': 1}
'''

# flesh out multiple_letter count:
def multiple_letter_count(word):
   return {w: word.count(w) for w in word}

print(multiple_letter_count('awesome'))



print('-----------------------------------')

'''
is_palindrome('testing') # False
is_palindrome('tacocat') # True
is_palindrome('hannah') # True
is_palindrome('robert') # False
is_palindrome('amanaplanacanalpanama') # True
'''

def is_palindrome(word):
   word = word.strip()
   length = int(len(word)/2)
   print('length = ', length)
   for i in range(length):
      if word[i] != word[len(word)-1-i]:
         return False
      return True

print(is_palindrome('amanaplanacanalpanama'))


print('hello'[::-1])


print('---------------------------------')


'''
compact([0,1,2,"",[], False, {}, None, "All done"]) # [1,2, "All done"]
'''

def compact(l):
   t=[]
   for i in l:
      if bool(i):
         t.append(i)
   
   return t
   
print(compact([0,1,2,"",[], False, {}, None, "All done"]))