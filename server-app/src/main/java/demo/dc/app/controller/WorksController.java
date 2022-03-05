package demo.dc.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.dc.app.model.WorkEditRequest;
import demo.dc.app.model.WorksRequest;
import demo.dc.app.model.WorksResponse;
import demo.dc.app.model.WorksSortingAndPagingReponse;
import demo.dc.app.model.WorksSortingAndPagingRequest;
import demo.dc.common.CommonHTTPBodyMessage;
import demo.dc.domain.service.WorksService;

@RestController
public class WorksController {
	@Autowired
	WorksService worksService;
	
	/**
	 * Get work list information
	 * 
	 * @param 
	 * @return HTTP response
	 */
	@RequestMapping(value = "/api/work", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Object> getWorks(){
		
		try {
			// Call service
			List<WorksResponse> res = worksService.getWorks();
			
			if(res == null) {
				return new ResponseEntity<Object>(Collections.singletonMap("message", CommonHTTPBodyMessage.MSG_NOT_FOUND), HttpStatus.OK);
			}
			return new ResponseEntity<Object>(res, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Add work information
	 * 
	 * @param WorksRequest model
	 * @return HTTP response
	 */
	@PostMapping(
			value = "/api/work/add", 
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> addWork(@RequestBody @Validated WorksRequest worksRequest){
		
		try {
			// Call service
			int res = worksService.addWorks(worksRequest);
			
			if(res == 0) {
				return new ResponseEntity<Object>(Collections.singletonMap("message", CommonHTTPBodyMessage.MSG_NOT_INSRERT), HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * Edit work information
	 * 
	 * @param model
	 * @param work code
	 * @return HTTP response
	 */
	@PostMapping(
			value = "/api/work/edit/{id}", 
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> editWork(@RequestBody @Validated WorkEditRequest worksRequest, @PathVariable("id") int id){
		
		try {
			// Call service
			int res = worksService.editWorks(worksRequest, id);
			
			if(res == 0) {
				return new ResponseEntity<Object>(Collections.singletonMap("message", CommonHTTPBodyMessage.MSG_NOT_UPDATE), HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Edit work information
	 * 
	 * @param model
	 * @param work code
	 * @return HTTP response
	 */
	@PostMapping(
			value = "/api/work/delete", 
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> deleteWork(@RequestBody @Validated WorkEditRequest worksRequest){
		
		try {
			// Call service
			int res = worksService.deleteWork(worksRequest.getId());
			
			if(res != 1) {
				return new ResponseEntity<Object>(Collections.singletonMap("message", CommonHTTPBodyMessage.MSG_NOT_FOUND), HttpStatus.OK);
			}
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * Edit work information
	 * 
	 * @param model
	 * @param work code
	 * @return HTTP response
	 */
	@PostMapping(
			value = "/api/work/sortpage", 
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> fecthWorkSortPaging(@RequestBody @Validated WorksSortingAndPagingRequest worksRequest){
		
		try {
			// Call service
			WorksSortingAndPagingReponse res = worksService.getWorkSortPaging(worksRequest);
			
			if(res == null) {
				return new ResponseEntity<Object>(Collections.singletonMap("message", CommonHTTPBodyMessage.MSG_NOT_FOUND), HttpStatus.OK);
			}
			return new ResponseEntity<Object>(res, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
}
