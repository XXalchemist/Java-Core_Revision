
/**
 * conditional_statements
 */
public class conditional_statements {

    public static void main(String[] args){

        int choice = 2;
        boolean condition = true;

        if(condition){
            System.out.println("True");

        }
        else
        System.out.println("False");

        switch (choice) {
            case 1: System.out.println("This is 1 ");
            break;

            case 2 : System.out.println("This is 2");
            break;

            default : System.out.println("This is dfault");
        }
    }
}