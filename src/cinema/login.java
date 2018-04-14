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
public class login {
    private String f,k;
    login(int a,int b){
        if(a == 12345 && b == 54321){
             f = "Adun";
             k = "Kaje";
        }
        if(a == 54321 && b == 12345){
          f = "Khan";
            k = "bear"; 
        }
        if(a == 11111 && b == 22222){
            f = "Aiaey";
           k = "Iven"; 
        }
    }
    public void print(){
        System.out.println("---------Welcome to AAK Cinema----------");
        System.out.println("Mr "+this.f+"\t"+this.k);
        System.out.println("---------------------------------------------");
        
    }
    public String re1(){
        
        return f;
    }
    public String re2(){
        
        return k;
    }
     
}
