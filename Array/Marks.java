public class Marks {
    public static void main(String[] args) {
        int[] marks = new int[] { 20, 30, 40, 23, 45, 65 };
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 30) {
                System.out.println(marks[i]);
            }
        }
    }
}
