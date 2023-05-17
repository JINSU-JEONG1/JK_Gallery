package com.gttn.jkGallery.common.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.gttn.jkGallery.common.enumeration.ApiResultError;

/**
 * 
 * <p>API 리턴 DTO</p> 
 *
 * @author Jinsu Jeong 
 *
 */
public class ApiResult extends HashMap<String, Object>{

	private static final long serialVersionUID = 5040586336975987989L;
	
	public static final String AR_KEY_RESULT_CODE = "resultCode";
	public static final String AR_KEY_RESULT_MSG = "resultFailMessage";
	public static final String AR_KEY_RESULT_DATA = "resultData";
	public static final String AR_KEY_PAGEINFO = "pageInfo";
	public static final String AR_KEY_LIST = "list";
	public static final String AR_KEY_SC = "sc";
	
	public ApiResult() {
		this.set(ApiResultError.ERROR_DEFAULT);		
	}
	
	public ApiResult(ApiResultError err) {
		this.set(err);
	}
	
	public ApiResult(Map<String, Object> map) {
		super(map);		
	}
	
	public ApiResult set(ApiResultError err) {
		return set(err, null);
	}
	
	public ApiResult set(ApiResultError err, String appendMessage) {
		put(AR_KEY_RESULT_CODE, err.getCode()); 
		
		String msg = err.getMessage();
		if(StringUtils.hasText(appendMessage)) {
			msg = String.format("%s\n%s", msg, appendMessage);
		}
    	put(AR_KEY_RESULT_MSG, msg);  
		return this;
	}
	
	public ApiResult put(String key, Object value) {
		super.put(key, value);
		return this;
	}
	
	public ApiResult setResultData(@SuppressWarnings("rawtypes") Map map) {
		super.put(AR_KEY_RESULT_DATA, map);
		return this; 
	}	
	
	public Object getResultData() {
		return (Object)super.get(AR_KEY_RESULT_DATA);
	}
	
	public String getResultMessage() {
		String msg = (String)super.get(AR_KEY_RESULT_MSG);
		if(StringUtils.hasText(msg)) {
			return msg;
		}
		
		return (String)super.get("resultMsg");
	}
	
	public ApiResult setResultMessage(String message) {
		super.put(AR_KEY_RESULT_MSG, message);
		return this; 
	}
	
	public String getResultCode() {
		return (String)super.get(AR_KEY_RESULT_CODE);
	}
	
	public Object getList() {
		return super.get(AR_KEY_LIST);
	}
	
	@SuppressWarnings("unchecked")
	public ApiResult setArray(Object[] array) {
		Map<String, Object> map = new HashMap<String, Object>();
				
		if(super.get(AR_KEY_RESULT_DATA) != null) {
			map = (HashMap<String, Object>) super.get(AR_KEY_RESULT_DATA);
		}
		map.put(AR_KEY_LIST, array);
		
		super.put(AR_KEY_RESULT_DATA, map);
		return this; 
	}
	
	@SuppressWarnings("unchecked")
	public ApiResult setList(@SuppressWarnings("rawtypes") List list) {
		Map<String, Object> map = new HashMap<String, Object>();
				
		if(super.get(AR_KEY_RESULT_DATA) != null) {
			map = (HashMap<String, Object>) super.get(AR_KEY_RESULT_DATA);
		}
		map.put(AR_KEY_LIST, list);
		
		super.put(AR_KEY_RESULT_DATA, map);
		return this; 
	}	
	
	public PageInfo getPageInfo() {
		return (PageInfo)super.get(AR_KEY_PAGEINFO);
	}
	
	@SuppressWarnings("unchecked")
	public ApiResult setPageInfo(PageInfo pi) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(super.get(AR_KEY_RESULT_DATA) != null) {
			map = (HashMap<String, Object>) super.get(AR_KEY_RESULT_DATA);
		}
		map.put(AR_KEY_PAGEINFO, pi);
		
		super.put(AR_KEY_RESULT_DATA, map);
		return this; 
	}
	
	@SuppressWarnings("unchecked")
	public ApiResult setSc(Object searchCondition) {
		Map<String, Object> map = new HashMap<String, Object>();
		if(super.get(AR_KEY_RESULT_DATA) != null) {
			map = (HashMap<String, Object>) super.get(AR_KEY_RESULT_DATA);
		}
		
		map.put(AR_KEY_SC, searchCondition);
		super.put(AR_KEY_RESULT_DATA, map);
		return this; 
	}
	
	public Object getSc() {
		return super.get(AR_KEY_SC);
	}
	

}
