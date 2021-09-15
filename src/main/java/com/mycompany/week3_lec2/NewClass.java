/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3_lec2;

/**
 *
 * @author amoonmainali
 */
public class NewClass {
    
    int getSum(int a, int b) {
        return a+b;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        int x=10, y=100;
        int z= nc.getSum(x,y);
        System.out.println("The sum is " + z);
    }
}
