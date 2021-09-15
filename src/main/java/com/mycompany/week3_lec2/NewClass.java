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
    
    int getStrLength(String name) {
        int l = name.length();
        return l;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        String str= "Amoon Mainali";
        int z= nc.getStrLength(str);
        System.out.println("The length is " + z);
    }
}
