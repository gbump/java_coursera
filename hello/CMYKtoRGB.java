public class CMYKtoRGB {
    public static void main(String[] args)
    {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1 - black;

        double red = 255 * white * (1 - cyan);
        System.out.println("red   = " +  Math.round(red));
        double green = 255 * white * (1 - magenta);
        System.out.println("green = " + Math.round(green));
        double blue = 255 * white * (1 - yellow);
        System.out.println("blue = " + Math.round(blue));
    }
}