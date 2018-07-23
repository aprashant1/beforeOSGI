package com.aman.rocket;

/**
 * <pre>
 * Title: Toast
 * Date: Jul 23, 2018
 * Description: TODO
 * Copyright: Copyright (c) 2018
 * Company: Rocket Software, Inc
 * </pre>
 * @author aprashant
 */
public class Toast
{
   public static void main(String[] a)
    {
        System.out.println("--- STARTING ---");
        GPS gps = new GPS();
        Airbag airbag = new Airbag();
        EmergencyMonitor emergencyMonitor = new EmergencyMonitor();
        emergencyMonitor.setAirbag(airbag);
        emergencyMonitor.setGps(gps);
        emergencyMonitor.startUp();
        emergencyMonitor.deployed();
        emergencyMonitor.shutdown();
        System.out.println("--- TERMINATED ---");

    }
}

