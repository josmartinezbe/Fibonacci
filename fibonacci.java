public class fibonacci{
	public static int fibo(int a){
		if (a > 2){
		    return fibo(a-1)+fibo(a-2);
		}else	
			return 1;
		
	}
	public static void main(String [] args){
		System.out.println(fibo(4));
	}
} 