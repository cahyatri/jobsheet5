/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MPC
 */
public class keywordThrows {
    public static void test(int n)
            throws NullPointerException, ArithmeticException {
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } 
        else {
            throw new ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
}
}
