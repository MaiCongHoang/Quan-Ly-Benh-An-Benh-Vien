package Connect;
import Model.BenhNhan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanConnectImpl implements BenhNhanConnectInte{

	@Override
	public List<BenhNhan> getList() throws SQLException {
		try {
			Connection cons = Connect.getConnection();
			String sql ="SELECT * FROM qlbenhnhan";
			List<BenhNhan> list = new ArrayList<>();
			PreparedStatement ps = cons.prepareCall(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BenhNhan benhNhan = new BenhNhan();
				benhNhan.setMaBN(rs.getString("maBN"));
				benhNhan.setTenBN(rs.getString("tenBN"));
				benhNhan.setGioitinh(rs.getBoolean("gioitinh"));
				benhNhan.setNgaysinh(rs.getString("ngaysinh"));
				benhNhan.setCMT(rs.getString("CMT"));
				benhNhan.setSDT(rs.getString("SDT"));
				benhNhan.setBHYT(rs.getString("BHYT"));
				benhNhan.setDiachi(rs.getString("diachi"));
				benhNhan.setDiungthuoc(rs.getBoolean("diungthuoc"));
				list.add(benhNhan);
			}
			ps.close();
			rs.close();
			cons.close();
			return list;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
    public boolean create(BenhNhan benhNhan) throws SQLException {
        String sql = "INSERT INTO qlbenhnhan(maBN, tenBN, ngaysinh, gioitinh, CMT, SDT, BHYT, diachi, diungthuoc)"
        		+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( Connection cons = Connect.getConnection();
            PreparedStatement ps = cons.prepareStatement(sql); ) {
            ps.setString(1, benhNhan.getMaBN());
            ps.setString(2, benhNhan.getTenBN());
            ps.setString(3, benhNhan.getNgaysinh());
            ps.setBoolean(4, benhNhan.getGioitinh());
            ps.setString(5, benhNhan.getCMT());
            ps.setString(6, benhNhan.getSDT());
            ps.setString(7, benhNhan.getBHYT());
            ps.setString(8, benhNhan.getDiachi());
            ps.setBoolean(9, benhNhan.getDiungthuoc());
            return ps.executeUpdate() > 0;
        }
	}
	
	@Override
	public boolean delete(String maBN) throws SQLException {
		String sql = "DELETE FROM `qlbenhan`.`qlbenhnhan` WHERE (`maBN` = ?);";
		try(
				Connection cons = Connect.getConnection();
				PreparedStatement pre = cons.prepareStatement(sql);
			){
			pre.setString(1, maBN);
			
			return pre.executeUpdate() > 0;
		}
	}
	
	@Override
	public boolean update(BenhNhan benhNhan) throws SQLException {
		String sql = "UPDATE `qlbenhan`.`qlbenhnhan` SET `tenBN` = ?, `ngaysinh` = ?, `gioitinh` = ?, `CMT` = ?, `SDT` = ?, `BHYT` = ?, `diachi` = ?, `diungthuoc` = ? WHERE (`maBN` = ?);";
		try(
				Connection cons = Connect.getConnection();
				PreparedStatement ps = cons.prepareStatement(sql);
			){
            ps.setString(1, benhNhan.getTenBN());
            ps.setString(2, benhNhan.getNgaysinh());
            ps.setBoolean(3, benhNhan.getGioitinh());
            ps.setString(4, benhNhan.getCMT());
            ps.setString(5, benhNhan.getSDT());
            ps.setString(6, benhNhan.getBHYT());
            ps.setString(7, benhNhan.getDiachi());
            ps.setBoolean(8, benhNhan.getDiungthuoc());
            ps.setString(9, benhNhan.getMaBN());
			
			return ps.executeUpdate() > 0;
		}
	}
//	public static void main(String[] args) {
//		BenhNhanConnectInte benhNhanInte = new BenhNhanConnectImpl();
//		System.out.println(benhNhanInte.getList());
//	}
}
