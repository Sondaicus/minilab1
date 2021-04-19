package repositories;



import models.*;
import org.springframework.data.repository.CrudRepository;
import java.util.*;



public interface KompisRepository extends CrudRepository<Kompis, Long>
{
	List<Kompis> findByName(String name);
	List<Kompis> findByEmail(String email);
	List<Kompis> findByTelephoneNumber(Long telephoneNumber);
	Kompis findById(long id);
}