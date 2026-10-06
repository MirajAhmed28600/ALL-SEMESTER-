
public class First {


    public void main (String[]args){
        // String name = "likhon";
        // byte age = 22;
        // float bill = 100.50f;
        // char grade = 'A';
        // double salary = 50000.75;
        // boolean Student = true;
        // long number1 = 123456789L;
        // short Number2 = 32767;
        
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(bill);
        // System.out.println(grade);
        // System.out.println(salary);
        // System.out.println(Student);
        // System.out.println(number1);
        // System.out.println(Number2);
        

     String str1 = "Hello, World!";
        String str2 = "Java Programming";
 // Convert to Uppercase
        String upperCaseString = str2.toUpperCase();
        System.out.println("Uppercase str2: " + upperCaseString);

       // Convert to Lowercase
        String lowerCaseString = str1.toLowerCase();
        System.out.println("Lowercase str1: " + lowerCaseString);
   // Trim
        String stringWithSpaces = " Trim me! ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
  // Boolean checks
        boolean startsWithHello = str1.startsWith("Hello");
        boolean endsWithProgramming = str2.endsWith("Programming");
        System.out.println("str1 starts with 'Hello': " + startsWithHello);
        System.out.println("str2 ends with 'Programming': " + endsWithProgramming);

    }
    
}
