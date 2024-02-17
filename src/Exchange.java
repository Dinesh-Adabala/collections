public class Exchange {
    public static void main(String[]args){
        StudentArray S1 = new StudentArray("Naresh",501);
        StudentArray S2 = new StudentArray("Meher",502);
        StudentArray[] student1 = new StudentArray[2];
        student1[0]=S1;
        student1[1]=S2;
        for (int i=0;i<student1.length;i++){
            System.out.println("FROM STUDENT1 "+"Name: "+student1[i].getName()+" "+"Idno: "+student1[i].getIdno());
            System.out.println();

        }StudentArray[] Student2 = new StudentArray[2];
        Student2[0]=S1;
        Student2[1]=S2;
        for (int i=0;i<Student2.length;i++){
            System.out.println("FROM STUDENT2 "+"Name :"+Student2[i].getName()+" "+"Idno :"+Student2[i].getIdno());
            System.out.println();
        }
        System.out.println("After S1 Name Changed to Neoteric ");
        System.out.println();
        S1.setName("Neoteric");
        for (int i=0;i<student1.length;i++) {
            System.out.println("FROM STUDENT1 " + "Name: " + student1[i].getName() + " " + "Idno: " + student1[i].getIdno());
            System.out.println();
        }
        for (int i=0;i<Student2.length;i++) {
            System.out.println("FROM STUDENT2 " + "Name :" + Student2[i].getName() + " " + "Idno :" + Student2[i].getIdno());
            System.out.println();
        }
    }
}
