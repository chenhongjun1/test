package com.tz.sort;

import java.util.Random;

/**
 * 
 * 选择排序
 * SelectSort
 * 创建人:xuchengfei 
 * 时间：2016年3月24日-下午8:08:20 
 * @version 1.0.0
 *
 */
public class MaoPaoSort {

	
	/**
	 * 随机数组
	 * 方法名：randomArray
	 * 创建人：xuchengfei 
	 * 时间：2016年3月24日-下午8:12:25 
	 * 手机:1564545646464
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
		 * 选择排序是一种简单之光的排序算法，基本原理是：
		 * 从数据元素中选出一个最大或者最小的一个元素，顺序放在一个已排好的数列最后，直到全部待排序的元素排完.
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
			
			System.out.print("第"+(i)+"轮:");
			//排序的结果和过程的查看
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
