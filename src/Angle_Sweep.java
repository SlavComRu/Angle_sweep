import java.sql.Array;
import java.util.Arrays;

public class Angle_Sweep {
    private double l1;  // длина развертки первой стороны
    private double l2;  // длина развертки второй стороны
    private double metalThickness; // толщина металла
    private double radius; // радиус развертки


    public void angleSweep(double l1, double l2, double radius, double metalThickness) {
        this.l1 = l1;
        this.l2 = l2;
        this.metalThickness = metalThickness;
        this.radius = radius;
        l1 = l1 - radius - metalThickness;
        l2 = l2 - radius - metalThickness;

        double c = Math.PI * (radius + (metalThickness * 0.5)) / 2;
        System.out.println(c);
        double p = l1 + l2 + c;
        System.out.printf("%.1f", p);
    }

    public void radiosArea() {

        int a = 3;
        double radius[] = {1, 1.5, 2, 3};
        double metalThickness[] = {1, 1.5, 2.5, 3};

        for (int i = 0; i < radius.length; i++) {
            int m = 0;
            try {
                for (int j = metalThickness.length; j > a; j--) {

                    double c = Math.PI * (radius[i] + (metalThickness[m] * 0.5)) / 2;
                    String result = String.format("%.2f", c);
                    System.out.print(result + "  ");
                    m++;
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a--;

            System.out.println();

        }
    }
}