import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner;
    private static boolean moreInput(){
        if(scanner == null){
            scanner= new Scanner(System.in);
        }
       System.out.println("Do you want to continue Y or N;   ");
        String line=  scanner.nextLine();
        if(line.trim().equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }
    private static void displayBmiInfo(BodyMassIndex bmi){
        System.out.println(bmi.getBmiInfo());
        System.out.println("Your bmi Category is:  " + bmi.getBMICategory());
    }
    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){
        double sum = 0;
        for(int x = 0; x< bmiData.size(); x++){
            sum = sum + bmiData.get(x).getBmi();
        }
        double average = sum / bmiData.size();
        System.out.println("This is the average BMI: " + average);
    }

    private static double getUserHeight(){
        double height = 0;
        while (height<= 0){
            System.out.print("Please enter your height in inches: ");
            height = scanner.nextDouble();
            scanner.nextLine();
        }
        return height;
    }
    private static double getUserWeight(){
        double weight = 0;
        while (weight <=0 ){
            System.out.print("Please enter your weight in pounds: ");
            weight = scanner.nextDouble();
            scanner.nextLine();
        }
        return weight;
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

}

