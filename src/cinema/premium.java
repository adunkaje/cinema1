/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;

class premium extends theater{
    private int s;
    public void movie(){
    Scanner a6 = new Scanner(System.in);
        do{
            System.out.println("How many do you need ? (not more than20)");
            System.out.print(">>>>>>>");
            s = a6.nextInt();
        }while(s>20);    
    }
    
 public int seat1(){       
        this.movie();
        return s;
    } 
 public int pricec(int a){
        this.setp(200);
        int price = this.getp();
        int ans = price*a;
        return ans ;
    }
}