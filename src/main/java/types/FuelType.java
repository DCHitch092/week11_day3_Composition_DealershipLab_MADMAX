package types;

public enum FuelType {
    DIRT(1),
    OIL(100),
    WATER(10),
    SOLAR(5);

    int energyValue;

    FuelType(int energyValue){
        this.energyValue = energyValue;
    };


}
