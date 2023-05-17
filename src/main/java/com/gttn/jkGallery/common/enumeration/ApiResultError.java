package com.gttn.jkGallery.common.enumeration;

public enum ApiResultError {
	
	NO_ERROR				("0000"	, "OK"),
	
	NO_AUTH_ERROR				("401"	, "권한이 없습니다."),
	
	LOGIN_ERR_NOT_FOUND_USER 	("100404"	, "사용자 아이디 혹은 비밀번호가 틀렸습니다."),
	LOGIN_ERR_NOT_MATCH_PASSWD	("100401"	, "사용자 아이디 혹은 비밀번호가 틀렸습니다."),
	LOGIN_ERR_BLOCKED_USER 		("100403"	, "사용 중지된 사용자 입니다."),
	LOGIN_ERR_NOT_USED_USER 	("100405"	, "사용 할 수 없는 계정 입니다."),
	LOGIN_ERR_PASS_BLOCKED 		("100406"	, "비밀번호 5회 오류로 사용중지된 계정입니다."),
	LOGIN_ERR_PASS_MUST_CHANAGE	("100407"	, "비밀번호 재설정이 필요합니다.\n재설정 후 다시 로그인 하십시오."),
	LOGIN_ERR_CANNOT_CHANAGE_INIT_PASS	("100407", "인증되지 않은 계정입니다."),
	LOGIN_ERR_OLD_PASS_EQUALS	("100408"	, "비밀번호가 이전비밀번호와 동일합니다.\n다른 비밀번호를 입력해 주십시오."),
	LOGIN_ERR_DORMANT	 		("100409"	, "휴면회원입니다."),
	LOGIN_ERR_REQUIRED			("100500"	, "로그인이 필요합니다"),
	
	MEMB_ERR_ADMIN_MEMB_ADD		("900001"	, "관리자계정 생성에 실패했습니다."),
	ATTACH_ERROR				("910001"	, "첨부파일 관련 시스템 오류가 발생하였습니다."),
	
	BOARD_ERR_ADD_MST			("200101"	, "게시판마스터 생성에 실패했습니다."),
	BOARD_ERR_UDT_MST			("200102"	, "게시판마스터 수정에 실패했습니다."),
	
	
	
	ERROR_INVALID_LOGIN			("9201" , "로그인정보가 유효하지 않습니다."),
	
	BAD_REQUEST					("9400", "잘못된 요청입니다."),
	NO_AUTH_TOKEN_EXPIRED		("9401", "토큰이 만료되었습니다."),
	NO_AUTH_TOKEN_INVALID		("9402", "토큰정보가 유효하지 않습니다."),	
	ERROR_ACCESS_DENIED			("9403", "실행 권한이 없습니다."),
	NO_AUTH_TOKEN_BLACKLIST		("9403", "차단된 토큰입니다."),
	NO_AUTH_REFRESH_TOKEN_INVALID("9403", "토큰정보가 유효하지 않습니다."),
	NO_AUTH_PERMISSION_DENIED	("9403", "사용 권한이 없습니다."),
	//ERROR_NO_JWT				("9401" , "토큰값이 누락되었습니다."),
	ERROR_INVALID_JWT			("9403" , "토큰값이 유효하지 않습니다."),	
	ERROR_ERROR_JWT				("9403" , "토큰값이 유효하지 않습니다."),
	ERROR_EXPIRED_JWT			("9403" , "토큰값이 만료되었습니다."),
	ERROR_INVALID_ISS			("9403" , "토큰값의 ISS가 유효하지 않습니다."),
	ERROR_INVALID_NO_JTI		("9403" , "토큰값의 Jti 고유식별자가 누락되었습니다."),
	ERROR_INVALID_JTI			("9403" , "토큰값의 Jti 고유식별자가 유효하지 않습니다."),
	
	
	NO_AUTH_NOT_FOUND_USER		("9404", "유효하지 않은 사용자 정보입니다."),
	
	
	ERROR_SERVER_ERROR			("9500", "서버 오류가 발생하였습니다."),	
	ERROR_CALL_API				("9801", "API 호출오류."),	
	
	ERROR_PARAMETERS			("9901", "파라미터 오류."),
	ERROR_NOT_SUPPORTED_METHOD	("9902", "지원하지 않는 Method 입니다."),
	ERROR_INTERNAL_API_PARAMETERS("9903", "내부 API 파라미터 오류."),
	
	
	ERROR_DEFAULT				("9999", "오류가 발생하였습니다.")
	
	;
	
	private String code;
	private String message;
	
	private ApiResultError(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public static boolean isOk(String code) {
		return ApiResultError.NO_ERROR.code.equals(code);
	}

}
