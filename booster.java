import java.util.Scanner;
public class Vaccination {
    void show(){
        System.out.println("You are eligible for booster dose.");
    }
    void show1(){
        System.out.println("You're not eigible for booster dose.");
    }

    public static void main(String[] args) {
        int YEAR= 2022;
        int age, year;
        String name, gen, nat;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Nationality: ");
        nat = sc.nextLine().toLowerCase();
        System.out.println(nat);

        System.out.println("Enter Gender: ");
        gen = sc.nextLine().toLowerCase();
        System.out.println(gen);

        System.out.println("Enter Year of Birth:");
        year = sc.nextInt();
        System.out.println(year);

        age = YEAR - year;
        System.out.println("Your age is "+age);

        Vaccination obj1 = new Vaccination();
        if ((age > 60 && gen == "male") || (age>50 && gen=="female" ) && nat=="indian" ) {
            obj1.show();
        } else if (age >= 45) {
            obj1.show1();
        }
    }
}