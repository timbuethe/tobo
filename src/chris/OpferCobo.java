package chris;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;

public class OpferCobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
            setAdjustRadarForRobotTurn(true);
            ahead(300);
            try {
                wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //turnGunRight(360);
            back(300);
            try {
                wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //turnGunRight(360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    //
    public void onHitWall(HitWallEvent e) {
        turnLeft(180);
    }
}