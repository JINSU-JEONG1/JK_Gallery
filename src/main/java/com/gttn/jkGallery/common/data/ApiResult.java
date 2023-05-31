package com.gttn.jkGallery.common.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.gttn.jkGallery.common.enumeration.ApiResultError;

/**
 * 
 * <p>API 리턴 DTO</p> 
 *
 * @author $ 0 ? H ! $ +
 *
 */
public class ApiResult extends HashMap<String, Object>{

	private static final long serialVersionUID = 5040586336975987989L;
	
	public static final String AR_KEY_RESULT_CODE = "resultCode";
	public static final String AR_KEY_RESULT_MSG = "resultFailMessage";
	public static final String AR_KEY_RESULT_DATA = "resultData";
	public static final String AR_KEY_PAGEINFO = "pageInfo";
	public static final String AR_KEY_SC = "sc";
	
	
	
	public ApiResult() {
		this.set(ApiResultError.ERROR_DEFAULT);
	}
	public ApiResult(@SuppressWarnings("rawtypes") Map map) {
		super(map);
	}
	public ApiResult(ApiResultError err) {
		this.set(err);
	}
	
	
		
	public Object getResultData() {
		return (Object)super.get(AR_KEY_RESULT_DATA);
	}

	
	
	// ResultData 데이터 추가, 삭제 method
	@SuppressWarnings("unchecked")
	public ApiResult addResultData(String str, Object obj) {

		// Create "resultData"'s space
		if(super.get(AR_KEY_RESULT_DATA) == null) {
			super.put(AR_KEY_RESULT_DATA, new HashMap<String, Object>());
		}
			
			
		(  (Map<String, Object>) super.get(AR_KEY_RESULT_DATA)  ).put(str, obj);
		
		return this;
	}
	@SuppressWarnings("unchecked")
	public ApiResult delResultData(String str) {
		
		if(super.get(AR_KEY_RESULT_DATA) != null){
			if(	
				(  (Map<String, Object>) super.get(AR_KEY_RESULT_DATA)  ).get(str) != null
			)
				(  (Map<String, Object>) super.get(AR_KEY_RESULT_DATA)  ).remove(str);
		}
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public ApiResult put(String key, Object value) {
//		super.put(key, value);
//		return this;
//	}

	public ApiResult set(ApiResultError err, String appendMessage) {
		put(AR_KEY_RESULT_CODE, err.getCode()); 
		
		String msg = err.getMessage();
		if(StringUtils.hasText(appendMessage)) {
			msg = String.format("%s\n%s", msg, appendMessage);
		}
    	put(AR_KEY_RESULT_MSG, msg);  
		return this;
	}
	
	public ApiResult set(ApiResultError err) {
		return set(err, null);
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
	

	
	// ????
//	public PageInfo getPageInfo() {
//		return (PageInfo)super.get(AR_KEY_PAGEINFO);
//	}
//
//	@SuppressWarnings("unchecked")
//	public ApiResult setPageInfo(PageInfo pi) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		if(super.get(AR_KEY_RESULT_DATA) != null) {
//			map = (HashMap<String, Object>) super.get(AR_KEY_RESULT_DATA);
//		}
//		map.put(AR_KEY_PAGEINFO, pi);
//		
//		super.put(AR_KEY_RESULT_DATA, map);
//		return this; 
//	}
}
