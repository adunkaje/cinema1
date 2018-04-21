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
public class setDatail{
    String k = null;
    String p = null;
    int y ;
    String setDatail(int a,int b,int c){
        
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
}
