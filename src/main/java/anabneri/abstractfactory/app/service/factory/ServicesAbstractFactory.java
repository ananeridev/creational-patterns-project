package anabneri.abstractfactory.app.service.factory;

import anabneri.abstractfactory.app.service.services.CarService;
import anabneri.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
