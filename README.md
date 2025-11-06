# COP2251 – Java Assignment 9

## Summary
This set of programs introduces object-oriented design through two small domains: a bank `Account` model with deposits, withdrawals, and interest, and a `Triangle` model with side data, perimeter, and area computation. The work emphasizes encapsulation, constructors, accessors/mutators, and driver classes that exercise and display class behavior.

## Program Behavior
- Account / AccountTest  
  - `Account` encapsulates `id`, `balance`, `annualInterestRate`, and the creation date.  
  - Provides standard getters/setters, `withdraw(double)`, and `deposit(double)`.  
  - `getMonthlyInterest()` is derived from the annual rate (monthly rate × current balance).  
  - `AccountTest` constructs an `Account` with ID `1122` and an initial balance of `20000`, sets `annualInterestRate` to `4.5`, performs a withdrawal of `2500` and a deposit of `3000`, then prints the balance, monthly interest, and the account’s creation date.

- Triangle / TriangleTester  
  - `Triangle` stores three side lengths (`side1`, `side2`, `side3`), provides constructors (default and parameterized), and exposes `getPerimeter()` along with an `getArea()` implementation based on the triangle’s sides (Heron’s formula is indicated in comments; the current return is the semi-perimeter `s`).  
  - `TriangleTester` builds a default `Triangle()` and a specified `Triangle(2, 2, 2)` and prints each triangle’s sides, computed area, and perimeter.

## Key Concepts Demonstrated
- Encapsulation: Private fields with public accessors/mutators.
- Constructors: Default and parameterized object construction.
- Derived Values: Monthly interest from annual rate; perimeter and (intended) area from side lengths.
- Driver Programs: Separate tester classes to validate and display model behavior.
- Packages and Modules: Source under `package nazario9` with a simple `module-info.java`.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands (from the `nazario9/src` directory):
javac -d ../out module-info.java nazario9/Account.java nazario9/AccountTest.java nazario9/Triangle.java nazario9/TriangleTester.java  
java -cp ../out nazario9.AccountTest  
java -cp ../out nazario9.TriangleTester
