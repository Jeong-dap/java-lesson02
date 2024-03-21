package kr.easw.lesson2;

public class ForWhileIteration {
    private static final int TARGET_ITERATION = 30;

    private static int currentIteration = 0;

    public static void main(String[] args) {
        iterateTenTime();
        iterateTwentyTime();
        if (currentIteration != TARGET_ITERATION) {
            System.out.println("오답입니다.");
        } else {
            System.out.println("정답입니다.");
        }
    }

    /**
     *  해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     *  for문을 이용해, 정확히 10번 {@code runTask} 메서드를 실행해야 합니다.
     */
    private static void iterateTenTime() {
        for (int i = 0; i < 10; i++) {
        	runTask();
        }
    }

    /**
     *  해당 메서드는 다음과 같은 역할을 가져야 합니다 :
     *  while문을 이용해, 정확히 20번 {@code runTask} 메서드를 실행해야 합니다.
     */
    private static void iterateTwentyTime() {
        int iterateCounter = 0;
        while (iterateCounter < 20) {
            runTask();
            iterateCounter++;
    }

    private static void runTask() {
        currentIteration++;
        System.out.println(currentIteration + "번 반복되었습니다.");
    }
}