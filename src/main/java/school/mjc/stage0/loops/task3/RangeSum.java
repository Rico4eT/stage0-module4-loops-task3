package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int result = 0;
        if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
        } else if (firstBoarder * -1 == secondBoarder || secondBoarder * -1 == firstBoarder) {
            System.out.println(0);
        } else if (firstBoarder < secondBoarder) {
            for (int i = 0; i <= secondBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        } else {
            for (int i = 0; i <= firstBoarder; i++) {
                result += i;
            }
            System.out.println(result);
        }
    }
}
