public class DoubleArrayExample {

    public static void main(String[] args) {

        double[] marks = {85.5, 72.0, 90.5, 68.5, 77.0};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}