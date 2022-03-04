package demo.dc.app.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WorksSortingAndPagingReponse {
	
	// All work is fetched
	private List<WorksSortingAndPagingOnePageReponse> AllWorks;

	public List<WorksSortingAndPagingOnePageReponse> getAllWorks() {
		return AllWorks;
	}

	public void setAllWorks(List<WorksSortingAndPagingOnePageReponse> allWorks) {
		AllWorks = allWorks;
	}
}
