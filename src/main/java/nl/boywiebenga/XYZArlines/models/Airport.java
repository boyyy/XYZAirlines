package nl.boywiebenga.XYZArlines.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
    @Column(name = "AIRPORT_ID")
    private long airportId;

    @Column(name = "AIRPORT_NAME")
    private String airportName;

    @Column(name = "AIRPORT_CITY")
    private String airportCity;

    @Column(name = "AIRPORT_COUNTRY")
    private String airportCountry;
}
