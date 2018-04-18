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
        int a,b,p,s1,ns,pc = 0,amount1=0,amount2=0,price1=0,price2=0,dis=0,ans = 0,ans2=0,total=0;
        char cf1,h,cf2,h1;
        String moviename,time,n1,n2,n3,food1,food2,food3,v;
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
            
            majer t1 = new majer();
                do{
                    
                    amount1=0;
                    amount2=0;
                    price1=0;
                    price2=0;
                    dis=0;
                    p = t1.print();
                    Maincinema t2 = new Maincinema();
                    moviename = t2.movietime(p,0,0);
                    premium t3 = new premium();
                    sofa t4 = new sofa();
                    promotion t6 = new promotion();
                    time = t1.submit();
                    System.out.println("Do you want to see the details of the promotion before? (Y/N)");
                    System.out.print("Enter :");
                    Scanner a3 = new Scanner(System.in);
                    String v4 = a3.nextLine();
                    h = v4.charAt(0);
                    
                        if(h =='y'||h=='Y'){
                            t6.promotiondetail();
                        }
                    t6.movie();   
                    Scanner a4 = new Scanner(System.in);
                    s1 = a4.nextInt();
                        for(int i=2 ;i<s1;i=2){
                            System.out.print("Enter number>>>>>>>");
                            s1 = a4.nextInt();
                        }
                    n3 = t2.movietime(0,s1,0);
                        if(s1 == 1){
                            ns=t4.seat1();
                            pc =t4.pricec(ns);
                        }else{
                            ns=t3.seat1();
                            pc =t3.pricec(ns);
                        }
                    eat t5 = new eat();       
                    System.out.println("Do you want some food ?(Y/N)");
                    Scanner ad1 = new Scanner(System.in);
                    System.out.print("Enter :");
                    String v1 = ad1.nextLine();
                    cf1 = v1.charAt(0);
                    food2 = "(There is not food that your order.)"; //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                    food3 = "(Not drink that you order.)"; //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า             
                        if(cf1 =='y'||cf1=='Y'){
                            food2 = t5.popcorn1();                            
                                if(food2 != null){
                                    amount1 =t5.printfood();
                                    price1=t5.popprice(amount1,food2);
                                    food3 = "(Not drink that you order.)"; //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                                }                                
                                if(food2==null){
                                    food2 = "(There is not food that your order.)"; //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                                    food3 = "(Not drink that you order.)";  //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                                }
                            dis = t6.promotionprint(n3, ns, food2, amount1,food3,amount2,pc,price1,price2);
                        }
                        
                        if(cf1 =='y'||cf1=='Y'){
                            food3 = t5.coke1();
                                if(food3 != null){
                                    amount2 =t5.printfood();
                                    price2=t5.cokeprice(amount2,food3);
                                }
                                if(food3==null){
                                    food2 = "(There is not food that your order.)"; //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                                    food3 = "(Not drink that you order.)";  //ตั้งไว้ดักในกรณีที่เลือกซื้ออย่างใดอย่างหนึ่งเพื่อให้ตัวแปรมีค่า
                                }
                            dis = t6.promotionprint(n3, ns, food2, amount1,food3,amount2,pc,price1,price2);
                        }
                    //dis = t6.promotionprint(n3, ns, food2, amount1,food3,amount2,pc,price1,price2);
                    ans = pc+price1+price2;
        
        
                    System.out.println("**********************************************");
                    System.out.println("************Detail You Order !!!!!************");
                    System.out.println("Your movie is :"+moviename+"\nThe time is :"+time);
                    System.out.println("Your seat is :"+n3+" amount "+ns+" price "+pc);
                    System.out.println("Your Food is "+food2+" amount "+amount1+" price"+price1+"\nand "+food3+" amount "+amount2+" price "+price2);
                    System.out.println("The Unit_cost is "+ans + " The Discount is "+dis);
                    ans2 = ans-dis;
                    System.out.println("ToTal cost is "+ ans2);
                    System.out.println("**********************************************");
                    System.out.println("Do you want to pay by credit card(charge 10%)?");
                    System.out.println("Yes(Y) or No(N)");
                    System.out.print("Enter :");
                    Scanner y1 = new Scanner(System.in);
                    String v0 = y1.nextLine();
                    cf2 = v0.charAt(0);
                        if(cf2 =='y'||cf2=='Y'){
                            total = credit(ans2);
                            System.out.println("The outstanding amount of all is " +total);
                        }else {
                            System.out.println("The outstanding amount of all is " +ans2); 
                        }
                    System.out.println("**********************************************");
                    System.out.println("Do you want to list again? (Y/N) ");
                    System.out.print("Enter :");
                    Scanner y2 = new Scanner(System.in);
                    v = y2.nextLine();
                    h1 = v.charAt(0);
                    if(h1 =='y'||h1 =='y'){
                        for(int i=0;i<100;i++){
                         System.out.println("");   
                        }
                    }
                }while( h1 =='y'||h1 =='y');
    }
    
    
    public static String movietime(int a,int b,int c){
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
               k = "Sofa (500 bath)";
               break;
           case 2:
               k = "Premium (200 batn)";
               break;
        }
        return  k;
    }
    
    
    public static int credit(int a){
        int y = (int)((a)+(a*0.1));
        return y ;
    }  
}
