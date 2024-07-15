class A:
   def do_something2(self):
      print('Method defined in: A')

class B(A):
   def do_something(self):
      print('Method defined in: B')  
      super().do_something2()

class C(A):
   def do_something(self):
      print('Method defined in: C')  
      # super().do_something()

class D(B, C):
   def do_something(self):
      print('Method defined in: D')
      super().do_something()

thing = D()
thing.do_something()

# Pastdagi methodlar kerakli methodlar hisoblanadi: 
# print(D.__mro__)
# print(D.mro())
# print(help(D))

#     A
#   /  \
#   B  C 
#   \  /
#    D
# D => B, C, A

