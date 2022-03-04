package demo.dc.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dc.app.model.WorksRequest;
import demo.dc.app.model.WorksResponse;

@Service
public interface WorksService{
	/**
	 * get work informations service
	 * @param
	 * @return work list
	 */
	public List<WorksResponse> getWorks() throws Exception;
	
	/**
	 * add info information service
	 * @param
	 * @return work list
	 */
	public int addWorks(WorksRequest workInfo) throws Exception;
}
