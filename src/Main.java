public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassIndex = service.calculate(45, 156);

        System.out.println(BodyMassIndex);
    }
}