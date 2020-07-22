package goldman.model;

import javax.swing.*;

public class Treasure extends Item{

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\treasure_icon.png");
    ItemTypes type = ItemTypes.TREASURE;

    public Treasure(){
        itemIcon = icon;
        itemType = type;
    }

}
