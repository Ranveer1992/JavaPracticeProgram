package com.basic.interviewquestion;

import java.util.Iterator;
import java.util.PriorityQueue;

public class FirstKelementsUsingMinHeap {

	public static void main(String[] args) {
		int arr[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };

		int size = arr.length;

		// Size of Min Heap
		int k = 3;

		FirstKelements(arr, size, k);

	}

	private static void FirstKelements(int[] arr, int size, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue();
		//add till kth element in heap
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		//traverse kth to size
		for(int i=k;i<size;i++) {
			if(minHeap.peek() > arr[i]) {
				continue;
			}else {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		System.out.println("Kth largest element are :: ");
		Iterator itr = minHeap.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}

}
