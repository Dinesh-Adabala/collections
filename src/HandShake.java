import java.util.LinkedList;

public class HandShake {
    String Name;
    public static void main(String args[])
    {
        LinkedList<String> studentName = new LinkedList<String>();
        studentName.add("Dinesh");
        studentName.add("uday");
        studentName.addLast("sudheer");
        studentName.addFirst("Kiran");
        studentName.add(2, "Kanna");

        System.out.println(studentName);

       studentName.remove("Kanna");
       studentName.remove(3);
       studentName.removeFirst();
       studentName.removeLast();

       System.out.println(studentName);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

