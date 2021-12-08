package class3.playingwithinterfaces.impl;

import class3.playingwithinterfaces.Play;

public class PlayImpl implements Play {
    @Override
    public int getRandomNumberByParams(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public int getRandomNumberByParams(int min, int max, int step) {
        return 0;
    }

    public static void main(String[] args) {
        Play play = new PlayImpl();
        System.out.println(play.getRandomNumberByParams(1, 20));

        play = new Play2Impl();
        System.out.println(play.getRandomNumberByParams(1, 20, 2));

        Play playWithImplementHere = new Play() {
            @Override
            public int getRandomNumberByParams(int min, int max) {
                return 1;
            }

            @Override
            public int getRandomNumberByParams(int min, int max, int step) {
                return 2;
            }
        };
        System.out.println("Interface being implemented here");
        System.out.println(playWithImplementHere.getRandomNumberByParams(0, 0));
//        System.out.println(playWithImplementHere.getRandomNumberByParams(0, 0, 0));


//        Play play1 = (x, y) -> x + y;
//        System.out.println(play1.getRandomNumberByParams(2, 3));


//        List<String> list = new ArrayList<>();
//        list.add("");
//        list.remove(1);
//        list.size();

    }
}
