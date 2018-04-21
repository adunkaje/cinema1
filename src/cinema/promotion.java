
package cinema;
import java.util.Scanner;
public class promotion extends class1 {
    int a1,b1,c1,ans=0, an;
    char con1,con2,con3;
    String j,k,l;
    public void movie(){
        super.print10();
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
        databaseDetail s3 = new databaseDetail();
        s3.print2();
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
