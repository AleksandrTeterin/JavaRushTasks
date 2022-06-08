package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int windowSide = 9;

    public void initialize(){
        this.setScreenSize(windowSide,windowSide);
    }

}
