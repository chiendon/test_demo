package demo.dc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.dc.app.bean.WorksBean;
import demo.dc.domain.service.WorksService;

@RestController
public class WorksController {
	@Autowired
	WorksService worksService;
	
	/**
	 * Get work list information
	 * 
	 * @param 
	 * @return list information
	 */
	@RequestMapping(value = "/api/work", method = RequestMethod.GET)
	public ResponseEntity<Object> getProduct(){
		
		try {
			// Call service
			List<WorksBean> res = worksService.getWorks();
			
			if(res == null) {
				return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Object>(res, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
