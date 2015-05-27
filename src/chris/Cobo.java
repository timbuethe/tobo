package chris;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.*;


public class Cobo extends Robot {

    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
        //Separate the rader movement from the gun's.
        setAdjustRadarForGunTurn(true);
        //Scan for the enemy
        turnRadarRight(360);
    }
    }

    public void onScannedRobot(ScannedRobotEvent e) {

        double distance = 0;

        turnRight(e.getBearing());
        distance = e.getDistance();

        if(distance<200)
        {
            fire(3.5);
        }
        else if(distance<500)
        {
            fire(2.5);
        }
        else if(distance<800)
        {
            fire(1.5);
        }
        else
        {
            fire(0.5);
        }
    }

    //falls getroffen
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like

        back(20);
        fire(5);
    }
/**
    //
    public void onHitWall(HitWallEvent e) {
        turnLeft(180);
    }
 **/
}

