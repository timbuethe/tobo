package ralf;

import robocode.*;
import robocode.Robot;

import java.awt.*;

/**
 * The actual robot that eventually will become
 * a monstrous beast that will defeat all the
 * unworthy opponents who try to challenge it.
 *
 * Created by ralf on 27/05/15.
 */
public class Robo extends AdvancedRobot {

    public void run() {

        // number of other robots
        int numberOfRobots;

        // battlefield dimensions
        double battlefieldHeight = getBattleFieldHeight();
        double battlefieldWidth = getBattleFieldWidth();

        // set colors
        setBodyColor(Color.black);
        setGunColor(Color.black);
        setBulletColor(Color.black);
        setRadarColor(Color.black);
        setScanColor(Color.black);

        //noinspection InfiniteLoopStatement
        while (true) {

            // save number of other robots
            numberOfRobots = getOthers();

            // separate the rader movement from the gun's.
            setAdjustRadarForGunTurn(true);

            // scan for enemies
            turnRadarRight(360);

            /*
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);

            turnLeft(90);

            getRadarHeading();
            getEnergy();
            getGunHeading();
            getGunCoolingRate();
            getGunHeat();
            getHeading();
            getX();
            getY();
            */
        }
    }

    /**
     *
     * @param e as ScannedRobotEvent
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        double bearing = e.getBearing();

        System.out.println("Heading: " + getHeading());
        System.out.println("Bearing: " + bearing);

        if (bearing > 0) {

        } else if (bearing < 0) {

        }

        turnRight(bearing);

        fire(1);
    }

    /**
     *
     * @param e as HitRobotEvent
     */
    public void onHitRobot(HitRobotEvent e) {

    }

    /**
     *
     * @param e as BulletMissedEvent
     */
    public void onBulletMiss(BulletMissedEvent e) {

    }

    /**
     *
     * @param e as HitByBulletEvent
     */
    public void onHitByBullet(HitByBulletEvent e) {

    }

    /**
     *
     * @param e as BulletHitEvent
     */
    public void onBulletHit(BulletHitEvent e) {

    }

    /**
     *
     * @param e as BulletHitBulletEvent
     */
    public void onBulletHitBullet(BulletHitBulletEvent e) {

    }

    /**
     *
     * @param e as HitWallEvent
     */
    public void onHitWall(HitWallEvent e) {

    }

    /**
     *
     */
    public void reverseDirection() {

    }

    /*
    private void Oppenent {

        String name;
        double energy;
        double distance;
        double bearing;
        double bearingRadians;
        double heading;
        double headingRadians;

    }
    */
}
