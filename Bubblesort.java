public class Bubblesort{
	public static void main(String[] args){
		int[] a={1,3,5,7,9,2,4,6,8,0};
		int[] b=bubblesort2(a);
		for(int v:b){
			System.out.print(v+" ");
		}
	}
	public static void swap(int[] a,int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static int[] bubblesort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
		return a;
	}
	public static int[] bubblesort2(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[j-1]>a[j]){
					swap(a,j-1,j);
				}
			}
		}
		return a;
	}
}