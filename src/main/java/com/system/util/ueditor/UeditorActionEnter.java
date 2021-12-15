package com.system.util.ueditor;

import com.baidu.ueditor.ActionEnter;
import com.baidu.ueditor.ConfigManager;
import com.baidu.ueditor.define.ActionMap;
import com.baidu.ueditor.define.BaseState;
import com.baidu.ueditor.define.State;
import com.baidu.ueditor.hunter.FileManager;
import com.baidu.ueditor.hunter.ImageHunter;
import com.baidu.ueditor.upload.Uploader;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class UeditorActionEnter extends ActionEnter {
    private HttpServletRequest request = null;
    private String rootPath = null;
    private String contextPath = null;
    private String actionType = null;
    private ConfigManager configManager = null;
    private String fileUrl = null;
    public UeditorActionEnter(HttpServletRequest request, String rootPath,String fileUrl) {
        super(request, rootPath);
        this.request = request;
        this.rootPath = rootPath;
        this.actionType = request.getParameter("action");
        this.contextPath = request.getContextPath();
        this.configManager = ConfigManager.getInstance(this.rootPath, this.contextPath, request.getRequestURI());
        this.fileUrl = fileUrl;
        System.out.println("actionType:"+actionType);
        System.out.println("fileUrl:"+fileUrl);
    }    
    @Override    
    public String invoke() {
        if (this.actionType != null && ActionMap.mapping.containsKey(this.actionType)) {
            if (this.configManager != null && this.configManager.valid()) {
                State state = null;
                int actionCode = ActionMap.getType(this.actionType);
                Map<String, Object> conf = null;
                switch (actionCode) { 
                   case 0: 
                       return this.configManager.getAllConfig().toString();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        conf = this.configManager.getConfig(actionCode);
                        //注意再这里修改rootPath和savePath，上传的实际路径为rootPath＋savePath
//                        conf.put("rootPath", "http://124.126.15.141:8810/xfyun/");
                        conf.put("rootPath", fileUrl);
                        conf.put("savePath", "/upload/" + conf.get("savePath"));
                        state = (new Uploader(this.request, conf)).doExec();
                        break;
                    case 5:
                        conf = this.configManager.getConfig(actionCode);
                        //注意再这里修改rootPath和savePath，上传的实际路径为rootPath＋savePath
//                        conf.put("rootPath", "http://124.126.15.141:8810/xfyun/");
                        conf.put("rootPath", fileUrl);
                        conf.put("savePath", "/upload/" + conf.get("savePath"));
                        String[] list = this.request.getParameterValues((String) conf.get("fieldName"));
                        state = (new ImageHunter(conf)).capture(list);
                        break;
                    case 6:
                    case 7:
                        conf = this.configManager.getConfig(actionCode);
                       //注意再这里修改rootPath和savePath，上传的实际路径为rootPath＋savePath
//                        conf.put("rootPath", "http://124.126.15.141:8810/xfyun/");
                        conf.put("rootPath", fileUrl);
                        conf.put("savePath", "/upload/" + conf.get("savePath"));
                        conf.put("dir", "/upload" + conf.get("dir"));
                        int start = this.getStartIndex();
                        state = (new FileManager(conf)).listFile(start);
                }
                System.err.println(conf);
                return state.toJSONString();
            } else {
                return (new BaseState(false, 102)).toJSONString();
            }
        } else {
            return (new BaseState(false, 101)).toJSONString();
        }
    }
}
