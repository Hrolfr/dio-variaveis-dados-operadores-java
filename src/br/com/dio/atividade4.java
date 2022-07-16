package br.com.dio;

public class atividade4 {
    public class atividade4 {

        public static void main(String[] args) {

            byte b1;
            short s1 = 1000;
            b1 = (byte) s1;
            //nesse ocorrerá perda de dados

            long l1;
            int il = 10;
            l1 = il;
            //upcast

            int i2;
            int l2 = 100000000L;
            i2 = (int) l2;
            //perda

            int i3;
            long l3 = 10000;
            i3 = (int) l3;
            //(não perde dados)

            double d1;
            float f1 = 10.5f;
            d1 = f1;
            //(up)

            float f2;
            float f3;
            double d2 = 10000.50d;
            f2 = (float) d2; //não perde
            double d3 = 10000.0000000000000000000000000d;
            f3 = (float) d3; //p

            int i4;
            float f4 = 11.5697f;
            i4 = (int) f4;

            System.out.println("b1:" + b1);
            System.out.println("l2:" + l2);
            System.out.println("i2:" + i2);
            System.out.println("i3:" + i3);
            System.out.println("d1:" + d1);
            System.out.println("f2:" + f2);
            System.out.println("f3:" + f3);
            System.out.println("f4:" + f4);

            b1 = (byte)  d3;

            System.out.println("b1:" + b1);

        }
    }

}
