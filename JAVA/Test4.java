import java.util.Scanner;

public class Test4 {

	public Test4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("How Long is Ypor Brup ?");
		int brupLength =sc.nextInt();
		String msg="";
		for(int i=1 ;i <= brupLength ; i++) {
			msg=msg+"r";
		}
		
     System.out.println("Bu"+msg+"p");
	}

}
