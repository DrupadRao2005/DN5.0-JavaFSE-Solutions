# E-commerce Search - Linear vs Binary Search

## Objective
Compare Linear Search and Binary Search algorithms for finding products in an e-commerce database.

## What is Big O Notation:
Big O measures how fast an algorithm runs as data grows.
- Linear Search: O(n) - checks every item
- Binary Search: O(log n) - divides list in half each time

For 1 million products:
- Linear Search: ~1 million comparisons
- Binary Search: ~20 comparisons

## Real World Use
- Amazon product search
- Flipkart inventory lookup
- Any database with fast search needs

## Folder Structure
EcommerceSearch/
├── src/
│   ├── Product.java
│   ├── LinearSearch.java
│   ├── BinarySearch.java
│   └── SearchTest.java
├── README.md
└── SearchTest_output.png

## How to Run
cd src
javac Product.java LinearSearch.java BinarySearch.java SearchTest.java
java SearchTest

## Expected Output
 Searching for Product ID: 3

Linear Search: Found at index 2
Binary Search: Found at index 2

 Searching for Product ID: 10 

Linear Search: Not found
Binary Search: Not found

## Concepts Used
- Linear Search Algorithm
- Binary Search Algorithm
- Big O Notation
- Array manipulation
- Getter methods

## Learning Outcomes
- Understood algorithm efficiency
- Learned Big O notation
- Learned when to use each search
- Understood performance difference