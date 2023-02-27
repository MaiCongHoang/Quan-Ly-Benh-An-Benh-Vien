package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Model.TaiKhoan;
import Service.TaiKhoanServiceImpl;
import Service.TaiKhoanServiceInte;
import View.MainView;

public class TaiKhoanController {
	private JDialog dialog;
	private JButton jbtDN;
	private JTextField jtfTK;
	private JPasswordField jpfMK;
	private JLabel jlbTB;
	
	private TaiKhoanServiceInte taiKhoanServiceInte = null;
	
	public TaiKhoanController(JDialog dialog, JButton jbtDN, JTextField jtfTK, JPasswordField jpfMK, JLabel jlbTB) {
		super();
		this.dialog = dialog;
		this.jbtDN = jbtDN;
		this.jtfTK = jtfTK;
		this.jpfMK = jpfMK;
		this.jlbTB = jlbTB;
		
		taiKhoanServiceInte = new TaiKhoanServiceImpl();
	}
	
	public void setEvent() {
		jbtDN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (jtfTK.getText().length() == 0 || jpfMK.getText().length() == 0) {
					jlbTB.setText("Vui Lòng Nhập Dữ Liệu!");
				} else {
					TaiKhoan taiKhoan = taiKhoanServiceInte.login(jtfTK.getText(), jpfMK.getText());
					if (taiKhoan == null) {
						jlbTB.setText("Tài Khoản Hoặc Mật Khẩu Không Chính Xác ! ");
					} else {
						MainView main = new MainView();
						main.setTitle("Quản Lý Bệnh Án");
						main.setExtendedState(JFrame.MAXIMIZED_BOTH);
						main.setVisible(true);
						dialog.dispose();
					}
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
			}
		});
	}
	
}

