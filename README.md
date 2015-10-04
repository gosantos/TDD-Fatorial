# TDD-Calculator
A simple calculator using TDD

# Running the program 

## Option 1:
For Linux users
>chmod 777 run.sh
>sudo ./run.sh

## Option 2:
Compile the test. On Linux or MacOS
> javac -cp .:junit-4.12.jar FatorialTest.java

and on Windows
> javac -cp .;junit-4.12.jar FatorialTest.java

Run the test from the command line. On Linux or MacOS
> java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore FatorialTest

and on Windows
> java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore FatorialTest
