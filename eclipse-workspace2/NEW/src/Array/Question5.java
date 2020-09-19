package Array;

public class Question5 {//average
	public static void main(String args[]) {
		int[] a = {1,2,3,4,5,6,7,8,9};
//		int[] b = Question5.inRange(a, 2, 3);
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
	}
	public static int inRange(int[] a, int startIndex, int endIndex) {
		int count =0;
		for(int i = 0; i <a.length; i ++ ) {
			if(a[i] >= startIndex && a[i] <= endIndex) {
				count++;
			}
		}
		int [] tem = new int [count];
		int k =0;
		int sum =0;
		for(int i = 0; i< a.length; i ++) {
			if(a[i] >= startIndex && a[i]<= endIndex){
				tem[k] = a[i];
			}
		}
		for(int i = 0; i < tem.length;i++) {
			sum+=i;
		}
		
		int avg = sum/count;
		return sum;
		
		
	}

}
