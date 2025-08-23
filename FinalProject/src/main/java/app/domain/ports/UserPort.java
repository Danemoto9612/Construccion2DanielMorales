package app.domain.ports;

import app.domain.model.User;
import java.util.Optional;

public interface UserPort {

    public void save(User user) throws Exception;

    public Optional<User> findById(User user) throws Exception;
}
