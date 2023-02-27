package Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.XuLyPanel;
import View.BenhAnView;
import View.BenhNhanView;
import View.TrangChuView;

public class ChuyenManHinhController {
	private JPanel root;
	private String kindSelected = "";
	private List<XuLyPanel> listItem = null ;
	
	public ChuyenManHinhController(JPanel jpnRoot) {
		this.root = jpnRoot;
	}
	public void setView(JPanel jpnItem, JLabel jlbItem) {
		kindSelected = "TrangChu";
		jpnItem.setBackground(new Color(76,132,10));
		jlbItem.setBackground(new Color(76,132,10));
		root.removeAll();
		root.setLayout(new BorderLayout());
		root.add(new TrangChuView());
		root.validate();
		root.repaint();
	}
	public void setEvent (List<XuLyPanel> listItem) {
		this.listItem = listItem  ;
		for(XuLyPanel item: listItem) {
			item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
		}
	}
	public class LabelEvent implements MouseListener {
		private JPanel node;
		
		private String kind;
		private JPanel jpnItem;
		private JLabel jlbItem;
		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			super();
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			switch(kind) {
			case "TrangChu" : 
				node = new TrangChuView();
				break;
			case "BenhNhan" :
				node = new BenhNhanView();
				break;
			case "BenhAn" :
				node = new BenhAnView();
				break;
			default :
//				node = new TrangChuView();
				break;
			}
			root.removeAll();
			root.setLayout(new BorderLayout());
			root.add(node);
			root.validate();
			root.repaint();
			setChangeBackground(kind);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			kindSelected = kind;
			jpnItem.setBackground(new Color(76,132,10));
			jlbItem.setBackground(new Color(76,132,10));
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			jpnItem.setBackground(new Color(76,132,10));
			jlbItem.setBackground(new Color(76,132,10));
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if(!kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(76,152,77));
				jlbItem.setBackground(new Color(76,152,77));
			}
			
		}
		
	}
	private void setChangeBackground(String kind) {
		for (XuLyPanel item : listItem ) {
			if (item.getKind().equalsIgnoreCase(kind)) {
				item.getJpn().setBackground(new Color(76,132,10));
				item.getJlb().setBackground(new Color(76,132,10));
			}
			else {
				item.getJpn().setBackground(new Color(76,152,77));
				item.getJlb().setBackground(new Color(76,152,77));
			}
		}
	}
}
