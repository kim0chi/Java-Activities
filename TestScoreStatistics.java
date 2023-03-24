import java.util.*;

public class TestScoreStatistics {
    
    public static void main(String[] args){
    int testScore, sum, count = 0, highest = 0, lowest = 0;
    double average = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter any number of test scores (0 - 100) or Enter 999 to exit");
    int num = sc.nextInt();

    while ( num != 999){
        if(num >= 0 && num <= 100)
            count++;
            sum += num;
        if(num <= lowest)
            lowest = num;
        else if(highest >= num)
            highest = num;
        }
    average = sum / count;
    System.out.println("Average : "+average + "\nSum : "+sum +"\ncount : "+count +"\nHighest : "+highest +"\nLowest : "+lowest);
    }
}
