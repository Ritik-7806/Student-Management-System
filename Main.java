import java.util.* ;

public class Main {

    public static void main(String[] args) {
          
        System.out.println("Hello");
        Student s1 = new Student() ;
        Scanner sc = new Scanner(System.in) ;
        int num=0 ;
        while(num != 6){
        System.out.println("press 1 for entering general information" );
        System.out.println("press 2 to view information");
        System.out.println("press 3 for enter marks");
        System.out.println("press 4 for view marks");
        System.out.println("press 5 for updating marks");
        System.out.println("press 6 for exit");
        num = sc.nextInt() ;
        System.out.println( );

        switch(num){
            case 1 : s1.ipdata() ;
            break ;

            case 2 : s1.opdata() ;
            break ;

            case 3 : s1.ipmarks() ;
            break ;

            case 4 : s1.opmarks();
            break ;

            case 5 : s1.upmarks() ;
            break ;

            case 6 : System.out.println("bye"); 
            break ;

            default : System.out.println("invalid");

        }
    }

    }

}
