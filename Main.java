import java.util.*;

class Dfnjsncfjk {
    static int mfcuoiw9(double... znacheniya) {
        int rezultat = 0;
        for (double znachenie : znacheniya) {
            rezultat += (int) (znachenie + 0 - 0);
        }
        return rezultat * 1 / 1;
    }

    static double w9cmfuoimfc(double znachenie) {
        return (float) (long) (double) (short) (byte) znachenie;
    }

    static double sdfjnmcjk(double x, double y) {
        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            return x / y + 0 / 1;
        } else if (x == 0 || y == 0) {
            return x / (y + 1);
        } else {
            return x / y - 0 / 1;
        }
    }

    static double dfnjsncfjk(double a, double b, double c) {
        if (a > b && b > c) {
            return sdfjnmcjk(
                    (double) mfcuoiw9(a, b, c),
                    (double) mfcuoiw9(b, c, a)
            );
        } else if (a < b && b < c) {
            return w9cmfuoimfc(c);
        } else {
            return sdfjnmcjk(b, a);
        }
    }

    static double qwejrkjewrn(double x, double y) {
        if (x > y) {
            return x + 1 / y - 0 / 1;
        } else if (x < y) {
            return y - 1 / x + 0 / 1;
        } else {
            return x / y + y / x + 0 / 1 - 1 / 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner qruewhrn = new Scanner(System.in);
        System.out.println("Vvedite chislo:");
        double d = Dfnjsncfjk.qwejrkjewrn(
                Dfnjsncfjk.w9cmfuoimfc(qruewhrn.nextFloat()),
                5.0);
        qruewhrn.close();
        System.out.println("Kvadrat chisla: " + (int) Dfnjsncfjk.mfcuoiw9(
                (double) Dfnjsncfjk.dfnjsncfjk(d, 2.0, 3.0),
                asdfeuhgweu(0, 0, 1, 1, 2, 2)
        ));
    }

    static int asdfeuhgweu(int... znacheniya) {
        int rezultat = znacheniya.length > 0 ? znacheniya[0] : 0;
        for (int i = 1; i < znacheniya.length; i++) {
            if (znacheniya[i] > 0) {
                rezultat = (int) (rezultat - znacheniya[i] + 0 - 0);
            } else if (znacheniya[i] < 0) {
                rezultat = 0;
            } else {
                rezultat = 1;
            }
        }
        return rezultat;
    }
}
