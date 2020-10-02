package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.Map;
import java.util.Set;

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
    public void shouldAddClientToLocation() { // dodanie klienta do lokalizacji
        boolean result = weatherAlerts.addClient("Wrocłąw", secondClient);
        assertTrue(result);
    }

    @Test
    public void shouldRemoveClientFromLocation() { // usuniecie klienta z danej lokalizacji

        boolean result = weatherAlerts.removeClient("Wrocław", secondClient);
        assertTrue(result);
    }

    @Test
    public void shouldRemoveClientFromAllLocations() { // wypisanie subskrybenta ze wszystkich lokalizacji
        weatherAlerts.removeClientFromAllLocation(firstClient);
        Mockito.verify(firstClient, Mockito.never()).receive(notification);


    }

    @Test
    public void shouldNotifyClientsForLocation() { //wysłanie powiadomienia do klientów dla danej lokalizacji
        weatherAlerts.notifyClient("Wrocław", notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldNotifyAllClients() { // powiadomienie do wszystkich
        weatherAlerts.notifyClients(notification);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void shouldRemoveLocation() { // skasowanie danej lokalizacji
        weatherAlerts.removeLocation("Wrocław");
        Map<String, Set<Client>> locations = weatherAlerts.getLocations();
        assertEquals(1, locations.get("Kraków").size());
    }

    @Test
    public void shouldReturnFalseIsLocationIsInncorect() {
        weatherAlerts.addLocation("Kraków");
        Map<String, Set<Client>> result = weatherAlerts.getLocations();
        assertFalse(result.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfLocationIsNull() {
        weatherAlerts.addLocation(null);
        Map<String, Set<Client>> result = weatherAlerts.getLocations();
        assertFalse(result.isEmpty());
    }

    @Test
    public void shouldReturnFalseIfClientisNull() {
        weatherAlerts.addClient("Wrocław", null);
        Map<String, Set<Client>> result = weatherAlerts.getLocations();
        assertFalse(result.isEmpty());

    }
}