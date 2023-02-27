package Service;
import java.util.List;

import Model.BenhAn;

public interface BenhAnServiceInte {
	public List<BenhAn> getList();
	
	public int createOrUpdate(BenhAn benhAn);
}
