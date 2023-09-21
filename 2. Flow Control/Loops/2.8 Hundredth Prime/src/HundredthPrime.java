public class HundredthPrime {
   public static void main(String[] args) {
      int n = 100; // El número primo que quieres encontrar (en este caso, el centésimo).

      int count = 0; // Contador para llevar la cuenta de los números primos encontrados.
      int num = 2; // El número actual que estamos comprobando.

      while (count < n) {
         if (isPrime(num)) {
            count++;
            if (count == n) {
               System.out.println(num);
               break; // Hemos encontrado el centésimo número primo, salimos del bucle.
            }
         }
         num++;
      }
   }

   // Método para comprobar si un número es primo.
   public static boolean isPrime(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}