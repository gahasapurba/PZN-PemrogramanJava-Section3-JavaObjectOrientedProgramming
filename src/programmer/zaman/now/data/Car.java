package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}