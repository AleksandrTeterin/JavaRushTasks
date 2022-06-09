package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE*SIDE;
    private int score = 0;

    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if(!isGameStopped) openTile(x,y);
        else restart();
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        if(!isGameStopped) markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
                setCellValue(x, y, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1 ; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1 ; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                GameObject gameObject = gameField[y][x];
                if (!gameObject.isMine) {
                    for (GameObject neighbor : getNeighbors(gameObject)) {
                        if (neighbor.isMine) {
                            gameObject.countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        GameObject gameObject = gameField[y][x];

        if (gameObject.isOpen || gameObject.isFlag || isGameStopped) return;
        if (gameObject.isMine) {
            setCellValueEx(gameObject.x, gameObject.y, Color.RED, MINE);
            gameOver();
            return;
        } else {
            if (gameObject.countMineNeighbors != 0) {
                setCellNumber(x, y, gameObject.countMineNeighbors);
            } else {
                setCellValue(gameObject.x, gameObject.y, "");
            }
        }
        gameObject.isOpen = true;
        countClosedTiles--;
        setCellColor(x, y, Color.LIGHTBLUE);
        score=score+5;
        setScore(score);
        if (countClosedTiles == countMinesOnField) {
            win();
            return;
        }
        if (gameObject.countMineNeighbors == 0 && !gameObject.isMine) {
            List<GameObject> listNearObj = getNeighbors(gameObject);
            for (GameObject nearObj: listNearObj){
                if(!nearObj.isOpen) openTile(nearObj.x, nearObj.y);
            }
        }
    }

    private void markTile(int x, int y) {
       GameObject gameObject = gameField[y][x];
       if(gameObject.isOpen) return;
       if(gameObject.isFlag){
           gameObject.isFlag = false;
           setCellValue(x, y, "");
           setCellColor(x,y,Color.ORANGE);
           countFlags++;
       } else if (countFlags>0){
           gameObject.isFlag = true;
           setCellValue(x, y, FLAG);
           setCellColor(x,y,Color.LIGHTPINK);
           countFlags--;
       }
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.RED, "Game OVER", Color.YELLOW, 80);
        }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "You WIN !!!", Color.RED, 80);
    }

    private void restart(){
        score = 0;
        countFlags = 0;
        countMinesOnField = 0;
        isGameStopped = false;
        countClosedTiles = SIDE*SIDE;
        setScore(score);
        createGame();
    }
}