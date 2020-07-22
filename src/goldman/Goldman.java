package goldman;

import goldman.controller.ItemFactory;
import goldman.controller.MotionHandler;
import goldman.model.Coordinate;
import goldman.model.ItemTypes;

public class Goldman {
    public static void main(String[] args) {
        ItemFactory factory = ItemFactory.getInstance();
        Coordinate old = new Coordinate(factory.getItem(ItemTypes.EMPTY));
        Coordinate next = new Coordinate(factory.getItem(ItemTypes.PLAYER));

        System.out.printf("old coordinate item = %s \n new coordinate item = %s\n", old, next);

        MotionHandler.swap(old, next);

        System.out.println("Calling static method to swap items in coordinate. Testing...");

        System.out.printf("old coordinate item = %s \n new coordinate item = %s\n", old, next);

    }
}
