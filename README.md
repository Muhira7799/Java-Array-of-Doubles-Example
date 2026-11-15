# Java Array of Doubles Example

A small Java program that stores student marks in an array of `double` values and prints each one with a regular `for` loop.

## What It Demonstrates

```java
double[] marks = {85.5, 72.0, 90.5, 68.5, 77.0};

for (int i = 0; i < marks.length; i++) {
    System.out.println("Student " + (i + 1) + ": " + marks[i]);
}
```

- Declaring and initializing a `double[]` array
- Looping with an index from `0` to `marks.length - 1`
- Using `(i + 1)` so the students are numbered from 1 instead of 0

This is a one-dimensional array of decimal numbers, not a two-dimensional array.

## Output

```
Student Marks:
Student 1: 85.5
Student 2: 72.0
Student 3: 90.5
Student 4: 68.5
Student 5: 77.0
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac DoubleArrayExample.java
java DoubleArrayExample
```

## Project Structure

```
.
├── DoubleArrayExample.java
└── README.md
```

## Next Steps

- Calculate the total and the average of the marks
- Find the highest and lowest mark
- Read the marks from the user with `Scanner`
