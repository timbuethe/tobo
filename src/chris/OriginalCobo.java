package chris;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class OriginalCobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {

            ahead(300);
            turnGunRight(360);
            back(300);
            turnGunRight(360);
            setAdjustRadarForRobotTurn(true);

        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }
}
