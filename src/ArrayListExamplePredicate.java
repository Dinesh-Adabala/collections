import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ArrayListExamplePredicate {
    static Predicate<Integer> markpredicate = (mark) -> mark>25;

    public static void main(String[] args) {

        List <Integer> List1 = new java.util.ArrayList();
        List1.add(10);
        List1.add(20);
        List1.add(30);
        List1.add(40);

        List<Integer>streamPassedStudent=List1.stream()
                .filter(number->markpredicate.test((Integer) number))
                .collect(Collectors.toList());
        System.out.println("stream passed student"+streamPassedStudent);
    }


}

