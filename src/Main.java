//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstname = "Samantha";
        String lastname = "oloruntoba";
        int age = 16;
        String color = "purple";
        String food = "rice";
        String hobby = "writing";
        int amount = 3000;
        int amount2 = 5000;

        System.out.println("My name is" +" "+ firstname + " "+ lastname);
        System.out.println("I am" + " " + age + " " +"years old.");
        System.out.println("My favourite color is " + " " + color);
        System.out.println("My favourite food is" + " " + food);
        System.out.println("My hobby is" + " " + hobby);
        System.out.println("My mom gave me" + " " + amount + "," + "but i already had" + " " + amount2);
        System.out.println("So now i have" + " " + (amount + amount2) + " " + "in total");
    }
}