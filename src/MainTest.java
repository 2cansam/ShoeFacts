

public class MainTest {
    public static void main(String[] args) {

      /*  ShoeBuilder jordan1 = new OldShoeBuilder();

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

*/

        // add scanner class to ask for user input
        System.out.println("Welcome to Shoe Facts! " +
                "\nWhich shoe would you like to learn about?");

    Shoe.Builder jordan1 = new Shoe.Builder().modelName("Jordan 1")
                                             .color1("Black")
                                             .color2("Red")
                                             .color3(" ")
                                             .brand("Nike")
                                             .material("Leather")
                                             .type("High-Top")
                                             .releaseYear(1984)
                                             .retroYear(1994)
                                             .facts("The Air Jordan that was first produced for Michael Jordan in 1984 was designed by Peter C. Moore." +
                    "\nThe red and black colorway of the Nike Air Ship, the prototype for the Jordan I, was later outlawed by then-NBA Commissioner David Stern for having very little white on them." +
                    "\nAfter the Nike Air Ship was banned, Michael Jordan and Nike introduced the Jordan I in colorways with more white, such as the \"Chicago\" and \"Black Toe\" colorways. " +
                    "\nThey used the Nike Air Ship's ban as a promotional tool in advertisements, hinting that the shoes gave an unfair competitive advantage. " +
                    "\nThe Air Jordan I was originally released from 1985 to 1986, with re-releases (known as \"retros\") in 1994, 2001–2004, and 2007 to the present. " +
                    "\nAlong with the introduction of the Retro Air Jordan line up's, the brand has elevated to a household notoriety with star-struck collaborations and unique limited releases.");

    Shoe.Builder jordan2 = new Shoe.Builder().modelName("Jordan 2")
                                             .color1("White")
                                             .color2("Red")
                                             .color3("Black")
                                             .brand("Nike")
                                             .material("Leather")
                                             .type("High-Top")
                                             .releaseYear(1986)
                                             .retroYear(1994)
                                             .facts("The success of the Air Jordan I encouraged Nike to release a new Air Jordan in 1986 for the new basketball season." +
                                                     "\nDesigned by Peter Moore and Bruce Kilgore, the original Air Jordan II was unique in that it was made in Italy." +
                                                     "\nThe Air Jordan II introduced better cushioning with a polyurethane midsole and a full length encapsulated Nike air bubble for maximum comfort." +
                                                     "\nThe Air Jordan II was the first Jordan not to have the Nike swoosh on the upper. The Air Jordan II originally retailed at $100");
        System.out.println(jordan1);
        System.out.println("\n");
        System.out.println(jordan2);
    }
}
