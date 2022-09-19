package practice;

public class Sandbox {

    public int sum(int num) {

        if(num <= 1)
            return 1;

        return num + sum(num - 1);

    }

    public int sumLoop(int num) {

        int sum = 1;
        for(int i=2; i <= num; i++)
            sum+=i;
        return sum;

    }


}
