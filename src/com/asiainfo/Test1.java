package com.asiainfo;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * ����������Ϊָ���ɼ��ӷ֣�ֱ���������ڵ��� 60 Ϊֹ������ӷ�ǰ�ͼӷֺ�ĳɼ�����ͳ�ƼӷֵĴ���
		 * */
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
        // ��������ӷִ���
        int count = 0;
        //��ӡ����ӷ�ǰ�ɼ� 
        System.out.println("�ӷ�ǰ����" + score);
        
        // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ���
        for(; score < 60 ; score++) {
        		count++;
        }
        //��ӡ����ӷֺ�ɼ����Լ��ӷִ���
        System.out.println("�ӷֺ������" + score);
        System.out.println("������" + count + "�Σ�");
	}
}
