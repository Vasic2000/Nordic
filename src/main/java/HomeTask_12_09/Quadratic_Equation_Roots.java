package HomeTask_12_09;

public class Quadratic_Equation_Roots {
    public static void main(String[] args) {
        //Поиск корней квадратного уравнения A x X^2 + B x X + C = 0
        int a = 1;
        int b = 1;
        int c = 2;

        //квадрат дискриминанта
        double d = b * b - 4 * a * c;

        //Дискрименант < 0 - корней нет
        if (d < 0)
            System.out.println("Уравнение не имеет действительных корней.");
            //Дискрименант == 0 - один корень
        else if (d == 0) {
            double x = -b / (2 * a);
            //Если решение целое число - вывод без запятой, если нет - 4 знака после запятой
            if (x % 1 == 0)
                System.out.println("x = " + (int) x);
            else
                System.out.printf("x = %.4f", x);
        } else
        //Остался дискрименант > 0 - два корня
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            //Если решение целое число - вывод без запятой, если нет - с
            if (x1 % 1 == 0)
                System.out.print("x1 = " + (int) x1);
            else
                System.out.print("x1 = " + x1);

            System.out.println();

            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            //Если решение целое число - вывод без запятой, если нет - с
            if (x2 % 1 == 0)
                System.out.print("x2 = " + (int) x2);
            else
                System.out.print("x2 = " + x2);
        }
    }
}