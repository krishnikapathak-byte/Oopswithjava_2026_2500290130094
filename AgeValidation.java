import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try{
        checkAge(age);
        }
        catch (AgeInvalidException e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }
    }


static void checkAge(int age) throws AgeInvalidException{
    if(age<18)
        throw new AgeInvalidException("Age is not valid to vote");
    System.out.println("Age is valid to vote");
   

}
}
class AgeInvalidException extends RuntimeException{
    public AgeInvalidException(String msg){
        super(msg);
    }
}