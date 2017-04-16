package com.asiainfo;

import java.util.Arrays;

/*
 * 小伙伴们，请根据所学知识，编写一个 JAVA 程序，实现输出考试成绩的前三名
	要求：
	1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73
	2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入
	3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
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
