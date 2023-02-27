package Utility;

import Model.BenhAn;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClassTableModelBenhAn {
	public DefaultTableModel setTableBenhAn(List<BenhAn> listItem, String[] listColumn) {
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
				BenhAn benhAn = listItem.get(i);
				obj = new Object[columns];
				obj[0] = (i+1);
				obj[1] = benhAn.getMaHS();
				obj[2] = benhAn.getMaBN();
				obj[3] = benhAn.getTenBN();
				obj[4] = benhAn.getNgaysinh();
				obj[5] = benhAn.getBHYT();
				obj[6] = benhAn.getTenBS();
				obj[7] = benhAn.getKhoa();
				obj[8] = benhAn.getSdtBS();
				obj[9] = benhAn.getLankham();
				obj[10] = benhAn.getThannhiet();
				obj[11] = benhAn.getHuyetap();
				obj[12] = benhAn.getMach();
				obj[13] = benhAn.getChieucao();
				obj[14] = benhAn.getCannang();
				obj[15] = benhAn.getChandoan();
				dtm.addRow(obj);
			}
		}
		return dtm;
		
	}
}
