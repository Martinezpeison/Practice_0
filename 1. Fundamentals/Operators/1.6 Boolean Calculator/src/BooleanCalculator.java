public class BooleanCalculator
{
   public static void main(String[] args)
   {
      int a = 3, b = -4, c = 1;
      boolean t = true, f = false;
      if (a >= b){
         System.out.println("TRUE");
      }else{
         System.out.println("FALSE");
      }if (-b/a == c){
         System.out.println("TRUE");
      }else{
         System.out.println("FALSE");
      }
      boolean b2 = 2 * c <= c;
      if ((t || !f) == b2) {
         System.out.println("TRUE");
      }else{
         System.out.println("FALSE");
      }
      boolean b1 = b + c / a > a - b * c;
      if ((!t == f) != b1) {
         System.out.println("TRUE");
      }else{
         System.out.println("FALSE");
      }
   }
}