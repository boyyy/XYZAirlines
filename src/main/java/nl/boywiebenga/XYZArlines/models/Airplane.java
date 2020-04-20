package nl.boywiebenga.XYZArlines.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Boy Wiebenga
 *
 * The airplane model defines the details of the airplanes and is used by the database
 * The airplane has a unique ID that is the same as the airplanes license number (like cars)
 * The details are about: Fuel
 */

@Entity
public class Airplane {

    @Id
    @Column(name = "AIRPLANE_ID")
    private String airplaneId;

    @Column(name = "AIRPLANE_FUEL_QUANTITY")
    private int airplaneFuelQuantity;

    @Column(name = "AIRPLANE_FUEL_CAPACITY")
    private int airplaneFuelCapacity;

    @Column(name = "AIRPLANE_BRAND")
    private String airplaneBrand;

    @Column(name = "AIRPLANE_TYPE")
    private String airplaneType;

    @Column(name = "AIRPLANE_AIRPORT_ID")
    private long airportId;

    public Airplane() {
    }

    public String getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(String airplaneId) {
        this.airplaneId = airplaneId;
    }

    public int getAirplaneFuelQuantity() {
        return airplaneFuelQuantity;
    }

    public void setAirplaneFuelQuantity(int airplaneFuelQuantity) {
        this.airplaneFuelQuantity = airplaneFuelQuantity;
    }

    public int getAirplaneFuelCapacity() {
        return airplaneFuelCapacity;
    }

    public void setAirplaneFuelCapacity(int airplaneFuelCapacity) {
        this.airplaneFuelCapacity = airplaneFuelCapacity;
    }

    public String getAirplaneBrand() {
        return airplaneBrand;
    }

    public void setAirplaneBrand(String airplaneBrand) {
        this.airplaneBrand = airplaneBrand;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public long getAirportId() {
        return airportId;
    }

    public void setAirportId(long airportId) {
        this.airportId = airportId;
    }
}
