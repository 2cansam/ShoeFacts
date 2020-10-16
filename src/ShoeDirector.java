public class ShoeDirector {

    private ShoeBuilder shoeBuilder;

    public ShoeDirector(ShoeBuilder shoeBuilder){

        this.shoeBuilder = shoeBuilder;
    }

    public Shoe getShoe(){

        return this.shoeBuilder.getShoe();
    }

    public void makeShoe(){

        this.shoeBuilder.buildShoeColor1();
        this.shoeBuilder.buildShoeColor2();
        this.shoeBuilder.buildShoeColor3();
        this.shoeBuilder.buildShoeMaterial();
        this.shoeBuilder.buildShoeBrand();
        this.shoeBuilder.buildShoeFacts();
        this.shoeBuilder.buildShoeType();
        this.shoeBuilder.buildShoeYearReleased();
        this.shoeBuilder.buildShoeYearRetroed();
        this.shoeBuilder.buildShoeMySize();
    }
}
