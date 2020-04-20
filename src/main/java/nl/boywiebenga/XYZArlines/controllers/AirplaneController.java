package nl.boywiebenga.XYZArlines.controllers;

import nl.boywiebenga.XYZArlines.models.Airplane;
import nl.boywiebenga.XYZArlines.repositories.AirplaneRepository;
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
 * The airplane controller handles all the changes made to a airplane
 */

@RestController
@RequestMapping("/api/airplane")
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;

    /**
     * Default request: get all airplanes
     * @return all airplanes
     */

    @GetMapping
    public List<Airplane> index() {
        return airplaneRepository.findAll();
    }

    /**
     * @param airplaneId
     * @return single airplane
     */

    @GetMapping("/{id}")
    public Airplane getAirplane(@PathVariable String airplaneId) {
        Optional<Airplane> optionalAirplane = airplaneRepository.findById(airplaneId);
        return optionalAirplane.orElse(null);
    }


}
