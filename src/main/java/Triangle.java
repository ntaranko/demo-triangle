public class Triangle {
    public static String defineTriangle(int a, int b, int c) {
        if (a + b < c ||
                a + c < b ||
                c + b < a ||
                a <= 0 || b <= 0 || c <= 0) {
            return String.format("Треугольник a = %s, b = %s, c = %s не является треугольником", a, b, c);
        }
        if (a == b && a == c) {
            return String.format("Треугольник a = %s, b = %s, c = %s - равносторонний треугольник", a, b, c);
        }

        if (a == b || a == c || b == c)
            return String.format("Треугольник a = %s, b = %s, c = %s - равнобедренный треугольник", a, b, c);

        if (a * a == b * b + c * c ||
                b * b == a * a + c * c ||
                c * c == a * a + b * b) {
            return String.format("Треугольник a = %s, b = %s, c = %s - прямогульный треугольник", a, b, c);
        } else {
            return String.format("Треугольник a = %s, b = %s, c = %s - обычный треугольник", a, b, c);
        }
    }
}
