# ArrayList to Array Conversion in Java

## Overview
This repository contains a Java program that demonstrates how to convert an `ArrayList` into an array. The program takes user input to populate an `ArrayList`, converts it into an array, and then prints the array elements.

## Code Explanation

```java
package arrayList_Operations;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_to_Array 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        System.out.println("How many elements to enter in ArrayList");
        int size = s.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i <= size - 1; i++) 
        {
            arrayList.add(s.nextInt());
        }
        
        Integer[] arr = new Integer[arrayList.size()];
        arrayList.toArray(arr);
        
        for (Integer ele : arr) 
        {
            System.out.println(ele + " ");
        }
    }
}
```

### **Step-by-Step Explanation**

1. **Importing Required Packages:**  
   - `import java.util.ArrayList;` → Imports the `ArrayList` class from the Java Collections Framework.
   - `import java.util.Scanner;` → Imports `Scanner` to take user input.

2. **Declaring Scanner and ArrayList:**  
   - `Scanner s = new Scanner(System.in);` → Creates a `Scanner` object to read input from the user.
   - `ArrayList<Integer> arrayList = new ArrayList<>();` → Declares an `ArrayList` that stores `Integer` values.

3. **Taking Input for ArrayList Size and Elements:**  
   - `int size = s.nextInt();` → Reads the number of elements the user wants to enter.
   - A `for` loop runs from `0` to `size-1`, taking integer inputs and adding them to the `ArrayList` using `arrayList.add(s.nextInt());`.

4. **Converting ArrayList to Array:**  
   - `Integer[] arr = new Integer[arrayList.size()];` → Declares an array of `Integer` type with the same size as the `ArrayList`.
   - `arrayList.toArray(arr);` → Converts the `ArrayList` into an array and stores the values.

5. **Printing the Array Elements:**  
   - The program uses an enhanced `for` loop (`for-each loop`) to iterate through the array and print each element.

## **Understanding Key Concepts**

### **1. ArrayList**
- `ArrayList` is a resizable array implementation in Java's Collections Framework.
- Unlike normal arrays, `ArrayList` can grow and shrink dynamically.
- It allows fast retrieval of elements, easy insertion, and deletion.
- Example:
  ```java
  ArrayList<Integer> numbers = new ArrayList<>();
  numbers.add(10);
  numbers.add(20);
  System.out.println(numbers); // Output: [10, 20]
  ```

### **2. Integer (Wrapper Class)**
- `Integer` is a wrapper class for the primitive data type `int`.
- It allows `int` values to be stored in collections like `ArrayList`, which cannot hold primitive types.
- Example:
  ```java
  Integer num = 100;
  int x = num; // Auto-unboxing
  System.out.println(x); // Output: 100
  ```

### **3. for-each Loop**
- The `for-each` loop (enhanced for loop) is used to iterate over collections or arrays without using an index.
- Syntax:
  ```java
  for (DataType variable : collection) {
      // Code to execute
  }
  ```
- In our program:
  ```java
  for (Integer ele : arr) {
      System.out.println(ele + " ");
  }
  ```
  This iterates over each element in the array and prints it.

## **Sample Output**
```
How many elements to enter in ArrayList
5
Enter the elements:
10
20
30
40
50
10 
20 
30 
40 
50 
```

## **Use Cases**
- Useful for converting `ArrayList` data into a fixed-size array.
- Helps in situations where APIs require an array instead of a list.
- Ideal for learning `ArrayList` and Java Collections concepts.

## **Conclusion**
This program effectively demonstrates how to convert an `ArrayList` to an array in Java. Understanding `ArrayList`, wrapper classes, and `for-each` loops will help you work efficiently with Java Collections and data structures.

## Clone
```
https://github.com/Ananthadatta02/Java-ArrayList_To_Array.git
```
