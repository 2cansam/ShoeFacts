import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Shoe.Builder jordan1 = new Shoe.Builder().modelName("Jordan 1")
                .color1("Black")
                .color2("Red")
                .color3("White")
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

        Shoe.Builder jordan3 = new Shoe.Builder().modelName("Jordan 3")
                .color1("White")
                .color2("Cement Grey")
                .color3("Black")
                .brand("Nike")
                .material("Leather")
                .type("Low-Top")
                .releaseYear(1988)
                .retroYear(1994)
                .facts("The Air Jordan III was designed in 1988 by Tinker Hatfield, who works for Nike as a designer for stores and offices. " +
                        "\nBy that time Michael Jordan was ready to leave Nike, but the Jordan III changed his mind. " +
                        "\nIt was the first Air Jordan to feature a visible air unit on the heel, the new Jumpman logo, an elephant print trim and tumbled leather to give it a luxury look. " +
                        "\nThe Air Jordan III was also famous for the humorous ads depicting film director Spike Lee as Mars Blackmon, the character he played in his film She's Gotta Have It. " +
                        "\nThis campaign was known as \"Mars and Mike\", which was one of Nike's most successful advertisement campaigns. " +
                        "\nThese were the first Jordans to feature the \"NIKE AIR\" logo on the back. " +
                        "\nThese were said to be Michael Jordan's favorite shoes, he wore them during the 1988 NBA Slam Dunk Contest and many other events in his basketball career. " +
                        "\nThe Air Jordan III's had poor sales when first reintroduced in 1994. On their second reintroduction in 2001, they sold well.");

        Shoe.Builder jordan4 = new Shoe.Builder().modelName("Jordan 4")
                .color1("White")
                .color2("Black")
                .color3("Cement Grey")
                .brand("Nike")
                .material("Leather")
                .type("Low-Top")
                .releaseYear(1989)
                .retroYear(1999)
                .facts("In 1989, Nike released the Air Jordan IV to the public. Designed by Tinker Hatfield, it was the first Air Jordan released on the global market. " +
                        "\nNike featured director and actor Spike Lee in ads for the AJ IV. Lee had featured the shoe in his movie Do The Right Thing." +
                        "\nMichael Jordan wore the Air Jordan IV when he made \"The Shot,\" a series winner in Game 5 of the 1989 NBA First Round between the Chicago Bulls and the Cleveland Cavaliers. " +
                        "\nIn 2012 a Cavalier colorway dubbed the \"Cavs\" was released to honor \"The Shot.\"");

        Shoe.Builder jordan5 = new Shoe.Builder().modelName("Jordan 5")
                .color1("White")
                .color2("Black")
                .color3("Fire Red")
                .brand("Nike")
                .material("Leather")
                .type("High-Top")
                .releaseYear(1990)
                .retroYear(2000)
                .facts("The Air Jordan V was released in February 1990, designed by Tinker Hatfield again. " +
                        "\nSome elements were carried over from the Air Jordan IV, but overall they were a completely new look. " +
                        "\nSome of its new features include a reflective tongue (with a unique protruding design and look), translucent rubber soles and lace locks." +
                        "\nThe soles gave them a new look, but yellowed over time when exposed to moisture and were the source of many complaints early on due to the slippery nature of the soles when collecting dust." +
                        "\nHatfield is believed to have drawn inspiration for the Air Jordan V from World War II fighter planes, which was most notably visible in the shark teeth shapes on the midsole. " +
                        "\nThe Air Jordan V was reintroduced in 2000");

        Shoe.Builder jordan6 = new Shoe.Builder().modelName("Jordan 6")
                .color1("White")
                .color2("Infrared")
                .color3("Black")
                .brand("Nike")
                .material("Leather")
                .type("High-Top")
                .releaseYear(1991)
                .retroYear(2000)
                .facts("The Air Jordan VI had a new design by Tinker Hatfield and released in 1991. " +
                        "\nThe Original 5 colorways were: Black/Infrared, White/Infrared, White/Carmine-Black, White/Sport Blue, and Off White/Maroon. " +
                        "\nThe Air Jordan VI introduced a reinforcement around the toe, It had two holes in the tongue, and a molded heel tab on the back of the sneaker (demanded by Jordan so it wouldn't hit his Achilles tendon). " +
                        "\nLike the Air Jordan V, this sneaker also had translucent rubber soles. The Air Jordan VI was the last Air Jordan to feature the Nike Air logo on it." +
                        "\nLater that year the Bulls defeated the Lakers in the 1991 NBA Finals, with Jordan (wearing the Black/Infrared) named as the most valuable player. " +
                        "\nThat was also the first NBA Championship won by Jordan and the Bulls. " +
                        "\nThe Jordan VI was also seen in the film White Men Can't Jump, which was produced in 1991 and released one year later.");

        Shoe.Builder jordan7 = new Shoe.Builder().modelName("Jordan 7")
                .color1("Black")
                .color2("Light Graphite")
                .color3("Bordeaux")
                .brand("Nike")
                .material("Leather and Suede")
                .type("High-Top")
                .releaseYear(1992)
                .retroYear(2000)
                .facts("The Air Jordan VII was released in 1992 with a new design by Tinker Hatfield. " +
                        "\nThis shoe introduced the huarache technology which allowed the shoes to better conform to the user's foot. " +
                        "\nA few things were no longer featured on the new model, such as the visible air sole, the Nike Air logo, and the translucent soles. " +
                        "\nThis was the first Air Jordan in the line that did not have any distinctive \"Nike Air\" on the outer portions of the shoe. The \"Nike Air\" branding was still on the in-soles, which Air Jordans VIII–XI also had. " +
                        "\nThe VIIs were also known for a successful ad campaign in which Bugs Bunny appeared alongside Michael Jordan to market the shoes.");

        Shoe.Builder jordan8 = new Shoe.Builder().modelName("Jordan 8")
                .color1("White")
                .color2("Black")
                .color3("True Red")
                .brand("Nike")
                .material("Leather")
                .type("High-Top")
                .releaseYear(1993)
                .retroYear(2003)
                .facts("The Air Jordan VIII was released to coincide with the 1992–1993 NBA season. " +
                        "\nThe eighth model of the Air Jordan was noticeably heavier than its predecessors. The Air Jordan VIII model became known as the \"Punisher\" because of the advanced basketball ankle support and enhanced traction. " +
                        "\nThis shoe contains a full length air sole, polyurethane midsole, polycarbonate shank plate, and two crossover straps (for added support and more custom fit).");

        Shoe.Builder jordan9 = new Shoe.Builder().modelName("Jordan 9")
                .color1("White")
                .color2("Black")
                .color3("True Red")
                .brand("Nike")
                .material("Leather")
                .type("High-Top")
                .releaseYear(1993)
                .retroYear(2002)
                .facts("Originally released in November 1993, the Air Jordan IX model was the first model released after Michael Jordan's retirement. " +
                        "\nJordan never played an NBA season wearing these shoes. This model was inspired by baseball cleats that Jordan wore when playing minor-league baseball." +
                        "\nLike the VII and VIII models, the Air Jordan IX featured an inner sock sleeve and nubuck accents. " +
                        "\nThe sole featured different symbols and languages of different countries. " +
                        "\nThe Air Jordan IX has been the shoe chosen to adorn Jordan's feet for his statue outside of the United Center in Chicago.");

        Shoe.Builder jordan10 = new Shoe.Builder().modelName("Jordan 10")
                .color1("White")
                .color2("Black")
                .color3("Steel Grey")
                .brand("Nike")
                .material("Leather")
                .type("High-Top")
                .releaseYear(1994)
                .retroYear(2005)
                .facts("The Air Jordan 10 was originally released from 1994-95. " +
                        "\nIt was the second model to drop while Jordan continued to take a swing at a professional baseball career. " +
                        "\nThe first colorway, known as \"Steel Grey,\" was the only original pair released featuring the extra leather toe cap. " +
                        "\nThe reason for the change was simple — Michael Jordan didn't care for the look. Unfortunately, it was too late to cancel the shoe, as the first colorway was officially in stores. " +
                        "\nHowever, there was still time to make changes to the shoe for future releases. " +
                        "\nThe added toe cap was removed per Jordan's request, giving the Jordan 10 a much cleaner look, and hasn't been seen since, including the make retro version of that first shoe.");

        Shoe.Builder jordan11 = new Shoe.Builder().modelName("Jordan 11")
                .color1("White")
                .color2("Black")
                .color3("Dark Concord")
                .brand("Nike")
                .material("Patent Leather & Ballistic Mesh")
                .type("High-Top")
                .releaseYear(1995)
                .retroYear(2000)
                .facts("This model was designed by Tinker Hatfield. When the shoe launched, Michael Jordan (retired from basketball by then) was with the Birmingham Barons in baseball's minor baseball leagues. " +
                        "\nHatfield designed the sneaker waiting for Jordan to come back and hoping he would play in them." +
                        "\nThe ballistic mesh upper of the sneaker was meant to make the Air Jordan XI lighter and more durable than past sneakers. " +
                        "\nFurther changes came with the use of a carbon fiber spring plate in the translucent \"frosty\" outsole, giving the shoe better torque when twisting on the court. " +
                        "\nThe highlight and arguably best-known aspect of the shoe is its patent leather mudguard. Patent leather was lightweight compared to genuine leather and also tended not to stretch as much – a property to help keep the foot within the bounds of the foot bed during directional changes on the court. " +
                        "\nThe patent leather gave the XI a \"formal\" look. When this shoe released, some wore this model with business suits instead of dress shoes." +
                        "\nThe sneakers were only samples in 1995 when Jordan decided to come back to the NBA. Hatfield and Nike discouraged Jordan from playing in them, but once they were produced, he couldn't resist. " +
                        "\nAlso noteworthy, Jordan violated league dress code by wearing the shoes, as his teammates wore all-black shoes. It wasn't the first time Jordan had run afoul of NBA footwear rules, having broken them with his very first signature shoe in 1985. He was fined $5,000 for not following the Bulls' colorway policy with the AJ XI. " +
                        "\nAfter the fine, Nike made him a pair of the shoes in a black/white/concord colorway for the series against Orlando. A similar black/white/royal blue colorway was released to the public at the end of 2000. " +
                        "\nThe colorway was changed for the public release because the concord purple had looked like royal blue on television");

        //possibly remove or add later for more shoes
        ArrayList<String> shoeList = new ArrayList<>();

        shoeList.add("Jordan 1");
        shoeList.add("Jordan 2");
        shoeList.add("Jordan 3");
        shoeList.add("Jordan 4");
        shoeList.add("Jordan 5");
        shoeList.add("Jordan 6");
        shoeList.add("Jordan 7");
        shoeList.add("Jordan 8");
        shoeList.add("Jordan 9");
        shoeList.add("Jordan 10");
        String input;
        int i = 3;

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Welcome to Jordan shoe facts! \nEnter a shoe you would like to know about.");


                input = sc.nextLine();
                if (input.equalsIgnoreCase("Jordan 1")) {
                    System.out.println(jordan1);
                } else if (input.equalsIgnoreCase("Jordan 2"))
                    System.out.println(jordan2);

                else if (input.equalsIgnoreCase("Jordan 3"))
                    System.out.println(jordan3);

                else if (input.equalsIgnoreCase("Jordan 4"))
                    System.out.println(jordan4);

                else if (input.equalsIgnoreCase("Jordan 5"))
                    System.out.println(jordan5);

                else if (input.equalsIgnoreCase("Jordan 6"))
                    System.out.println(jordan6);

                else if (input.equalsIgnoreCase("Jordan 7"))
                    System.out.println(jordan7);

                else if (input.equalsIgnoreCase("Jordan 8"))
                    System.out.println(jordan8);

                else if (input.equalsIgnoreCase("Jordan 9"))
                    System.out.println(jordan9);

                else if (input.equalsIgnoreCase("Jordan 10"))
                    System.out.println(jordan10);

                else if (input.equalsIgnoreCase("Jordan 11"))
                    System.out.println(jordan11);

            } catch (InputMismatchException e){
                System.out.println("Please enter only letters and numbers");
            }

        }
    }
}
