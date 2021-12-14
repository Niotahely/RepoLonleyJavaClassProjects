import java.util.Objects;
import java.util.Scanner;

public class MainTestPerson {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( " set the name ");
        String name = scanner.nextLine();

        System.out.println( " set the surname ");
        String surname= scanner.nextLine();

        System.out.println( " set the socialSN ");
        int socialSN = Integer.parseInt(scanner.nextLine());

        System.out.println( " set the relationship ");
        boolean relationship ;
        relationship = Objects.equals(scanner.nextLine(), "y");




        System.out.println( " set the name ");
        String name2 = scanner.nextLine();

        System.out.println( " set the surname ");
        String surname2= scanner.nextLine();

        System.out.println( " set the socialSN ");
        int socialSN2 = Integer.parseInt(scanner.nextLine());

        System.out.println( " set the relationship ");
        boolean relationship2 ;
        relationship = Objects.equals(scanner.nextLine(), "y");


        Person p1 = new Person(name,surname,socialSN, null);
        Person p2 = new Person ( name2,surname2,socialSN2,null);

        p1.join(p1,p2);

        System.out.println(p1.spouse.name);


    }
}
