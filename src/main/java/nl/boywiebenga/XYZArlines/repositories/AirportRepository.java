package nl.boywiebenga.XYZArlines.repositories;

import nl.boywiebenga.XYZArlines.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

}
