/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class sofa extends theater{
    private int s;
    int ans;
    public void movie(){
        Scanner a6 = new Scanner(System.in);
        
            do{
                System.out.println("How many do you need ? (not more than10)");
                System.out.print("Enter");
                s = a6.nextInt();
            }while(s>10);  
    }
    public int seat1(){
        this.movie();
        return s;
    } 
    public int pricec(int a){
        this.setp(500);
        int price = this.getp();
        int ans = price*a;
        return ans ;
    }
    
    
}