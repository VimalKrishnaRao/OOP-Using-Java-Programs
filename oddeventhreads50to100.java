class OddThread extends Thread 
{
   public void run() 
   {
      for (int i = 51; i <= 100; i += 2) 
      {
         System.out.println(i);
      }
   }
}

class EvenThread extends Thread 
{
   public void run() 
   {
      for (int i = 50; i <= 100; i += 2) 
      {
         System.out.println(i);
      }
   }
}

class Main
{
   public static void main(String[] args) 
   {
      OddThread odd = new OddThread();
      EvenThread even = new EvenThread();
      
      odd.start();
      even.start();
   }
}

