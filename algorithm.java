import java.io.* ;

class Algorithm {

	public static void main( String[] args ) {
		int[] data = {11, 8, 8, 1, 6, 3, 10};
		int[] ordered = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

		System.out.println(search(ordered, 21));

		// int[] sorted = bubbleSort(data);
		// for (int i = 0; i < sorted.length; i++) {
		// 	System.out.println(sorted[i]);
		// }
	}

	// public static int max(int[] a) {
	// 	int max = a[0];

	// 	for (int x : a) {
	// 		if (x > max) {
	// 			max = x;
	// 		}
	// 	}
	// 	return max;
	// }
	// public static int min(int[] a) {
	// 	int min = a[0];

	// 	for (int x : a) {
	// 		if (x < min) {
	// 			min = x;
	// 		}
	// 	}
	// 	return min;
	// }
	// public static int index(int val, int[] a) {
	// 	int index = 0;

	// 	for (int i = 0; i < a.length; i++) {
	// 		if (val == a[i]) {
	// 			index = i;
	// 			break;
	// 		}
	// 	}
	// 	return index;
	// }

	// public static int[] sort(int[] arr) {
	// 	int[] newArr = new int[arr.length];
	// 	int max = max(arr);
	// 	for (int i = 0; i < arr.length; i++) {
	// 		newArr[i] = min(arr);
	// 		arr[index(newArr[i], arr)] = max;
	// 	}
	// 	return newArr;
	// }

	public static boolean search(int[] arr, int target) {
		int midInd = arr.length / 2;
		int mid = arr[midInd];
		int firstQuaInd = arr.length / 4;
		int firstQua = arr[firstQuaInd];
		int thirdQuaInd = midInd + firstQuaInd;
		int thirdQua = arr[thirdQuaInd];

		if (mid == target) {
			return true;
		} else if (mid > target) {
			if (firstQua == target) {
				return true;
			} else if (firstQua > target) {
				for (int i = 0; i < firstQuaInd; i++) {
					if (arr[i] == target) {
						return true;
					}
				}
			} else if (firstQua < target){
				for (int i = 0; i < midInd; i++) {
					if (arr[i] == target) {
						return true;
					}
				}
			}
		} else {
			if (thirdQua == target) {
				return true;
			} else if (thirdQua > target) {
				for (int i = thirdQuaInd; i < arr.length; i++) {
					if (arr[i] == target) {
						return true;
					}
				}
			} else if (thirdQua < target){
				for (int i = midInd; i < thirdQuaInd; i++) {
					if (arr[i] == target) {
						return true;
					}
				}
			}
		}
		return false;
	}
}