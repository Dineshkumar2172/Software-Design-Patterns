class BankAccount:
    def __init__(self, account_number, balance):
        self._account_number = account_number # protected attribute (single underscore)
        self.__balance = balance # private attribute (double underscore - name mangling
    
    def get_balance(self) -> int:
        return self.__balance
    
    def set_balance(self, balance: int) -> None:
        if balance >= 0:
            self.__balance = balance
        else:
            print("invalid balance")

    def deposit(self, amount: int) -> None:
        if amount > 0:
            self.__balance += amount
        else:
            print("invalid deposit amount")

    def withdraw(self, amount: int) -> None:
        # if withdrawal amount is greater than 0 and 
        # balance amount is greater than withdrawal amount
        if 0 < amount <= self.__balance:
            self.__balance -= amount # debit
        else:
            print("invalid withdrawal amount")

account = BankAccount("1234556354", 1000)

print(f"account number : {account._account_number}")
print(f"account balance : {account.get_balance()}")
