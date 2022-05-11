public class User {

    String name;
    String role;
    String voiceLine;



    public void printRole(){
        System.out.println("I am a "+role);
    }

    public void printName(){
        System.out.println("I am "+name);
    }
    public void sayLine(String passedLine){
        System.out.println(passedLine);
    }

}

class Student extends User{

   public Student(){
       role = "Student";
       voiceLine= "Uni is gnarly man";
   }

}

class Tutor extends User{

    public Tutor(){
        role = "Tutor";
        voiceLine= "Do your reading mister";
    }
}

class Admin extends User{

    public Admin(){
        role = "Admin";
        voiceLine= "I am the overlord";
    }
}