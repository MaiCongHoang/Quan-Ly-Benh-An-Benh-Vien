package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.SwingConstants;

import java.sql.*;

import Connect.BenhNhanConnectImpl;
import Connect.BenhNhanConnectInte;
import Connect.Connect;
import Controller.QLBenhNhanController;
import Model.BenhNhan;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class BenhNhanView extends JPanel {
	private JTextField jtfmaBN;
	private JTextField jtftenBN;
	private JTextField jtfNS;
	private JTextField jtfCMT;
	private JTextField jtfSDT;
	private JTextField jtfBHYT;
	private JTextField jtfDC;
	private JTextField jtfSearch;
	/**
	 * Create the panel.
	 */
	public BenhNhanView() {
		
		setBackground(new Color(247, 245, 246));
		setBounds(0, 80, 1535, 740);
		setLayout(null);
		
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBackground(new Color(232, 252, 241));
		jpnRoot.setBounds(0, 0, 1535, 740);
		add(jpnRoot);
		jpnRoot.setLayout(null);
		
		JPanel jpnView = new JPanel();
		jpnView.setBackground(new Color(232, 252, 241));
		jpnView.setBounds(0, 461, 1535, 241);
		jpnRoot.add(jpnView);
		
		JLabel jlbmaBN = new JLabel("Mã Bệnh Nhân");
		jlbmaBN.setHorizontalAlignment(SwingConstants.LEFT);
		jlbmaBN.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbmaBN.setBounds(271, 31, 143, 52);
		jpnRoot.add(jlbmaBN);
		
		JLabel jlbtenBN = new JLabel("Tên Bệnh Nhân");
		jlbtenBN.setHorizontalAlignment(SwingConstants.LEFT);
		jlbtenBN.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbtenBN.setBounds(271, 105, 143, 52);
		jpnRoot.add(jlbtenBN);
		
		JLabel jlbgioiTinh = new JLabel("Giới Tính");
		jlbgioiTinh.setHorizontalAlignment(SwingConstants.LEFT);
		jlbgioiTinh.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbgioiTinh.setBounds(271, 178, 143, 52);
		jpnRoot.add(jlbgioiTinh);
		
		JLabel jlbngaySinh = new JLabel("Ngày Sinh");
		jlbngaySinh.setHorizontalAlignment(SwingConstants.LEFT);
		jlbngaySinh.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbngaySinh.setBounds(271, 258, 143, 52);
		jpnRoot.add(jlbngaySinh);
		
		JLabel jlbCMT = new JLabel("CMND/CCCD");
		jlbCMT.setHorizontalAlignment(SwingConstants.LEFT);
		jlbCMT.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbCMT.setBounds(849, 31, 143, 52);
		jpnRoot.add(jlbCMT);
		
		JLabel jlbSDT = new JLabel("Liên Hệ");
		jlbSDT.setHorizontalAlignment(SwingConstants.LEFT);
		jlbSDT.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbSDT.setBounds(849, 105, 143, 52);
		jpnRoot.add(jlbSDT);
		
		JLabel jlbBHYT = new JLabel("BHYT");
		jlbBHYT.setHorizontalAlignment(SwingConstants.LEFT);
		jlbBHYT.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbBHYT.setBounds(849, 176, 143, 52);
		jpnRoot.add(jlbBHYT);
		
		JLabel jlbdiaChi = new JLabel("Địa Chỉ");
		jlbdiaChi.setHorizontalAlignment(SwingConstants.LEFT);
		jlbdiaChi.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbdiaChi.setBounds(849, 256, 143, 52);
		jpnRoot.add(jlbdiaChi);
		
		JLabel jlbdiungThuoc = new JLabel("Dị Ứng Thuốc");
		jlbdiungThuoc.setHorizontalAlignment(SwingConstants.LEFT);
		jlbdiungThuoc.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbdiungThuoc.setBounds(272, 338, 143, 52);
		jpnRoot.add(jlbdiungThuoc);
		
		jtfmaBN = new JTextField();
		jtfmaBN.setBounds(418, 39, 243, 42);
		jpnRoot.add(jtfmaBN);
		jtfmaBN.setColumns(10);
		
		jtftenBN = new JTextField();
		jtftenBN.setColumns(10);
		jtftenBN.setBounds(418, 115, 243, 42);
		jpnRoot.add(jtftenBN);
		
		jtfNS = new JTextField();
		jtfNS.setColumns(10);
		jtfNS.setBounds(418, 266, 243, 42);
		jpnRoot.add(jtfNS);
		
		jtfCMT = new JTextField();
		jtfCMT.setColumns(10);
		jtfCMT.setBounds(995, 39, 243, 42);
		jpnRoot.add(jtfCMT);
		
		jtfSDT = new JTextField();
		jtfSDT.setColumns(10);
		jtfSDT.setBounds(995, 115, 243, 42);
		jpnRoot.add(jtfSDT);
		
		jtfBHYT = new JTextField();
		jtfBHYT.setColumns(10);
		jtfBHYT.setBounds(995, 188, 243, 42);
		jpnRoot.add(jtfBHYT);
		
		jtfDC = new JTextField();
		jtfDC.setColumns(10);
		jtfDC.setBounds(995, 268, 243, 42);
		jpnRoot.add(jtfDC);
		
		JRadioButton jrbNam = new JRadioButton("Nam");
		jrbNam.setBackground(new Color(232, 252, 241));
		jrbNam.setFont(new Font("Arial", Font.PLAIN, 18));
		jrbNam.setBounds(420, 194, 103, 21);
		jpnRoot.add(jrbNam);
		
		JRadioButton jrbNu = new JRadioButton("Nữ");
		jrbNu.setFont(new Font("Arial", Font.PLAIN, 18));
		jrbNu.setBackground(new Color(232, 252, 241));
		jrbNu.setBounds(558, 194, 103, 21);
		jpnRoot.add(jrbNu);
		
		ButtonGroup gioiTinh = new ButtonGroup();
		gioiTinh.add(jrbNam);
		gioiTinh.add(jrbNu);
		
		JRadioButton jrbCo = new JRadioButton("Có");
		jrbCo.setFont(new Font("Arial", Font.PLAIN, 18));
		jrbCo.setBackground(new Color(232, 252, 241));
		jrbCo.setBounds(421, 354, 103, 21);
		jpnRoot.add(jrbCo);
		
		JRadioButton jrbKhong = new JRadioButton("Không");
		jrbKhong.setFont(new Font("Arial", Font.PLAIN, 18));
		jrbKhong.setBackground(new Color(232, 252, 241));
		jrbKhong.setBounds(558, 354, 103, 21);
		jpnRoot.add(jrbKhong);
		
		ButtonGroup diungThuoc = new ButtonGroup();
		diungThuoc.add(jrbCo);
		diungThuoc.add(jrbKhong);
		
		JLabel jlbTB = new JLabel("");
		jlbTB.setForeground(Color.RED);
		jlbTB.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbTB.setHorizontalAlignment(SwingConstants.CENTER);
		jlbTB.setBounds(0, 0, 263, 73);
		jpnRoot.add(jlbTB);
		
		JLabel jlbSearch = new JLabel("Tìm Kiếm");
		jlbSearch.setForeground(Color.BLACK);
		jlbSearch.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbSearch.setBackground(new Color(76, 152, 77));
		jlbSearch.setBounds(1325, 399, 135, 52);
		jpnRoot.add(jlbSearch);
		
		jtfSearch = new JTextField();
		jtfSearch.setBounds(1052, 402, 263, 52);
		jpnRoot.add(jtfSearch);
		jtfSearch.setColumns(10);
		
		QLBenhNhanController controller = new QLBenhNhanController(jpnView, jtfSearch, jtfmaBN, jtftenBN, jtfNS, jtfCMT, jtfSDT, jtfBHYT, jtfDC, jrbNam, jrbNu, jrbCo, jrbKhong);
		controller.setDatetoTable();
		
		JButton jbtAdd = new JButton("Thêm Mới");
		jbtAdd.setForeground(new Color(247, 245, 246));
		jbtAdd.setFont(new Font("Arial", Font.PLAIN, 18));
		jbtAdd.setBackground(new Color(76, 152, 77));
		jbtAdd.setBounds(58, 399, 162, 52);
		jpnRoot.add(jbtAdd);
		
		jbtAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection cons = Connect.getConnection();
				try {
					if(jtfmaBN.getText().length() == 0 || jtftenBN.getText().length() == 0 || jtfNS.getText().length() == 0 ) {
						JOptionPane.showMessageDialog(jbtAdd,"Nhập Dữ Liệu Cần Thiết!");
					} else {
						StringBuffer sb = new StringBuffer();
						String sql_check_pk = "select maBN from qlbenhnhan where maBN = '" + jtfmaBN.getText()+"'";
						Statement st = cons.createStatement();
						ResultSet rs =st.executeQuery(sql_check_pk);
						if (rs.next()) {
							sb.append("Bệnh Nhân Đã Tồn Tại!");
						}
						if(sb.length() > 0) {
							JOptionPane.showMessageDialog(jbtAdd, sb.toString());
						} else {
							BenhNhan benhNhan = new BenhNhan();
							benhNhan.setMaBN(jtfmaBN.getText());
							benhNhan.setTenBN(jtftenBN.getText());
							benhNhan.setNgaysinh(jtfNS.getText());
							benhNhan.setGioitinh(jrbNam.isSelected());
							benhNhan.setCMT(jtfCMT.getText());
							benhNhan.setSDT(jtfSDT.getText());
							benhNhan.setBHYT(jtfBHYT.getText());
							benhNhan.setDiachi(jtfDC.getText());
							benhNhan.setDiungthuoc(jrbCo.isSelected());
							BenhNhanConnectInte benhNhanConnectInte = new BenhNhanConnectImpl();
							benhNhanConnectInte.create(benhNhan);
							
							JOptionPane.showMessageDialog(jbtAdd, "Thêm Dữ Liệu Thành Công");
							xoatrang();
							controller.setDatetoTable();
						}
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(jbtAdd, "Erorr: " + e2.getMessage());
					e2.printStackTrace();
				}
			}
		});
		
		JButton jbtRemove = new JButton("Xoá");
		jbtRemove.setForeground(new Color(247, 245, 246));
		jbtRemove.setFont(new Font("Arial", Font.PLAIN, 18));
		jbtRemove.setBackground(new Color(76, 152, 77));
		jbtRemove.setBounds(271, 400, 162, 52);
		jpnRoot.add(jbtRemove);
		jbtRemove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if(jtfmaBN.getText().length() == 0 || jtftenBN.getText().length() == 0 || jtfNS.getText().length() == 0 ) {
					sb.append("Nhập Dữ Liệu Cần Thiết!");
				}
				if(sb.length() > 0) {
					JOptionPane.showMessageDialog(jbtRemove, sb);
					return;
				}
				try {
					BenhNhanConnectInte benhNhanConnectInte = new BenhNhanConnectImpl();
					benhNhanConnectInte.delete(jtfmaBN.getText());
					
					JOptionPane.showMessageDialog(jbtRemove, "Xóa thành công");
					xoatrang();
					controller.setDatetoTable();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(jbtRemove, "Erorr: " + e2.getMessage());
					e2.printStackTrace();
				}
			}
		});
		
		JButton jbtUpdate = new JButton("Cập Nhật");
		jbtUpdate.setForeground(new Color(247, 245, 246));
		jbtUpdate.setFont(new Font("Arial", Font.PLAIN, 18));
		jbtUpdate.setBackground(new Color(76, 152, 77));
		jbtUpdate.setBounds(486, 399, 162, 52);
		jpnRoot.add(jbtUpdate);
		
		JLabel jlbNote = new JLabel("*");
		jlbNote.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote.setForeground(Color.RED);
		jlbNote.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote.setBounds(677, 53, 23, 24);
		jpnRoot.add(jlbNote);
		
		JLabel jlbNote_1 = new JLabel("*");
		jlbNote_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote_1.setForeground(Color.RED);
		jlbNote_1.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote_1.setBounds(677, 127, 23, 24);
		jpnRoot.add(jlbNote_1);
		
		JLabel jlbNote_2 = new JLabel("*");
		jlbNote_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote_2.setForeground(Color.RED);
		jlbNote_2.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote_2.setBounds(677, 280, 23, 24);
		jpnRoot.add(jlbNote_2);
		jbtUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if(jtfmaBN.getText().length() == 0 || jtftenBN.getText().length() == 0 || jtfNS.getText().length() == 0 ) {
					sb.append("Nhập Dữ Liệu Cần Thiết!");
				}
				if(sb.length() > 0) {
					JOptionPane.showMessageDialog(jbtUpdate, sb);
					return;
				}
				try {
					BenhNhan benhNhan = new BenhNhan();
					benhNhan.setMaBN(jtfmaBN.getText());
					benhNhan.setTenBN(jtftenBN.getText());
					benhNhan.setNgaysinh(jtfNS.getText());
					benhNhan.setGioitinh(jrbNam.isSelected() ? true : false);
					benhNhan.setCMT(jtfCMT.getText());
					benhNhan.setSDT(jtfSDT.getText());
					benhNhan.setBHYT(jtfBHYT.getText());
					benhNhan.setDiachi(jtfDC.getText());
					benhNhan.setDiungthuoc(jrbCo.isSelected() ? true : false);
					
					BenhNhanConnectInte benhNhanConnectInte = new BenhNhanConnectImpl();
					benhNhanConnectInte.update(benhNhan);
					
					JOptionPane.showMessageDialog(jbtUpdate, "Cập Nhật Dữ Liệu Thành Công");
					xoatrang();
					controller.setDatetoTable();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(jbtUpdate, "Erorr: " + e2.getMessage());
					e2.printStackTrace();
				}
			}			
		});
		
	}
	public void xoatrang() {
		jtfmaBN.setText("");
		jtftenBN.setText("");
		jtfNS.setText("");
		jtfCMT.setText("");
		jtfSDT.setText("");
		jtfBHYT.setText("");
		jtfDC.setText("");
		jtfmaBN.setEnabled(true);
	}
}
