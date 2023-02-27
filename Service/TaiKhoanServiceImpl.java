package Service;

import Connect.TaiKhoanConnectImpl;
import Connect.TaiKhoanConnectInte;
import Model.TaiKhoan;

public class TaiKhoanServiceImpl implements TaiKhoanServiceInte {
	private TaiKhoanConnectInte taiKhoanConnectInte = null;
	
	
	public TaiKhoanServiceImpl() {
		taiKhoanConnectInte = new TaiKhoanConnectImpl();
	}


	@Override
	public TaiKhoan login(String tenTK, String MK) {
		return taiKhoanConnectInte.login(tenTK,MK);
	}

}
