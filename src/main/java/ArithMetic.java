public class ArithMetic
{

        int a=15, b=5;
        void sum()
        {
            int c;
            c=a+b;
            System.out.println("Sum=" + c);
        }

        void sub()
        {
            int d;
            d=a-b;
            System.out.println("SUBTRaction="+d);

        }

        void mul()
        {
            int m;
            m=a*b;
            System.out.print("Multiplication="+m);
        }

        void div()
        {
            int d;
            d = a / b;
            System.out.print("Division=" + d);
        }

        void mod()
        {
            float mod;
            mod=a%b;
            if (mod==0)
            {
                System.out.println("a and b are dividable");
            }

        }

}


