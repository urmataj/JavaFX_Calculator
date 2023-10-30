# JavaFX_Calculator
A JavaFX calculator application that can perform basic arithmetic operations (addition, subtraction, multiplication, division by using SceneBuilder. It contains four files:

# Calculator
The class that will handle the core logic of the calculator. Its instance variables:

- double operand1 (to store the first operand)
- double operand2 (to store the second operand)
- char operator (to store the arithmetic operator)
- double result (to store the result of the operation)

Its instance methods:
- setOperand1(double operand) (to set the first operand)
- setOperand2(double operand) (to set the second operand)
- setOperator(char operator) (to set the arithmetic operator)
- calculate() (to perform the calculation)
- getResult() (to get the result)
  
# (Main)CalculatorApplication class
The class responsible for launching the application and loading your FXML.

# FXML file
Responsible for what the application displays.

# CalculatorController class
FXML and java code adapter.
The class that is a layer between the java code and the FXML file. All fx:id links are connected through it, calls to interactive interface elements are processed in its methods, and initialization occurs immediately.
