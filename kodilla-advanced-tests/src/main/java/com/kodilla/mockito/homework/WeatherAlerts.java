package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;

import javax.management.Notification;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherAlerts {
    private Map<String, Set<Client>> locations = new HashMap<>();


    public void addLocation(String location){
        this.locations.put(location, new HashSet<>());
    }
    public void removeLocation(String location){
        this.locations.remove(location);
    }
    public boolean addClient(String location,Client client){
        return this.locations.get(location).add(client);
    }

    public boolean removeClient(String location, Client client) {
        return this.locations.get(location).remove(client);
    }
    public void removeClients(Client client){
        this.locations.values().forEach(clients -> clients.remove(client));
    }
    public void notifyClient(String location, Notification notification) {
        this.locations.get(location).forEach(client -> client.receive(notification));
    }

    public void notifyClients(Notification notification) {
        this.locations.keySet().forEach(location -> this.notifyClient(location, notification));
    }

    public Map<String, Set<Client>> getLocations() {
        return locations;
    }
}

