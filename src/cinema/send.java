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
public class send extends setDatail{
    
    public String send(int a,int b,int c){
        this.p = this.setDatail(a, b, c);
        return p;
    }
    public static int credit(int a){
        int y = (int)((a)+(a*0.1));
        return y ;
    }
    
}
