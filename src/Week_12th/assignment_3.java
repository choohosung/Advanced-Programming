package Week_12th;

import java.util.ArrayList;

class PrimeNumber {
   private ArrayList<Integer> primeList = new ArrayList<Integer>();
   int check = 0;
   
   public void makePrime(int num)
   {
      if(num == 2)
      {
         primeList.add(num);
      }
      else {
    	  for(int i=2; i<=num; i++)
          {
             if(num % i == 0)
            	 check++;     
          }
    	  if(check == 1) {
				primeList.add(num);
				check = 0;
			}	
			else {
				check = 0;
			}
      }
   }
   
   public ArrayList<Integer> getPrimeNumber()
   {
      return primeList;
   }
}

public class assignment_3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		PrimeNumber prime_list = new PrimeNumber();
		
		for(int i=2; i<=100; i++) {
			list.add(i);
		}
		System.out.println("2부터 100까지 정수\n" + list);	
		
		for(int i=0; i<list.size(); i++) {
			prime_list.makePrime(list.get(i));
		}
		System.out.println("2부터 100까지 정수 중 소수 \n" + prime_list.getPrimeNumber());
	}

}
