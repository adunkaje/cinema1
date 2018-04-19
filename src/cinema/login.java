
package cinema;

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
   
     
}
