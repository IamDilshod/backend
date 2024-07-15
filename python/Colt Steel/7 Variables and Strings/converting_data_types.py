decimal = 12.42345256
integer = int(decimal)
print(integer) # 12

my_list = [1,2,3]
my_list_as_string = str(my_list)
print(my_list_as_string) # "[1,2,3]"


# Python program to demonstrate
# implicit type conversion
 
# Python automatically converts
# a to int
a = 5
print(type(a))
 
# Python automatically converts
# b to float
b = 1.0
print(type(b))
 
# Python automatically converts
# c to int as it is a floor division
c = a//b
print(c)
print(type(c))