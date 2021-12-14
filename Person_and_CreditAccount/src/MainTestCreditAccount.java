import java.util.Objects;
import java.util.Scanner;

public class MainTestCreditAccount {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println( " set the name ");
        String name = scanner.nextLine();

        System.out.println( " set the surname ");
        String surname= scanner.nextLine();

        System.out.println( " set the socialSN ");
        int socialSN = Integer.parseInt(scanner.nextLine());

        System.out.println( " set the limit ");
        int limit = Integer.parseInt(scanner.nextLine())*100;

        System.out.println( " set the balance");
        int balance = Integer.parseInt(scanner.nextLine())*100;

        System.out.println( " set the relationship ");
        boolean relationship ;
        relationship = Objects.equals(scanner.nextLine(), "y");

        Person p1 = new Person(name,surname,socialSN, null);

        CreditAccount p = new CreditAccount(p1 , p1.socialSN).newOfLimitBalanceOwner(limit,balance,p1);

        System.out.println(p.owner.name);
        System.out.println(p.getId());
        System.out.println(p.getBalance());
        System.out.println(p.getLimit());
    }
}
