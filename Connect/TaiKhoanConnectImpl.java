package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.TaiKhoan;

public class TaiKhoanConnectImpl implements TaiKhoanConnectInte {

	@Override
	public TaiKhoan login(String tenTK, String MK) {
		Connection cons = Connect.getConnection();
        String sql = "SELECT * FROM taikhoan WHERE tenTK LIKE ? AND MK LIKE ?";
        TaiKhoan taiKhoan = null;
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, tenTK);
            ps.setString(2, MK);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                taiKhoan = new TaiKhoan();
                taiKhoan.setMaTK(rs.getInt("maTK"));
                taiKhoan.setTenTK(rs.getString("tenTK"));
                taiKhoan.setMK(rs.getString("MK"));
            }
            ps.close();
            cons.close();
            return taiKhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

}
