package org.peredovik.tttests;

public class Test2 {

	public static void main(String[] args){

		int numberOfTurns = solution(2,2);

		System.out.println("result is: " + numberOfTurns);
		
	}

    public static int solution(int A, int B) {

    	int resultValue = 0;
    	
    	if ((Math.abs(A) < 1) || (Math.abs(B) < 1)){
    		resultValue = -1;
    		return resultValue;
    	}
    	
    	int bigger = 0;
    	int smaller = 0;
    	int rest = 0;
    	
    	bigger = Math.max(Math.abs(A), Math.abs(B));
    	
    	if (bigger == Math.abs(A)){
    		smaller = Math.abs(B);
    	}else{
    		smaller = Math.abs(A);
    	}
    	
    	int turnsA = bigger / 2;
    	int restA = bigger % 2;
    	
    	if(turnsA >= 100000000){
    		resultValue = -2;
    		return resultValue;
    	}

    	
    	int turnsB = smaller / 2;
    	int restB = smaller % 2;
    	
    	if(turnsB >= 100000000){
    		resultValue = -2;
    		return resultValue;
    	}

		int modA = bigger%2;
		int modB = smaller%2;

		if (modA == modB){
			rest = 1;
		}

		int shift = turnsA + turnsB;

		resultValue = shift;
		
		if ((bigger != smaller) && (restA == 0) && (restB == 0)){
			resultValue = resultValue + 1;
		}
    	
    	if (bigger <= 2){
    		resultValue++;;
    	}
		
    	if (smaller <= 2){
    		resultValue++;;
    	}
		
    	if ((bigger == 1) && (smaller == 1)){
    		resultValue++;
    	}
    	
    	return resultValue;
    }

	
	
}
