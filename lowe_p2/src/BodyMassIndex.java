public class BodyMassIndex {
    private double height;
    private double weight;

    public BodyMassIndex(double height, double weight){
        this.height= height;
        this.weight= weight;
    }
    public String getBmiInfo(){
        double bmi = getBmi();
        return "Your BMI is: " + bmi;
    }
    public String getBMICategory() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "underweight";

        } else if (bmi >= 18.5 && bmi < 25) {
            return "normal";

        } else if (bmi >= 25 && bmi < 30) {
            return "overweight";
        }
            else {
                return "obese";
        }
    }
    public double getBmi(){
        double bmi = (weight * 703) / (height * height);
        return bmi;
    }
}
