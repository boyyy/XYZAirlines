package nl.boywiebenga.XYZArlines.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Boy Wiebenga
 *
 * The flight model defines the details of the flights and is used by the database
 * The flight has a unique ID
 * The flight is instant, so doesn't have a flighttime
 * A flight has a fixt fuel usage of 2 tons (so not defined)
 * Structure is: From -> To, which plane and when
 */

@Entity
public class Flight {

    @Id
    @Column(name = "FLIGHT_ID")
    private long flightId;

    @Column(name = "FLIGHT_FROM_AIRPORT")
    private long flightFrom;

    @Column(name = "FLIGHT_TO_AIRPORT")
    private long flightTo;

    @Column(name = "FLIGHT_AIRPLANE")
    private String airplaneId;

    @Column(name = "FLIGHT_DATE")
    private String flightDate;
}
