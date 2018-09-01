package com.tz.sort;

import java.util.Random;

/**
 * 
 * ѡ������
 * SelectSort
 * ������:xuchengfei 
 * ʱ�䣺2016��3��24��-����8:08:20 
 * @version 1.0.0
 *
 */
public class MaoPaoSort {

	
	/**
	 * �������
	 * ��������randomArray
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��3��24��-����8:12:25 
	 * �ֻ�:1564545646464
	 * @return int[]
	 * @exception 
	 * @since  1.0.0
	 */
	public static int[] randomArray(){
		Random random = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=random.nextInt(50);
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
		/*
		 * ѡ��������һ�ּ�֮��������㷨������ԭ���ǣ�
		 * ������Ԫ����ѡ��һ����������С��һ��Ԫ�أ�˳�����һ�����źõ��������ֱ��ȫ���������Ԫ������.
		 * */
		
		int[] nums =randomArray();
		int index ;
		for (int i = 1; i < nums.length; i++) {
			index=0;
			for (int j = 1; j <= nums.length-i; j++) {
				if(nums[j] > nums[index]){
					index = j;
				}
			}
			
			int temp = nums[nums.length-i];
			nums[nums.length-i] = nums[index];
			nums[index]=temp;
			
			System.out.print("��"+(i)+"��:");
			//����Ľ���͹��̵Ĳ鿴
			for (int k = 0; k < nums.length; k++) {
				int j = nums[k];
				System.out.print(j+"\t");
			}
			System.out.println("=====");
		}
		
		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			System.out.print(j+"\t");
		}
		
		
	}
	
	
}
