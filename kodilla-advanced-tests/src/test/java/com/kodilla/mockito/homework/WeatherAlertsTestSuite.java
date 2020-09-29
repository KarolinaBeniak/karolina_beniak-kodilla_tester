package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.management.Notification;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertsTestSuite {
    WeatherAlerts weatherAlerts = new WeatherAlerts();
    Client firstClient = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @BeforeEach
    public void addClientsAndLocations() {
        weatherAlerts.addLocation("Wrocław");
        weatherAlerts.addLocation("Kraków");
        weatherAlerts.addClient("Wrocław", firstClient);
        weatherAlerts.addClient("Wrocław", secondClient);
        weatherAlerts.addClient("Kraków", thirdClient);
    }

    @Test
    public void shouldAddClientToLocation() {
        boolean result = weatherAlerts.addClient("Wrocłąw", secondClient);
        assertTrue(result);
    }

    @Test
    public void shouldRemoveClientFromLocation() {
        boolean result = weatherAlerts.removeClient("Wrocław", secondClient);
        assertTrue(result);
    }
    @Test
    public void shouldNotifyCliuentsForLocation(){
        weatherAlerts.notifyClient("Wrocław", notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.never()).receive(notification);

    }
}