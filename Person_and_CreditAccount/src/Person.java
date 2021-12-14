import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    // fields

    public final String name;
    public String surname;
    public final long socialSN;
    public Person spouse = null ;
    private boolean relationship;

    public Person(String name, String surname, long socialSN, Person spouse) {

        // checking if name and surname are valid
        if(checkNS(name))this.name = name; else throw new IllegalArgumentException();
        if(checkNS(surname))this.surname = surname;else throw new IllegalArgumentException();

        // checking if socialSN is positive
        if(socialSN < 0) throw new IllegalArgumentException();
        else this.socialSN = socialSN;

        if (!this.relationship)this.spouse = spouse;

    }



    // method that checks if name and surname are valid
    public boolean checkNS( String idPerson){
        Pattern pattern = Pattern.compile(idPerson, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(idPerson);
        return matcher.find();
    }


    // method that checks if person is single or not
    public boolean isSingle (Person p){
        return (!p.relationship);
    }


    // method that checks if two persons are the same person
    public boolean isTheSamePerson( Person p1, Person p2){
        return (p1.socialSN == p2.socialSN);
    }




    // method that allows two persons to marry
    public void join(Person p1, Person p2){

        // check if they are the saime person
        if(isTheSamePerson(p1, p2)) throw new IllegalArgumentException();

        // check if they are single
        else if (!(p1.relationship && p2.relationship)) p1.relationship = true ; p2.relationship = true;
        p1.spouse = p2 ;
        p2.spouse = p1 ;


    }


    // method that allows two persons to divorce
    public void divorce ( Person p1 , Person p2){


        // check if they are the saime person
        if(isTheSamePerson(p1, p2)) throw new IllegalArgumentException();

        // check if they are married
        else if ((p1.relationship && p2.relationship)) p1.relationship = false ; p2.relationship = false;
        p1.spouse = null ;
        p2.spouse = null ;
    }





}
