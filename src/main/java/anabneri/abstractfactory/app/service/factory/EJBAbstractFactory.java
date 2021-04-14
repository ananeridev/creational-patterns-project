package anabneri.abstractfactory.app.service.factory;


import anabneri.abstractfactory.app.service.services.CarEJBService;
import anabneri.abstractfactory.app.service.services.CarService;
import anabneri.abstractfactory.app.service.services.UserEJBService;
import anabneri.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



