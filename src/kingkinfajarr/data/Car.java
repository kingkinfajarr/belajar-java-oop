package kingkinfajarr.data;

import kingkinfajarr.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand {
    void drive();
    int getTire();

    default boolean isBig(){
        return false;
    }
}
