public class ProceduralProgramming {

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int totalWage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println("Total Wage: " + totalWage);
    }

}