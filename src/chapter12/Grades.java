package chapter12; // Chapter 12 Homework

import java.util.HashMap;
import java.util.Map;

public class Grades {

    private static int[] oldGrades;
    private static int[] redoGrades;

    public static void main(String[] args) {
        // get grades
        Map redo = TestResults.getMakeUpGrades();
        Map grade = TestResults.getOriginalGrades();

        int oldSize = grade.size();
        int redoSize = redo.size();

        setOldGrades(oldGrades);
        setRedoGrades(redoGrades);

        for (int i = 0; i < oldSize; i++) {
            if (oldGrades[i] > redoGrades[i]) {

            }
        }

    }

    public static void setOldGrades(int[] array) {

        Map<String, Integer> grades = TestResults.getOriginalGrades();
        for (var oldGrades: grades.entrySet()) {
            int i = 0;
            array[i] = oldGrades.getValue();
            i++;
        }
    }

    public static void setRedoGrades(int[] array) {
        Map<String, Integer> grades = TestResults.getMakeUpGrades();
        for (var redoGrades: grades.entrySet()) {
            int i = 0;
            array[i] = redoGrades.getValue();
            i++;
        }
    }
}
