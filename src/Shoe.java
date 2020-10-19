/*
add comments 
 */

public class Shoe {

    private final String modelName;
    private final String color1;
    private final String color2;
    private final String color3;
    private final String material;
    private final String brand;
    private final String type;
    private final String facts;
    private final int releaseYear;
    private final int retroYear;


    private Shoe(Builder builder){

        this.modelName = builder.modelName;
        this.color1 = builder.color1;
        this.color2 = builder.color2;
        this.color3 = builder.color3;
        this.material = builder.material;
        this.brand = builder.brand;
        this.type  = builder.type;
        this.facts = builder.facts;
        this.releaseYear = builder.releaseYear;
        this.retroYear = builder.retroYear;
    }

    public String getModelName(){
        return modelName;
    }

    public String getColor1() {
        return color1;
    }

    public String getColor2() {
        return color2;
    }

    public String getColor3() {
        return color3;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getFacts() {
        return facts;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRetroYear() {
        return retroYear;
    }

    public static class Builder{

        private String modelName;
        private String color1;
        private String color2;
        private String color3;
        private String material;
        private String brand;
        private String type;
        private String facts;
        private int releaseYear;
        private int retroYear;

        public Builder modelName(final String modelName){

            this.modelName = modelName;
            return this;
        }

        public Builder color1(final String color1){

            this.color1 = color1;
            return this;
        }

        public Builder color2(final String color2){

            this.color2 = color2;
            return this;
        }

        public Builder color3(final String color3){

            this.color3 = color3;
            return this;
            /*returns none if no value is entered for color 3
            if (this.color3 == null){
                System.out.print("None");
            } else {
                System.out.print(this.color3);
            }
             */
        }

        public Builder material(final String material){

            this.material = material;
            return this;
        }

        public Builder brand(final String brand){

            this.brand = brand;
            return this;
        }

        public Builder type(final String type){

            this.type = type;
            return this;
        }

        public Builder facts(final String facts){

            this.facts = facts;
            return this;
        }

        public Builder releaseYear(final int releaseYear){

            this.releaseYear = releaseYear;
            return this;
        }

        public Builder retroYear(final int retroYear){

            this.retroYear = retroYear;
            return this;
        }

        public String toString(){

            return "Model Name: " + this.modelName + "\nColor 1: " + this.color1 +
                    "\nColor 2: " + this.color2 + "\nColor 3: " + this.color3 + "\nBrand: " + this.brand + "\nMaterial: " + this.material +
                    "\nType: " + this.type + "\nRelease Year " + this.releaseYear +
                    "\nRetro Year: " + this.retroYear + "\nShoe Facts: " + this.facts;
        }

        public Shoe build(){

            return new Shoe(this);
        }

    }
}
