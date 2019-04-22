/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.webtrade.gitdemo1;

/**
 *
 * @author thomas
 */
public class Demo {
    
    public static void main(String[] args) {
        new Demo().count10();
    }
    
    public void count10(){
        for (int i = 10; i > 0; i--) {
            System.out.println("i is: "+i);
        }
    }
}
