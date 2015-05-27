package ralf;

import robocode.*;
import robocode.Robot;

import java.awt.*;

/**
 * This is just a test dummy to be able to test
 * all the fancy stuff with the actual robot.
 *
 * Created by ralf on 27/05/15.
 */
public class DummyRobo extends Robot {

    public void run() {

        // set colors
        setBodyColor(Color.white);
        setGunColor(Color.white);
        setBulletColor(Color.white);
        setRadarColor(Color.white);
        setScanColor(Color.white);

        while (true) {
            // do nothing as this is only a test dummy at first
            turnRadarRight(360);
        }

    }

}
