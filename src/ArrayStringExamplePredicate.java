import java.util.List;
import java.util.function.Predicate;

public class ArrayStringExamplePredicate {
    String Name;
    String Country;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public ArrayStringExamplePredicate(String name, String country) {
       this. Name = name;
      this.  Country = country;
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", Country='" + Country + '\'' ;
    }
}
