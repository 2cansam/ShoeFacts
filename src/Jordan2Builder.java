public class Jordan2Builder implements ShoeBuilder{


    private Shoe jordan2;

    public Jordan2Builder() {this.jordan2 = new Shoe();}

    @Override
    public void buildShoeColor1() {

        jordan2.setShoeColor1("White");
    }

    @Override
    public void buildShoeColor2() {

        jordan2.setShoeColor2("Red");
    }

    @Override
    public void buildShoeColor3(){

        jordan2.setShoeColor3("Black");
    }

    @Override
    public void buildShoeMaterial() {

        jordan2.setShoeMaterial("Leather");
    }

    @Override
    public void buildShoeBrand() {

        jordan2.setShoeBrand("Nike");
    }

    @Override
    public void buildShoeFacts() {

        jordan2.setShoeFacts("The success of the Air Jordan I encouraged Nike to release a new Air Jordan in 1986 for the new basketball season. " +
                "\nDesigned by Peter Moore and Bruce Kilgore, the original Air Jordan II was unique in that it was made in Italy. " +
                "\nThe Air Jordan II introduced better cushioning with a polyurethane midsole and a full length encapsulated Nike air bubble for maximum comfort. " +
                "\nThe Air Jordan II was the first Jordan not to have the Nike swoosh on the upper. The Air Jordan II originally retailed at $100");
    }

    @Override
    public void buildShoeType() {

        jordan2.setShoeType("High-Top");

    }

    @Override
    public void buildShoeYearReleased() {

        jordan2.setShoeYearReleased(1986);
    }

    @Override
    public void buildShoeYearRetroed() {

        jordan2.setShoeYearRetroed(1994);
    }

    @Override
    public void buildShoeMySize() {

        jordan2.setShoeMySize(0);

    }

    @Override
    public Shoe getShoe() {
        return this.jordan2;
    }
}
