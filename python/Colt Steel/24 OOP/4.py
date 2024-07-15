class BankAccount:
    def __init__(self, owner):
        self.owner = owner
        self.balance = 0.0
        
    def deposit(self, m):
         self.balance+=m
         return self.balance
        
    def withdraw(self, m):
        self.balance-=m
        return self.balance
        