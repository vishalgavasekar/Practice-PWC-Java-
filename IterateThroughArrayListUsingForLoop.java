import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Creating an array list
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

        // Using for loop
        System.out.println("Iterating over ArrayList using for loop: ");

        for (int i = 0; i < languages.size(); i++) {
            System.out.print(languages.get(i));
            System.out.print(", ");
        }
    }
}