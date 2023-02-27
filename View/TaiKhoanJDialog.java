package View;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import Controller.TaiKhoanController;

public class TaiKhoanJDialog extends JDialog {
	private JTextField jtfTK;
	private JPasswordField jpfMK;

	public TaiKhoanJDialog(java.awt.Frame parent, boolean modal) {
		super(parent,modal);
		setBounds(100, 100, 1101, 565);
		getContentPane().setLayout(null);
		
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBackground(new Color(246, 246, 246));
		jpnRoot.setBounds(0, 0, 1087, 528);
		getContentPane().add(jpnRoot);
		jpnRoot.setLayout(null);
		
		JLabel jlbImage = new JLabel("");
		jlbImage.setBackground(Color.WHITE);
		jlbImage.setIcon(new ImageIcon(TaiKhoanJDialog.class.getResource("/Images/4-nguyen-tac-trong-thiet-ke-logo-nganh-y-duoc0_1585716769.jpg")));
		jlbImage.setBounds(0, 0, 650, 528);
		jpnRoot.add(jlbImage);
		
		JPanel jpnView = new JPanel();
		jpnView.setBackground(new Color(232, 252, 241));
		jpnView.setBounds(650, 0, 437, 528);
		jpnRoot.add(jpnView);
		jpnView.setLayout(null);
		
		JLabel jlbTK = new JLabel("Tài Khoản :");
		jlbTK.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbTK.setBounds(29, 173, 118, 48);
		jpnView.add(jlbTK);
		
		jtfTK = new JTextField();
		jtfTK.setBounds(147, 174, 261, 53);
		jpnView.add(jtfTK);
		jtfTK.setColumns(10);
		
		JLabel jlbMK = new JLabel("Mật Khẩu :");
		jlbMK.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbMK.setBounds(29, 237, 118, 48);
		jpnView.add(jlbMK);
		
		jpfMK = new JPasswordField();
		jpfMK.setBounds(146, 241, 262, 48);
		jpnView.add(jpfMK);
		
		JButton jbtDN = new JButton("Đăng Nhập");
		jbtDN.setFont(new Font("Arial", Font.BOLD, 20));
		jbtDN.setBounds(29, 300, 379, 53);
		jpnView.add(jbtDN);
		
		JLabel jlbTB = new JLabel("");
		jlbTB.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbTB.setHorizontalAlignment(SwingConstants.CENTER);
		jlbTB.setForeground(Color.RED);
		jlbTB.setBounds(29, 417, 379, 53);
		jpnView.add(jlbTB);
		
		TaiKhoanController controller = new TaiKhoanController(this, jbtDN, jtfTK, jpfMK, jlbTB);	
		controller.setEvent();
	}
}
