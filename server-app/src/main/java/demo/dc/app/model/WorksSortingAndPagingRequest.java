package demo.dc.app.model;

import org.springframework.stereotype.Component;

@Component
public class WorksSortingAndPagingRequest {

	// Work code. 0: Don't short, 1: sort from small to large, 2: sort from big to small
	private int idShort = 0;
	
	// Work name. 0: Don't short, 1: sort from small to large, 2: sort from big to smal
	private int workNameShort = 0;
	
	// Starting Date. 0: Don't short, 1: sort from small to large, 2: sort from big to smal
	private int startingDateShort = 0;
	
	// Ending Date 0: Don't short, 1: sort from small to large, 2: sort from big to smal
	private int endingDateShort = 0;
	
	// Status. 0: Don't short, 1: sort from small to large, 2: sort from big to smal
	private int statusShort = 0;
	
	// total works on 1 page
	private int totalONOnePage = 0;

	public int getIdShort() {
		return idShort;
	}

	public void setIdShort(int idShort) {
		this.idShort = idShort;
	}

	public int getWorkNameShort() {
		return workNameShort;
	}

	public void setWorkNameShort(int workNameShort) {
		this.workNameShort = workNameShort;
	}

	public int getStartingDateShort() {
		return startingDateShort;
	}

	public void setStartingDateShort(int startingDateShort) {
		this.startingDateShort = startingDateShort;
	}

	public int getEndingDateShort() {
		return endingDateShort;
	}

	public void setEndingDateShort(int endingDateShort) {
		this.endingDateShort = endingDateShort;
	}

	public int getStatusShort() {
		return statusShort;
	}

	public void setStatusShort(int statusShort) {
		this.statusShort = statusShort;
	}

	public int getTotalONOnePage() {
		return totalONOnePage;
	}

	public void setTotalONOnePage(int totalONOnePage) {
		this.totalONOnePage = totalONOnePage;
	}
}
