package cinema;

abstract class theater {
    private int price ;
    private int q;
    int movie ;

   public abstract void movie();
   public void setp(int a){
       this.price = a ;
   }
   public int getp(){
       return price;
   }
   public void sets(int s){
       this.q = s ;
   }
   public int gets(){
       return q;
   }
}
