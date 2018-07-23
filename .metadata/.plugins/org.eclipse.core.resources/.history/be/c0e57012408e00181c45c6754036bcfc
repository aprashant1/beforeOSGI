package com.aman.rocket;

/**
 * <pre>
 * Title: EmergencyMonitor
 * Date: Jul 23, 2018
 * Description: TODO
 * Copyright: Copyright (c) 2018
 * Company: Rocket Software, Inc
 * </pre>
 * @author aprashant
 */
public class EmergencyMonitor implements IAirbagListener
{
    private Airbag airbag;
    private GPS gps;

    @Override
    public void deployed()
    {
        System.out.println("accident occured at latitude: "+
            gps.getLatitude()+", longitude: "+gps.getLongitude()
            +" Heading towards -> "+gps.getHeading()+" at speed "+gps.getSpeed());
        
    }

    public void setAirbag(Airbag airbag)
    {
        this.airbag = airbag;
    }

    public void setGps(GPS gps)
    {
        this.gps = gps;
    }
    
    public void shutdown() {
        airbag.removeListener(this);
    }
    
    public void startUp() {
        airbag.addListener(this);
    }
}

