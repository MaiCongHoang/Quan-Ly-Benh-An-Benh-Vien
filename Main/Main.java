package Main;
//import View.MainView;
import View.TaiKhoanJDialog;
public class Main {
	public static void main(String[] args) {
//		new MainView().setVisible(true);
		TaiKhoanJDialog dialog = new TaiKhoanJDialog(null,true);
		dialog.setTitle("Đăng Nhập");
		dialog.setResizable(false);
		dialog.setLocationRelativeTo(null);
		dialog.setVisible(true);
		
	}
}
