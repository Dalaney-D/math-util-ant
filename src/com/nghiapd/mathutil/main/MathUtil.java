/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghiapd.mathutil.main;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    //trong class nay ta sẽ viết cac ham` tiện ich dung` chung
    //cho nhiều class khac'. Cai gi` ma` dung cho cho cac class khac' thi` thường dung` la` static

    //ham` nay` tinh' n!
    //quy uoc' ko co giai thua` a^m
    // 0! = 1! = 1
    //chi tinh n tu` 1 => 20
    public static long getFactorial(int n) {
        //if n <0 va n > 20
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. N must be between 0 -> 20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
        return n * getFactorial(n - 1);
    }

//hoc ki thuat viet code dc goi la` TDD (test driven development)
//la` ki~ thuat ngay khi viet code. ngay khi thiet ke ra ten^ ham`/class
//da~ phai chuan bi luon bo^. kiem? thu? - chuan bi luon test-case
//chuan bi luon cac tinh` huong' test cac ham` de xac dinh ham` dung'/sai
//viet code huong' ve` cac' bai` test 
//cac test case/cac tinh` huong' xai` ham` khi ham viet xong
// case #1: n = 0 ==> hy vong ham` tra? ra 1
//TEST CASE la 1 tinh` huong' kiem thu app/man hinh/tinh nang
//xem no co chay dung' ko?
}
