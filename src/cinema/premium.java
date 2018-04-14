/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;

class premium extends theater{
    public void movie(){
        
    }
    public void menu(){
        
    }
 public int seat1(int a){
        int s;
        Scanner a6 = new Scanner(System.in);
        do{
            System.out.println("How many do you need ? (not more than20)");
            System.out.print(">>>>>>>");
            s = a6.nextInt();
        }while(s>20);
        
        return s;
    }   
}