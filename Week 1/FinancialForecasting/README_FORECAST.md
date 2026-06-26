# Financial Forecasting - Recursion

## Objective
Implement recursive function to calculate compound interest on investments over multiple years.

## What is Recursion?
A function that calls itself to solve smaller versions of the same problem.
Every recursive function needs a base case (when to stop) and recursive case (when to call itself again).

## Real World Use
- Bank interest calculations
- File system traversal (folders inside folders)
- Tree traversal algorithms
- Fibonacci sequences
- Factorial calculations

## Folder Structure
FinancialForecasting/
├── src/
│   ├── Investment.java
│   ├── RecursiveForecasting.java
│   └── ForecastingTest.java
├── README.md
└── ForecastingTest_output.png

## How to Run
cd src
javac Investment.java RecursiveForecasting.java ForecastingTest.java
java ForecastingTest

## Expected Output
Initial Amount: $1000.0
Interest Rate: 5.0%

=== Recursive Forecasting ===

Year 1: $1050.00
Year 2: $1102.50
Year 3: $1157.63
Year 4: $1215.51
Year 5: $1276.28

## Concepts Used
- Recursion
- Base case and recursive case
- Compound interest formula
- String formatting

## Learning Outcomes
- Understood how recursion works
- Learned base case is essential
- Learned recursion vs loops
- Understood real-world financial calculations