# Flow Control Challenge

The system will receive two parameters via the terminal, representing two integer numbers. With these two numbers, you will determine the number of iterations (`for` loop) and perform the printing in the console (`System.out.print`) of the incremented numbers. For example:

If you input the numbers 12 and 30, we will have an iteration (`for` loop) with 18 occurrences to print the numbers, such as "Printing number 1", "Printing number 2", and so on.

If the first parameter is GREATER than the second parameter, you should throw a custom exception named `ParametrosInvalidosException` with the message: "The second parameter must be greater than the first."

Create a project named `DesafioControleFluxo`.

Within the project:
- Create a class named `Contador.java` to implement all the coding for our program.
- Create a class named `ParametrosInvalidosException` which will represent the business exception in the system.
