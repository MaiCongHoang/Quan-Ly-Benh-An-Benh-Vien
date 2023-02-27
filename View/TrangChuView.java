package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class TrangChuView extends JPanel {
	
	public TrangChuView() {
		setBackground(new Color(247, 245, 246));
		setBounds(0, 80, 1535, 740);
		setLayout(null);
		
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBackground(new Color(247, 245, 246));
		jpnRoot.setBounds(0, 0, 1535, 740);
		add(jpnRoot);
		jpnRoot.setLayout(null);

		JPanel jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(76, 152, 77));
		jpnMenu.setBounds(0, 624, 1544, 93);
		jpnRoot.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		JLabel jlbMenu = new JLabel("Địa Chỉ : 124 Hải Phòng, Thạch Thang, Thành Phố Đà Nẵng | Điện thoại: 0236.3821118 | Email: benhviendanang@danang.gov.vn | Website: dananghospital.org.vn");
		jlbMenu.setHorizontalAlignment(SwingConstants.CENTER);
		jlbMenu.setForeground(Color.WHITE);
		jlbMenu.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbMenu.setBounds(10, 10, 1524, 73);
		jpnMenu.add(jlbMenu);
		
		JPanel jpnView = new JPanel();
		jpnView.setBackground(new Color(232, 252, 241));
		jpnView.setBounds(0, 0, 1535, 625);
		jpnRoot.add(jpnView);
		jpnView.setLayout(null);
		
		JLabel jlbSlogan = new JLabel("“SÁNG Y ĐỨC – VỮNG CHUYÊN MÔN – VUÔNG TRÒN HẠNH PHÚC”");
		jlbSlogan.setHorizontalAlignment(SwingConstants.CENTER);
		jlbSlogan.setForeground(new Color(76, 152, 77));
		jlbSlogan.setFont(new Font("Arial", Font.BOLD, 25));
		jlbSlogan.setBounds(0, 10, 1524, 73);
		jpnView.add(jlbSlogan);
		
		JLabel jlbImage1 = new JLabel("");
		jlbImage1.setIcon(new ImageIcon(TrangChuView.class.getResource("/Images/sihg_kiem-soat-stress-o-benh-nhan-ung-thu-p1_full_10302020_033052-1.gif")));
		jlbImage1.setBounds(119, 138, 501, 445);
		jpnView.add(jlbImage1);
		
		JLabel jlbtext1 = new JLabel("PHẦN MỀM ");
		jlbtext1.setFont(new Font("Arial", Font.BOLD, 40));
		jlbtext1.setBounds(1113, 123, 236, 57);
		jpnView.add(jlbtext1);
		
		JLabel jlbtext2 = new JLabel("QUẢN LÝ BỆNH ÁN ");
		jlbtext2.setForeground(Color.RED);
		jlbtext2.setFont(new Font("Arial", Font.BOLD, 40));
		jlbtext2.setBounds(963, 168, 386, 79);
		jpnView.add(jlbtext2);
		
		JLabel jlbtext3 = new JLabel("BỆNH VIỆN");
		jlbtext3.setFont(new Font("Arial", Font.BOLD, 40));
		jlbtext3.setBounds(1113, 227, 236, 65);
		jpnView.add(jlbtext3);
		
		JLabel jlbtext4 = new JLabel("ĐA KHOA ĐÀ NẴNG");
		jlbtext4.setForeground(Color.RED);
		jlbtext4.setFont(new Font("Arial", Font.BOLD, 40));
		jlbtext4.setBounds(958, 278, 391, 79);
		jpnView.add(jlbtext4);
		
		JLabel jlbImage2 = new JLabel("");
		jlbImage2.setIcon(new ImageIcon(TrangChuView.class.getResource("/Images/Streamlineicons-Streamline-Ux-Free-Doctor-hospital.256.gif")));
		jlbImage2.setBounds(1065, 381, 246, 201);
		jpnView.add(jlbImage2);
	}
}
