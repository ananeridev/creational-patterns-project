package anabneri.factory.app.dbadapter.after.factory;


import anabneri.factory.app.dbadapter.after.db.DB;
import anabneri.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
