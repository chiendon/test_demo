package demo.dc.domain.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dc.app.bean.WorksBean;
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
	public List<WorksBean> getWorks() throws Exception{

		formatter = new SimpleDateFormat("dd/MM/yyyy");
		List<WorksBean> result = new ArrayList<WorksBean>();
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
				WorksBean work = new WorksBean();
				work.setId(info.getId());
				work.setWorkName(info.getWorkName());
				work.setStartingDate(formatter.format(info.getStartingDate()));
				work.setEndingDate(formatter.format(info.getEndingDate()));
				work.setStatus(info.getStatus());
				result.add(work);
			}
			return result;
		}
		catch(Exception e) {
			throw new Exception(e);
		}
	}

}
