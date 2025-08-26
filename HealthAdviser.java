import java.util.*;

class User {
        String Name;
        double Weight;
        int Age;
        double Water;
        int Sleep;
        double Height;

        User(String Name,double Weight,int Age,double Water,int Sleep,double Height){
            this.Name = Name;
            this.Weight = Weight;
            this.Age = Age;
            this.Water = Water;
            this.Sleep = Sleep;
            this.Height = Height;
        }
    }

public class HealthAdviser{
    public static void main(String[] args)
    {
        System.out.println("Hello! Welcome to online Health care");
        System.out.println("Let's start, you give me your details.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String Name = sc.nextLine();
        System.out.println("Enter your current weight : ");
        double Weight = sc.nextDouble();
        System.out.println("Enter your Age : ");
        int Age = sc.nextInt();
        System.out.println("Enter your average daily water intake in liters : ");
        double Water = sc.nextDouble();
        System.out.println("How many hours do you usually sleep at night? : ");
        int Sleep = sc.nextInt();
        System.out.println("Enter your height in feet : ");
        double Height = sc.nextDouble();
        sc.close();

        double HeightMeters = Height * 0.3048;
        double BMI = Weight / (HeightMeters * HeightMeters);

        User data = new User(Name, Weight, Age, Water, Sleep,Height);

        System.out.println("------------------------------------------------");
        System.out.println("             Health Report Overview");
        System.out.println("------------------------------------------------");
        System.out.printf(" Name           : %s\n", data.Name);
        System.out.printf(" Age            : %d years\n", data.Age);
        System.out.printf(" Weight         : %.1f kg\n", data.Weight);
        System.out.printf(" Water Intake   : %.1f liters/day\n",data.Water);
        System.out.printf(" Sleep Duration : %d hours/night\n", data.Sleep);
        System.out.printf(" Height         : %.2f ft\n", data.Height);
        System.out.printf(" BMI            : %.2f\n", BMI );

        System.out.println("\n  Suggested Health Actions:");
        System.out.println("------------------------------------------------");

        if(data.Age <= 5)
        {
            if(data.Water <= 1.2)
            {
                System.out.printf("You should drink more water. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age >= 6 && data.Age <= 12)
        {
            if(data.Water <= 2.1)
            {
                System.out.printf("Keep hydrating! Drink 2.5 to 3 liters of water daily. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age >= 13 && data.Age <= 19)
        {
            if(data.Water <= 2.1)
            {
                System.out.printf("Keep hydrating! Drink 2.5 to 3 liters of water daily. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age >= 20 && data.Age <= 26)
        {
            if(data.Water <= 2.7)
            {
                System.out.printf("Keep hydrating! Drink 2.5 to 3 liters of water daily. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age >= 27 && data.Age <= 60)
        {
            if(data.Water <= 2.5)
            {
                System.out.printf("Keep hydrating! Drink 2.5 to 3 liters of water daily. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age > 60)
        {
            if(data.Water <= 2)
            {
                System.out.printf("Keep hydrating! Drink 2.5 to 3 liters of water daily. %.1f this is not enough.%n", data.Water);
            }else{
                System.out.println("Great! Your daily water intake is sufficient. Keep it up to stay hydrated.");
            }
        }
        if(data.Age <= 10)
        {
            if(data.Sleep < 9)
            {
                System.out.println("You may not be getting enough sleep for your age. (Need : 9-12 hrs)");
            }
            else if(data.Sleep > 12)
            {
                System.out.println("Too much sleep may reduce energy. (Need : 9-12 hrs)");
            }
            else{
                System.out.println("Great! You are getting enough rest.");
            }
        }
        if(data.Age >= 11 && data.Age <= 18)
        {
            if(data.Sleep < 7)
            {
                System.out.println("You may not be getting enough sleep for your age. (Need : 8-10 hrs)");
            }
            else if(data.Sleep > 11)
            {
                System.out.println("Too much sleep may reduce energy. (Need : 8-10 hrs)");
            }
            else{
                System.out.println("Great! You're getting enough sleep. This helps keep your mind and body refreshed.");
            }
        }
        if(data.Age >= 19 && data.Age <= 60)
        {
            if(data.Sleep < 7)
            {
                System.out.println("You may not be getting enough sleep for your age. (Need : 7-9 hrs)");
            }
            else if(data.Sleep > 11)
            {
                System.out.println("Too much sleep may reduce energy. (Need : 7-9 hrs)");
            }
            else{
                System.out.println("Great! You're getting enough sleep. This helps keep your mind and body refreshed.");
            }
        }
        if(data.Age > 60)
        {
            if(data.Sleep < 7)
            {
                System.out.println("You may not be getting enough sleep for your age. (Need : 7-9 hrs)");
            }
            else if(data.Sleep > 10)
            {
                System.out.println("Too much sleep may reduce energy. (Need : 7-9 hrs)");
            }
            else{
                System.out.println("Great! You're getting enough sleep. This helps keep your mind and body refreshed.");
            }
        }
        System.out.printf("BMI Category: ");
        if (BMI < 18.5) {
            System.out.println("Underweight");
            System.out.println("You are underweight. Eat more nutritious food and increase calorie intake.");
        } else if (BMI >= 18.5 && BMI < 24.9) 
        {
            System.out.println("Normal");
            System.out.println("You are in a healthy weight range. Keep it up!");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Overweight");
            System.out.println("You are overweight. Do regular exercise and maintain a balanced diet.");
        } else {
            System.out.println("Obese");
            System.out.println("You are in the obese category. Consult a healthcare professional.");
        }

        System.out.println("Stay active! Try to do at least 30 minutes of physical activity daily like walking, stretching, or yoga.");
        System.out.println("Practice deep breathing, meditation, or any hobby to reduce daily stress.");

        System.out.println("------------------------------------------------");

    }
}