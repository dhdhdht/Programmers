package Hot;

import java.util.PriorityQueue;

public class Hot {
	
	public static void main(String[] args) {
		//Programmers 42626
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
		//int[] scoville = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
		
		//�켱���� ���� (��ȣ�� ���� ���� ��)����
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//int�迭�� ���� ���� �־��ֱ�
		for(int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
			System.out.println("pq : " + pq);
		}
		
		int answer = 0;
		//��簪�� K���� ���������� �ݺ�
		while(pq.peek() < K) {
			if (pq.size() == 1) {
                return -1;
		}
			
			int first = pq.poll(); //���� ���� ���� ����(�� �� ������)
			//System.out.println("minpq : " + pq);
            int second = pq.poll(); //�ι�°�� ���� ���� ����(�� ���� ������)
            //System.out.println("minpq2 : " + pq);
            //System.out.println("pq2 : " + pq);
            
            int result = first + (second * 2); //���������� ���ں� ����
            pq.add(result); //����� �켱���� ť�� ����
            System.out.println("pq3 : " + pq);
            answer++;
		}
		return answer;
	}

}
