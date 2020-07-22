package goldman.model;

import javax.swing.*;

public class Player extends Item{

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\player\\player_left.png");
    ItemTypes type = ItemTypes.PLAYER;

    public Player(){
        itemIcon = icon;
        itemType = type;
    }

}
