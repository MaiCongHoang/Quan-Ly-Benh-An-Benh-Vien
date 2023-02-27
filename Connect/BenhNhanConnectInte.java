package Connect;

import java.sql.SQLException;
import java.util.List;

import Model.BenhNhan;

public interface BenhNhanConnectInte {
	public List<BenhNhan> getList() throws SQLException;
	
	public boolean create(BenhNhan benhNhan) throws SQLException;
	
	public boolean delete(String MaBN) throws SQLException;
	
	public boolean update(BenhNhan benhNhan) throws SQLException;
}
