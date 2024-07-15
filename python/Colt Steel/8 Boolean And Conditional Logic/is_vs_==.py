# The is keyword is used to test if two variables refer to the same object.
# The test returns True if the two objects are the same object.
# The test returns False if they are not the same object, even if the two objects are 100% equal.

# Use the == operator to test if two variables are equal.
a1 = 1
a2 = 1
print(a1 == a2) # True
print(a1 is a2) # True

a = [1,2,3]
b = [1,2,3]
print(a == b) # True
print(a is b) # False


