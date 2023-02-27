package Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.BenhAn;

public class BenhAnConnectImpl implements BenhAnConnectInte{

	@Override
	public List<BenhAn> getList() {
		try {
			Connection cons = Connect.getConnection();
			String sql ="SELECT * FROM qlbenhan.qlbenhan";
			List<BenhAn> list = new ArrayList<>();
			PreparedStatement ps = cons.prepareCall(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BenhAn benhAn = new BenhAn();
				benhAn.setMaHS(rs.getString("maHS"));
				benhAn.setLankham(rs.getString("lankham"));
				benhAn.setThannhiet(rs.getString("thannhiet"));
				benhAn.setHuyetap(rs.getString("huyetap"));
				benhAn.setMach(rs.getString("mach"));
				benhAn.setChieucao(rs.getString("chieucao"));
				benhAn.setCannang(rs.getString("cannang"));
				benhAn.setChandoan(rs.getString("chandoan"));
				benhAn.setMaBN(rs.getString("maBN"));
				benhAn.setTenBN(rs.getString("tenBN"));
				benhAn.setNgaysinh(rs.getString("ngaysinh"));
				benhAn.setBHYT(rs.getString("BHYT"));
				benhAn.setTenBS(rs.getString("tenBS"));
				benhAn.setKhoa(rs.getString("khoa"));
				benhAn.setSdtBS(rs.getString("sdtBS"));
				list.add(benhAn);
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
    public int createOrUpdate(BenhAn benhAn) {
        try {
            Connection cons = Connect.getConnection();
            String sql = "INSERT INTO qlbenhan(maHS, lankham, thannhiet, huyetap, mach, chieucao, cannang, chandoan, maBN, tenBN, ngaysinh, BHYT, tenBS, khoa, sdtBS)"
            		+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE maHS = VALUES(maHS), lankham = VALUES(lankham), thannhiet = VALUES(thannhiet), huyetap = VALUES(huyetap), mach = VALUES(mach), chieucao = VALUES(chieucao), cannang = VALUES(cannang), chandoan = VALUES(chandoan), maBN = VALUES(maBN), tenBN = VALUES(tenBN), ngaysinh = VALUES(ngaysinh), BHYT = VALUES(BHYT), tenBS = VALUES(tenBS), khoa = VALUES(khoa), sdtBS = VALUES(sdtBS)";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, benhAn.getMaHS());
            ps.setString(2, benhAn.getLankham());
            ps.setString(3, benhAn.getThannhiet());
            ps.setString(4, benhAn.getHuyetap());
            ps.setString(5, benhAn.getMach());
            ps.setString(6, benhAn.getChieucao());
            ps.setString(7, benhAn.getCannang());
            ps.setString(8, benhAn.getChandoan());
            ps.setString(9, benhAn.getMaBN());
            ps.setString(10, benhAn.getTenBN());
            ps.setString(11, benhAn.getNgaysinh());
            ps.setString(12, benhAn.getBHYT());
            ps.setString(13, benhAn.getTenBS());
            ps.setString(14, benhAn.getKhoa());
            ps.setString(15, benhAn.getSdtBS());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
	@Override
	public boolean delete(String maHS) throws SQLException {
		String sql = "DELETE FROM `qlbenhan`.`qlbenhan` WHERE (`maHS` = ?);";
		try(
				Connection cons = Connect.getConnection();
				PreparedStatement pre = cons.prepareStatement(sql);
			){
			pre.setString(1, maHS);
			
			return pre.executeUpdate() > 0;
		}
	}
//	public static void main(String[] args) {
//		BenhAnConnectInte benhAnInte = new BenhAnConnectImpl();
//		System.out.println(benhAnInte.getList());
//	}
}
