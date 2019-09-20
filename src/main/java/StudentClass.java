public class StudentClass
{
    private int studentId;
    private String firstName;
    private String lastName;
    private float m1;
    private float m2;
    private float m3;
    private float m4;
    private float m5;

    private float Total=0;
    private float percentage;
    private String result;
   private  int passmarks;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }



    public float getM3() {
        return m3;
    }

    public void setM3(float m3) {
        this.m3 = m3;
    }



    public float getM4() {
        return m4;
    }

    public void setM4(float m4) {
        this.m4 = m4;
    }



    public float getM5() {
        return m5;
    }

    public void setM5(float m5) {
        this.m5 = m5;
    }




    public float getM1() {
        return m1;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }


    public void calculateTotal()
    {
     Total=m1+m2+m3+m4+m5;
     System.out.println(Total);
    }
    public  void calculatePercentage()
    {
        percentage=Total/5;
        System.out.println(percentage);
    }



    public void generateResult()
    {
        if(determineResult())
        {
            System.out.println("PASS");
        }
    }

    private boolean determineResult() {

        int count = 0;
        if(m1 < passmarks )
        {
            count++;
        }
        if(m2 < passmarks )
        {
            count++;
        }
        if(m3< passmarks )
        {
            count++;
        }
        if(m4 < passmarks )
        {
            count++;
        }
        if(m5 < passmarks )
        {
            count++;
        }

        if(count == 1) {
            System.out.println("FAIL");
            return false;
        }else if(count >= 2) {
            System.out.println("FAIL");
            return false;
        }

        return  true;
    }


    public void gradeSys()
    {
        if(percentage<49)
            System.out.println("f");
        else if(percentage<59)
            System.out.println("E");
        else if(percentage<69)
            System.out.println("D");
        else if(percentage<79)
            System.out.println("C");
        else if(percentage<89)
            System.out.println("B");
        else if(percentage<99)
            System.out.println("A");


    }

}