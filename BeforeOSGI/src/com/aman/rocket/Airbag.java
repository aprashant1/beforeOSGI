package com.aman.rocket;

import java.util.ArrayList;
import java.util.List;


/**
 * <pre>
 * Title: Airbag
 * Date: Jul 23, 2018
 * Description: TODO
 * Copyright: Copyright (c) 2018
 * Company: Rocket Software, Inc
 * </pre>
 * @author aprashant
 */
public class Airbag
{
    
    public List<IAirbagListener> listeners;

    public Airbag()
    {
        super();
        this.listeners = new ArrayList<>();
    }
    
    public synchronized void addListener(IAirbagListener listener) {
        this.listeners.add(listener);
    }
    
    public synchronized void removeListener(IAirbagListener listener) {
        this.listeners.remove(listener);
    }
    
    public synchronized void deploy() {
        listeners.forEach(e -> {
            e.deployed();
        });
    }

}

