package Controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Model.BenhNhan;
import Service.BenhNhanServiceInte;
import Utility.ClassTableModelBenhNhan;
import Service.BenhNhanServiceImpl;

public class QLBenhNhanController {
	private JPanel jpnView;
	private JTextField jtfSearch;
	
	private JTextField jtfmaBN;
	private JTextField jtftenBN;
	private JTextField jtfNS;
	private JTextField jtfCMT;
	private JTextField jtfSDT;
	private JTextField jtfBHYT;
	private JTextField jtfDC;
	private JRadioButton jrbNam;
	private JRadioButton jrbNu;
	private JRadioButton jrbCo;
	private JRadioButton jrbKhong;
	
	private BenhNhanServiceInte benhNhanServiceInte = null;
	
	
	private String[] listColumn = {"STT", "Mã bệnh nhân", "Họ Tên", "Giới Tính", "Ngày Sinh", "CMND/CCCD", "SDT","BHYT","Địa Chỉ", "Dị Ứng Thuốc"};
	
	private TableRowSorter<TableModel> rowSorter = null;
		
	public QLBenhNhanController(JPanel jpnView, JTextField jtfSearch, JTextField jtfmaBN, JTextField jtftenBN, JTextField jtfNS, JTextField jtfCMT,
			JTextField jtfSDT, JTextField jtfBHYT, JTextField jtfDC, JRadioButton jrbNam, JRadioButton jrbNu,
			JRadioButton jrbCo, JRadioButton jrbKhong) {
		super();
		this.jpnView = jpnView;
		this.jtfSearch = jtfSearch;
		this.jtfmaBN = jtfmaBN;
		this.jtftenBN = jtftenBN;
		this.jtfNS = jtfNS;
		this.jtfCMT = jtfCMT;
		this.jtfSDT = jtfSDT;
		this.jtfBHYT = jtfBHYT;
		this.jtfDC = jtfDC;
		this.jrbNam = jrbNam;
		this.jrbNu = jrbNu;
		this.jrbCo = jrbCo;
		this.jrbKhong = jrbKhong;
		
		this.benhNhanServiceInte = new BenhNhanServiceImpl();
		
	}

	public void setDatetoTable() {
		List<BenhNhan> listItem = benhNhanServiceInte.getList();
		DefaultTableModel model = new ClassTableModelBenhNhan().setTableBenhNhan(listItem, listColumn);
		JTable table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if(text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				}
				else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text ));
				}
				
			}
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if(text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				}
				else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text ));
				}
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2 && table.getSelectedRow() !=-1) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int selectedRowIndex = table.getSelectedRow();
					selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
					
					BenhNhan benhNhan = new BenhNhan();
					benhNhan.setMaBN(model.getValueAt(selectedRowIndex, 1).toString());
					benhNhan.setTenBN(model.getValueAt(selectedRowIndex, 2).toString());
					benhNhan.setGioitinh(model.getValueAt(selectedRowIndex, 3).toString().equalsIgnoreCase("Nam"));
					benhNhan.setNgaysinh(model.getValueAt(selectedRowIndex, 4).toString());
					benhNhan.setCMT(model.getValueAt(selectedRowIndex, 5).toString());
					benhNhan.setSDT(model.getValueAt(selectedRowIndex, 6).toString());
					benhNhan.setBHYT(model.getValueAt(selectedRowIndex, 7).toString());
					benhNhan.setDiachi(model.getValueAt(selectedRowIndex, 8).toString());
					benhNhan.setDiungthuoc(model.getValueAt(selectedRowIndex, 9).toString().equalsIgnoreCase("Có"));
					
					jtfmaBN.setText(benhNhan.getMaBN());
					jtftenBN.setText(benhNhan.getTenBN());
					if (benhNhan.getGioitinh() ) {
						jrbNam.setSelected(true);
						jrbNu.setSelected(false);
					} else {
						jrbNam.setSelected(false);
						jrbNu.setSelected(true);
					}
					jtfNS.setText(benhNhan.getNgaysinh());
					if (benhNhan.getDiungthuoc() ) {
						jrbCo.setSelected(true);
						jrbKhong.setSelected(false);
					} else {
						jrbCo.setSelected(false);
						jrbKhong.setSelected(true);
					}
					jtfCMT.setText(benhNhan.getCMT());
					jtfSDT.setText(benhNhan.getSDT());
					jtfBHYT.setText(benhNhan.getBHYT());
					jtfDC.setText(benhNhan.getDiachi());
					jtfmaBN.setEnabled(false);
				}
			}
		});
		table.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.getViewport().add(table);
		scrollPane.setPreferredSize(new Dimension(1300,400));
		
		jpnView.removeAll();
		jpnView.setLayout(new BorderLayout());
		jpnView.add(scrollPane);
		jpnView.validate();
		jpnView.repaint();
	}
}
