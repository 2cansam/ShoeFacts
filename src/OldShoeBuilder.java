

public class OldShoeBuilder implements ShoeBuilder {

    private Shoe shoe;

    public OldShoeBuilder(){
        this.shoe = new Shoe();
    }

    @Override
    public void buildShoeColor1() {

        shoe.setShoeColor1("Black");
    }

    @Override
    public void buildShoeColor2() {

        shoe.setShoeColor2("Red");
    }

    public void buildShoeColor3(){

        shoe.setShoeColor3("N/A");
    }

    @Override
    public void buildShoeMaterial() {

        shoe.setShoeMaterial("Tumbled Leather");

    }

    @Override
    public void buildShoeBrand() {

        shoe.setShoeBrand("Nike");

    }

    @Override
    public void buildShoeFacts() {

        shoe.setShoeFacts("The Air Jordan that was first produced for Michael Jordan in 1984 was designed by Peter C. Moore." +
                "\nThe red and black colorway of the Nike Air Ship, the prototype for the Jordan I, was later outlawed by then-NBA Commissioner David Stern for having very little white on them." +
                "\nAfter the Nike Air Ship was banned, Michael Jordan and Nike introduced the Jordan I in colorways with more white, such as the \"Chicago\" and \"Black Toe\" colorways. " +
                "\nThey used the Nike Air Ship's ban as a promotional tool in advertisements, hinting that the shoes gave an unfair competitive advantage. " +
                "\nThe Air Jordan I was originally released from 1985 to 1986, with re-releases (known as \"retros\") in 1994, 2001–2004, and 2007 to the present. " +
                "\nAlong with the introduction of the Retro Air Jordan line up's, the brand has elevated to a household notoriety with star-struck collaborations and unique limited releases.");

    }

    @Override
    public void buildShoeType() {

        shoe.setShoeType("High-Top");

    }

    @Override
    public void buildShoeYearReleased() {

        shoe.setShoeYearReleased(1984);

    }

    @Override
    public void buildShoeYearRetroed() {

        shoe.setShoeYearRetroed(1994);
    }

    @Override
    public void buildShoeMySize() {

        shoe.setShoeMySize(9);
    }

    public Shoe getShoe(){

        return this.shoe;
    }
}
