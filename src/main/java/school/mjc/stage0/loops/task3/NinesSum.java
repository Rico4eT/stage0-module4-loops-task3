package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum_of_nine = 0;
        String nine = "9";
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= lengthOfLastNumber; i ++) {
                sum_of_nine += Integer.parseInt(nine.repeat(i));
                }
            System.out.println(sum_of_nine);
            }
        }
    }
