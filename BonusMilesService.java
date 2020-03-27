package Blok_4_Testability.Z1_Mile_upgrade;

public class BonusMilesService {
    public static int calculate(int price) {
        int miles = price / 20;
        return miles;
    }
}
