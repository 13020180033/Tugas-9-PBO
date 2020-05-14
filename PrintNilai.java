package no6 generic programming dan wrapper & string class;




public class PrintNilai {
    
   public static void main(String[] args) {
      Integer varInt = 8652339;
      Double varDouble = 96342.7656;
      Character varChar = 'H';
      String varString = "Belajar Java.";
 
      System.out.println();
      System.out.println("Nilai-nilai yang dicetak:");
 
      print(varInt);
      print(varDouble);
      print(varChar);
      print(varString);         
   }
   public static void print(Integer nilaiInteger) {
      System.out.println(nilaiInteger);
   }

   public static void print(Double nilaiDouble) {
      System.out.println(nilaiDouble);
   }
 
   public static void print(Character nilaiChar) {
      System.out.println(nilaiChar);
   }
 
   public static void print(String nilaiString) {
      System.out.println(nilaiString);
   }
}