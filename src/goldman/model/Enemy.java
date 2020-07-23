package goldman.model;

import javax.swing.*;

public class Enemy extends Item {

    Icon icon = new ImageIcon("src\\goldman\\assets\\game_icons\\enemy\\enemy_left.png");
    ItemTypes type = ItemTypes.ENEMY;

    public Enemy() {
        itemIcon = icon;
        itemType = type;
    }

}
