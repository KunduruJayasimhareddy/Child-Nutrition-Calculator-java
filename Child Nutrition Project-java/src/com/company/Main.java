package com.company;
import java.util.*;

public class Main {

    private static String name;
    private static int age;
    private static String gender;
    private static int height;
    private static int weight;

    private static int milk;
    private static int vegetables;
    private static int meat;
    private static int lentils;
    private static int egg;
    private static int rice;

     static void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
         name = sc.nextLine();
        System.out.println("Enter Age:");
         age= sc.nextInt();
        System.out.println("Enter Gender(male or female):");
         gender= sc.next();
        System.out.println("Enter Height(inches):");
         height= sc.nextInt();
        System.out.println("Enter Weight(pounds):");
         weight= sc.nextInt();
    }

    static void inputIntakeDetails(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the intake details of food in grams");

        System.out.println("Milk:");
        milk= sc.nextInt();

        System.out.println("Vegetables:");
        vegetables= sc.nextInt();

        System.out.println("Meat:");
        meat= sc.nextInt();

        System.out.println("Lentils:");
        lentils= sc.nextInt();

        System.out.println("Egg:");
        egg= sc.nextInt();

        System.out.println("Rice:");
        rice= sc.nextInt();
    }

    public static double calTotalCalorieIntake(int Milk,int Vegetables,int Meat,int Lentils,int Egg,int Rice){
         double caloriesOfMilk=(100/100)*Milk;
         double caloriesOfVegetables=(85/100)*Vegetables;
         double caloriesOfMeat=(143/100)*Meat;
         double caloriesOfLentils=(113/100)*Lentils;
         double caloriesOfEgg=(155/100)*Egg;
         double caloriesOfRice=(130/100)*Rice;

        return caloriesOfMilk+caloriesOfVegetables+caloriesOfMeat+caloriesOfLentils+caloriesOfEgg+caloriesOfRice;
    }

    public static double calculateBMI(int Height,int Weight){
        double result = (Weight / (Height * Height)) * 703;
        return result;
    }


    public static void main(String[] args) {

        inputDetails();

        inputIntakeDetails();

        double totalCalConsumption=calTotalCalorieIntake(milk,vegetables,meat,lentils,egg,rice);

        double BMI=calculateBMI(height,weight);

        System.out.println("\n************************************************************");
        System.out.println("Child Details:");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Height:"+height+"inches");
        System.out.println("Weight:"+weight+"pounds");

        System.out.println("\nChild intake Details:");
        System.out.println("Milk:"+milk+"g");
        System.out.println("Vegetables:"+vegetables+"g");
        System.out.println("Meat:"+meat+"g");
        System.out.println("Lentils:"+lentils+"g");
        System.out.println("Egg:"+egg+"g");
        System.out.println("Rice:"+rice+"g");

        if(gender.equals("male")){
            if(BMI<16) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and he is Severely UnderWeight");
            }
            else if(BMI>=16 && BMI<18.5) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and he is UnderWeight");
            }
            else if(BMI>=18.5 && BMI<25) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and he is Healthy");
            }
            else if(BMI>=25 && BMI<30) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and he is Overweight");
            }
            else{
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and he is Obese");
            }

            if(age>=0 && age<2 && totalCalConsumption<800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is " + totalCalConsumption+ " and he is Undernourished");
            }
            else if(age>=0 && age<2 && totalCalConsumption>=800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption+ " and he is not Undernourished");
            }
            else if(age>=2 && age<4 && totalCalConsumption<1400) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption+ " and he is Undernourished");
            }
            else if(age>=2 && age<4 && totalCalConsumption>=1400) {
                System.out.println("\nThe daily calorie consumption of " + name + " is " + totalCalConsumption + " and he is not Undernourished");
            }
            else if(age>=4 && age<8 && totalCalConsumption<1800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption + " and he is Undernourished");
            }
            else if(age>=4 && age<8 && totalCalConsumption>=1800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption + " and he is not Undernourished");
            }


        }

        if(gender.equals("female")){
            if(BMI<16) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and she is Severely UnderWeight");
            }
            else if(BMI>=16 && BMI<18.5) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and she is UnderWeight");
            }
            else if(BMI>=18.5 && BMI<25) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and she is Healthy");
            }
            else if(BMI>=25 && BMI<30) {
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and she is Overweight");
            }
            else{
                System.out.println("\nBMI of " + name + " is "+ BMI+ " and she is Obese");
            }

            if(age>=0 && age<2 && totalCalConsumption<800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is " + totalCalConsumption+ " and she is Undernourished");
            }
            else if(age>=0 && age<2 && totalCalConsumption>=800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption+ " and she is not Undernourished");
            }
            else if(age>=2 && age<4 && totalCalConsumption<1400) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption+ " and she is Undernourished");
            }
            else if(age>=2 && age<4 && totalCalConsumption>=1400) {
                System.out.println("\nThe daily calorie consumption of " + name + " is " + totalCalConsumption + " and she is not Undernourished");
            }
            else if(age>=4 && age<8 && totalCalConsumption<1800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption + " and she is Undernourished");
            }
            else if(age>=4 && age<8 && totalCalConsumption>=1800) {
                System.out.println("\nThe daily calorie consumption of " + name + " is "+ totalCalConsumption + " and she is not Undernourished");
            }


        }
        System.out.println("\n************************************************************");
    }

}
