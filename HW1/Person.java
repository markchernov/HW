package hw1;
import java.util.List;
import java.util.Objects;
import hw1.Gender;

public class Person {

    private String name;

    private Gender gender;

    private boolean isMatched = false;

    private Person spouse;

    private List<Person> preference = null;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    
    public void setName(String name) {
        this.name = name;
     }
 
     public String getName() {
        return name;
     } 

     public void setGender(Gender gender) {
        this.gender = gender;
     }
 
     public Gender getGender() {
        return gender;
     } 

     public void setIsMatched(boolean matched) {
        this.isMatched = matched;
     }
 
     public boolean getIsMatched() {
        return isMatched;
     } 

     public void setSpouse(Person spouse) {
        this.spouse = spouse;
     }
 
     public Person getSpouse() {
        return spouse;
     } 

     public void setPreference(List<Person> preference) {
        this.preference = preference;
     }
 
     public List<Person> getPreference() {
        return preference;
     } 

     @Override
     public boolean equals(Object o) {

        if(o == null)                return false;
        if( !(o instanceof Person ))   return false;
    
        Person other = (Person) o;
        return this.getName() == other.getName();
      }

    @Override
    public int hashCode() {

        return Objects.hash(this.name);

    }

     @Override
     public String toString() {
         return this.getGender() + " " + this.getName() + " " + " IsMatched: " + this.getIsMatched() + " Spouse: " + (this.getIsMatched() ? this.getSpouse().getName() : "None" );        
    };
}

