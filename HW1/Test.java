import java.util.List;

public class Test {

    public static void main(String[] args) {

    StableMatching sm = new StableMatching(); 
    
    List<Person> men = sm.getMen();

    List<Person> women = sm.getWomen();

    System.out.println("Before for men loop: ");
   
    while ( ! sm.haveAllMenBeenMatched() ) {
    
        sm.match(men, women);

    }
           
    System.out.println("After: " + men);
    System.out.println("After: " + women);

    }
}