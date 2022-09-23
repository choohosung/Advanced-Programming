package Week_12th;

import java.util.ArrayList;

public class assignment_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList primeList = new ArrayList();
		int check = 0;
		
		for(int i=2; i<=100; i++) {
			list.add(i);
		}
		
		System.out.println("2부터 100까지 정수\n" + list);
		
		for(int i=0; i<list.size();i++) {
			for(int j=2; j<=(int)list.get(i); j++) {
				if((int)list.get(i)%j == 0)
					check++;
			}
			if(check == 1) {
				primeList.add(list.get(i));
				check = 0;
			}	
			else {
				check = 0;
			}
		}
		System.out.println("2부터 100까지 정수 중 소수 \n" + primeList);	
	}

}
