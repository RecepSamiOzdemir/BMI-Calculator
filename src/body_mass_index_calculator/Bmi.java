package body_mass_index_calculator;

public class Bmi {
    private String name;
    private int age;
    private double height;
    private double weight;
    public static final double KILOGRAMS_PER_POUND =  0.45359237;
    public static final double  METERS_PER_INCH =   0.0254;
    //public double calcBmi;
    public Bmi(){
        name = "John Black";
        age = 25;
        height = 100;
        weight = 50;
    }
    public  Bmi(String p2Name, double p2Weight, double p2Height){
        name = p2Name;
        height = p2Height;
        weight = p2Weight;
        age = 20;
    }
    public Bmi(String p3Name, int p3Age, double p3Weight, double p3Height){
        name = p3Name;
        age = p3Age;
        weight = p3Weight;
        height = p3Height;
    }


    public String getName() {
        return name;
    }

    public void setName(String setName) {
        name = setName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int setAge) {
        age = setAge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double setHeight) {
        height = setHeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double setWeight) {
        weight = setWeight;
    }


    public double getBMI(Bmi bmiPerson){
        double calcBmi, weight, height;

        weight = bmiPerson.getWeight();
        height = bmiPerson.getHeight();

        weight *= KILOGRAMS_PER_POUND;
        height *= METERS_PER_INCH;
        calcBmi = Math.round(weight / Math.pow(height,2));

        return calcBmi;
    }
    public String getStatus(double calcBmi){
        String bmiStatus = "";

        if (calcBmi < 18.5){
             bmiStatus = "Underweight";
        } else if (calcBmi >= 18.5 && calcBmi < 25) {
             bmiStatus = "Normal";
        } else if (calcBmi >= 25 && calcBmi < 30) {
             bmiStatus = "Overweight";
        }else {
             bmiStatus = "Obese";
        }
        return bmiStatus;
    }
}
