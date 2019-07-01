import java.util.Scanner;
public class TestClass {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Closet closet1 = new Closet();
                Closet closet2 = new Closet();
                Closet closet3 = new Closet();

                String input;

                do {

                    System.out.println("Hello! you have three options to choose: closet1, closet2 and closet3. Which closet would you like to open? when you done type quit");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("closet1")) {
                        System.out.println(closet1.getCloset1());
                    } else if (input.equalsIgnoreCase("closet2")) {
                        System.out.println(closet2.getCloset2());
                    } else if (input.equalsIgnoreCase("closet3")) {
                        System.out.println(closet3.getCloset3());
                    }else if(input.equalsIgnoreCase("quit")){
                        break;

                    }else{
                        System.out.println(" Sorry that is not an option");
                    }

                } while(!input.equalsIgnoreCase("quit"));
            }
        }


