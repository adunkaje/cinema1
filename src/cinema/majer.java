
package cinema;
import java.util.Scanner;
 class majer extends theater{
    public void menu(){
        Scanner a1 = new Scanner(System.in);
        System.out.println("**********Select the movie**********");
        this.movie();
            do{
                System.out.print("Enter number>>>>>>>");
                movie = a1.nextInt();
            }while(!(movie == 1||movie == 2||movie == 3||movie == 4));
        System.out.println("You want to see the details of a movie?(Y/N)");
        System.out.print("Enter :");
        Scanner a2 = new Scanner(System.in);
        String v = a2.nextLine();
        char h = v.charAt(0);
            if(h =='y'||h=='Y'){
                this.detailmovie(movie);
           
            } 
    }
    
    public int detailmovie(int a){
        int v = a;
        databaseDetail s4 = new databaseDetail();
        if(a ==1){
            s4.print3();   
        }
        if(a ==2){
            s4.print4();  
        }
        if(a ==3){
            s4.print5();  
            
        }
        if(a ==4){
            s4.print6();  
            
        }
      return v;  
    }
    public void movie(){
        System.out.println("1.Midnight Sun");
        System.out.println("2.Pacific Rim : Uprising");
        System.out.println("3.Avengers : Infinity War");
        System.out.println("4.Ready Player One");
        
    }
    public int print(){
        char h ;
            do{
                this.menu();
                System.out.println("Do you need to select the movie again?(Y/N)");
                System.out.print("Enter :");
                Scanner a3 = new Scanner(System.in);
                String v = a3.nextLine();
                h = v.charAt(0);
            }while( h =='y'||h =='y');
        return movie;
    }
    public static String submit(){
        String time = null; 
        int v1;
        System.out.println("*********Select the time **********");
        System.out.println("1.Morning = 09.00 Am");
        System.out.println("2.Afternoon = 01.00 Pm");
        System.out.println("3.Evening = 05.00 Pm");
        System.out.println("4.At Night = 09.00 Pm ");
            do{
                Scanner a4 = new Scanner(System.in);
                System.out.print("Enter number>>>>>>>");
                v1 = a4.nextInt();
                    if(v1 == 1){
                        time = "09.00 Am";
                    }
                    if(v1 == 2){
                        time = "01.00 Pm";
                    }
                    if(v1 == 3){
                        time = "05.00 Pm";
                    }
                    if(v1 == 4){
                        time = "09.00 Pm";
                    }
            }while(!(v1 == 1||v1 == 2||v1 == 3||v1 == 4));
        return time;
        
    }

    
}