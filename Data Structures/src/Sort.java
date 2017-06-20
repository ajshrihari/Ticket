
public class Sort {
	
		 
	    public static int[] SelectionSort(int[] arr){
	         
	        for (int i = 0; i < arr.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < arr.length; j++)
	                if (arr[j] < arr[index])
	                    index = j;
	      
	            int smallerNumber = arr[index]; 
	            arr[index] = arr[i];
	            arr[i] = smallerNumber;
	        }
	        return arr;
	    }
	    public static int[] InsertionSort(int[] in){
	         
	        int temp;
	        for (int i = 1; i < in.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(in[j] < in[j-1]){
	                    temp = in[j];
	                    in[j] = in[j-1];
	                    in[j-1] = temp;
	                }
	            }
	        }
	        return in;
	    }
	    public static void swap(int i, int j, int[] array) {
	    	  
	        int temp;
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	  
	    public static void printarr(int[] input) {
	          
	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }
	
	    public static void bubble_srt(int array[]) {
	        int n = array.length;
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (array[i] > array[k]) {
	                    swap(i, k, array);
	                }
	            }
	            printarr(array);
	        }
	    }
	
	    
	
	    public static void main(String a[]){
	         
	        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	        int[] arr2 = InsertionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	}
	


