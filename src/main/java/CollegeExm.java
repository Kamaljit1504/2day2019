
public class CollegeExm {
    public static void main(String args[]) {
        ArithMetic Ab = new ArithMetic();
        Ab.sum();
        Ab.sub();
        Ab.mul();
        Ab.div();
        Ab.mod();

        StudentClass s= new StudentClass();
        s.setStudentId(123);
        s.setFirstName("Kamal");
        s.setLastName("Soni");
        s.setM1(80);
        s.setM2(88);
        s.setM3(90);
        s.setM3(85);
        s.setM4(98);
        s.setM5(80);

        System.out.println(s.getStudentId());
        System.out.println((s.getFirstName()));
        System.out.println(s.getLastName());
        s.calculateTotal();
        s.calculatePercentage();
        s.generateResult();
        s.gradeSys();





    }
}

