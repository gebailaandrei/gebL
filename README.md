# gebL - Programming language made in Java using ANTLR

## Installation
- ANTLR plugin is required.
- The .jar file of ANTLR is included in the project files.
- In IntelliJ go to File > Project Structure > Libraries and hit the "+" at the top and select Java. Then go in the Project file and select the .jar file and click Ok then click Apply and close the window.
- Open gebL.g4 in the editor and right click the list in the beginning of the file and select Configure Antlr.
- Select the output directory to be src folder and set the Package/namespace name to MainPackage then hit Ok.

## Features
- Variable declaration, assigning, operations and operation assigning.
- Order of operations, parenthesis operations.
- Data types: int, float. More will be added.
- Datastructures: DoublyLinked lists have been partially added, there is more work to do. They will serve as arrays.
- Loops: do ... while, while. More will be added.
- Decisionals: if else if else, switch, ternary.
- Logical expressions: ||, &&.
- Comparisons: >, <, >=, <=, ==, !=.
- Method creation, method calls, method return types (void, int), nested methods.
- Built in Print() method that can only print a string or a variable at a time. Concatenation will be implemented.

## Running
In order to run your own gebL code, write it in the file called "test.gebl" and then run the Main method inside the Main class.