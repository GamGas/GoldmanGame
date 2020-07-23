package goldman.controller;

import goldman.model.*;

import java.util.Objects;

//Фабрика проверена. Работает. Наверное надо будет сделать её синглтоном

public class ItemFactory {
    private Item player, exit, treasure, enemy, wall, empty;

    private static ItemFactory INSTANCE = null;

    private ItemFactory() {
    }

    public static synchronized ItemFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ItemFactory();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }

    public Item getItem(ItemTypes type) {
        switch (type) {
            case EXIT -> {
                return Objects.requireNonNullElseGet(exit, Exit::new);
            }
            case WALL -> {
                return Objects.requireNonNullElseGet(wall, Wall::new);
            }
            case EMPTY -> {
                return Objects.requireNonNullElseGet(empty, Empty::new);
            }
            case ENEMY -> {
                return Objects.requireNonNullElseGet(enemy, Enemy::new);
            }
            case PLAYER -> {
                return Objects.requireNonNullElseGet(player, Player::new);
            }
            case TREASURE -> {
                return Objects.requireNonNullElseGet(treasure, Treasure::new);
            }
            default -> {
                return null;
            }
        }
    }
}
