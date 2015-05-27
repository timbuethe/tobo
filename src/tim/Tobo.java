package tim;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Tobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

}
