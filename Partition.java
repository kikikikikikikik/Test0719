public class Partition{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8};
		for(int v:partition2(a)){
			System.out.print(v+" ");
		}
	}
	public static void swap(int[] a,int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static int[] partition1(int[] a){
		int begin=0;
		int end=a.length-1;
		while(begin<end){
			while(begin<end&&a[begin]%2==0){
				begin++;
			}
			while(begin<end&&a[begin]%2!=0){
				swap(a,begin,end);
				end--;
			}
		}
		return a;
	}
	public static int[] partition2(int[] a){
		int d=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				swap(a,i,d);
				d++;
			}
		}
		return a;
	}
}