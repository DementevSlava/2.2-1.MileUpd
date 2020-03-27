// package Blok_4_Testability.Z1_Mile_upgrade;//Заменить на свой (Для IDEA)

public class MileUpd {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
