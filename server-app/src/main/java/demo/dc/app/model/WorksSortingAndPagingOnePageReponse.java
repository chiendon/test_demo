package demo.dc.app.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class WorksSortingAndPagingOnePageReponse {
	
	// what page number?
	private int numberPage;
	
	// list works information
	private List<WorksResponse> WorksOnePage;

	public int getNumberPage() {
		return numberPage;
	}

	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	public List<WorksResponse> getWorksOnePage() {
		return WorksOnePage;
	}

	public void setWorksOnePage(List<WorksResponse> worksOnePage) {
		WorksOnePage = worksOnePage;
	}
}
