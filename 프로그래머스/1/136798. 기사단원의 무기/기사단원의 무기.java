class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        int[] arr = new int[number+1]; 

    for(int i=1; i<=number; i++) {
    	arr[i] = i; 	
    	int n=0; // 각 기사단원의 공격력을 계산하여 철 무게를 받을 변수
    	
    	for(int j=1; j*j <= arr[i]; j++) {  		   	
    		if(j*j == arr[i]) {
    			n++;   			
    		}
    		else if(arr[i] % j  == 0) {
    			n +=2;    	      
    		} 
            if(n > limit) { // 제한 공격력 넘을 시, 규정 공격력 부여
     	   n = power;
           break;
           }
        }    		
    	result += n; 	
    }
   return result;
  }
}