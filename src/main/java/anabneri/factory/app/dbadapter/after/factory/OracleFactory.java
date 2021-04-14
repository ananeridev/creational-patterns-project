package anabneri.factory.app.dbadapter.after.factory;


import anabneri.factory.app.dbadapter.after.db.DB;
import anabneri.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
