package com.asiainfo;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
    	Demo2 hello = new Demo2();
		int[] scores={79,52,98,81};
        
		//���÷���������ɼ����飬����ȡ�ɼ��ĸ���
		int count= hello.sort(scores);
        
		System.out.println("����"+count+"���ɼ���Ϣ��");
	}
    
	/*
	 * ���ܣ������Գɼ�������������سɼ��ĸ���
	 * ����һ������������������ķ���������ɼ�����
	 * ʹ��Arrays��Գɼ���������������
	 * ����ִ�к󷵻�������Ԫ�صĸ���
	 */
	public int sort(int[] scores){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int count = scores.length;
		Math.random();
        //����������Ԫ�صĸ���
        return count;
	}
}
