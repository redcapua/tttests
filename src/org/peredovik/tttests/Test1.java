package org.peredovik.tttests;

public class Test1 {

	public static void main(String[] args){

		int x = 5;
		int[] A = {5, 5, 1, 7, 2, 3, 5};
		
		int xy =  solution(x, A);

		System.out.println("result = " + xy);
		
	}

	
    public static int solution(int X, int[] A) {
    	
    	Integer[] equalArray = new Integer[A.length];
    	Integer[] notEqualArray = new Integer[A.length]; 
    	
    	int equal = 0;
    	
    	for (int i = 0; i < A.length; i++){
    		
    		int elementA = A[i];
    		
    		if (elementA == X){
    			equal++;
    		}
    		
    		equalArray[i] = equal;
    		
    	}
    	
    	int notEqual = 0;
    	
    	for (int i = A.length - 1; i >= 0; i--){
    		
    		int elementA = A[i];
    		
    		if (elementA != X){
    			notEqual++;
    		}
    		
    		notEqualArray[i] = notEqual;
    		
    	}

    	int resultValue = -1; //if no solution has been found 
    	
    	for (int i = 0; i < A.length; i++){
    		
    		int equalCnt = equalArray[i];
    		int notEqualCnt = notEqualArray[i];

    		if (equalCnt == notEqualCnt){
    			resultValue = i;
    			break;
    		};
    		
    	}
    	
    	return resultValue;
    }
	
}



