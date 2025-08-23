package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class RegisterUser {

    private UserPort userPort;
    
    public void register(User user) throws Exception {
        if (userPort.findById(user).isPresent()) {
            throw new Exception("Usuario ya existe");
        }
        userPort.save(user);
    }
}
