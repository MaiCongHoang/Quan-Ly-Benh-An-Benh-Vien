package Service;

import java.util.List;

import Connect.BenhAnConnectImpl;
import Connect.BenhAnConnectInte;
import Model.BenhAn;

public class BenhAnServiceImpl implements BenhAnServiceInte {

	private BenhAnConnectInte benhAnConnectInte = null;
	
	public BenhAnServiceImpl() {
		benhAnConnectInte = new BenhAnConnectImpl();
	}

	@Override
	public List<BenhAn> getList() {
		return benhAnConnectInte.getList();
	}
	
	@Override
	public int createOrUpdate(BenhAn benhAn) {
		return benhAnConnectInte.createOrUpdate(benhAn);
	}

}
