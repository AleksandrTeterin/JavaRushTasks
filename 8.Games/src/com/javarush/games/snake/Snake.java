package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.*;

public class Snake {

    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    private List<GameObject> snakeParts = new ArrayList<GameObject>();

    public boolean isAlive;
    private SnakeGame.Direction direction = SnakeGame.Direction.LEFT;


    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x+1, y));
        snakeParts.add(new GameObject(x+2, y));
    }

    public void draw(Game game){
        for (int i=0; i<snakeParts.size(); i++){
            GameObject curSnakePart = snakeParts.get(i);
            if(i==0) game.setCellValueEx(curSnakePart.x, curSnakePart.y, Color.NONE, HEAD_SIGN, isAlive ? Color.GREEN : Color.RED, 75);
            else game.setCellValueEx(curSnakePart.x, curSnakePart.y, Color.NONE, BODY_SIGN, isAlive ? Color.GREEN : Color.RED, 75);
        }
    }

    public void setDirection(SnakeGame.Direction dir){
        this.direction = dir;
    }
}
