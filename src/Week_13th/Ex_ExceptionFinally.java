package Week_13th;

public class Ex_ExceptionFinally {

	   static void startInstall() { System.out.println("설치 시작"); /* 프로그램 설치를 위해 임시 폴더에 파일 압축해제 */ }
	   static void copyFiles() { System.out.println("파일 복사"); /* 파일들을 복사하는 코드를 적는다. */ }
	   static void deleteTempFiles() { System.out.println("임시파일 삭제"); /* 임시 폴더 삭제 */ }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();		
			copyFiles();		 
			throw new Exception("예외 발생"); // 예외 발생시키기
			// deleteTempFiles();	// 중복으로 메서드 실행 필요
		} catch (Exception e) {
			e.printStackTrace();
		    	// deleteTempFiles();   // 중복으로 메서드 실행 필요
		} finally {
	    	deleteTempFiles();   // 예외의 발생여부와 상관없이 항상 실행되는 finally 블럭을 사용
		}
	}

}
