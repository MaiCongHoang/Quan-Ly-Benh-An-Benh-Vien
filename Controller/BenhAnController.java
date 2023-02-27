package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Model.BenhAn;
import Service.BenhAnServiceImpl;
import Service.BenhAnServiceInte;

public class BenhAnController {
	private JButton jbtSubmit;
	private JTextField jtfmaHS;
	private JTextField jtfLK;
	private JTextField jtfTN;
	private JTextField jtfHA;
	private JTextField jtfMach;
	private JTextField jtfCC;
	private JTextField jtfCN;
	private JTextArea jtaCD;
	private JTextField jtfmaBN;
	private JTextField jtftenBN;
	private JTextField jtfNS;
	private JTextField jtfBHYT;
	private JTextField jtftenBS;
	private JTextField jtfKhoa;
	private JTextField jtfsdtBS;
	private JLabel jlbTB;
	
	private BenhAn benhAn = null;
	
	private BenhAnServiceInte benhAnServiceInte = null;
		
		public BenhAnController(JButton jbtSubmit, JTextField jtfmaHS, JTextField jtfLK, JTextField jtfTN, JTextField jtfHA,
			JTextField jtfMach, JTextField jtfCC, JTextField jtfCN, JTextArea jtaCD, JTextField jtfmaBN,
			JTextField jtftenBN, JTextField jtfNS, JTextField jtfBHYT, JTextField jtftenBS, JTextField jtfKhoa,
			JTextField jtfsdtBS, JLabel jlbTB) {
		super();
		this.jbtSubmit = jbtSubmit;
		this.jtfmaHS = jtfmaHS;
		this.jtfLK = jtfLK;
		this.jtfTN = jtfTN;
		this.jtfHA = jtfHA;
		this.jtfMach = jtfMach;
		this.jtfCC = jtfCC;
		this.jtfCN = jtfCN;
		this.jtaCD = jtaCD;
		this.jtfmaBN = jtfmaBN;
		this.jtftenBN = jtftenBN;
		this.jtfNS = jtfNS;
		this.jtfBHYT = jtfBHYT;
		this.jtftenBS = jtftenBS;
		this.jtfKhoa = jtfKhoa;
		this.jtfsdtBS = jtfsdtBS;
		this.jlbTB = jlbTB;
		
		this.benhAnServiceInte = new BenhAnServiceImpl();	
		}

	public void setView(BenhAn benhAn) {
		this.benhAn = benhAn;
		jtfmaHS.setText(benhAn.getMaHS());
		jtfLK.setText(benhAn.getLankham());
		jtfTN.setText(benhAn.getThannhiet());
		jtfHA.setText(benhAn.getHuyetap());
		jtfMach.setText(benhAn.getMach());
		jtfCC.setText(benhAn.getChieucao());
		jtfCN.setText(benhAn.getCannang());
		jtaCD.setText(benhAn.getChandoan());
		jtfmaBN.setText(benhAn.getMaBN());
		jtftenBN.setText(benhAn.getTenBN());
		jtfNS.setText(benhAn.getNgaysinh());
		jtfBHYT.setText(benhAn.getBHYT());
		jtftenBS.setText(benhAn.getTenBS());
		jtfKhoa.setText(benhAn.getKhoa());
		jtfsdtBS.setText(benhAn.getSdtBS());
	}
	public void setEvent() {
		jbtSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (jtfmaHS.getText().length() == 0 || jtfmaBN.getText().length() == 0 || jtaCD.getText().length() == 0) {
					jlbTB.setText("Vui Lòng Nhập Dữ Liệu Cần Thiết!");
				} else {
					benhAn.setMaHS(jtfmaHS.getText());
					benhAn.setLankham(jtfLK.getText());
					benhAn.setThannhiet(jtfTN.getText());
					benhAn.setHuyetap(jtfHA.getText());
					benhAn.setMach(jtfMach.getText());
					benhAn.setChieucao(jtfCC.getText());
					benhAn.setCannang(jtfCN.getText());
					benhAn.setChandoan(jtaCD.getText());
					benhAn.setMaBN(jtfmaBN.getText());
					benhAn.setTenBN(jtftenBN.getText());
					benhAn.setNgaysinh(jtfNS.getText());
					benhAn.setBHYT(jtfBHYT.getText());
					benhAn.setTenBS(jtftenBS.getText());
					benhAn.setKhoa(jtfKhoa.getText());
					benhAn.setSdtBS(jtfsdtBS.getText());
					benhAnServiceInte.createOrUpdate(benhAn);
					jlbTB.setText("Cập Nhật Dữ Liệu Thành Công!");
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
