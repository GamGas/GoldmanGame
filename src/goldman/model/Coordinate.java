package goldman.model;

import javax.swing.*;

public class Coordinate {

    private Item item;

    public Coordinate(Item item){
        this.item = item;
    }

    public Icon getIcon(){
        return item.itemIcon;
    }

    public ItemTypes getType(){
        return item.itemType;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "item=" + item +
                '}';
    }
}
