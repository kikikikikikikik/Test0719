import java.util.Arrays;
public class Rotate{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6};
		int[] b=rotate(a,1);
		for(int v:b){
			System.out.print(" "+v);
		}
	}
	public static int[] rotate(int[] a,int k){
		k=k%a.length;
		int[] RightPart=Arrays.copyOfRange(a,a.length-k,a.length);
		System.arraycopy(a,0,a,k,a.length-k);
		System.arraycopy(RightPart,0,a,0,k);
		return a;
	}
}