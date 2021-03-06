package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> evens = new ArrayList<>();
        for(int i = 0; i < ints.length; i++) {
            if(i % 2 == 1) {
                evens.add(i);
            }
        }
        Integer[] newNum = {evens.size()};
        return evens.toArray(newNum);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> evens = new ArrayList<>();
        for(int i = 2; i <= ints.length; i++) {
            if(i % 2 == 0) {
                evens.add(i);
            }
        }
        Integer[] newNum = {evens.size()};
        return evens.toArray(newNum);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> three = new ArrayList<>();
        for(int i : ints) {
            if(i % 3 != 0) {
                three.add(i);
            }
        }
        Integer[] newNum = {three.size()};
        return three.toArray(newNum);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> evens = new ArrayList<>();
        for(int i : ints) {
            if(i % multiple != 0) {
                evens.add(i);
            }
        }
        Integer[] newNum = {evens.size()};
        return evens.toArray(newNum);
    }
}
