package goldman.controller;

import goldman.model.*;

//Фабрика проверена. Работает. Наверное надо будет сделать её синглтоном

public class ItemFactory {
    private Item player, exit, treasure, enemy, wall, empty;

    private static ItemFactory INSTANCE = null;

    private ItemFactory(){
    }

    public static synchronized ItemFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ItemFactory();
            return INSTANCE;
        }else {
            return INSTANCE;
        }
    }

    public Item getItem(ItemTypes type){
        switch (type){
            case EXIT -> {
                if(exit == null){
                    return new Exit();
                }
                return exit;
            }
            case WALL -> {
                if(wall == null){
                    return new Wall();
                }
                return wall;
            }
            case EMPTY -> {
                if(empty == null){
                    return new Empty();
                }
                return empty;
            }
            case ENEMY -> {
                if(enemy == null){
                    return new Enemy();
                }
                return enemy;
            }
            case PLAYER -> {
                if(player == null){
                    return new Player();
                }
                return player;
            }
            case TREASURE -> {
                if(treasure == null){
                    return new Treasure();
                }
                return treasure;
            }
            default -> {
                return null;
            }
        }
    }
}
