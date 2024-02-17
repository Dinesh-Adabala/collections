public class Validation {
    public static void main(String[]args){
        StudentArray[] student = new StudentArray[5];
        student[0]= new StudentArray("Dinesh",401);
        student[1]=new StudentArray("Sasank",402);
        student[2]=new StudentArray("Siva",403);
        student[3]=new StudentArray("Sudheer",404);
        student[4]=new StudentArray("Gopi",405);
        for (int i=0;i< student.length;i++){
            System.out.println("Name :"+student[i].getName() + "   "+"Idno :"+student[i].getIdno());

            System.out.println();
        }

    }
}
