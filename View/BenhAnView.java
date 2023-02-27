package View;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import Connect.BenhAnConnectImpl;
import Connect.BenhAnConnectInte;
import Controller.QLBenhAnController;
import Model.BenhAn;

import javax.swing.JButton;

public class BenhAnView extends JPanel {
	private JTextField jtfSearch;
	private JTextField jtfRemove;

	/**
	 * Create the panel.
	 */
	public BenhAnView() {
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
		jpnView.setBounds(0, 212, 1535, 506);
		jpnRoot.add(jpnView);
		
		jtfSearch = new JTextField();
		jtfSearch.setBounds(133, 60, 373, 60);
		jpnRoot.add(jtfSearch);
		jtfSearch.setColumns(10);
		
		JLabel jlbSearch = new JLabel("Tìm Kiếm");
		jlbSearch.setBackground(new Color(76, 152, 77));
		jlbSearch.setHorizontalAlignment(SwingConstants.TRAILING);
		jlbSearch.setFont(new Font("Arial", Font.PLAIN, 20));
		jlbSearch.setBounds(10, 56, 113, 60);
		jpnRoot.add(jlbSearch);
		
		QLBenhAnController controller = new QLBenhAnController(jpnView, jtfSearch);
		controller.setDatetoTable();
		
		JButton jbtAdd = new JButton("Thêm");
		jbtAdd.setForeground(Color.WHITE);
		jbtAdd.setBackground(new Color(76, 152, 77));
		jbtAdd.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtAdd.setBounds(1240, 56, 228, 60);
		jpnRoot.add(jbtAdd);
		
		jbtAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BenhAnJFrame frame = new BenhAnJFrame(new BenhAn());
				frame.setLocationRelativeTo(null);
				frame.setResizable(false);
				frame.setVisible(true);
			}
		});
		
		jtfRemove = new JTextField();
		jtfRemove.setColumns(10);
		jtfRemove.setBounds(854, 60, 277, 60);
		jpnRoot.add(jtfRemove);
		
		JButton jbtRemove = new JButton("Xoá theo Mã Hồ Sơ");
		jbtRemove.setForeground(Color.WHITE);
		jbtRemove.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtRemove.setBackground(new Color(76, 152, 77));
		jbtRemove.setBounds(616, 60, 228, 60);
		jpnRoot.add(jbtRemove);
		
		jbtRemove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StringBuilder sb = new StringBuilder();
				if(jtfRemove.getText().length() == 0 ) {
					sb.append("Nhập Mã Hồ Sơ!");
				}
				if(sb.length() > 0) {
					JOptionPane.showMessageDialog(jbtRemove, sb);
					return;
				}
				try {
					BenhAnConnectInte benhAnConnectInte = new BenhAnConnectImpl();
					benhAnConnectInte.delete(jtfRemove.getText());
					
					JOptionPane.showMessageDialog(jbtRemove, "Xóa thành công");
					jtfRemove.setText("");
					controller.setDatetoTable();
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(jbtRemove, "Erorr: " + e2.getMessage());
					e2.printStackTrace();
				}
			}
		});	
		JButton jbtRefresh = new JButton("Tải Lại");
		jbtRefresh.setForeground(Color.WHITE);
		jbtRefresh.setFont(new Font("Arial", Font.PLAIN, 20));
		jbtRefresh.setBackground(new Color(76, 152, 77));
		jbtRefresh.setBounds(1240, 130, 228, 60);
		jpnRoot.add(jbtRefresh);
		
		jbtRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.setDatetoTable();
				
				}
		});	
	}
}
