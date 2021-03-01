package Printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
	
	public static void main(String[] args) {
		//Programmers 42587
		
		int[] priorities = {2,1,3,2};
		//int[] priorities = {1,1,9,1,1,1};
		int location = 0;
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		//PriorityQueue를 사용해서 숫자가 높을수록 우선순위를 가지게 저장
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int answer = 0;
		
		for(int pri : priorities) {
			pq.offer(pri);
			//System.out.println(pq);
		}
		
		//내가 인쇄요청한 문서 찾을때까지 반복
		while(pq.size() != 0) {
			for(int i = 0; i < priorities.length; i++) {
				//내가 요청한 문서와 해당 문서의 인덱스를 알기위해 비교
				if(pq.peek() == priorities[i]) {
					pq.poll();
					//System.out.println(pq);
					answer++;
					
					//내가 요청한 문서일때
					if(location == i) {
						pq.clear();
						break;
					}
				}
			}
		}
		
		return answer;
	}

}
