############################# VIOLATION DESIGN #############################

from abc import ABC, abstractmethod

class IMultiFunctionInterface:
    def print(self): pass

    def scan(self): pass

    def copy(self): pass

    def fax(self): pass

class Printer(IMultiFunctionInterface):
    def print(self):
        print("Printing... ")

class Scanner(IMultiFunctionInterface):
    def scan(self):
        print("Scanning... ")

class Copier(IMultiFunctionInterface):
    def copy(self):
        print("Copying... ")

# Issues
# 1. This code has a single interface with methods for printing, scanning, copying and faxing
# 2. Each class implementing this interface must provide implementation for all methods, even those that are not related to its functionality

############################# SOLUTION #############################

class IPrinter:
    def print(self): pass

class IScanner:
    def scan(self): pass

class ICopier:
    def copy(self): pass

class IFax:
    def fax(self): pass

class Printer(IPrinter):
    def print(self):
        print("printing")

class Scanner(IScanner):
    def scan(self):
        print("Scanning... ")

class Copier(ICopier):
    def copy(self):
        print("Copying... ")

class Fax(IFax):
    def fax(self):
        print("Faxing... ")


# here we are not forcing classes to implement methods that are not related its functionality
