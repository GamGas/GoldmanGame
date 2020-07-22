package goldman.model;

import javax.swing.*;

public abstract class Item {
    protected Icon itemIcon;
    protected ItemTypes itemType;

    @Override
    public String toString() {
        return itemType.toString();
    }
}

