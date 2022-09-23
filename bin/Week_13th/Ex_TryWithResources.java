package Week_13th;
import java.io.*;

class tryWithResource implements AutoCloseable {
	  private String file;

	  public tryWithResource(String file)
	  {
		  this.file = file;
	  }

	  public void read(){
		  System.out.println(file + " 을(/를) 읽습니다.");
	  }

	  @Override
	  public void close() throws Exception {
		  System.out.println(file + " 을(/를) 닫습니다.");
	  }
}

public class Ex_TryWithResources {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fileInputStream	= new FileInputStream("C://Exception.txt")){
			// 구현 생략
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(tryWithResource res = new tryWithResource("Ex_TryWithResources")){
			res.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/* 예외처리 
		try {
		fileInputStream	= new FileInputStream("C://Exception.txt");
		//구현 생략
		} catch(IOException e) {
			e.printStackTrace ();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		*/
	}
}
