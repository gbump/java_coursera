public class RightTriangle {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isPositive = (a > 0) && (b > 0) && (c > 0);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = a + b + c - min - max;

        boolean pifagor = (((min*min) + (middle*middle) == max*max) && isPositive);
        System.out.println(pifagor);
    }

}
