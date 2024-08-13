package evaluation2;

public class Base {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 123;
//		int num2 = 13;
//		int base=4
		
		int num1=1010;
		int num2=11001; 
		int base = 2;
		int temp = num1 + num2;
//		int k = 1, temp1 = 0;
//		
//		
//
//		while (temp != 0) {
//			int mod = temp % base;
//			temp1 += mod * k;
//			k *= 10;
//			temp /= base;
//		}
		
		String temp1="";
		
		while(temp!=0)
		{
			temp1+=temp%base;
			temp/=base;
		}
		
		System.out.println(temp1);

	}
}
