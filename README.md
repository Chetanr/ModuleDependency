The task has been implemented using JAVA.

### Running the code

Clone the project. 

To run the code, use the terminal in your IDE (Visual Studio Code is preferred) or the command line,

1. navigate to TechTestModuleDependency->src directory

2. compile the project using the below command

    > **javac \*.java**

3. run the code using the below command

    > **java Main**

### Exception and Error Handling

Exception is thrown when trying to find the dependency of a module that is not existing.

### Limitations

1. The program currently takes into account only hardcoded modules and check for the dependencies against them.
2. The code does not read the test data from the file.
3. The code runs only once. For example, if you want to run it to find dependencies of more than one module, you need to re-run the code everytime.
