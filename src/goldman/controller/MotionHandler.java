package goldman.controller;

import goldman.model.Coordinate;
import goldman.model.Item;

public class MotionHandler {



    //Метод, меняющий объекты в координатах местами. Для перемещения.
    //Впрочем, обычный метод с временной переменной
    public static void swap(Coordinate prev, Coordinate next){
        Item tempItem = prev.getItem();
        prev.setItem(next.getItem());
        next.setItem(tempItem);
    }
}
