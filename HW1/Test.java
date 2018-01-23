import java.util.List;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Person m1 = new Person("Bob", Gender.MALE);
        Person m2 = new Person("John", Gender.MALE);
        Person m3 = new Person("Pete", Gender.MALE);
       
        Person w1 = new Person("Kate", Gender.FEMALE);
        Person w2 = new Person("Lucy", Gender.FEMALE);
        Person w3 = new Person("Mia", Gender.FEMALE);

        m1.setPreference(Arrays.asList(w1, w2, w3));
        m2.setPreference(Arrays.asList(w2, w1, w3));
        m3.setPreference(Arrays.asList(w3, w2, w1));

        w1.setPreference(Arrays.asList(m1, m2, m3));
        w2.setPreference(Arrays.asList(m2, m1, m3));
        w3.setPreference(Arrays.asList(m3, m2, m1));
                     
        StableMatching sm = new StableMatching( Arrays.asList(m1,m2,m3), Arrays.asList(w1,w2,w3) );  
        System.out.println("Men Before: " + sm.getAllMen());
        System.out.println("Women Before: " + sm.getAllWomen());    
     
        while ( ! sm.haveAllMenBeenMatched() ) {
    
            sm.match( sm.getAllMen(), sm.getAllWomen() );

        }
           
        System.out.println("Men After: " + sm.getAllMen());
        System.out.println("Women After: " + sm.getAllWomen());

    }
}