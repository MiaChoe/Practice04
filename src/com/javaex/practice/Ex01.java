//Done//2021.11.21(일)21:27
//예상:i는 0부터5까지 다섯 개가 나올 텐데 global variables로 선언한 게 5개 이므로 for문조건 범위가 틀림. 등호를 빼주면 일단 돼.
//intArray[3],intArray[4],intArray[5]값을 모르므로 result4,result5,result6는 기존result값인 0이고 22가 출력.

package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i =0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
	}

}
