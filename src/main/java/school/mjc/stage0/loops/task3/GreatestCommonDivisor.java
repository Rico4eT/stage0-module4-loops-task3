package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int answer = 0;
        int temp = 0;
        int bigger = first <= second ? second : first;
        for (int i = 1; i <= bigger; i++) {
            if (second % i == 0 && first % i == 0) {
                temp = i;
            }
        }
        System.out.println(answer < temp ? answer | temp : temp);
    }
}
