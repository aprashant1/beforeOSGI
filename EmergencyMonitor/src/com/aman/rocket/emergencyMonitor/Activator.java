package com.aman.rocket.emergencyMonitor;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.aman.rocket.airbag.Airbag;
import com.aman.rocket.gps.GPS;

/**
 * <pre>
 * Title: Activator
 * Date: Jul 23, 2018
 * Description: TODO
 * Copyright: Copyright (c) 2018
 * Company: Rocket Software, Inc
 * </pre>
 * @author aprashant
 */
public class Activator
    implements BundleActivator
{   
    private Airbag airbag;
    private GPS gps;
    private EmergencyMonitor monitor;

    @Override
    public void start(BundleContext arg0)
        throws Exception
    {
        System.out.println("--- STARTING ---");
        airbag = new Airbag();
        gps = new GPS();
        monitor = new EmergencyMonitor();
        monitor.setAirbag(airbag);
        monitor.setGps(gps);
        monitor.startUp();
        monitor.deployed();
        
    }

    @Override
    public void stop(BundleContext arg0)
        throws Exception
    {
        monitor.shutdown();
        System.out.println("--- TERMINATED ---");
        
    }

}
