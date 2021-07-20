package Numbers;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		int num=5;
		int sum=add(num);
		System.out.println(sum);
	}
	
	public static int add(int num){
		if(num!=0){
			return num+add(num-1);
		}else{
			return num;
		}
	}

}
