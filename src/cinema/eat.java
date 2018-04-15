/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class eat extends theater implements popcorn,drink{
    int pop,coke,ans=0;
    char cf2,cf3,cf4;
    String k=null;
    String j=null;
    public void movie(){
        
    }
    
    public void print(){
        System.out.println("1.Size M (80 bath)");
        System.out.println("2.Size L (100 bath)");
        System.out.print(">>>>>>>>>>>>>");
    }
    public int printfood(){
        System.out.print("How many do you want.");
        System.out.print(">>>>>>>>>>>>>");
        Scanner ad2 = new Scanner(System.in);
        int v1 = ad2.nextInt();
        
        return v1;
    }
    public String b(int a,int b){
        String k1 =null;
        switch(a){
           case 1:
               k1 = "Popcorn(Size M (80 bath))";
               break;
           case 2:
               k1 = "Popcorn(Size L (100 bath))";
               break;
        }
                switch(b){
           case 1:
               k1 = "Coke(Size M (80 bath))";
               break;
           case 2:
               k1 = "Coke(Size L (100 bath))";
               break;
                }
        return k1;
    
    }
    public String popcorn1(){
        
        Scanner eat2 = new Scanner(System.in);
        System.out.println("Do you want some Popcorn?(Y/N)");
        String v2 = eat2.nextLine();
        cf2 = v2.charAt(0);
        if(cf2 =='y'||cf2=='Y'){
            System.out.println("**********Popcorn**********");
            this.print();
            Scanner eat3 = new Scanner(System.in);
            pop = eat3.nextInt();
            for(int i=2 ;i<pop;i=2){
        System.out.print(">>>>>>>>>>>>>");
        pop = eat3.nextInt();
        }
            j=this.b(pop,0);
        }
        
        return j;
    }
    public String coke1(){
        
          Scanner eat3 = new Scanner(System.in);
        System.out.println("Do you want some Drink?(Y/N)");
        String v3 = eat3.nextLine();
        cf3 = v3.charAt(0);
        if(cf3 =='y'||cf3=='Y'){
            System.out.println("**********Drink (Coke) **********");
            this.print();
            Scanner eat4 = new Scanner(System.in);
            coke = eat4.nextInt();
            for(int i=2 ;i<coke;i=2){
        System.out.print(">>>>>>>>>>>>>");
        coke = eat3.nextInt();
        }
            j=this.b(0,coke);
        }
        
        return j;
    }
    public int popprice(int a,String b){
        cf2 = b.charAt(13);
        if(cf2 =='M'){
        this.setp(cornm);
        int price = this.getp();
         ans = price*a;
        }else{
            this.setp(cornl);
        int price = this.getp();
         ans = price*a;
        }
        
        return ans;
    }
     public int cokeprice(int a,String b){
        cf2 = b.charAt(10);
        if(cf2 =='M'){
        this.setp(cokem);
        int price = this.getp();
         ans = price*a;
        }else{
            this.setp(cokel);
        int price = this.getp();
         ans = price*a;
        }
        
        return ans;
    }
    
    
}
