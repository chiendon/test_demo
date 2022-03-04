package demo.dc.app.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class WorkEditRequest {
	// Work code
	private int id;
	
	// Work name
	@Size(min= 1, max = 250, message= "value is too long")
	private String workName;
	
	// Starting Date
//	@Pattern(regexp = "^[0-9]*$", message="Value isn't Date type")
	private String startingDate;
	
	// Ending Date
//	@Pattern(regexp = "^[0-9]*$", message="Value isn't Date type")
	private String endingDate;
	
	// status
//	@Pattern(regexp = "^[0-9]*$", message="Value isn't Decimal type")
	private int status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getWorkName() {
		return workName;
	}
	
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	
	public String getStartingDate() {
		return startingDate;
	}
	
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	
	public String getEndingDate() {
		return endingDate;
	}
	
	public void setEndingDate(String endingDate) {
		this.endingDate = endingDate;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
