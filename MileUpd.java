package Blok_4_Testability.Z1_Mile_upgrade;

public class MileUpd {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
