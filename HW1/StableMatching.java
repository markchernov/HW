import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class StableMatching {

    private List<Person> men;

    private List<Person> women;

    private List<Boolean> result;

    public StableMatching(List<Person> men, List<Person> women) {

        this.men = men;
        this.women = women;
        
    }

    public boolean haveAllMenBeenMatched() {

        this.result = new ArrayList<Boolean>();

        for (Person m : this.men) {
            this.result.add(m.getIsMatched());
        }

         return !this.result.contains(false);   
    }

    public List<Person> getAllMen() {

         return this.men;   
    }

    public List<Person> getAllWomen() {

        return this.women;   
   }
   
    public void match (List<Person> man, List<Person> women) {

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
                        System.out.println("In Else. Not a match");
                        System.out.println(  m );
                        System.out.println(  w );                        
                }                   
            }         
        }
    }
}
