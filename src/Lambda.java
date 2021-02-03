import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static double a;
    public static double b;
    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        return (a,b) -> {
            if (a > b)
                return a;
            else return b;
        };
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        Function<Double,Double> sqrt = Math::sqrt;
        return sqrt;

    }
}