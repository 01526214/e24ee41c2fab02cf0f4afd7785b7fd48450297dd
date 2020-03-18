package at.ac.tuwien.sepm.assignment.individual.persistence;

import at.ac.tuwien.sepm.assignment.individual.entity.Owner;
import at.ac.tuwien.sepm.assignment.individual.exception.NotFoundException;
import at.ac.tuwien.sepm.assignment.individual.persistence.exeptions.PersistenceException;
import org.springframework.dao.DataAccessException;

import java.util.ArrayList;

public interface OwnerDao {

    /**
     * @param id of the owner to find.
     * @return the owner with the specified id.
     * @throws DataAccessException will be thrown if something goes wrong during the database access.
     * @throws NotFoundException   will be thrown if the owner could not be found in the database.
     * @throws PersistenceException   will be thrown if something goes wrong during data processing.
     */
    Owner findOneById(Long id) throws PersistenceException, NotFoundException;

    /**
     * @return all owner in the database passing to the filters
     * @throws DataAccessException will be thrown if something goes wrong during the database access.
     * @throws NotFoundException   will be thrown if the owner could not be found in the database.
     * @throws PersistenceException   will be thrown if something goes wrong during data processing.
     */

    ArrayList<Owner> getAll() throws PersistenceException, NotFoundException;

}
