package kr.easw.lesson2;

import java.util.Random;

public class MultiplicationTableIteration {
    private static int[][] fixedMultiplicationTable = new int[][]{
            new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
            new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18},
            new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27},
            new int[]{4, 8, 12, 16, 20, 24, 28, 32, 36},
            new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45},
            new int[]{6, 12, 18, 24, 30, 36, 42, 48, 54},
            new int[]{7, 14, 21, 28, 35, 42, 49, 56, 63},
            new int[]{8, 16, 24, 32, 40, 48, 56, 64, 72},
            new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81}
    };

    private static final int CHECK_COUNT = 9;
    private static final Random random = new Random();
    private static int matchCounter = 0;

    public static void main(String[] args) {
        // Random#nextInt(int)는 0부터 주어진 값까지(exclusive) 무작위의 숫자를 반환합니다.
        // 현재 조건에서는, 1단부터 9단까지 무작위로 조건을 주어야 합니다.
        // 그러므로, 9를 파리미터로 사용하면 0부터 8까지의 무작위 값이 주어지고,
        // 이에 1을 더해 1에서 9 사이의 무작위 값을 생성할 수 있습니다.
        loopMultiplicationTable(random.nextInt(9) + 1);
        if (matchCounter == CHECK_COUNT) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
        }
    }

    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * first 파라미터를 행으로 두고, 1부터 9까지 반복하여 matchMultiplicationTable 메서드를 호출해야 합니다.
     *
     * @param first 구구단의 행
     */
    private static void loopMultiplicationTable(int first) {
        // 아래 2줄은 힌트입니다.
        // 아래에 제시된 2줄의 코드를 활용하여 코드를 작성해보세요.
        // 힌트를 활용하지 않아도 구현은 가능합니다.
        int row = 1;
        matchMultiplicationTable(first, row, checkMultiplicationTable(first, row));
        for (int i = 1; i <= 9; i++) {
            matchMultiplicationTable(first, i, checkMultiplicationTable(first, i));
        }
    }


    /**
     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     * 파라미터 first와 파라미터 second를 곱해 반환해야 합니다.
     *
     * @param first  구구단의 행
     * @param second 구구단의 열
     */
    private static int checkMultiplicationTable(int first, int second) {
    	return first * second;
    }


    /**
     * 해당 메서드는 구구단의 행과 열을 받아 미리 선언된 값과 주어진 값을 비교하고,
     * 만약 주어진 값과 일치한다면 일치 횟수를 1 증가시킵니다.
     *
     * @param first 구구단의 행
     * @param second 구구단의 열
     * @param result 비교할 값
     */
    private static void matchMultiplicationTable(int first, int second, int result) {
        if (fixedMultiplicationTable[first - 1][second - 1] == result) {
            matchCounter++;
        }
    }
}