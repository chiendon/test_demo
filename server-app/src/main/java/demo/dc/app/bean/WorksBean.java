package demo.dc.app.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
//@Getter
//@Setter
public class WorksBean {
	// Work code
	private int id;
	// Work name
	private String workName;
	// Starting Date
	private String startingDate;
	// Ending Date
	private String endingDate;
	// status
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
