package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number){
        int sum = 0;
        if (number < 0) {
            number *= -1;
        }
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            sum += Integer.parseInt((String.valueOf(String.valueOf(number).charAt(i))));
        }
        System.out.println(sum);
    }
}
