package com.test.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
public class UploadController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("upload.jss")
	public Map<String, Object> upload(Model model, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		// 转型为MultipartHttpRequest
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		// 获得上传的文件（根据前台的name名称得到上传的文件）
		MultiValueMap<String, MultipartFile> multiValueMap = multipartRequest.getMultiFileMap();
		List<MultipartFile> files = multiValueMap.get("Filedata");
		// MultipartFile file = multipartRequest.getFile("Filedata");
		if (!files.isEmpty()) {
			// 在这里就可以对file进行处理了，可以根据自己的需求把它存到数据库或者服务器的某个文件夹
			logger.info(files.get(0).getName() + "=========" + files.get(0).getOriginalFilename() + "========" + files.get(0).getSize());
			result.put("imgUrl", "http://xx.com/yy.jpg");
		}
		return result;
	}
}
