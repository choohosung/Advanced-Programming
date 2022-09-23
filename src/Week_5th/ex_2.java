package Week_5th;

class Time{
	int hour;
	int minute;
	int second;
}

public class ex_2 {

	public static void main(String[] args) {
		// 시간 정보 시, 분, 초
		int hour;
		int minute;
		int second;
		
		// 여러가지 시간을 저장할 때
		int hour1, hour2, hour3, hour4;
		int minute1, minute2, minute3, minute4;
		int second1, second2, second3, second4;
		
		// 배열을 이용해서 저장
		int[] hourArray = new int[4];
		int[] minuteArray = new int[4];
		int[] secondArray = new int[4];
		
		// 클래스 사용
		Time t = new Time();
		Time[] tArray = new Time[4];
	}

}
