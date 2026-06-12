# Java Full Stack Internship - Complete Learning Guide
  
## 📚 Table of Contents
 
1. [Course Overview](#course-overview)
2. [Module 1: Fundamentals](#module-1-fundamentals)
3. [Module 2: Object-Oriented Programming](#module-2-object-oriented-programming)
4. [Mock Interview Questions & Answers](#mock-interview-questions--answers)
5. [Coding Practice Problems](#coding-practice-problems)

---

## Course Overview

This repository contains comprehensive Java programming coursework covering fundamentals through advanced OOPs concepts.

### Topics Covered:
- **Basic Programming**: Variables, Data Types, Operators
- **Control Structures**: Conditional statements, Loops
- **Patterns**: Star patterns, Number patterns, Character patterns
- **Arrays & Sorting**: Array manipulation, Sorting algorithms
- **Strings**: String methods and manipulation
- **OOPs**: Classes, Objects, Constructors, Encapsulation, Inheritance
- **Methods**: Function declaration, parameters, return types

---

## Module 1: Fundamentals

### 1. **Operators & Conditionals**
   - Arithmetic, Logical, Relational operators
   - If-else, If-else-if ladder
   - Real-world applications: Grade calculation, Age verification, Bank withdrawal

### 2. **Loops & Patterns**
   - While loop, Do-while loop
   - For loops with pattern printing
   - Alphabet patterns (A-Z), Number patterns, Special character patterns

### 3. **Methods**
   - Static methods
   - Return types (int, double, char, boolean)
   - Method calling and reusability

### 4. **Arrays**
   - Array declaration and initialization
   - Bubble sort implementation
   - Using `Arrays.sort()` utility

### 5. **Strings**
   - `charAt()`, `length()`, `toCharArray()`
   - `indexOf()`, `lastIndexOf()`
   - `contains()`, `startsWith()`, `endsWith()`

---

## Module 2: Object-Oriented Programming

### 1. **Classes & Objects**
   - Class definition and object creation
   - Instance variables and methods
   - Static and non-static members
   - Instance initializer blocks

### 2. **Constructors**
   - Default and parameterized constructors
   - Constructor overloading
   - Constructor chaining
   - Real-world example: Banking system with deposit/withdraw functionality

### 3. **Encapsulation**
   - Access modifiers (private, public)
   - Getter and setter methods
   - Data hiding and validation
   - Example: Student class with validated age and percentage

### 4. **Inheritance**
   - Parent-child class relationships
   - Extending classes (Account → Bank)
   - Code reusability
   - Employee management system

---

## Mock Interview Questions & Answers

### **Beginner Level (Module 1)**

#### Q1: What is the difference between `==` and `.equals()` in Java?
**Answer:** 
- `==` compares memory addresses (references) for objects
- `.equals()` compares actual content/values
- Example: Two String objects with same text will be equal using `.equals()` but may not be equal using `==`

#### Q2: Explain the output of this code:
```java
int x = 13;
if(x%2==0 || x%3==0){
    System.out.println("biriyani");
}
```
**Answer:** Output: "biriyani" because 13 % 3 == 1 (false) but we use OR (||) operator, so only one condition needs to be true. Actually 13 % 3 = 1, so both are false. The answer should be NO OUTPUT.

#### Q3: What's the difference between `next()` and `nextLine()` in Scanner?
**Answer:**
- `next()` reads only one word (stops at whitespace)
- `nextLine()` reads entire line including spaces
- Example: Input "Hello World" → `next()` returns "Hello", `nextLine()` returns "Hello World"

#### Q4: How do you find all occurrences of a character in a String?
**Answer:**
```java
String str = "developer";
int first = str.indexOf('e');      // 1
int second = str.indexOf('e', first + 1);  // 3
int third = str.indexOf('e', second + 1);  // 7
```

#### Q5: Write a program to check if a number is prime.
**Answer:**
```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

---

### **Intermediate Level (Module 2)**

#### Q6: What is a constructor? Can it be private?
**Answer:**
- Constructor is a special method used to initialize objects
- It has same name as class and no return type
- Yes, constructors can be private (used in Singleton pattern)
- Example from your code: `Bank(double deposit, double withdraw, double accountBalance)`

#### Q7: Explain encapsulation with real-world example.
**Answer:**
- Encapsulation is wrapping data (variables) and code (methods) together
- Making variables private and providing public getters/setters
- Real example: ATM machine - internal workings are hidden, only buttons/screen are exposed
- Your code example: Student class with private name, age, percentage and public methods to access them

#### Q8: What is inheritance? Why use it?
**Answer:**
- Inheritance allows one class to acquire properties/methods of another class
- Benefits: Code reusability, Method overriding, Runtime polymorphism
- Your example: `Hr extends Employee` - HR inherits employee properties

#### Q9: What happens when you create an object? Explain constructor chaining.
**Answer:**
1. Memory allocation
2. Default values to variables
3. Constructor execution
4. Constructor chaining: One constructor calls another using `this()` or `super()`
- Must be first statement in constructor

#### Q10: Difference between static and non-static members?
**Answer:**
| Static | Non-Static |
|--------|------------|
| Belongs to class | Belongs to object |
| Single copy for all objects | Separate copy for each object |
| Accessed via class name | Accessed via object reference |
| Cannot access non-static directly | Can access both static and non-static |

---

### **Advanced Level**

#### Q11: Can you override a static method?
**Answer:** No, static methods cannot be overridden. They are bound at compile time (method hiding). Only instance methods can be overridden.

#### Q12: What is the output?
```java
class A {
    static { System.out.println("A static"); }
    { System.out.println("A instance"); }
}
class B extends A {
    static { System.out.println("B static"); }
    { System.out.println("B instance"); }
}
// In main: new B();
```
**Answer:**
```
A static
B static
A instance
B instance
```
(Static blocks execute once when class loads, instance blocks execute on each object creation)

#### Q13: Design a banking system with multiple account types.
**Answer:**
```java
class Account {
    protected long accountNumber;
    protected double balance;
    
    public Account(long accNum, double balance) {
        this.accountNumber = accNum;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(long accNum, double balance, double rate) {
        super(accNum, balance);
        this.interestRate = rate;
    }
    
    public void addInterest() {
        balance += balance * interestRate / 100;
    }
}
```

---

## Coding Practice Problems

### **Level 1: Basic Programs**

#### Problem 1: Pattern Printing
Write a program to print the following patterns:

**Pattern A:**
```
* * * * *
*       *
*       *
*       *
* * * * *
```

**Pattern B (Diamond):**
```
  *
 * *
* * *
 * *
  *
```

**Pattern C (Number Pyramid):**
```
    1
   121
  12321
 1234321
123454321
```

---

#### Problem 2: Number Operations
Write programs to:
1. Check if a number is Armstrong number (sum of cubes of digits = number itself)
   - Example: 153 = 1³ + 5³ + 3³ = 153 ✓
2. Print Fibonacci series up to n terms
3. Find GCD and LCM of two numbers

---

#### Problem 3: String Manipulation
Write programs to:
1. Check if a string is palindrome (reads same forwards and backwards)
2. Count vowels, consonants, digits, and special characters in a string
3. Reverse a string without using built-in functions
4. Check if two strings are anagrams (same characters, different arrangement)
   - Example: "listen" and "silent"

---

### **Level 2: Intermediate Programs**

#### Problem 4: Array Operations
Implement:
1. Find second largest and second smallest element in array
2. Rotate array by k positions
3. Remove duplicates from sorted array
4. Merge two sorted arrays into third array
5. Move all zeros to end while maintaining order of non-zero elements

---

#### Problem 5: Matrix Operations
Create a menu-driven program for matrix operations:
1. Add two matrices
2. Multiply two matrices
3. Transpose of a matrix
4. Check if matrix is identity matrix
5. Find sum of diagonal elements

---

#### Problem 6: Number Series
Print the following series:
1. 1, 3, 6, 10, 15, 21... (Triangular numbers - sum of natural numbers)
2. 1, 1, 2, 3, 5, 8, 13... (Fibonacci)
3. 2, 6, 12, 20, 30... (n×(n+1))
4. 1, 11, 21, 1211, 111221... (Look-and-say sequence)

---

### **Level 3: OOPs Concepts**

#### Problem 7: Library Management System
Design classes for a library:
```
Requirements:
- Book class with: title, author, price, quantity
- Methods: addBook(), sellBook(), displayInfo()
- Use encapsulation (private variables, public methods)
- Create Library class that manages multiple books
- Implement search functionality by title/author
```

---

#### Problem 8: Student Grading System
```
Create Student class with:
- name, rollNumber, marks[5] (for 5 subjects)
- Methods: calculateTotal(), calculateAverage(), getGrade()
- Grade criteria:
  * Average >= 90: A+
  * 80-89: A
  * 70-79: B+
  * 60-69: B
  * 50-59: C
  * <50: Fail
- Create StudentDatabase class to store and retrieve student records
```

---

#### Problem 9: E-commerce Shopping Cart
```
Classes needed:
1. Product: productId, name, price, quantity
2. CartItem: Product, quantity, totalAmount
3. ShoppingCart: List<CartItem>, addItem(), removeItem(), calculateTotal()
4. Customer: name, email, cart, checkout()

Features:
- Add/remove products from cart
- Apply discount coupons
- Calculate final bill with GST
- Generate invoice
```

---

#### Problem 10: Employee Management System
```
Class Hierarchy:
Employee (base class)
├── id, name, salary, department
├── calculateSalary()
└── displayInfo()

Manager extends Employee
├── bonus (additional property)
├── Override calculateSalary() to include bonus
└── manageTeam()

Developer extends Employee
├── skills[] (array of technical skills)
├── Override calculateSalary() with skill-based incentives
└── writeCode()

Tester extends Employee
├── testCasesWritten
├── bugsFound
└── Override calculateSalary() with performance metrics
```

**Task:** Create objects of each type, store in array, and display all employees with their calculated salaries.

---

### **Level 4: Real-World Applications**

#### Problem 11: ATM Machine Simulation
```
Features:
- User authentication (PIN verification)
- Check balance
- Cash deposit
- Cash withdrawal (with validation)
- Mini statement (last 5 transactions)
- Change PIN

Classes:
- Account: accountNumber, pin, balance, transactions[]
- ATM: validateUser(), performTransaction()
- Transaction: type, amount, timestamp
```

---

#### Problem 12: Hotel Reservation System
```
Classes:
- Room: roomNumber, type(Single/Double/Deluxe), price, isOccupied
- Customer: name, contact, checkInDate, checkOutDate
- Reservation: customer, room, numberOfDays, totalAmount
- Hotel: rooms[], addReservation(), cancelReservation(), checkAvailability()

Features:
- Book available rooms
- Cancel reservations
- Calculate bill with taxes
- Display room status
```

---

#### Problem 13: Vehicle Rental System
```
Vehicle (base class)
├── vehicleId, brand, model, rentalPrice, isRented
└── calculateRentalCost(days)

Car extends Vehicle
├── numberOfSeats, fuelType
└── applyDiscount() for long-term rental

Bike extends Vehicle
├── engineCapacity, hasGear
└── applyInsurance()

RentalAgency:
- Maintain fleet of vehicles
- Rent vehicle to customer
- Return vehicle and calculate final cost
- Track rental history
```

---

### **Level 5: Algorithm Challenges**

#### Problem 14: Sorting Visualizer
Implement different sorting algorithms and display step-by-step:
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
4. Quick Sort
5. Merge Sort

For each algorithm, count number of comparisons and swaps.

---

#### Problem 15: Password Validator
Create a robust password validator:
```
Criteria:
- Minimum 8 characters
- At least 1 uppercase letter
- At least 1 lowercase letter
- At least 1 digit
- At least 1 special character (@#$%^&*)
- Cannot contain username

Features:
- Validate password strength (Weak/Medium/Strong)
- Suggest improvements
- Generate strong random passwords
```

---

#### Problem 16: Contact Management System
```
Contact: name, phone[], email, address, group(Family/Friends/Work)
ContactManager: 
- addContact(), deleteContact(), updateContact()
- searchByName(), searchByPhone()
- groupContacts()
- exportContacts()
- mergeDuplicateContacts()

Advanced Features:
- Speed dial assignment
- Blacklist numbers
- Recent calls log
- Favorite contacts
```

---

## Quick Reference: Common Patterns

### Triangle Patterns
```java
// Right triangle
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}

// Inverted triangle
for(int i=n; i>=1; i--) {
    for(int j=1; j<=i; j++)
        System.out.print("* ");
    System.out.println();
}

// Pyramid
for(int i=1; i<=n; i++) {
    for(int j=1; j<=n-i; j++)
        System.out.print(" ");
    for(int j=1; j<=2*i-1; j++)
        System.out.print("*");
    System.out.println();
}
```

### Number Patterns
```java
// Floyd's Triangle
int num = 1;
for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++)
        System.out.print(num++ + " ");
    System.out.println();
}

// Pascal's Triangle
for(int i=0; i<n; i++) {
    int coef = 1;
    for(int j=0; j<=i; j++) {
        System.out.print(coef + " ");
        coef = coef * (i - j) / (j + 1);
    }
    System.out.println();
}
```

---

## Study Tips

1. **Practice Daily**: Code at least 2-3 problems every day
2. **Understand Logic**: Don't memorize code, understand the logic
3. **Dry Run**: Trace code execution on paper before running
4. **Debug Yourself**: Learn to identify and fix errors
5. **Build Projects**: Apply concepts in mini-projects
6. **Teach Others**: Explaining reinforces your understanding

---

## Recommended Next Steps

1. ✅ Master all patterns (done!)
2. ✅ Understand OOPs concepts thoroughly (done!)
3. 📚 Learn Exception Handling
4. 📚 Study Collections Framework (ArrayList, HashMap, etc.)
5. 📚 File I/O operations
6. 📚 Multithreading basics
7. 📚 Start building real projects

---

## Resources

- **Java Documentation**: https://docs.oracle.com/javase/
- **Practice Platforms**: LeetCode, HackerRank, Codeforces
- **YouTube Channels**: Programming with Mosh, CodeWithHarry
- **Books**: Head First Java, Effective Java

---

## 🔥 Important Key Points for Interviews

### **Most Asked Java Questions:**

1. **`public static void main(String[] args)` breakdown:**
   - `public`: Accessible from anywhere
   - `static`: Can be called without creating object
   - `void`: Returns nothing
   - `main`: Entry point method name
   - `String[] args`: Command line arguments

2. **Difference between Overloading and Overriding:**
   ```java
   // Overloading (Compile-time polymorphism)
   // Same class, same method name, different parameters
   void display() {}
   void display(int a) {}
   void display(String s) {}
   
   // Overriding (Runtime polymorphism)
   // Different class (parent-child), same method signature
   class Parent { void show() {} }
   class Child extends Parent { void show() {} } // Override
   ```

3. **Access Modifiers Hierarchy:**
   ```
   private < default < protected < public
   (class only)  (package)    (subclass)  (everywhere)
   ```

4. **`this` keyword uses:**
   - Refer current class instance variables
   - Invoke current class constructor
   - Return current class object
   - Pass as argument in methods

5. **`super` keyword uses:**
   - Access parent class variables
   - Call parent class constructor
   - Invoke parent class methods

6. **Static vs Instance Block:**
   ```java
   class Demo {
       static { 
           System.out.println("Static block"); 
       } // Runs once when class loads
       
       { 
           System.out.println("Instance block"); 
       } // Runs every time object is created
   }
   ```

7. **Final Keyword:**
   - `final variable`: Cannot change value (constant)
   - `final method`: Cannot override
   - `final class`: Cannot inherit

8. **Abstract Class vs Interface:**
   | Abstract Class | Interface |
   |----------------|-----------|
   | Can have abstract + concrete methods | All methods abstract (before Java 8) |
   | Can have any access modifier | Public by default |
   | Can have instance variables | Only constants (static final) |
   | One class can extend one abstract class | Can implement multiple interfaces |
   | Used for "is-a" relationship | Used for "can-do" capability |

9. **Constructor Rules:**
   - Name must match class name
   - No return type (not even void)
   - Called automatically when object is created
   - If no constructor defined, JVM provides default
   - Can be overloaded but not overridden

10. **String Immutability:**
    - String objects cannot be changed once created
    - Every modification creates new String object
    - String literal pool saves memory
    - Use `StringBuilder` for mutable strings

---

## ⚡ Quick Tips for Coding Rounds

### **Pattern Printing Strategy:**
```
Always identify:
1. Number of rows = n
2. Columns per row
3. Conditions for * vs space
4. Relationship between i, j, and n
```

### **Common Conditions:**
```java
// Hollow patterns
if(i==0 || i==n-1 || j==0 || j==n-1) print("*");

// Diagonal patterns  
if(i==j || i+j==n-1) print("*");

// Border patterns
if(i==0 || i==n-1 || j==0 || j==n-1) print("*");
else print(" ");
```

### **Number Operations Shortcuts:**
```java
// Reverse a number
while(n > 0) {
    rev = rev * 10 + n % 10;
    n /= 10;
}

// Count digits
int count = 0;
while(n > 0) {
    count++;
    n /= 10;
}

// Check palindrome
return original == reversed;

// GCD of two numbers
while(b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
}
return a; // GCD
```

### **Array Tricks:**
```java
// Second largest
int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
for(int num : arr) {
    if(num > first) {
        second = first;
        first = num;
    } else if(num > second && num != first) {
        second = num;
    }
}

// Rotate array by k positions
reverse(arr, 0, n-1);
reverse(arr, 0, k-1);
reverse(arr, k, n-1);

// Move zeros to end
int pos = 0;
for(int i=0; i<n; i++) {
    if(arr[i] != 0) {
        arr[pos++] = arr[i];
    }
}
while(pos < n) arr[pos++] = 0;
```

### **String Interview Questions Formula:**
```java
// Convert string to char array
char[] chars = str.toCharArray();

// Check palindrome string
StringBuilder sb = new StringBuilder(str);
return str.equals(sb.reverse().toString());

// Count character frequency
Map<Character, Integer> map = new HashMap<>();
for(char c : str.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}

// Remove duplicates
LinkedHashSet<Character> set = new LinkedHashSet<>();
for(char c : str.toCharArray()) set.add(c);
StringBuilder result = new StringBuilder();
for(char c : set) result.append(c);
```

---

## 🎯 Top 10 Must-Know Programs

1. ✅ Fibonacci Series
2. ✅ Prime Number Check
3. ✅ Palindrome (Number & String)
4. ✅ Factorial (Iterative & Recursive)
5. ✅ Armstrong Number
6. ✅ Bubble Sort / Selection Sort
7. ✅ Binary Search / Linear Search
8. ✅ Pattern Printing (Triangle, Diamond, Pyramid)
9. ✅ Swap Two Numbers (with/without third variable)
10. ✅ Find Largest/Smallest in Array

---

## 📝 Important Output Questions

**Q1: What's the output?**
```java
String s1 = "Hello";
String s2 = new String("Hello");
System.out.println(s1 == s2);        // false
System.out.println(s1.equals(s2));   // true
```

**Q2: What's the output?**
```java
class Test {
    static int x = 10;
    static { x = 20; }
    { x = 30; }
    public static void main(String[] args) {
        new Test();
        System.out.println(x);  // 30
    }
}
```

**Q3: What's the output?**
```java
int[] arr = {1, 2, 3};
change(arr);
System.out.println(arr[0]);  // 100
static void change(int[] a) {
    a[0] = 100;
}
```

**Q4: What's the output?**
```java
System.out.println(10 + 20 + "30");    // "3030"
System.out.println("10" + 20 + 30);    // "102030"
System.out.println(10 + "20" + 30);    // "102030"
```

---

## 💡 Pro Tips

1. **Always dry run code** before writing on paper
2. **Use meaningful variable names** in interviews
3. **Handle edge cases** (null, empty, negative values)
4. **Comment your logic** while writing
5. **Start with brute force**, then optimize
6. **Ask clarifying questions** in interviews
7. **Think aloud** while solving problems
8. **Test your solution** with different inputs

---

## 🚨 Common Mistakes to Avoid

❌ Not initializing variables  
❌ Array index out of bounds  
❌ Infinite loops (wrong condition)  
❌ Comparing strings with `==` instead of `.equals()`  
❌ Forgetting to break in switch cases  
❌ Not handling null/empty inputs  
❌ Missing base case in recursion  
❌ Using wrong access modifiers  
❌ Memory leaks (not closing resources)  
❌ Not following naming conventions  

---

**Created during Java Full Stack Internship**  
*Keep Learning, Keep Coding! 🚀*
