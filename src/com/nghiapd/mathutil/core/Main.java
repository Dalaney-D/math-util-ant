/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghiapd.mathutil.core;

import com.nghiapd.mathutil.main.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        //        test case 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! status: expected =" + expected + " |actual = " + actual);
        //        test case 2
        System.out.println("1! status: expected = 1 |actual = " + MathUtil.getFactorial(1));

        //        test case 3
        System.out.println("5! status: expected = 120 |actual = " + MathUtil.getFactorial(5));

        //        test case 4
        System.out.println("-5! status: expected = chui? |actual = " + MathUtil.getFactorial(-5));
    }
}
//

