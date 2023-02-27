package Utility;

import Model.BenhNhan;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClassTableModelBenhNhan {
	public DefaultTableModel setTableBenhNhan(List<BenhNhan> listItem, String[] listColumn) {
		DefaultTableModel dtm = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		dtm.setColumnIdentifiers(listColumn);
		int columns = listColumn.length;
		Object[] obj = null;
		int rows = listItem.size();
		if (rows>0) {
			for (int i=0; i<rows; i++)
			{
				BenhNhan benhNhan = listItem.get(i);
				obj = new Object[columns];
				obj[0] = (i+1);
				obj[1] = benhNhan.getMaBN();
				obj[2] = benhNhan.getTenBN();
				obj[3] = benhNhan.getGioitinh() == true ? "Nam" : "Nữ"; 
				obj[4] = benhNhan.getNgaysinh();
				obj[5] = benhNhan.getCMT();
				obj[6] = benhNhan.getSDT();
				obj[7] = benhNhan.getBHYT();
				obj[8] = benhNhan.getDiachi();
				obj[9] = benhNhan.getDiungthuoc() == true ? "Có" : "Không";
				dtm.addRow(obj);
			}
		}
		return dtm;
		
	}
}
