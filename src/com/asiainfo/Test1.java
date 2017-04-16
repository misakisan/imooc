package com.asiainfo;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 功能描述：为指定成绩加分，直到分数大于等于 60 为止，输出加分前和加分后的成绩，并统计加分的次数
		 * */
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
        // 变量保存加分次数
        int count = 0;
        //打印输出加分前成绩 
        System.out.println("加分前分数" + score);
        
        // 只要成绩小于60，就循环执行加分操作，并统计加分次数
        for(; score < 60 ; score++) {
        		count++;
        }
        //打印输出加分后成绩，以及加分次数
        System.out.println("加分后分数是" + score);
        System.out.println("共加了" + count + "次！");
	}
}
