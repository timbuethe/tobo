package chris;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;


public class Cobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement

        //Separate the rader movement from the gun's.
        setAdjustRadarForGunTurn(true);
        //Scan for the enemy
        turnRadarRight(360);
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double bearing = e.getBearing();
        turnRight(bearing);

        fire(1);
    }
/**
    //
    public void onHitWall(HitWallEvent e) {
        turnLeft(180);
    }
 **/
}

