import framework.*;
import idcard.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("ヤマケン");
        Product card2 = factory.create("高品");
        Product card3 = factory.create("みつはし");
        card1.use();
        card2.use();
        card3.use();
    }
}
