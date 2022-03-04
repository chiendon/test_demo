package demo.dc.app.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class WorksRequest {
	// Work name
	@NotNull(message="Properties isn't exist")
	@NotEmpty(message="Properties isn't value")
	@Size(min= 1, max = 250, message= "value is too long")
	private String workName;
	
	// Starting Date
	@NotNull(message="Properties isn't exist")
	@NotEmpty(message="Properties isn't value")
//	@Pattern(regexp = "^[0-9]*$", message="Value isn't Date type")
	private String startingDate;
	
	// Ending Date
	@NotNull(message="Properties isn't exist")
	@NotEmpty(message="Properties isn't value")
//	@Pattern(regexp = "^[0-9]*$", message="Value isn't Date type")
	private String endingDate;
	
	// status
	@NotNull(message="Properties isn't exist")
	private int status;
	
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
