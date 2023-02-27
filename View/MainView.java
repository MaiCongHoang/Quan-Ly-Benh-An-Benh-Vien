package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ChuyenManHinhController;
import Model.XuLyPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MainView extends JFrame {

	private JPanel jpnRoot;
	private JPanel jpnMenu;
	private JPanel jpnView;

	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("Quản Lý Bệnh Án Bệnh Nhân");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1535, 820);
		jpnRoot = new JPanel();
		jpnRoot.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jpnRoot);
		jpnRoot.setLayout(null);
		
		jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(76, 152, 77));
		jpnMenu.setBounds(0, 0, 1552, 70);
		jpnRoot.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		jpnView = new JPanel();
		jpnView.setBounds(0, 80, 1537, 714);
		jpnRoot.add(jpnView);
		
		JPanel jpnTenBV = new JPanel();
		jpnTenBV.setBackground(new Color(76, 152, 77));
		jpnTenBV.setBounds(0, 0, 467, 70);
		jpnMenu.add(jpnTenBV);
		jpnTenBV.setLayout(null);
		
		JLabel jlbTenBV = new JLabel("Bệnh Viện Đa Khoa Đà Nẵng");
		jlbTenBV.setIcon(new ImageIcon(MainView.class.getResource("/Images/Dapino-Medical-Hospital.64.png")));
		jlbTenBV.setHorizontalAlignment(SwingConstants.LEFT);
		jlbTenBV.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlbTenBV.setForeground(Color.WHITE);
		jlbTenBV.setBounds(10, 0, 377, 62);
		jpnTenBV.add(jlbTenBV);
		
		JLabel jlbĐcBV = new JLabel(" 124 Hải Phòng, Thạch Thang, Thành Phố Đà Nẵng");
		jlbĐcBV.setHorizontalAlignment(SwingConstants.LEFT);
		jlbĐcBV.setForeground(Color.WHITE);
		jlbĐcBV.setFont(new Font("Arial", Font.PLAIN, 13));
		jlbĐcBV.setBounds(76, 46, 297, 24);
		jpnTenBV.add(jlbĐcBV);
		
		JPanel jpnTrangChu = new JPanel();
		jpnTrangChu.setBackground(new Color(76, 152, 77));
		jpnTrangChu.setBounds(467, 0, 350, 70);
		jpnMenu.add(jpnTrangChu);
		jpnTrangChu.setLayout(null);
		
		JLabel jlbTrangChu = new JLabel("Trang Chủ");
		jlbTrangChu.setIcon(new ImageIcon(MainView.class.getResource("/Images/Hopstarter-Sleek-Xp-Basic-Home.48.gif")));
		jlbTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		jlbTrangChu.setForeground(Color.WHITE);
		jlbTrangChu.setFont(new Font("Tahoma", Font.BOLD, 22));
		jlbTrangChu.setBounds(0, 0, 350, 70);
		jpnTrangChu.add(jlbTrangChu);
		
		JPanel jpnBenhNhan = new JPanel();
		jpnBenhNhan.setLayout(null);
		jpnBenhNhan.setBackground(new Color(76, 152, 77));
		jpnBenhNhan.setBounds(819, 0, 350, 70);
		jpnMenu.add(jpnBenhNhan);
		
		JLabel jlbBN = new JLabel("Bệnh Nhân");
		jlbBN.setIcon(new ImageIcon(MainView.class.getResource("/Images/Fa-Team-Fontawesome-FontAwesome-Hospital-User.48.gif")));
		jlbBN.setHorizontalAlignment(SwingConstants.CENTER);
		jlbBN.setForeground(Color.WHITE);
		jlbBN.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlbBN.setBounds(0, 0, 350, 70);
		jpnBenhNhan.add(jlbBN);
		
		JLabel jlbttBN = new JLabel("Thông Tin Bệnh Nhân");
		jlbttBN.setHorizontalAlignment(SwingConstants.CENTER);
		jlbttBN.setForeground(Color.WHITE);
		jlbttBN.setFont(new Font("Arial", Font.PLAIN, 13));
		jlbttBN.setBounds(65, 46, 285, 24);
		jpnBenhNhan.add(jlbttBN);
		
		JPanel jpnBenhAn = new JPanel();
		jpnBenhAn.setLayout(null);
		jpnBenhAn.setBackground(new Color(76, 152, 77));
		jpnBenhAn.setBounds(1171, 0, 371, 70);
		jpnMenu.add(jpnBenhAn);
		
		JLabel jlbBA = new JLabel("Bệnh Án");
		jlbBA.setIcon(new ImageIcon(MainView.class.getResource("/Images/Dapino-Medical-Medical-report.48.gif")));
		jlbBA.setHorizontalAlignment(SwingConstants.CENTER);
		jlbBA.setForeground(Color.WHITE);
		jlbBA.setFont(new Font("Tahoma", Font.BOLD, 20));
		jlbBA.setBounds(0, 0, 355, 70);
		jpnBenhAn.add(jlbBA);
		
		JLabel jlbhsBA = new JLabel("Hồ Sơ Bệnh Án");
		jlbhsBA.setHorizontalAlignment(SwingConstants.CENTER);
		jlbhsBA.setForeground(Color.WHITE);
		jlbhsBA.setFont(new Font("Arial", Font.PLAIN, 13));
		jlbhsBA.setBounds(57, 46, 298, 24);
		jpnBenhAn.add(jlbhsBA);
		ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
		jpnView.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(746, 5, 45, 13);
		jpnView.add(label);
		controller.setView(jpnTrangChu, jlbTrangChu);
		List<XuLyPanel> listItem = new ArrayList<>();
		listItem.add(new XuLyPanel("TrangChu",jpnTrangChu,jlbTrangChu));
		listItem.add(new XuLyPanel("BenhNhan",jpnBenhNhan,jlbBN));
		listItem.add(new XuLyPanel("BenhAn",jpnBenhAn,jlbBA));
		controller.setEvent(listItem);
		
	}
}
