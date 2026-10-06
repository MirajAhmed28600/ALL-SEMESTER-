

class Person {
            String Name;
            int age;

            Person(String Name, int age) {
                this.Name = Name;
                this.age = age;
            }
            void displayinfo(){
                System.out.println("Name:"+ Name+",age:"+ age);
            }
        }
    
    
public class Main{
    public static void main(String[] args){
    Person person1 = new Person("likhon",20);
    Person person2 = new Person("mohua" ,19);

    person1.displayinfo();
    person2.displayinfo();



    }
}