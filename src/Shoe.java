/*
add comments 
 */

public class Shoe implements ShoePlan {

    private String shoeColor1;
    private String shoeColor2;
    private String shoeColor3;
    private String shoeMaterial;
    private String shoeBrand;
    private String shoeFacts;
    private String shoeType;
    private int shoeYearReleased;
    private int shoeRetroed;
    private int shoeMySize;


    @Override
    public void setShoeColor1(String color1) {

        shoeColor1= color1;
    }

    public String getShoeColor1() {
        return shoeColor1;
    }

    @Override
    public void setShoeColor2(String color2) {

        shoeColor2 = color2;

    }

    public String getShoeColor2() {
        return shoeColor2;
    }

    @Override
    public void setShoeMaterial(String material) {

        shoeMaterial = material;

    }

    public void setShoeColor3(String Color3) {

        shoeColor3 = Color3;
    }

    public String getShoeColor3() { return shoeColor3; }

    public String getShoeMaterial() {
        return shoeMaterial;
    }

    @Override
    public void setShoeBrand(String brand) {

        shoeBrand = brand;

    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    @Override
    public void setShoeFacts(String facts) {

        shoeFacts = facts;

    }

    public String getShoeFacts() {
        return shoeFacts;
    }

    @Override
    public void setShoeType(String type) {

        shoeType = type;

    }

    public String getShoeType() {
        return shoeType;
    }

    @Override
    public void setShoeYearReleased(int yearReleased) {

        shoeYearReleased = yearReleased;

    }

    public int getShoeYearReleased() {
        return shoeYearReleased;
    }

    @Override
    public void setShoeYearRetroed(int yearRetroed) {

        shoeRetroed = yearRetroed;

    }

    public int getShoeRetroed() {
        return shoeRetroed;
    }

    @Override
    public void setShoeMySize(int mySize) {

        shoeMySize = mySize;

    }

    public int getShoeMySize() {
        return shoeMySize;
    }
}
