package com.springboot.basics.Spring.boot.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick") 
public class QuickSort implements SortAlgorithm{
	public int[] sort(int[] numbers ){
		//logic for quick sort
		return numbers;
	}
}
