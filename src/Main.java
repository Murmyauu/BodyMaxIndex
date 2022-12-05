public class Main {
    public static void main(String[] args) {

        BmiService index = new BmiService();
        double weight = 130;
        double height = 1.95;
        double bMi = index.calculate(weight, height);

        System.out.println();
        System.out.println("Индекс массы тела: " + bMi);
    }
}