//Caso de uso recursos humanos
package app.application.usescases;

import app.domain.model.User;
import app.domain.model.enums.Role;
import app.domain.services.CreateUser;

public class HumanResourseUseCase {

    private CreateUser createuser;

    public void createNurse(User user) throws Exception {
        user.setRole(Role.NURSE);
        createuser.create(user);
    }

    public void createDoctor(User user) throws Exception {
        user.setRole(Role.DOCTOR);
        createuser.create(user);
    }

    public void createSuppor(User user) throws Exception {
        user.setRole(Role.SUPPORT);
        createuser.create(user);
    }

    public void createAdmin(User user) throws Exception {
        user.setRole(Role.ADMIN);
        createuser.create(user);
    }
}
