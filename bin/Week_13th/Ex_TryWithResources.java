package Week_13th;
import java.io.*;

class tryWithResource implements AutoCloseable {
	  private String file;

	  public tryWithResource(String file)
	  {
		  this.file = file;
	  }

	  public void read(){
		  System.out.println(file + " ��(/��) �н��ϴ�.");
	  }

	  @Override
	  public void close() throws Exception {
		  System.out.println(file + " ��(/��) �ݽ��ϴ�.");
	  }
}

public class Ex_TryWithResources {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fileInputStream	= new FileInputStream("C://Exception.txt")){
			// ���� ����
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(tryWithResource res = new tryWithResource("Ex_TryWithResources")){
			res.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/* ����ó�� 
		try {
		fileInputStream	= new FileInputStream("C://Exception.txt");
		//���� ����
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
