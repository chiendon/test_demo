package demo.dc.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dc.app.bean.WorksBean;
import demo.dc.domain.entity.Works;

@Service
public interface WorksService{
	/**
	 * get work information service
	 * @param
	 * @return work list
	 */
	public List<WorksBean> getWorks() throws Exception;
}
