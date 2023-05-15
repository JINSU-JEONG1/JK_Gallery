package com.gttn.jkGallery.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gttn.jkGallery.board.dao.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO dao;
	
//	@Autowired
//	private FileRepository fileRepo;
//	
//	@Autowired
//	private FileService fileService;
//	
//	@Override
//	public List<Map<String, Object>> getList(EventSearchDTO param) {
//		return dao.getList(param);
//	}
//
//	@Override
//	public int getListCount(EventSearchDTO param) {
//		return dao.getListCount(param);
//	}
//
//	@Override
//	public Map<String, Object> load(EventSearchDTO param) {
//		return dao.load(param);
//	}
//
//	@Override
//	public int insert(EventVO param) {
//		return dao.insert(param);
//	}
//
//	@Override
//	public int update(EventVO param) {
//		return dao.update(param);
//	}
//	
//	@Override
//	public Map<String, Object> insert(EventVO eventVO, EventSetDTO param, List<MultipartFile> newFiles)
//			throws IllegalStateException, IOException {
//		if(dao.insert(eventVO) <= 0) {
//			return null;
//		}
//		
//		long evntSeq = eventVO.getEvntSeq();
//		param.setEvntSeq(evntSeq);
//		procAttachFiles(param, evntSeq, newFiles, null);
//		
//		EventSearchDTO eventScDTO = new EventSearchDTO();
//		eventScDTO.setEvntSeq(evntSeq);
//		
//		Map<String, Object> retMap = dao.load(eventScDTO);
//		return retMap;
//	}
//
//	@Override
//	public Map<String, Object> update(EventVO eventVO, EventSetDTO param, List<MultipartFile> addFiles,
//			String strDelFileIds) throws IllegalStateException, IOException {
//		if(dao.update(eventVO) <= 0) {
//			return null;
//		}
//		
//		long evntSeq = param.getEvntSeq();
//		procAttachFiles(param, evntSeq, addFiles, strDelFileIds);
//		
//		EventSearchDTO eventScDTO = new EventSearchDTO();
//		eventScDTO.setEvntSeq(evntSeq);
//		
//		Map<String, Object> retMap = dao.load(eventScDTO);
//		return retMap;
//	}
//
//	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	protected final String getFileTypeCode() {
//		return String.format("FT_%S", "EVENT");
//	}
//	
//	/**
//	 * 첨부파일 처리
//	 * @param 이벤트모델
//	 * @param fileInputName 
//	 * @param strDelFileIds
//	 * @throws IOException 
//	 * @throws IllegalStateException 
//	 */
//	protected void procAttachFiles(EventSetDTO param, long regId, List<MultipartFile> uploadFiles, String strDelFileIds) throws IllegalStateException, IOException {
//		String fileTypeCd = getFileTypeCode();
//		
//		// 파일 추출 및 저장
//		List<FileSetDTO> newFiles = new ArrayList<>();
//		for(MultipartFile mFile : uploadFiles) {
//			FileSetDTO fDto = fileRepo.storeFile(mFile, fileTypeCd);
//			fDto.setRefSeq(param.getEvntSeq());
//			fDto.setRgtr(regId);
//			newFiles.add(fDto);
//		}
//		
//		String[] delFileIds = !StringUtils.hasText(strDelFileIds) ? new String[0] : strDelFileIds.split(","); 
//		List<FileSetDTO> delFiles = new ArrayList<>();
//		if(delFileIds.length > 0) {
//			List<Map<String, Object>> delList = fileRepo.getList(fileTypeCd, param.getEvntSeq(), delFileIds);
//			for(Map<String, Object> delFile : delList) {
//				
//				FileSetDTO item = new FileSetDTO();
//				item.setFileId(delFile.get("fileId").toString());
//				item.setChnr(regId);
//				
//				delFiles.add(item);
//			}
//		}
//		
//		//파일 추가 삭제
//		fileRepo.setFiles(newFiles, delFiles, Const.DELETE_PHYSICAL_FILE);
//		
//		List<Map<String, Object>> attachFiles = fileRepo.getList(fileTypeCd, param.getEvntSeq());
//		//param.setFiles(attachFiles);
//	}
//
//	@Override
//	public List<Map<String, Object>> getFiles(EventSearchDTO param) {
//		String fileTypeCd = getFileTypeCode();
//		return getFiles(fileTypeCd, param.getEvntSeq());
//	}
//
//	@Override
//	public List<Map<String, Object>> getFiles(String fileTypeCd, long evntSeq) {
//		FileSearchDTO fileScDTO = new FileSearchDTO();
//		fileScDTO.setRefCode(fileTypeCd);
//		fileScDTO.setRefSeq(evntSeq);
//		fileScDTO.setDelYn("N");
//		return fileService.getList(fileScDTO);
//	}

	
}
