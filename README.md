## Lab: Inheritance
## @author Samuel A. Rebelsky
## @author Arsal Shaikh
## @author Shibam Mukhopadhyay

Exercise 2: Tally Summary
You can call the constructor of the super class in the subclass using the "super()".
When we create a new subclass from the parent class and change the parameters of this class, we need to ensure that the parameters also are changed when calling this new class.

Exercise 3: DecrementableCounter Summary
Interfaces do not recognize the methods of their subclasses. You can cast subclasses into parent classes but not the other way round.

Exercise 4: NamedCounter Summary
Super Constructor call must be the first statement in a constructor for a subclass that extends to a parent class. Without toString method in Named Counter, it just outputs the toString method of the parent class. Then you can override this toString method in subclass to provide additional functionality. One thing we tested as well was if we did not have the super.toString() and it still worked fine. 

Exercise 5: NamedCounter Revisited Summary
If a subclass extends to another subclass, it does not affect the methods of the parent class that were called. 
When a subclass of a subclass is called, the constructor of its superclass is called first. Similarly when the subclass of a parentclass is called, the constructor of its superclass is called first.

Exercise 6: Double Counters Summary
A explicit super constructor is required for DoubleCounter to compile. When overriding a method from superclass that throws an exception, we must include the throws exception in the override method call as well.

Exercise 7: Bounded Counters Summary
We learnt that computer hate us because debugging this was not fun. We learnt that we can cast subclasses into their superclass and still access the methods and fields of the subclass. Because of the field and method override, we were able to get an exception for when the bound was exceeded.

Exercise 8: Double Counters, Revisited
A class which polymorphically takes its interface as an argument can also take itself or other classes or subclasses that implement or extend to the same interface as an argument to itself.

## New Java Project ReadmeFile information:
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
