## This Project follows all the best coding practices.


    Proper Naming Convention: Are variable names descriptive? Do method names accurately describe their function? Are there any typos in the codebase?
    Magic Numbers: Are there any hard-coded values that should be replaced with named constants or variables?
    Single Responsibility Principle: Do classes, functions, and methods follow the single responsibility principle?
    Redundant or Duplicate Code: Is there any redundant or duplicate code? (CPD can be used to detect this)
    Commented Code: Is commented code present and does it accurately describe the intent and function of the code?
    Code Modularity: Is the code modular and easy to understand?
    Overuse of Options: Are options being overused?
    Nested Pattern Matching: Can nested pattern matching be converted into for comprehensions to make the code more readable?
    Related Data Structures: Do data structures contain only related data?
    Appropriate Method Arguments: Do method arguments have simple and appropriate names and types?
    Function Length: Do functions in the codebase confirm to the length (more than 50 lines of code)?
    Default Arguments: Are default arguments being used instead of hardcoded values?
    Tuples: Are tuples being used judiciously, or would a case class be more appropriate?
    Complexity: Is the code too complex to understand?
    Comments: Are comments present and do they describe the intent of the code?
    Unusual Behaviour: Is any unusual behaviour or edge-case handling described?
    Third-Party Libraries: Is the use and function of third-party libraries documented?
    Data Structures: Are data structures and units of measurement explained?
    Incomplete Code: Is there any incomplete code, and if so, is it flagged appropriately with a marker like 'TODO'?
    Logging: Are there defined loggers in the code? Are we capturing information at the appropriate log levels? Are we logging exceptions correctly for debugging purposes?
    Security: Are any security checks and logging being done in a proper manner?
    Testability: Is the code testable?
    Testing: Are tests comprehensive and covering the intended functionality?
    Array Bounds: Are arrays checked for 'out-of-bound' errors?
    Existing APIs: Could any test code be replaced with the use of an existing API?
    Naming Conventions: Are proper naming conventions being followed?
    Readability: Is the code easy to read and understand?
    Code Smells and Anti-Patterns: Are we avoiding code smells and anti-patterns?
    SOLID Principles: Does the code comply with the SOLID principles?
    Best Practices and Design Patterns: Are we following best practices and design patterns?
    Code Organization: Is the code well-organized and modular?
    Documentation: Is the code properly commented and documented?
    Data Structures and Algorithms: Are appropriate data structures and algorithms being used?
    Code Duplication: Are we avoiding code duplication and redundancy?
    Security Best Practices: Are we following security best practices?
    
    
## Assignment-1

This code defines a class CapitalizeAlphabetA that contains two methods: capitalizeAllAs and capitalizeAs.
The capitalizeAs method takes a single string as input and returns a new string with all occurrences 
of 'a' or 'A' replaced with 'A'. If the input string is empty, an IllegalArgumentException is thrown.
The capitalizeAllAs method takes a list of strings as input and returns a new list of strings with all
'a's capitalized using the capitalizeAs method. This method is wrapped in a Try block,
which allows for error handling if an exception is thrown by capitalizeAs.
Overall, this code provides a utility for capitalizing all occurrences of 'a' or 'A' in a list of strings.



## Assignment-2

This code defines a class named SquareRootCalculator that calculates the square roots of a list of integers using the map function.
It takes a list of integers as input and returns a list of their square roots. If an exception occurs during the calculation, 
it returns an empty list. The calculateSquareRoots method of the class uses the Try monad to handle exceptions and returns the calculated 
square roots or an empty list, depending on whether the calculation was successful or not. The code handles specific exceptions such as 
IllegalArgumentException, ArithmeticException, and NullPointerException, and returns an empty list for those cases. It also handles any
other exceptions that might occur during the calculation and returns an empty list for those as well.
    
    
## Assignment-3

This code defines a class named KthElementFromEnd that finds the kth element from the end of a given list of type A. 
The class takes a list of type A as input and provides a method named getKthElementFromEnd that returns an Option type.
The method takes an integer kthPosition as input, which specifies the position of the element to be returned from the end of the list.
If the position is invalid or the list is empty, it returns None.

The getKthElementFromEnd method first checks if the kthPosition is less than or equal to 0 or if the list is empty. 
If it is, it returns None. Otherwise, it calculates the position of the kth element from the start of the list, 
by dropping the length of the list minus kthPosition elements from the beginning of the list, and then taking the
first element of the resulting list. It returns an Option that contains the kth element from the end of the list, 
or None if an exception occurs during the calculation. The code catches any exception and returns None.



    
    
    
