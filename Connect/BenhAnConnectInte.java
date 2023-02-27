package Connect;

import java.sql.SQLException;
import java.util.List;

import Model.BenhAn;

public interface BenhAnConnectInte {
	public List<BenhAn> getList();
	
	public int createOrUpdate(BenhAn benhAn);
	
	public boolean delete(String MaHS) throws SQLException;
	
}
