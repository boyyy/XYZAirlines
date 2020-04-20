package nl.boywiebenga.XYZArlines.models;

import javax.persistence.*;
import java.util.List;

/**
 * @author Boy Wiebenga
 *
 * The airport model defines the details of the airplanes and is used by the database
 * The airport has a unique ID
 * The airport doesn't have a limit of passengers nor planes etc
 */

@Entity
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AIRPORT_ID", updatable = false, nullable = false)
    private long airportId;

    @Column(name = "AIRPORT_NAME")
    private String airportName;

    @Column(name = "AIRPORT_CITY")
    private String airportCity;

    @Column(name = "AIRPORT_COUNTRY")
    private String airportCountry;

    @OneToMany
    @JoinColumn(name="AIRPLANE_AIRPORT_ID", referencedColumnName="AIRPORT_ID")
    private List<Airplane> airplanes;

    public Airport() {
    }

    public long getAirportId() {
        return airportId;
    }

    public void setAirportId(long airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
