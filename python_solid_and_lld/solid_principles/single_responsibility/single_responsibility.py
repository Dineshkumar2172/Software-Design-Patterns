############################# VIOLATION DESIGN #############################

class TodoList:
    def __init__(self):
        self.tasks = []
    
    def add_task(self, task):
        self.tasks.append(task)

    def delete_task(self, task):
        self.tasks.remove(task)

    def display_tasks(self):
        for task in self.tasks:
            print(task)
    
    def input_task(self):
        task = input("enter the task  : ")
        self.tasks.append(task)

    def remove_task(self):
        task = input("enter the task to be removed : ")
        self.tasks.remove(task)

# The above class violates the SRP
#       1. The above todolist handles thes multiple responsibilities: managing task, handling user inputs and displaying tasks.
#       2. This violates the SRP, which states that a class should have only one reason to change (one responsibility).


############################# SOLUTION #############################

class TaskManager:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def delete_task(self, task):
        self.tasks.remove(task)

class TaskPresenter:
    # this method can be access using the class itself
    @staticmethod # it's to define a method that does not opearate on the instance of a class
    def display_tasks(tasks):
        for task in tasks:
            print(task)


class InputManager:
    @staticmethod
    def input_task():
        return input("Enter a task : ")

    @staticmethod
    def remove_task():
        return input("Enter the task to be removed : ")
