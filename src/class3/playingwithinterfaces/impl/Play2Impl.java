package class3.playingwithinterfaces.impl;

import class3.playingwithinterfaces.Play;

public class Play2Impl implements Play {
    @Override
    public int getRandomNumberByParams(int min, int max) {
        return 0;
    }

    @Override
    public int getRandomNumberByParams(int min, int max, int step) {
        return (int) (Math.random() * (max - min) / step) * step + min;
    }
    //n methods
}
