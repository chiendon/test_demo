package demo.dc.app.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
//@Getter
//@Setter
public class WorksResponse {
	// Work code
	private int id;
	// Work name
	private String workName;
	// Starting Date
	private String startingDate;
	// Ending Date
	private String endingDate;
	// Status
	private String status;
	

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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
