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

}
