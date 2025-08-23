package app.domain.ports;

import app.domain.model.Order;

public interface OrderPort {

    public void save(Order order) throws Exception;
}
