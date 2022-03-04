package demo.dc.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dc.app.model.WorkEditRequest;
import demo.dc.app.model.WorksRequest;
import demo.dc.app.model.WorksResponse;
import demo.dc.app.model.WorksSortingAndPagingReponse;
import demo.dc.app.model.WorksSortingAndPagingRequest;

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
	 * @param workInfo
	 * @return work list
	 */
	public int addWorks(WorksRequest workInfo) throws Exception;

	/**
	 * edit info information service
	 * @param workInfo
	 * @param workCode
	 * @return work list
	 */
	public int editWorks(WorkEditRequest workInfo, int workCode) throws Exception;
	
	/**
	 * delete info information service
	 * @param workInfo
	 * @return work list
	 */
	public int deleteWork(int workCode) throws Exception;
	
	/**
	 * fetch work with sorting and paging
	 * @param workInfo
	 * @return work list
	 */
	public WorksSortingAndPagingReponse getWorkSortPaging(WorksSortingAndPagingRequest info) throws Exception;
}
