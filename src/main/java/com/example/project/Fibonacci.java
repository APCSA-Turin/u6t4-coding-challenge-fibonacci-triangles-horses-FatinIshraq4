package com.example.project;

import java.util.Arrays;

public class Fibonacci {
  // instance variable
  private int[] sequence;

  /** Constructor: sets sequence to an array containing the first seqLen numbers
      in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
      previous two numbers to generate the next number,
      e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…

      All Fibonacci sequences start out with 0 and 1 as the first two numbers.

      PRECONDITION: seqLen >= 2
    */
  public Fibonacci(int seqLen) {
    sequence = new int[seqLen];
    sequence[0]=0;
    sequence[1]=1;
    for (int i=2; i<sequence.length; i++) {
      sequence[i]=sequence[i-1]+sequence[i-2];
    }
  }

  /** Getter method: returns a reference to the sequence array
    */
  public int[] getSequence() {
    return sequence;
  }

  /** Returns the index in the array where a particular value, searchVal, is
      located in sequence; if not found, returns -1.  If searchVal == 1, return
      first index where 1 is found (since this value appears twice in Fibonacci
      sequences longer than 2 numbers)
   */
  public int getIndexOf(int searchVal) {
    for (int i=0; i<sequence.length; i++) {
      if (sequence[i]==searchVal) {return i;}
    }
    return -1;
  }

  /** Assigns sequence to a new array that extends the current sequence by
      howManyMore numbers of the Fibonnaci sequence

      For example, if sequence is {0, 1, 1, 2, 3, 5} and this method is called
      with howManyMore = 3, sequence would be assigned to a new array with
      the next 3 Fibonacci numbers added: {0, 1, 1, 2, 3, 5, 8, 13, 21}
   */
  public void extendBy(int howManyMore) {
    int[] newSeq = new int[sequence.length+howManyMore];
    for (int i=0; i<newSeq.length; i++) {
      if (i<sequence.length) {
        newSeq[i]=sequence[i];
      } else {
        newSeq[i]=newSeq[i-1]+newSeq[i-2];
      }
    }
    sequence=newSeq;
  }

  /** Returns a string that represents the sequence array nicely formatted, for
   *  example, if sequence == [2, 3, 7], this method should return the String
   *  "[2, 3, 7]"
   *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
   */
  public String fibonacciString() {
    return ArrayPrinter.printableString(sequence);
  }

  public static void main(String[] args) {
    Fibonacci fib0 = new Fibonacci(5);
    Fibonacci fib1 = new Fibonacci(11);
    Fibonacci fib2 = new Fibonacci(20);
    Fibonacci[] fibonaccis = {fib0, fib1, fib2};
    for (Fibonacci i : fibonaccis) {
      System.out.println(i.getSequence().length);      
    }



  }
}
