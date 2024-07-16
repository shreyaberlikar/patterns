class pat10 {
   
    static void erect_pyramid(int N)
 {
     
     for (int i = 0; i < N; i++)
     {
       
          for (int j =0; j<=i; j++)
         {
             System.out.print("*");
         }
        
 
         System.out.println();
     }
 }
 
    static void inverted_pyramid(int N)
 {
   
     for (int i = 5; i > N; i--)
     {
     
         for (int j =0; j<i; j++)
         {
             System.out.print("*");
         }
        
 
         System.out.println();
     }
 }
 
     public static void main(String[] args) {
         
       
         int N = 5;
         erect_pyramid(N);
         inverted_pyramid(0);
     }
 }
 /*
Output :
*
**
***
****
*****
*****
****
***
**
*
  */