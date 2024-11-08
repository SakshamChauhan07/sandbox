package sandbox;   
public class linearSearch{    
	    public static int linearSc(int[] arr, int key){    
	            for(int i=0;i<arr.length;i++){    
	                if(arr[i] == key){    
	                    return i;    
	                }    
	            }    
	            return -1;    
	        }    
        public static void main(String []args){    
            int[] a1= {10,20,30,50,70,90};    
            int key = 30;    
            System.out.println(key+" is found at index: "+linearSc(a1, key));    
        }    
    }    