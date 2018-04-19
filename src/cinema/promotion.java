
package cinema;
import java.util.Scanner;
public class promotion extends class1 {
    int a1,b1,c1,ans=0, an;
    char con1,con2,con3;
    String j,k,l;
    public void movie(){
        super.print3();
    }
    public int promotion1(int a){
        ans = 0;
        ans = (int)((a)*0.4);
    return ans;    
    }
    
    
    public int promotion2(int a){
        ans = 0;
        ans = (int)((a)*0.35);
    return ans;    
    }
    
    
    public int promotion3(int a ){
        ans = 0;
        ans = (int)((a)*0.3);
    return ans;    
    }
    
    
    public int promotion4(int a ){
        ans = 0;
        ans = (int)((a)*0.1);
    return ans;  
    }
    
    
    public int promotion5(int a){
        ans = 0;
        ans = (int)((a)*0.5);
    return ans;  
    }
    
    
    public static void promotiondetail(){
        System.out.println("*************THE DETAIL OF THE PROMOTION***********");
        System.out.println("1.Book premium 20 seats,buy popcorn size L (More than 2),coke size L (More than 2) discount 40%.");
        System.out.println("2.Book sofa 5 seats, buy popcorn size L coke size L is 35% ");
        System.out.println("3.Book premium 10 seats ,buy popcorn size L coke size L is 30% discount ");
        System.out.println("4.Buy popcorn size L (More than 2) ,coke size M (More than 3) has a 10% ");
        System.out.println("5.Book sofa 10 seats, buy popcorn size L (More than 2),coke size L (More than 2) is 50%.");
        System.out.println("***************************************************");
    }
    
    
    public int promotionprint(String a,int b,String c,int d,String e,int f,int i,int x,int z){
        con1 = a.charAt(0);
        con2 = c.charAt(13);
        con3 = e.charAt(10);
        int y=0;
            an = i+x+z;  
                if(con1 == 'P' && b==20 && con2 =='L'&& con3=='L'&& f >= 2 && d >= 2){
                    y= this.promotion1(an);
                }
                else if(con1 == 'S' && b >= 5 && con2 =='L'&& con3=='L'&& b !=10){
                    y= this.promotion2(an);
                }
                else if(con1 == 'P'&& b>=10&&b<= 19 && con2 =='L'&& con3=='L'){
                    y= this.promotion3(an);
                }
                else if(con2 == 'L' && con3 == 'M'&& d >= 2 && f>=3){
                    y= this.promotion4(an);
                }
                else if(con1 == 'S' && b > 9 &&con2 == 'L' && con3 == 'L' && f >= 2 && d >= 2 ){   
                    y= this.promotion5(an);
                }
        return y;
    }
}
