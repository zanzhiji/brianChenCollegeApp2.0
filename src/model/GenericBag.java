package model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class GenericBag<E extends Comparable<E>> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private E[] arr;
	private int nEle;

	public GenericBag(Class cls, int capacity) {
		arr = (E[]) (Array.	newInstance(cls, capacity));
		nEle = 0;
	}

	public E[] removeCopy(Class cls, Predicate<E> predicate) {
		E[] matchArr = (E[]) (Array.newInstance(cls, nEle));
		int matchCount = 0;
		for (int i = 0; i < nEle; i++) {
			if (predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];

				arr[i] = arr[nEle - 1];
				nEle--;
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
	}

	public E[] removeShifting(Class cls, Predicate<E> predicate) {
		E[] matchArr = (E[]) (Array.newInstance(cls, nEle));
		int matchCount = 0;
		for (int i = 0; i < nEle; i++) {
			if (predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
				for (int j = i; j < nEle - 1; j++) {
					arr[j] = arr[j + 1];
				}
				i--;
				nEle--;
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
	}

	public E[] search(Class cls, Predicate<E> predicate) {
		E[] matchArr = (E[]) (Array.newInstance(cls, nEle));
		int matchCount = 0;
		for (int i = 0; i < nEle; i++) {
			if (predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
	}

	public void add(E value) {
		arr[nEle++] = value;
	}

	public void display() {
		for (int i = 0; i < nEle; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
