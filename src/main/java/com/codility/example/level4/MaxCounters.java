package com.codility.example.level4;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by choonghyun on 19/02/2019.
 */
@Slf4j
public class MaxCounters {

    //77%가 나온다.. 퍼포먼스 테스트에서 실패...
    // 도저히 모르겠다 사람들이 푼 답을 보고싶지만....참아야지
    public int[] solution1(int N, int[] A) {
        int result[] = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (N < A[i]) {
                Arrays.fill(result, max);
            } else {
                int temp = ++result[(A[i] - 1)];
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return result;
    }
}
