# Factory Method Pattern

## Objective
Implement the Factory Method design pattern to create different types of documents in Java.

## What is Factory Method Pattern?
A design pattern that creates objects without exposing the creation logic,
we ask the factory for an object and it decides which class to objectify.

## Real World Use
- Spring Framework Bean Factory
- JDBC Database Connection Factory
- AWS SDK Client Factories

## Folder Structure
FactoryMethodPattern/
src/
 Document.java
 WordDocument.java
 PdfDocument.java
 ExcelDocument.java
 DocumentFactory.java
 FactoryTest.java
 README.md

## How to Run
cd src
javac Document.java WordDocument.java PdfDocument.java ExcelDocument.java DocumentFactory.java FactoryTest.java
java FactoryTest

## Expected Output
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
Unknown document type!

## Concepts Used
- Factory Method Design Pattern
- Interface and implements keyword
- Polymorphism
- Null checking

## Learning Outcomes
- Understood why Factory Pattern exists
- Learned interfaces in Java
- Learned polymorphism
- Learned null exception.