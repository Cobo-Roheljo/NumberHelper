/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numberhelper1;

public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {

        if ((number % 2) == 0) {
            return true;
        }

        return false;
    }

    public boolean isOdd() {

        if ((number % 2) == 0) {
            return false;
        }

        return true;
    }

    public int sum(int n) {

        return number += n;
    }

    public boolean isPrime() {

        for (int i = 2; i < number; i++) {

            if (number == 2) {
                return true;
            } else if (number % 2 == 0) {
                return true;
            }

        }

        return false;
    }

    public boolean isDivisibleBy(int n) {

        if (n % 2 == 0 && n != 0) {

            return true;
        } else if (n == 0) {
            return true;
        }
        return false;
    }

}

