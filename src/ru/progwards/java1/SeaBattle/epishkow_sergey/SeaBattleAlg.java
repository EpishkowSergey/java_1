package ru.progwards.java1.SeaBattle.epishkow_sergey;

import ru.progwards.java1.SeaBattle.SeaBattle;

public class SeaBattleAlg {
    public void battleAlgorithm(SeaBattle seaBattle) {
        // пример алгоритма:
        // стрельба по всем квадратам поля полным перебором
        for (int y = 0; y < seaBattle.getSizeX(); y++) {
            for (int x = 0; x < seaBattle.getSizeY(); x++) {
                SeaBattle.FireResult fireResult = seaBattle.fire(x, y);
            }
        }
    }
}
