package Model;


public class BenhNhan {
	private String maBN;
	private String tenBN;
	private String ngaysinh;
	private Boolean gioitinh;
	private String CMT;
	private Boolean diungthuoc;
	private String SDT;
	private String BHYT;
	private String diachi;
	
	public BenhNhan() {
		super();
	}
	
	public BenhNhan(String maBN, String tenBN,
			String ngaysinh, Boolean gioitinh, String CMT,
			Boolean diungthuoc, String SDT, String BHYT, String diachi) {
		super();
		this.maBN = maBN;
		this.tenBN = tenBN;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.CMT = CMT;
		this.diungthuoc = diungthuoc;
		this.SDT = SDT;
		this.BHYT = BHYT;
		this.diachi = diachi;
	}
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	public String getTenBN() {
		return tenBN;
	}
	public void setTenBN(String tenBN) {
		this.tenBN = tenBN;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public Boolean getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getCMT() {
		return CMT;
	}
	public void setCMT(String cMT) {
		CMT = cMT;
	}
	public Boolean getDiungthuoc() {
		return diungthuoc;
	}
	public void setDiungthuoc(Boolean diungthuoc) {
		this.diungthuoc = diungthuoc;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getBHYT() {
		return BHYT;
	}
	public void setBHYT(String bHYT) {
		BHYT = bHYT;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	@Override
	public String toString() {
		return "BenhNhan [maBN=" + maBN + ", tenBN=" + tenBN +
				 ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + ", CMT=" + CMT + ", diungthuoc=" + diungthuoc + ", SDT=" + SDT + ", BHYT="
				+ BHYT + ", diachi=" + diachi + "]";
	}
}
	
