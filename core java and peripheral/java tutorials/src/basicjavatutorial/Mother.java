package basicjavatutorial;

import java.util.List;

public class Mother {
	 public int motherId;
	 public List<Childd> childList;

	 /**
	  * @return the motherId
	  */
	 public int getMotherId() {
	 	return motherId;
	 }

	 /**
	  * @param motherId the motherId to set
	  */
	 public void setMotherId(int motherId) {
	 	this.motherId = motherId;
	 }

	/**
	 * @return the childList
	 */
	public List<Childd> getChildList() {
		return childList;
	}

	/**
	 * @param childList the childList to set
	 */
	public void setChildList(List<Childd> childList) {
		this.childList = childList;
	}


	  
}
