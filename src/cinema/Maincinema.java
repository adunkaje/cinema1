/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;

class Maincinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,p,s1,ns;

       String moviename,time,n1,n2,n3;
        Scanner a1 = new Scanner(System.in);
        do{
        System.out.println("******LOGIN******");
        System.out.println("ID and Password is real");
        System.out.print("Enter your ID :");
        a = a1.nextInt();
        System.out.print("Enter your Password :");
        b = a1.nextInt();
        }while(!(((a == 12345&& b == 54321)||(a == 54321&& b == 12345) ||(a == 11111&& b == 22222))));
        login b1 = new login(a,b);
        b1.print();
        n1 = b1.re1();
        n2 = b1.re2();
        majer t1 = new majer();
        p = t1.print();
        Maincinema t2 = new Maincinema();
        moviename = t2.movietime(p,0);
        premium t3 = new premium();
        sofa t4 = new sofa();
        time = t1.submit();
        System.out.println("-----Select Seat------");
        System.out.println("1.Sofa : 200 bath");
        System.out.println("2.Premium : 150 batn");
        System.out.print(">>>>>>>");
        Scanner a4 = new Scanner(System.in);
        s1 = a4.nextInt();
        for(int i=2 ;i<s1;i=2){
        System.out.print(">>>>>>>");
        s1 = a4.nextInt();
        }
        n3 = t2.movietime(0,s1);
        if(s1 == 1){
        ns=t4.seat1(s1);
        }else{
        ns=t3.seat1(s1);
            }
        
        
        System.out.println("**********************************************");
        System.out.println("Your movie is :"+moviename+"\nThe time is :"+time);
       System.out.println("Your seat is :"+n3+"\nYour seat is :"+ns);
       
    }
    public static String movietime(int a,int b){
        String k = null;
       switch(a){
           case 1:
               k = "Midnight Sun";
               break;
           case 2:
               k = "Pacific Rim : Uprising";
               break;
           case 3:
               k = "Avengers : Infinity War";
               break;
           case 4:
               k = "Ready Player One";
               break;    
                }
       switch(b){
           case 1:
               k = "Sofa 200 bath";
               break;
           case 2:
               k = "Premium 150 batn";
               break;
       }
        return  k;
    }
    
}
