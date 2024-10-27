import java.util.*;

public class Student{

    Scanner sc = new Scanner(System.in) ;
    String name , phone_number ;
    int age , enrollment_number ;
    int p,c,m ;
   
    public void ipdata(){
        System.out.println("enter your name :");
        name = sc.nextLine() ;
        System.out.println("enter your age :");
        age = sc.nextInt() ;
        System.out.println("enter your enrollment_number :");
        enrollment_number = sc.nextInt() ;

        sc.nextLine() ;
   
        System.out.println("enter your phone_number :");
        phone_number = sc.nextLine() ;
        System.out.println();

    }

    void opdata(){
        System.out.println();
        System.out.println("Welcome "+name);
        System.out.println("Enrollment number : "+enrollment_number);
        System.out.println("age : "+age);
        System.out.println("phone number : "+phone_number);
        System.out.println();
    }

    void ipmarks(){
        System.out.println("enter your marks in physics chemistry and maths respectively");
        p = sc.nextInt() ;
        c = sc.nextInt() ;
        sc.nextLine() ;
        m = sc.nextInt() ;
        System.out.println();
    }
    void opmarks(){
        System.out.println("marks is physics : "+p+" ,chemistry : "+c+" ,maths : "+m);
        float percent = (p+c+m)/3 ;
        System.out.println("percentage in pcm : " + percent);
        System.out.println(" ");
    }
    void upmarks(){
        System.out.println("enter password");
        String str ;
        str = sc.nextLine() ;
        if(str == "password"){
            ipmarks(); 
        }
        else{
            System.out.println("you are not admin ");
        }

    }

}