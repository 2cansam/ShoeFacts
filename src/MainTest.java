
public class MainTest {
    public static void main(String[] args) {

        ShoeBuilder jordan1 = new OldShoeBuilder();

        ShoeDirector shoeDirector = new ShoeDirector(jordan1);

        shoeDirector.makeShoe();

        Shoe firstShoe = shoeDirector.getShoe();

        System.out.println("Shoe Built");

        System.out.println("Shoe Color 1: " + firstShoe.getShoeColor1());

        System.out.println("Shoe Color 2: " + firstShoe.getShoeColor2());

        System.out.println("Shoe Material: " + firstShoe.getShoeMaterial());

        System.out.println("Shoe Brand: " + firstShoe.getShoeBrand());

        System.out.println("Shoe Type : " + firstShoe.getShoeType());

        System.out.println("Year Shoe Retroed : " + firstShoe.getShoeRetroed());

        System.out.println("I own this shoe in size : " + firstShoe.getShoeMySize());

        System.out.println("Shoe Facts: " + firstShoe.getShoeFacts());

        System.out.println("-----------------------------------------------------------------------------------------");

        ShoeBuilder j2 = new Jordan2Builder();

        ShoeDirector j2sd = new ShoeDirector(j2);

        j2sd.makeShoe();

        Shoe secondShoe = shoeDirector.getShoe();

        System.out.println("Shoe Built");

        System.out.println("Shoe Color 1: " + secondShoe.getShoeColor1());

        System.out.println("Shoe Color 2: " + secondShoe.getShoeColor2());

        System.out.println("Shoe Color 3: " + secondShoe.getShoeColor3());

        System.out.println("Shoe Material: " + secondShoe.getShoeMaterial());

        System.out.println("Shoe Brand: " + secondShoe.getShoeBrand());

        System.out.println("Shoe Type : " + secondShoe.getShoeType());

        System.out.println("Year Shoe Retroed : " + secondShoe.getShoeRetroed());

        System.out.println("I own this shoe in size : " + secondShoe.getShoeMySize());

        System.out.println("Shoe Facts: " + secondShoe.getShoeFacts());



    }
}
