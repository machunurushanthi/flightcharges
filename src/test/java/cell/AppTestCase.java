package cell;

import panda.dao.Dao;
import cell.tool.AppConsole;


public abstract class AppTestCase {
	protected Dao getDao() {
		return AppConsole.i().getDao();
	}
}
