/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;
 class majer extends theater{
    public void menu(){
        Scanner a1 = new Scanner(System.in);
        System.out.println("**********Select the movie**********");
        this.movie();
            do{
                System.out.print("Enter >>>> ");
                movie = a1.nextInt();
            }while(!(movie == 1||movie == 2||movie == 3||movie == 4));
        System.out.println("You want to see the details of a movie?(Y/N)");
        Scanner a2 = new Scanner(System.in);
        String v = a2.nextLine();
        char h = v.charAt(0);
            if(h =='y'||h=='Y'){
                this.detailmovie(movie);
           
            } 
    }
    
    public int detailmovie(int a){
        int v = a;
        if(a ==1){
            System.out.println("-----------------Detail Movie-----------------");
            System.out.println("1.Midnight Sun");
            System.out.println("109 minutes in length.");
            System.out.println("movie on March 22, 2018 ");
            System.out.println("English / Thailand (dubbed) \n" +
"English / Thailand (sub) ");
            System.out.println("Directed by Scott Spears.");
            System.out.println("AAK Cinema.");
            System.out.println("---------------------------------------------");
            
        }
        if(a ==2){
            System.out.println("-----------------Detail Movie-----------------");
            System.out.println("2.Pacific Rim : Uprising");
            System.out.println("110 minutes in length.");
            System.out.println("movie on March 23, 2018 ");
            System.out.println("English / Thailand (dubbed) \n" +
"English / Thailand (sub) " );
            System.out.println("Directed by: Steven s. Baby naika");
            System.out.println("AAK Cinema.");
            System.out.println("---------------------------------------------");
        }
        if(a ==3){
            System.out.println("-----------------Detail Movie-----------------");
             System.out.println("3.Avengers : Infinity War");
            System.out.println("160 minutes in length.");
            System.out.println("movie on April 25, 2018 ");
            System.out.println("English / Thailand (dubbed) \n" +
"English / Thailand (sub) " );
            System.out.println("Director: Anthony Russo, Joe Russo.");
            System.out.println("AAK Cinema.");
            System.out.println("---------------------------------------------");
        }
        if(a ==4){
            System.out.println("-----------------Detail Movie-----------------");
            System.out.println("4.Ready Player One");
            System.out.println("139 minutes in length.");
            System.out.println("movie on March 28, 2018 ");
            System.out.println("English / Thailand (dubbed) \n" +
"English / Thailand (sub) " );
            System.out.println("Director: Steven Spielberg.");
            System.out.println("AAK Cinema.");
             System.out.println("---------------------------------------------");
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
                System.out.println("You need to select a new movie?(Y/N)");
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
                System.out.print(">>>>>>>");
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