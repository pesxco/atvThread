/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplothread;

/**
 *
 * @author Gustavo
 */
public class Calcula extends Thread {
    private int num1;
    private int num2;
    
    
    public Calcula(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
        start();
    }
    
    public void tabuada(int num1, int num2){
        int mult;
        int i;
        for(i = 1; i <= num2; i++){
           mult = num1*i;
            System.out.println(""+num1+" x "+i+" = "+mult); 
        }
    }
    
    @Override
    public void run() {
        this.tabuada(num1, num2);
    }
    
}
