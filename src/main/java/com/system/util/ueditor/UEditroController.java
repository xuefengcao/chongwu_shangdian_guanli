package com.system.util.ueditor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UEditroController {

	private Logger logger = LoggerFactory.getLogger(UEditroController.class);
	@Autowired
	private HttpServletRequest request;
	@Value("${ftp.url}")
	private String fileUrl;// 链接地址 生产需要修改

	/**
	 * 入口方法：ueditor.config.js中配置调用的
	 * 
	 * @param response
	 * @param action
	 */
	@RequestMapping("/ueditorConfig")
	public void getUEditorConfig(HttpServletResponse response, String action) {
		 String rootPath = "src/main/resources/static";//本地
	//	String rootPath = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/classes/static";// 部署在环境中
		logger.info("*************in ueditorConfig********************action:" + action);
		logger.info("*************in ueditorConfig********************rootPath:" + rootPath);
		try {
			String exec = new UeditorActionEnter(request, rootPath, fileUrl).exec();
			PrintWriter writer = response.getWriter();

			writer.write(exec);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 上传图片调用的方法
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/upload/image", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> save(HttpServletRequest req) {

		logger.info("*************in /upload/image********************");
		Map<String, Object> rs = new HashMap<String, Object>();
		MultipartHttpServletRequest mReq = null;
		MultipartFile file = null;
		// 原始文件名 UEDITOR创建页面元素时的alt和title属性
		// String originalFileName = "";
		String InName = "";
		try {
			mReq = (MultipartHttpServletRequest) req;
			// 从config.json中取得上传文件的ID
			file = mReq.getFile("upfile");
			if (!file.isEmpty()) {
				rs=imagTomcat(rs,file);// windows   tomcat 部署
				//rs=imagTomcat(rs,file);// linux   tomcat 部署
				
			}
			System.out.println("========================上传完毕"+rs.toString() );
		} catch (Exception e) {
			e.printStackTrace();
			rs.put("state", "文件上传失败!"); // 在此处写上错误提示信息，这样当错误的时候就会显示此信息
			rs.put("url", "");
			rs.put("title", "");
			rs.put("original", "");
		}
		return rs;
	}

	private Map<String, Object> imagTomcat(Map<String, Object> rs, MultipartFile files)
			throws IllegalStateException, IOException {

		// 部署tomcat 可用
		//String path = System.getProperty("catalina.home") + "/webapps/file/jingyan/";
		//部署在  外部tomcat
		String path = "D:/tomcat/apache-tomcat-8/webapps/file/";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String fileName = sdf.format(new Date());

		System.out.println("========================????   " + path);
		File file = new File(path);

		if (!file.exists()) {// 判断文件路径是否存在
			file.mkdirs(); // 不存在创建新的文件

		}

		String oldName = files.getOriginalFilename();
		String suffix = oldName.substring(oldName.indexOf("."), oldName.length());

		File diskFile = new File(path + fileName + suffix);
		files.transferTo(diskFile);
		// 保存路径
		String userImgPath =  fileName + suffix;
		rs.put("state", "SUCCESS");// UEDITOR的规则:不为SUCCESS则显示state的内容
		rs.put("url", userImgPath); // 能访问到你现在图片的路径
		rs.put("title", oldName);
		rs.put("original", oldName);

		return rs;
	}

	private static String getDateStr() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}

}
