public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
        //

        double a = 10;
        double b = 5;
        double c = 15;

        double area = (2 * (a*b)) + (2 * (a*c)) + (2 * (b*c));
        double volume = a*b*c;

        String VolumeAsString = String.format("%.0f", volume);
        String AreaAsString = String.format("%.0f", area);

        System.out.println("Surface area: " + AreaAsString);
        System.out.println("Volume: " + VolumeAsString);


    }

}
