package nl.boywiebenga.XYZArlines.repositories;

import nl.boywiebenga.XYZArlines.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

    Optional<Airport> findByAirportName(String airportName);

}
