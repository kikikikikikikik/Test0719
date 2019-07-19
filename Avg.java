public class Avg{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9,0};
		System.out.print(avg(a));
	}
	public static double avg(int[] a){
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int sum=0;
		for(int v:a){
			sum+=v;
			if(v>max){
				max=v;
			}
			if(v<min){
				min=v;
			}
		}
		return (double)(sum-max-min)/(a.length-2);
	}
}