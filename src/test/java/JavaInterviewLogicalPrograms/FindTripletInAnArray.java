package JavaInterviewLogicalPrograms;

public class FindTripletInAnArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 9, 1, 0, 4,8};
        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            	for(int k=0;k<arr.length;k++){
            		
            		if(arr[i]+arr[j]+arr[k]==10) {
            			System.out.println("["+ arr[i] + ", " + arr[j] + "," + arr[k] + "]");
            		}
            	}
                    
            
            }
        }
    }
}