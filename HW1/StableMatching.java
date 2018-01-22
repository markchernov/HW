import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

class StableMatching {

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
        
        List<Person> men = Arrays.asList(m1,m2,m3);
        List<Person> women = Arrays.asList(w1,w2,w3);

        System.out.println("Before: " + men);
        System.out.println("Before: " + women);

        System.out.println("Before for men loop: ");
            
        while ( ! (men.get( 0 ).getIsMatched()) && ! ( men.get( 1 ).getIsMatched()) && ! (men.get( 2 ).getIsMatched()) ) {
        
        for ( Person m : men ) {
            
            System.out.println( "Man " + m );                         
            System.out.println("Before for women loop");
               
                for ( Person w : women ) {
                                      
                    if ( !w.getIsMatched() && !m.getIsMatched() ) {

                        System.out.println( "In Women not matched: " + w.getName() );
                        m.setIsMatched(true);
                        m.setSpouse( w );
                        w.setIsMatched(true);
                        w.setSpouse( m );
                        System.out.println(  m );
                        System.out.println(  w );
                    }

                    else if ( w.getIsMatched() &&  ( w.getPreference().indexOf( m ) < w.getPreference().indexOf( w.getSpouse() ) ) )   {
                        System.out.println( "In Women is matched: " + w.getName() + " Index of Current Man: " + w.getPreference().indexOf( m ) + " Index of Current Spouse: " + w.getPreference().indexOf( w.getSpouse()));
                        m.setIsMatched(true);
                        m.setSpouse( w );
                        w.setIsMatched(true);
                        w.setSpouse( m );
                        w.getSpouse().setIsMatched( false );
                        w.getSpouse().setSpouse( null );
                        System.out.println(  m );
                        System.out.println(  w );

                    }

                    else  {
                        System.out.println("In Else");
                        System.out.println(  m );
                        System.out.println(  w );                        
                    }                   
                }           
            }
        }
            
        System.out.println("After: " + men);
        System.out.println("After: " + women);
    }
}