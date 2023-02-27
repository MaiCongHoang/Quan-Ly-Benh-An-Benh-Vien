package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Controller.BenhAnController;
import Model.BenhAn;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class BenhAnJFrame extends JFrame {

	private JPanel jpnRoot;
	private JTextField jtftenBN;
	private JTextField jtfNS;
	private JTextField jtfBHYT;
	private JTextField jtftenBS;
	private JTextField jtfKhoa;
	private JTextField jtfsdtBS;
	private JTextField jtfMach;
	private JTextField jtfHA;
	private JTextField jtfTN;
	private JTextField jtfCN;
	private JTextField jtfCC;
	private JTextField jtfmaHS;
	private JTextField jtfLK;
	private JTextField jtfmaBN;
	/**
	 * Create the frame.
	 */
	public BenhAnJFrame(BenhAn benhAn) {
		setTitle("Bệnh Án Bệnh Nhân");

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(80, 80, 1400, 700);
		jpnRoot = new JPanel();
		jpnRoot.setBackground(new Color(232, 252, 241));
		jpnRoot.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jpnRoot);
		jpnRoot.setLayout(null);
		
		JPanel jpnHSBA = new JPanel();
		jpnHSBA.setBackground(new Color(232, 252, 241));
		jpnHSBA.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "H\u1ED3 S\u01A1 B\u1EC7nh \u00C1n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpnHSBA.setBounds(32, 66, 887, 571);
		jpnRoot.add(jpnHSBA);
		jpnHSBA.setLayout(null);
		
		JLabel jlbMach = new JLabel("Mạch");
		jlbMach.setHorizontalAlignment(SwingConstants.CENTER);
		jlbMach.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbMach.setBounds(29, 322, 93, 34);
		jpnHSBA.add(jlbMach);
		
		jtfMach = new JTextField();
		jtfMach.setColumns(10);
		jtfMach.setBounds(174, 319, 215, 46);
		jpnHSBA.add(jtfMach);
		
		JLabel jlbchanDoan = new JLabel("Chẩn Đoán");
		jlbchanDoan.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbchanDoan.setHorizontalAlignment(SwingConstants.CENTER);
		jlbchanDoan.setBounds(29, 422, 100, 34);
		jpnHSBA.add(jlbchanDoan);
		
		jtfHA = new JTextField();
		jtfHA.setColumns(10);
		jtfHA.setBounds(174, 224, 215, 46);
		jpnHSBA.add(jtfHA);
		
		JLabel jlbhuyetAp = new JLabel("Huyết Áp");
		jlbhuyetAp.setHorizontalAlignment(SwingConstants.CENTER);
		jlbhuyetAp.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbhuyetAp.setBounds(29, 227, 93, 34);
		jpnHSBA.add(jlbhuyetAp);
		
		jtfTN = new JTextField();
		jtfTN.setColumns(10);
		jtfTN.setBounds(174, 127, 215, 46);
		jpnHSBA.add(jtfTN);
		
		JLabel jlbthanNhiet = new JLabel("Thân Nhiệt");
		jlbthanNhiet.setHorizontalAlignment(SwingConstants.CENTER);
		jlbthanNhiet.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbthanNhiet.setBounds(29, 130, 93, 34);
		jpnHSBA.add(jlbthanNhiet);
		
		jtfCN = new JTextField();
		jtfCN.setColumns(10);
		jtfCN.setBounds(591, 224, 234, 46);
		jpnHSBA.add(jtfCN);
		
		JLabel jlbcanNang = new JLabel("Cân Nặng");
		jlbcanNang.setHorizontalAlignment(SwingConstants.CENTER);
		jlbcanNang.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbcanNang.setBounds(465, 227, 93, 34);
		jpnHSBA.add(jlbcanNang);
		
		jtfCC = new JTextField();
		jtfCC.setColumns(10);
		jtfCC.setBounds(591, 127, 234, 46);
		jpnHSBA.add(jtfCC);
		
		JLabel jlbchieuCao = new JLabel("Chiều Cao");
		jlbchieuCao.setHorizontalAlignment(SwingConstants.CENTER);
		jlbchieuCao.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbchieuCao.setBounds(465, 130, 93, 34);
		jpnHSBA.add(jlbchieuCao);
		
		jtfmaHS = new JTextField();
		jtfmaHS.setColumns(10);
		jtfmaHS.setBounds(174, 35, 215, 46);
		jpnHSBA.add(jtfmaHS);
		
		JLabel jlbmaHS = new JLabel("Mã Hồ Sơ");
		jlbmaHS.setHorizontalAlignment(SwingConstants.CENTER);
		jlbmaHS.setFont(new Font("Arial", Font.PLAIN, 18));
		jlbmaHS.setBounds(29, 38, 135, 34);
		jpnHSBA.add(jlbmaHS);
		
		JTextArea jtaCD = new JTextArea();
		jtaCD.setBounds(174, 422, 651, 107);
		jpnHSBA.add(jtaCD);
		
		jtfLK = new JTextField();
		jtfLK.setColumns(10);
		jtfLK.setBounds(591, 35, 234, 46);
		jpnHSBA.add(jtfLK);
		
		JLabel jlblanKham = new JLabel("Lần Khám");
		jlblanKham.setHorizontalAlignment(SwingConstants.CENTER);
		jlblanKham.setFont(new Font("Arial", Font.PLAIN, 18));
		jlblanKham.setBounds(465, 38, 93, 34);
		jpnHSBA.add(jlblanKham);
		
		JPanel jpnBS = new JPanel();
		jpnBS.setBackground(new Color(232, 252, 241));
		jpnBS.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u00E1c S\u0129", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpnBS.setBounds(945, 377, 417, 260);
		jpnRoot.add(jpnBS);
		jpnBS.setLayout(null);
		
		JLabel jlbtenBS = new JLabel("Tên Bác Sĩ : ");
		jlbtenBS.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbtenBS.setBounds(55, 74, 91, 31);
		jpnBS.add(jlbtenBS);
		
		jtftenBS = new JTextField();
		jtftenBS.setColumns(10);
		jtftenBS.setBounds(156, 74, 214, 31);
		jpnBS.add(jtftenBS);
		
		JLabel jlbKhoa = new JLabel("Khoa :");
		jlbKhoa.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbKhoa.setBounds(55, 125, 104, 31);
		jpnBS.add(jlbKhoa);
		
		jtfKhoa = new JTextField();
		jtfKhoa.setColumns(10);
		jtfKhoa.setBounds(156, 125, 214, 31);
		jpnBS.add(jtfKhoa);
		
		JLabel jlbSDT = new JLabel("Liên Hệ :");
		jlbSDT.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbSDT.setBounds(55, 176, 104, 31);
		jpnBS.add(jlbSDT);
		
		jtfsdtBS = new JTextField();
		jtfsdtBS.setColumns(10);
		jtfsdtBS.setBounds(156, 176, 214, 31);
		jpnBS.add(jtfsdtBS);
		
		JPanel jpnBN = new JPanel();
		jpnBN.setBackground(new Color(232, 252, 241));
		jpnBN.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "B\u1EC7nh Nh\u00E2n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpnBN.setBounds(945, 66, 417, 280);
		jpnRoot.add(jpnBN);
		jpnBN.setLayout(null);
		
		JLabel jlbImage = new JLabel("");
		jlbImage.setIcon(new ImageIcon(BenhAnJFrame.class.getResource("/Images/facebook-cap-nhat-avatar-doi-voi-tai-khoan-khong-su-dung-anh-dai-dien-e4abd14d (1).jpg")));
		jlbImage.setBounds(10, 47, 139, 194);
		jpnBN.add(jlbImage);
		
		JLabel jlbtenBN = new JLabel("Tên BN : ");
		jlbtenBN.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbtenBN.setBounds(147, 73, 82, 31);
		jpnBN.add(jlbtenBN);
		
		jtftenBN = new JTextField();
		jtftenBN.setBounds(239, 73, 158, 31);
		jpnBN.add(jtftenBN);
		jtftenBN.setColumns(10);
		
		JLabel jlbNS = new JLabel("Ngày Sinh :");
		jlbNS.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbNS.setBounds(147, 124, 82, 31);
		jpnBN.add(jlbNS);
		
		jtfNS = new JTextField();
		jtfNS.setColumns(10);
		jtfNS.setBounds(239, 124, 158, 31);
		jpnBN.add(jtfNS);
		
		JLabel jlbBHYT = new JLabel("BHYT");
		jlbBHYT.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbBHYT.setBounds(147, 175, 82, 31);
		jpnBN.add(jlbBHYT);
		
		jtfBHYT = new JTextField();
		jtfBHYT.setColumns(10);
		jtfBHYT.setBounds(239, 175, 158, 31);
		jpnBN.add(jtfBHYT);
		
		JLabel jlbmaBN = new JLabel("Mã BN : ");
		jlbmaBN.setFont(new Font("Arial", Font.PLAIN, 15));
		jlbmaBN.setBounds(10, 227, 57, 31);
		jpnBN.add(jlbmaBN);
		
		jtfmaBN = new JTextField();
		jtfmaBN.setColumns(10);
		jtfmaBN.setBounds(66, 228, 83, 31);
		jpnBN.add(jtfmaBN);
		
		JButton jbtSubmit = new JButton("Lưu Dữ Liệu");
		jbtSubmit.setBackground(new Color(76, 152, 77));
		jbtSubmit.setForeground(Color.WHITE);
		jbtSubmit.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtSubmit.setBounds(1174, 10, 184, 44);
		jpnRoot.add(jbtSubmit);
		
		JLabel jlbTB = new JLabel("");
		jlbTB.setForeground(Color.RED);
		jlbTB.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbTB.setBounds(32, 10, 417, 44);
		jpnRoot.add(jlbTB);
		BenhAnController controller = new BenhAnController(jbtSubmit, jtfmaHS, jtfLK, jtfTN, jtfHA, jtfMach, jtfCC, jtfCN, jtaCD, jtfmaBN, jtftenBN, jtfNS, jtfBHYT, jtftenBS, jtfKhoa, jtfsdtBS, jlbTB);
		
		JLabel jlbNote_2 = new JLabel("*");
		jlbNote_2.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote_2.setForeground(Color.RED);
		jlbNote_2.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote_2.setBounds(159, 237, 23, 24);
		jpnBN.add(jlbNote_2);
		
		JLabel jlbNote = new JLabel("*");
		jlbNote.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote.setForeground(Color.RED);
		jlbNote.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote.setBounds(397, 57, 23, 24);
		jpnHSBA.add(jlbNote);
		
		JLabel jlbNote_1 = new JLabel("*");
		jlbNote_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlbNote_1.setForeground(Color.RED);
		jlbNote_1.setFont(new Font("Arial", Font.PLAIN, 30));
		jlbNote_1.setBounds(837, 435, 23, 24);
		jpnHSBA.add(jlbNote_1);
		controller.setView(benhAn);
		controller.setEvent();
	}
}
