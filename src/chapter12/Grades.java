package chapter12; // Chapter 12 Homework

import java.util.HashMap;
import java.util.Map;

public class Grades {

    // names
    private static String[] names;

    // grades array
    private static int[] oldGrades;
    private static int[] redoGrades;
    private static int[] checkedGrades;

    public static void main(String[] args) {
        // get grades
        Map<String, Integer> redo = TestResults.getMakeUpGrades();
        Map<String, Integer> grade = TestResults.getOriginalGrades();

        // Initialize arrays with the size of the maps
        int size = grade.size();
        names = new String[size];
        oldGrades = new int[size];
        redoGrades = new int[size];
        checkedGrades = new int[size];

        // get names and grades into an array
        setNames(names);
        setOldGrades(oldGrades);
        setRedoGrades(redoGrades);

        // check grades based on numbers
        checkGrades(oldGrades, redoGrades);

        Map<String, Integer> newGradesMap = new HashMap<>();
        for (int i = 0; i < oldGrades.length; i++) {
            newGradesMap.put(names[i], checkedGrades[i]);
        }

        System.out.println("Grades: ");
        newGradesMap.forEach(
                (k, v) -> System.out.println("Name: " + k + " Grade: " + v)
        );
    }

    public static void setNames(String[] buf) {
        Map<String, Integer> grades = TestResults.getOriginalGrades();
        int i = 0;
        for (var entry : grades.entrySet()) {
            buf[i++] = entry.getKey();
        }
    }

    public static void setOldGrades(int[] buf) {
        Map<String, Integer> grades = TestResults.getOriginalGrades();
        int i = 0;
        for (var entry : grades.entrySet()) {
            buf[i++] = entry.getValue();
        }
    }

    public static void setRedoGrades(int[] buf) {
        Map<String, Integer> grades = TestResults.getMakeUpGrades();
        int i = 0;
        for (var entry : grades.entrySet()) {
            buf[i++] = entry.getValue();
        }
    }

    public static void checkGrades(int[] first, int[] second) {
        // check if grades are the same or different
        for (int i = 0; i < first.length; i++) {
            if (first[i] >= second[i]) {
                checkedGrades[i] = first[i];
            } else {
                checkedGrades[i] = second[i];
            }
        }
    }
}
