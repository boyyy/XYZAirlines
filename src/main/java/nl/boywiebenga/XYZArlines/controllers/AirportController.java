package nl.boywiebenga.XYZArlines.controllers;

import nl.boywiebenga.XYZArlines.models.Airport;
import nl.boywiebenga.XYZArlines.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Boy Wiebenga
 *
 * The airport controller handles all the changes made to a airport
 */

@RestController
@RequestMapping("/api/airport")
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;

    /**
     * Default request: get all airports
     * @return Airports
     */

    @GetMapping
    public List<Airport> index() {
        return airportRepository.findAll();
    }

    /**
     * Get airport with Id
     * @param airportId
     * @return Single Airport
     */

    @GetMapping("/id/{airportId}")
    public Airport getAirportById(@PathVariable Long airportId) {
        Optional<Airport> optionalAirport = airportRepository.findById(airportId);
        return optionalAirport.orElse(null);
    }

    /**
     * Get airport with Name
     * @param airportName
     * @return Single Airport
     */

    @GetMapping("/name/{airportName}")
    public Airport getAirportByName(@PathVariable String airportName) {
        Optional<Airport> optionalAirport = airportRepository.findByAirportName(airportName);
        return optionalAirport.orElse(null);
    }

}
