// Stage 1: Hardcoded
public class WeatherModelStage1 {
    public static void main(String[] args) {
        double a = 1;
        double b = -3;
        double c = 2;

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("No real roots.");
        }
    }
}
