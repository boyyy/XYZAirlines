package nl.boywiebenga.XYZArlines.repositories;

import nl.boywiebenga.XYZArlines.models.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, String> {

}
