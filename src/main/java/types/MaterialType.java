package types;

public enum MaterialType {
    RUBBER(3),
    STEEL(10),
    IRON(5),
    ROCK(1);

    private int scrapValue;

    MaterialType(int scrapValue){
        this.scrapValue = scrapValue;
    }

}
