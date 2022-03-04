package demo.dc.domain.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dc.app.model.WorkEditRequest;
import demo.dc.app.model.WorksRequest;
import demo.dc.app.model.WorksResponse;
import demo.dc.app.model.WorksSortingAndPagingOnePageReponse;
import demo.dc.app.model.WorksSortingAndPagingReponse;
import demo.dc.app.model.WorksSortingAndPagingRequest;
import demo.dc.common.Const;
import demo.dc.domain.entity.Works;
import demo.dc.domain.entity.WorksExample;
import demo.dc.domain.repository.WorksMapper;
import demo.dc.domain.service.WorksService;

@Service
public class WorksServiceImpl implements WorksService{
	@Autowired
	WorksMapper worksMapper;
	@Autowired
	WorksExample worksExample;

	SimpleDateFormat formatter;
	
	/**
	 * get work information service
	 * @param
	 * @return work list
	 */
	@Override
	public List<WorksResponse> getWorks() throws Exception{

		formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<WorksResponse> result = new ArrayList<WorksResponse>();
		worksExample.clear();

		// Query data
		try {
			List<Works> worksList = worksMapper.selectByExample(worksExample);
	
			// check data have exist?
			if(worksList == null) {
				return null;
			}

			// map to bean
			for(Works info : worksList) {
				WorksResponse work = new WorksResponse();
				work.setId(info.getId());
				work.setWorkName(info.getWorkName());
				work.setStartingDate(formatter.format(info.getStartingDate()));
				work.setEndingDate(formatter.format(info.getEndingDate()));
				
				// map status to 3 type
				switch (info.getStatus()) {
				case 0:
					work.setStatus(Const.PLANNING);
					break;
				case 1:
					work.setStatus(Const.DOING);
				    break;
				case 2:
					work.setStatus(Const.COMPLETE);
					break;
				}
				result.add(work);
			}
			return result;
		}
		catch(Exception e) {
			// throw if system have exception
			throw new Exception(e);
		}
	}
	
	/**
	 * add info information service
	 * @param workInfo
	 * @return work list
	 */
	@Override
	public int addWorks(WorksRequest workInfo) throws Exception{
		formatter = new SimpleDateFormat("dd/MM/yyyy");

		try {
			// map to Entity
			Works work = new Works();
			work.setWorkName(workInfo.getWorkName());
			work.setStartingDate(formatter.parse(workInfo.getStartingDate()));
			work.setEndingDate(formatter.parse(workInfo.getEndingDate()));
			work.setStatus(workInfo.getStatus());
			return worksMapper.insert(work);
		}
		catch(Exception e) {
			// throw if system have exception
			throw new Exception(e);
		}
	}

	/**
	 * edit info information service
	 * @param workInfo
	 * @param workCode
	 * @return work list
	 */
	@Override
	public int editWorks(WorkEditRequest workInfo, int workCode) throws Exception{
		formatter = new SimpleDateFormat("dd/MM/yyyy");

		try {
			// map to Entity
			Works work = new Works();
			work.setId(workCode);
			work.setWorkName(workInfo.getWorkName());
			if(workInfo.getStartingDate() != null) work.setStartingDate(formatter.parse(workInfo.getStartingDate()));
			if(workInfo.getEndingDate() != null) work.setEndingDate(formatter.parse(workInfo.getEndingDate()));
			work.setStatus(workInfo.getStatus());
			
			// Update db
			return worksMapper.updateByPrimaryKeySelective(work);
		}
		catch(Exception e) {
			// throw if system have exception
			throw new Exception(e);
		}
		
	}
	
	/**
	 * delete info information service
	 * @param workInfo
	 * @return work list
	 */
	@Override
	public int deleteWork(int workCode) throws Exception{
		formatter = new SimpleDateFormat("dd/MM/yyyy");

		try {
			return worksMapper.deleteByPrimaryKey(workCode);
		}
		catch(Exception e) {
			// throw if system have exception
			throw new Exception(e);
		}
		
	}
	
	/**
	 * get work information service
	 * @param
	 * @return work list
	 */
	@Override
	public WorksSortingAndPagingReponse getWorkSortPaging(WorksSortingAndPagingRequest info) throws Exception{

		formatter = new SimpleDateFormat("dd/MM/yyyy");
		WorksSortingAndPagingReponse result = new WorksSortingAndPagingReponse();
		List<WorksSortingAndPagingOnePageReponse> resultOnePageList = new ArrayList<WorksSortingAndPagingOnePageReponse>();
		worksExample.clear();

		// Query data
		try {
			List<Works> worksList = worksMapper.selectBySorting(info);
	
			// check data have exist?
			if(worksList == null) {
				return null;
			}
			int worksOnPage = info.getTotalONOnePage();
			
			//index of record current
			int idCuretnt = 0;
			
//			if(worksOnPage > worksList.size())
//				int maxWorks = worksList.size()
//			else
			
			double maxWorks = Math.ceil(worksList.size()/worksOnPage);
			
			for(int i = 0; i < maxWorks; i++) {
				
				WorksSortingAndPagingOnePageReponse resultOnePage = new WorksSortingAndPagingOnePageReponse();
				List<WorksResponse> worksResponseList = new ArrayList<WorksResponse>();
				
				resultOnePage.setNumberPage(i+1);
				
				//Map into 1 page
				for(int j = 0; j < worksOnPage; j++) {
					
					
					WorksResponse work = new WorksResponse();
					work.setId(worksList.get(idCuretnt).getId());
					work.setWorkName(worksList.get(idCuretnt).getWorkName());
					work.setStartingDate(formatter.format(worksList.get(idCuretnt).getStartingDate()));
					work.setEndingDate(formatter.format(worksList.get(idCuretnt).getEndingDate()));
					
					// map status to 3 type
					switch (worksList.get(idCuretnt).getStatus()) {
					case 0:
						work.setStatus(Const.PLANNING);
						break;
					case 1:
						work.setStatus(Const.DOING);
					    break;
					case 2:
						work.setStatus(Const.COMPLETE);
						break;
					}
					worksResponseList.add(work);
					idCuretnt++;
				}
				resultOnePage.setWorksOnePage(worksResponseList);
				resultOnePageList.add(resultOnePage);
			}
			
			//map into all page
			result.setAllWorks(resultOnePageList);
			return result;
		}
		catch(Exception e) {
			// throw if system have exception
			throw new Exception(e);
		}
	}

}
