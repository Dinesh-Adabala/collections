import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Validation2 {
   // static Predicate<ArrayStringExamplePredicate> studentpredicate = ads->ads.getCountry().equals("India");
    public static void main(String[]args){

        List<ArrayStringExamplePredicate> Student= new ArrayList<>();
        Student.add(new ArrayStringExamplePredicate("Dinesh","India"));
        Student.add(new ArrayStringExamplePredicate("Sasank","India"));
        Student.add(new ArrayStringExamplePredicate("Siva","England"));
        Student.add(new ArrayStringExamplePredicate("Tarun","India"));
        List<ArrayStringExamplePredicate>streamPassedStudent=Student.stream()
                .filter(ads->ads.getCountry().equals("India"))
                .collect(Collectors.toList());
        System.out.println("Same Country Students"+streamPassedStudent);
    }
}
