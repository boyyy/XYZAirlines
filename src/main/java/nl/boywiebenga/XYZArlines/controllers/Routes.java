package nl.boywiebenga.XYZArlines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Boy Wiebenga
 *
 * This routes class provide the urls without extension
 *
 */

@Controller
public class Routes {

    @GetMapping(value = "/flight")
    public String flightPage() {
        return "/flight.html";
    }

    @GetMapping(value = "/airplane")
    public String airplanePage() {
        return "/airplane.html";
    }

    @GetMapping(value = "/airport")
    public String airportPage() {
        return "/airport.html";
    }

    @GetMapping(value = "/airport/details")
    public String airportDetailPage() {
        return "/airportDetails.html";
    }

}
