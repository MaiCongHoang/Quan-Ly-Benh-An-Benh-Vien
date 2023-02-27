package Model;


public class BenhAn {
	private String maHS;
	private String lankham;
	private String thannhiet;
	private String huyetap;
	private String mach;
	private String chieucao;
	private String cannang;
	private String chandoan;
	private String maBN;
	private String tenBN;
	private String ngaysinh;
	private String BHYT;
	private String tenBS;
	private String khoa;
	private String sdtBS;
	
	
	public BenhAn() {
		super();
	}

	public BenhAn(String maHS, String lankham, String thannhiet, String huyetap, String mach, String chieucao,
			String cannang, String chandoan, String maBN, String tenBN, String ngaysinh, String bHYT, String tenBS,
			String khoa, String sdtBS) {
		super();
		this.maHS = maHS;
		this.lankham = lankham;
		this.thannhiet = thannhiet;
		this.huyetap = huyetap;
		this.mach = mach;
		this.chieucao = chieucao;
		this.cannang = cannang;
		this.chandoan = chandoan;
		this.maBN = maBN;
		this.tenBN = tenBN;
		this.ngaysinh = ngaysinh;
		BHYT = bHYT;
		this.tenBS = tenBS;
		this.khoa = khoa;
		this.sdtBS = sdtBS;
	}

	public String getMaHS() {
		return maHS;
	}

	public void setMaHS(String maHS) {
		this.maHS = maHS;
	}

	public String getLankham() {
		return lankham;
	}

	public void setLankham(String lankham) {
		this.lankham = lankham;
	}

	public String getThannhiet() {
		return thannhiet;
	}

	public void setThannhiet(String thannhiet) {
		this.thannhiet = thannhiet;
	}

	public String getHuyetap() {
		return huyetap;
	}

	public void setHuyetap(String huyetap) {
		this.huyetap = huyetap;
	}

	public String getMach() {
		return mach;
	}

	public void setMach(String mach) {
		this.mach = mach;
	}

	public String getChieucao() {
		return chieucao;
	}

	public void setChieucao(String chieucao) {
		this.chieucao = chieucao;
	}

	public String getCannang() {
		return cannang;
	}

	public void setCannang(String cannang) {
		this.cannang = cannang;
	}

	public String getChandoan() {
		return chandoan;
	}

	public void setChandoan(String chandoan) {
		this.chandoan = chandoan;
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

	public String getBHYT() {
		return BHYT;
	}

	public void setBHYT(String bHYT) {
		BHYT = bHYT;
	}

	public String getTenBS() {
		return tenBS;
	}

	public void setTenBS(String tenBS) {
		this.tenBS = tenBS;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getSdtBS() {
		return sdtBS;
	}

	public void setSdtBS(String sdtBS) {
		this.sdtBS = sdtBS;
	}

	@Override
	public String toString() {
		return "BenhAn [maHS=" + maHS + ", lankham=" + lankham + ", thannhiet=" + thannhiet + ", huyetap=" + huyetap
				+ ", mach=" + mach + ", chieucao=" + chieucao + ", cannang=" + cannang + ", chandoan=" + chandoan
				+ ", maBN=" + maBN + ", tenBN=" + tenBN + ", ngaysinh=" + ngaysinh + ", BHYT=" + BHYT + ", tenBS="
				+ tenBS + ", khoa=" + khoa + ", sdtBS=" + sdtBS + "]";
	}
}
