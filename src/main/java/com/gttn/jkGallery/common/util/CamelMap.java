package com.gttn.jkGallery.common.util;

import java.util.HashMap;

import org.springframework.jdbc.support.JdbcUtils;

/**
 * 
 * <p>쿼리결과의 컬럼명을 camel 형식으로 변환</p> 
 *
 * @author Hunwoo Park 
 *
 */
public class CamelMap extends HashMap<String, Object> {

	private static final long serialVersionUID = 8022445617785180990L;


    @Override
    public Object put(String key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName(key), value);
    }
}
