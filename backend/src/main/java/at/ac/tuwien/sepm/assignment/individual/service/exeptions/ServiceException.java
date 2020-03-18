package at.ac.tuwien.sepm.assignment.individual.service.exeptions;

public class ServiceException extends Exception {

    public ServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
