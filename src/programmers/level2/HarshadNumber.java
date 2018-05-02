package programmers.level2;

public class HarshadNumber {

    public boolean isHarshad(int num){

        String[] buffer = Integer.toString(num).split("");
        int sum = 0;
        for (int i = 0 ; i < buffer.length ; i++) {
            sum += Integer.parseInt(buffer[i]);
        }

        if (num % sum == 0) {
            return true;
        }

        return false;
    }

    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(11));
    }
}
