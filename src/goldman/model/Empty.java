package goldman.model;

import javax.swing.*;

public class Empty extends Item{

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\empty_icon.png");
    ItemTypes type = ItemTypes.EMPTY;

    public Empty(){
        itemIcon = icon;
        itemType = type;
    }

}
