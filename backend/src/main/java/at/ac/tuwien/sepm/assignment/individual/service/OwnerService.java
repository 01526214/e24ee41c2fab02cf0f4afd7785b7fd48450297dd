package at.ac.tuwien.sepm.assignment.individual.service;

import at.ac.tuwien.sepm.assignment.individual.entity.Owner;
import at.ac.tuwien.sepm.assignment.individual.exception.NotFoundException;
import at.ac.tuwien.sepm.assignment.individual.service.exeptions.ServiceException;

import java.util.ArrayList;

public interface OwnerService {


    /**
     * @param id of the owner to find.
     * @return the owner with the specified id.
     * @throws RuntimeException  will be thrown if something goes wrong during data processing.
     * @throws NotFoundException will be thrown if the owner could not be found in the system.
     * @throws ServiceException  will be thrown if something goes wrong during data processing.
     */
    Owner findOneById(Long id) throws ServiceException, NotFoundException;

    /**
     * @return all owners in the database
     * @throws RuntimeException  will be thrown if something goes wrong during data processing.
     * @throws NotFoundException will be thrown if the owner could not be found in the system.
     * @throws ServiceException  will be thrown if something goes wrong during data processing.
     */
    ArrayList<Owner> getAll() throws ServiceException, NotFoundException;

}
