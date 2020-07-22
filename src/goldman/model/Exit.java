package goldman.model;

import javax.swing.*;

public class Exit extends Item{

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\exit_icon.png");
    ItemTypes type = ItemTypes.EXIT;

    public Exit(){
        itemIcon = icon;
        itemType = type;
    }

}
