public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int miles2 = service.calculate(999666_00);
        System.out.println(miles2);
    }
}
