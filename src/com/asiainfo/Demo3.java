package com.asiainfo;

import java.util.Arrays;

/*
 * С����ǣ��������ѧ֪ʶ����дһ�� JAVA ����ʵ��������Գɼ���ǰ����
	Ҫ��
	1�� ���Գɼ��ѱ��������� scores �У�����Ԫ������Ϊ 89 , -23 , 64 , 91 , 119 , 52 , 73
	2�� Ҫ��ͨ���Զ��巽����ʵ�ֳɼ�������������������ɼ�������Ϊ��������
	3�� Ҫ���жϳɼ�����Ч�ԣ� 0��100 ��������ɼ���Ч������Դ˳ɼ�
 * */
public class Demo3 {
	
	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
		int[] scores = new int[]{89,-23,64,91,119,52,73};
		demo3.getSorce(scores);
	}
	
	public void getSorce(int[] scores1){

		Arrays.sort(scores1);
		int num = 0;
		for(int i = scores1.length - 1;i >= 0; i--){
			if(scores1[i] < 0 || scores1[i] > 100){
				continue;
			}
			num++;
			if(num > 3){
				break;
			}
			System.out.println(scores1[i]);
		}
	}
	
}
