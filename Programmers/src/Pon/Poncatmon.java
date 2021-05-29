package pon;

import java.util.*;

public class Poncatmon {
	public static void main(String[] args) {
		//Programmers 1845
		int[] nums = {3, 3, 3, 2, 2, 4};
		// return 2
		
		System.out.println(solution(nums));
	}
	
	    public static int solution(int[] nums) {
	        int answer = 0;
	        int choice = nums.length/2;	//¼±ÅÃÇÒ È½¼ö
	        
	        Set<Integer> num = new HashSet<Integer>();
	        
	        for (int n : nums) {
	        	num.add(n);
	        }
	        //System.out.println(num);
	        
	        if (choice < num.size()) {
	        	answer = choice;
	        } else {
	        	answer = num.size();
	        }
	        
	        return answer;
	    }
	
}
