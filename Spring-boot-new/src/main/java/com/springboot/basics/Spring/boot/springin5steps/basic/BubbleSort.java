package com.springboot.basics.Spring.boot.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")
public class BubbleSort implements SortAlgorithm {
	public int[] sort(int[] numbers ){
		//logic for bubble sort
		return numbers;
	}
}
