package sandbox;

public class bubbleSort{
	
	public static void bsort(int[] array) {
		int temp = 0; //Initialize
		
		for(int i = 0; i < (array.length);i++) {
			for (int j = 1; j < (array.length);j++) {
				if(array[j] < array[j-1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j-1] = temp;
				}
			}
			
		}
	}
	
	public static void main(String []args) {
		
		int arr[]= {4,8,7,9,5,6,1,3,2};
		
		
        System.out.println("Array Before Bubble Sort");    
        for(int i=0; i < arr.length; i++){    
                System.out.print(arr[i] + " ");    
        }   
        System.out.println();    
        bsort(arr);//sorting array elements using bubble sort    
        System.out.println("Array After Bubble Sort");    
        for(int i=0; i < arr.length; i++){    
                System.out.print(arr[i] + " ");    
        }    

	}
}