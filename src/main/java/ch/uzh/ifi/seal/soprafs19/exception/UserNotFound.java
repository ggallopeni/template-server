package ch.uzh.ifi.seal.soprafs19.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFound extends Exception{
    public UserNotFound(String message){
        super(message);
    }
}
