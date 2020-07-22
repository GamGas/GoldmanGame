package goldman.model;

import javax.swing.*;

public class Wall extends Item{

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\wall_icon.png");
    ItemTypes type = ItemTypes.WALL;

    public Wall(){
        itemIcon = icon;
        itemType = type;
    }

}
