# Singleton Pattern - Logger

## Objective
Implement the Singleton design pattern using a Logger class in Java.

## What is Singleton?
A design pattern that ensures only one object of a class is created.
No matter how many times you ask for it  you get the same object.

## Real World Use
- Used for Logging frameworks
- Database connection
- Configuration 

## Folder Structure
SingletonPatternExample/
├── src/
│   ├── Logger.java
│   └── SingletonTest.java
└── README_SINGLETON.md

## How to Run
cd src
javac Logger.java SingletonTest.java
java SingletonTest

## Expected Output
{LOG}: First message
{LOG}: Second message
Same instance - Singleton successful!

## Concepts Used
- Singleton Design Pattern
- Private constructor
- Static variables and methods
- Object reference comparison

## Learning Outcomes
- Understood why Singleton exists
- Learned private constructors
- Learned static keyword
- Learned how memory references work in Java