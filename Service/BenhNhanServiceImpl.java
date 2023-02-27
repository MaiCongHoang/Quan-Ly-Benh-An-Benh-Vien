package Service;

import java.sql.SQLException;
import java.util.List;

import Connect.BenhNhanConnectImpl;
import Connect.BenhNhanConnectInte;
import Model.BenhNhan;

public class BenhNhanServiceImpl implements BenhNhanServiceInte {

	private BenhNhanConnectInte benhNhanConnectInte = null;
	
	public BenhNhanServiceImpl() {
		benhNhanConnectInte = new BenhNhanConnectImpl();
	}

	@Override
	public List<BenhNhan> getList() {
		try {
			return benhNhanConnectInte.getList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
