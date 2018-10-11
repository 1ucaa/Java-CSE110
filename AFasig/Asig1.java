package AFasig;

import java.lang.Math;
import java.util.Scanner;

public class Asig1 {

    public static void main(String[] args){
        /*
        Vel. - The speed (ft/sec) at which cannonball is fired.
        Angle - Angle (degrees) above the ground at which cannon is fired.
        Distance - Horizontal Distance (ft) to the target.
        Elevation - Height (ft) of the BOTTOM of the target off the ground.
        Size - How tall the target is from its bottom to the top.
         */
        System.out.println("We will first adjust the cannon!");
        System.out.print("Cannonball's velocity in feet per second: ");
        Scanner scan = new Scanner(System.in);
        double vel = scan.nextDouble();

        System.out.print("Angle of which the cannon shoots in degrees: ");
        double ang = scan.nextDouble();

        System.out.println("Now we will adjust the target!");
        System.out.print("Horizontal distance to the target in feet: ");
        double dis = scan.nextDouble();

        System.out.print("Elevation of the bottom of the target in feet: ");
        double ele = scan.nextDouble();

        System.out.print("Height of the target, from bottom to top, in feet: ");
        double hei = scan.nextDouble();

        if (vel == 0){
            System.out.print("The distance cannot be calculated with this input.");
        }

        ang = Math.toRadians(ang);

        double heiPro = (vel * Math.cos(ang));
        heiPro = (dis/heiPro);
        heiPro = (vel*heiPro*Math.sin(ang)-(32.17*Math.pow(heiPro,2)/2));


        if (heiPro > 0){
            if (ele > heiPro) {
                System.out.print("The cannonball was just low of the target at "+heiPro+" feet high.");
            }
            else if (heiPro > (hei+ele)){
                System.out.print("The cannonball went above the target at "+heiPro+" feet high.");
            }
            else {
                System.out.print("CONGRATS! You have hit the target.");
            }
        }
        if (heiPro < 0) {
            System.out.print("The cannonball did not make it to the target.");
        }

        }
}
