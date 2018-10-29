public class VariableMutation {

    public static void main(String[] args) {

        int a, b, c, d, e, f1, f2, g1, g2, h, i1, i2, j;
        a = 3;
        b = 100;
        c = 44;
        d = 125;
        e = 8;
        f1 = 123;
        f2 = 345;
        g1 = 350;
        g2 = 200;
        h = 135798745;
        i1 = 10;
        i2 = 3;
        j = 1521;

        a += 10;

        System.out.println(a);

        b -= 7;

        System.out.println(b);
        c *= 2;

        System.out.println(c);
        d /= 5;

        System.out.println(d);

        e = e * e * e;

        System.out.println(e);

        boolean fNumber = f1 > f2;

        System.out.println(fNumber);

        boolean gNumber = g2 * 2 > g1;

        System.out.println(gNumber);

        boolean hNumber = h % 11 == 0;

        System.out.println(hNumber);

        boolean iNumber = false;

        if (i1 > i2 * i2 && i1 < i2 * i2 * i2) {

            iNumber = true;

        }

        System.out.println(iNumber);

        boolean jNumber = false;

        if (j % 3 == 0 || j % 5 == 0) {

            jNumber = true;
        }

        System.out.println(jNumber);

        String k = "Apple";
        int times = 4;

        for (int counter = 0; counter < times; counter++) {

            System.out.println(k);
        }

    }
}
