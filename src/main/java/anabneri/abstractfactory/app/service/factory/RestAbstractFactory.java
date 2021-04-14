package anabneri.abstractfactory.app.service.factory;


import anabneri.abstractfactory.app.service.services.CarRestApiService;
import anabneri.abstractfactory.app.service.services.CarService;
import anabneri.abstractfactory.app.service.services.UserRestApiService;
import anabneri.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
