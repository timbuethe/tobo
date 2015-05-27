package chris;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;


public class Cobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement

        do {
            scan();
        } while (true);
    }

    public void onScannedRobot(ScannedRobotEvent e) {

        fire(1);
    }

    //
    public void onHitWall(HitWallEvent e) {
        turnLeft(180);
    }
}

