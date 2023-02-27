package Controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Model.BenhAn;
import Service.BenhAnServiceInte;
import Utility.ClassTableModelBenhAn;
import View.BenhAnJFrame;
import Service.BenhAnServiceImpl;

public class QLBenhAnController {
	private JPanel jpnView;
	private JTextField jtfSearch;	
	
	private BenhAnServiceInte benhAnServiceInte = null;
	
	private String[] listColumn = {"STT", "Mã Hồ Sơ", "Mã Bệnh Nhân", "Tên Bệnh Nhân", "Ngày Sinh", "BHYT", "Tên Bác Sĩ", "Khoa", "Liên Hệ",
			"Lần Khám", "Thân Nhiệt", "Huyết Áp", "Mạch", "Chiều Cao", "Cân Nặng", "Chẩn Đoán",
			};
	
	private TableRowSorter<TableModel> rowSorter = null;
	
	public QLBenhAnController(JPanel jpnView, JTextField jtfSearch) {
		super();
		this.jpnView = jpnView;
		this.jtfSearch = jtfSearch;
		
		this.benhAnServiceInte = new BenhAnServiceImpl();
	}
	
	public void setDatetoTable() {
		List<BenhAn> listItem = benhAnServiceInte.getList();
		DefaultTableModel model = new ClassTableModelBenhAn().setTableBenhAn(listItem, listColumn);
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
					
					BenhAn benhAn = new BenhAn();
					benhAn.setMaHS(model.getValueAt(selectedRowIndex, 1).toString());
					benhAn.setMaBN(model.getValueAt(selectedRowIndex, 2).toString());
					benhAn.setTenBN(model.getValueAt(selectedRowIndex, 3).toString());
					benhAn.setNgaysinh(model.getValueAt(selectedRowIndex, 4).toString());
					benhAn.setBHYT(model.getValueAt(selectedRowIndex, 5).toString());
					benhAn.setTenBS(model.getValueAt(selectedRowIndex, 6).toString());
					benhAn.setKhoa(model.getValueAt(selectedRowIndex, 7).toString());
					benhAn.setSdtBS(model.getValueAt(selectedRowIndex, 8).toString());
					benhAn.setLankham(model.getValueAt(selectedRowIndex, 9).toString());
					benhAn.setThannhiet(model.getValueAt(selectedRowIndex, 10).toString());
					benhAn.setHuyetap(model.getValueAt(selectedRowIndex, 11).toString());
					benhAn.setMach(model.getValueAt(selectedRowIndex, 12).toString());
					benhAn.setChieucao(model.getValueAt(selectedRowIndex, 13).toString());
					benhAn.setCannang(model.getValueAt(selectedRowIndex, 14).toString());
					benhAn.setChandoan(model.getValueAt(selectedRowIndex, 15).toString());				
					BenhAnJFrame frame = new BenhAnJFrame(benhAn);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
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


