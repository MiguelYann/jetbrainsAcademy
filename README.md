# Jetbrains academy

## Operators 

##### Reversing

Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

- [Solution](./src/fr/myt/learn/operator/Reversing.java)  
- [Test](./src/fr/myt/learn/operator/ReversingTest.java)

##### Decrement

Write a program that reads four numbers and decrements each of them.
The program must output the results in the same order separated by spaces.

- [Solution](./src/fr/myt/learn/operator/Decrement.java)
- [Test](./src/fr/myt/learn/operator/DecrementTest.java)


> Be aware the solution that implement for this exercisealso works but I find one issue on my Unit test. Be free to see it

##### Replacing characters

Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

The program should print out the resulting string.

- [solution](./src/fr/myt/learn/strings/Replacing.java)



##### Leap Year

Find whether the given year is a leap year.

Just a reminder: leap years are those years in which the year’s number is either divisible by 4, but not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).

- [Solution](./src/fr/myt/learn/conditional/Year.java)  


##### Custom Fizzbuzz

Fizz Buzz is a classic programming problem. Here is its slightly modified version.


Write a program that takes the input of two integers: the beginning and the end of the interval (both numbers belong to the interval).

The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it; if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.

Output each number or the word on a separate line.

- [Solution](./src/fr/myt/learn/loops/FizzBuzz.java)  
- [Test](./src/fr/myt/learn/loops/FizzBuzzTest.java)


##### The count of numbers divisible by N

Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

- [Solution](./src/fr/myt/learn/loops/CountDivisible.java)  
- [Test](./src/fr/myt/learn/loops/CountDivisibleTest.java)

##### The product of numbers from a to b

Write a program that prints the product of all integer numbers from a to b (a < b).
Include a and exclude b from the product.

- [Solution](./src/fr/myt/learn/loops/IntervalMultiplicative.java)

##### The largest element of a sequence

Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.

The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.

- [Solution](./src/fr/myt/learn/loops/SequenceInput.java)  
- [Test](./src/fr/myt/learn/loops/SequenceInputTest.java)


##### Squares of natural numbers

Read an integer number N from the input and print all the squares of natural numbers:

* less than or equal to N,
* in ascending order.

- [Solution](./src/fr/myt/learn/loops/SquareNumber.java)   
- [Test](./src/fr/myt/learn/loops/SquareNumberTest.java)

##### The smallest value

A user inputs a long positive number m. You need to find out what is the smallest int number n such that n! > m.


- [Solution](./src/fr/myt/learn/loops/Smallest.java)  
- [Test](./src/fr/myt/learn/loops/Smallest.java)


##### Even or odd

Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". If the number is equal to 0, the program must stop reading and processing numbers.

* Input data

A sequence of natural numbers, each number in a new line.

* Output data

The sequence of words "even" and "odd". Each word in a new line.

Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.

- [Solution](./src/fr/myt/learn/branching/Numbers.java)


##### Bus tour 

A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.

But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?

The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.

You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i" (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.

- [Solution](./src/fr/myt/learn/branching/BusTour.java)



##### The (un)-ordered sequence 

Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false.

Keep in mind, if a number has the same value as the following number, it does not break the order.

The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

- [Solution](./src/fr/myt/learn/branching/SortIntelligent.java)
