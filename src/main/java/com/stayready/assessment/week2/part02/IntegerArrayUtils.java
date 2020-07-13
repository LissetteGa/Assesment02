package com.stayready.assessment.week2.part02;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newNum= Arrays.copyOf(integerArray,integerArray.length +1);
        newNum[integerArray.length] = valueToBeAdded;
        return newNum;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        ArrayList<Integer> newNum = new ArrayList<Integer>();
        for(int i = 0; i < integerArray.length; i++) {
            if( i == indexToInsertAt) {
                newNum.add(valueToBeInserted);
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        Arrays.toString(integerArray);
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        //Integer[] num = Arrays.copyOf(integerArray, integerArray.length);
       for(int i = 0; i < integerArray.length; i++) {
           if(integerArray[i] % 2 == 0) {
               integerArray[i]++;
           } else {
               integerArray[i]--;
           }
       }
       return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for(int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] % 2 == 0) {
                integerArray[i]++;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] % 2 != 0) {
                input[i]--;
            }
        }
        return null;
    }
}
