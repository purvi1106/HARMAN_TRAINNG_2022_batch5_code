package a;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		for(String val: args) {
			sum=sum+Integer.parseInt(val);
		}
		
		System.out.println(sum);
	}
}
