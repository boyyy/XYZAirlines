package nl.boywiebenga.XYZArlines.controllers;

import nl.boywiebenga.XYZArlines.models.Airplane;
import nl.boywiebenga.XYZArlines.models.Airport;
import nl.boywiebenga.XYZArlines.repositories.AirplaneRepository;
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
 * The flight controller handles the flights
 */

@RestController
@RequestMapping("/api/flight")
public class FlightController {



}
