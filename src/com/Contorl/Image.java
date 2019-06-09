package com.Contorl;

import com.Service.GetUsrPhoto;
import com.Service.getImg;
import com.Service.randUsrs;
import com.Utli.Vcode;

import com.Utli.savePhoto;
import org.apache.commons.fileupload.FileItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/image")
public class Image {
    private HttpServletRequest request;
    private HttpServletResponse response;

    @ModelAttribute
    public void bindRequest(HttpServletRequest request){
        this.request = request;
    }
    @ModelAttribute
    public void bindResponse(HttpServletResponse response){
        this.response = response;
    }

    @RequestMapping("/vcode")
    public void getVcoe() throws IOException {
        Vcode vcode = new Vcode();
        request.getSession().setAttribute("vcode", vcode.getText());
        ImageIO.write(vcode.getBufferedImage(), "PNG", response.getOutputStream());
    }

    @RequestMapping("headPhoto")
    public void getheadPhoto() throws IOException {
        String usrMail = request.getParameter("mail");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        getImg imgServer = (getImg) ac.getBean("getImg");
        byte[] imgByte = imgServer.getUsrHead(usrMail);
        BufferedImage result = savePhoto.byteToBufferedImage(imgByte);
        ImageIO.write(result, "PNG", response.getOutputStream());
    }

    @RequestMapping("getUsrPhotos")
    public void getUsrPhotos() throws IOException {
        String usrMail = request.getParameter("mail");
        int index = new Integer(request.getParameter("index"));
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUsrPhoto getUsrPhoto = (GetUsrPhoto) ac.getBean("getUsrPhoto");
        List<byte[]> list = getUsrPhoto.getUsrPhoto(usrMail);
        ImageIO.write(savePhoto.byteToBufferedImage(list.get(index)), "PNG", response.getOutputStream());
    }

    @RequestMapping("saveHeadPhoto")
    @ResponseBody
    public String saveHeadPhoto(@RequestParam MultipartFile uploadFile, String mail) throws IOException { // 保存用户头像
        InputStream inputStream = uploadFile.getInputStream();

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GetUsrPhoto getUsrPhoto = (GetUsrPhoto) ac.getBean("getUsrPhoto");
        getUsrPhoto.updateUsrHeadPhoto(mail, savePhoto.InputStreamToByte(inputStream));
        return "{\"success\":\"success\"}";

    }
// https://blog.csdn.net/qq_20565303/article/details/78478757
    @RequestMapping("saveUsrPhoto")
    @ResponseBody
    public String saveUsrPhoto(@RequestParam MultipartFile uploadFile, String mail){ // 保存用户图像



        return "{\"success\":\"success\"}";

    }

}


//    public Map<String> uploadFile&#40;MultipartFile uploadExcelFile&#41; {
//        Map<String> resultMap = new HashMap&lt;>();
//        //文件为空
//        if(null == uploadExcelFile ) {
//        resultMap.put("status", 1);
//        resultMap.put("msg", "上传文件为空！");
//        return resultMap;
//        }
//        String originalFilename = uploadExcelFile.getOriginalFilename();
//        int indexPostion = originalFilename.indexOf(".") + 1;
//        String filenameExtension = originalFilename.substring(indexPostion);
//        if("xlsx".equals(filenameExtension)) {//此时文件的扩展名为.xlsx
//        try {
//        InputStream inputStream = uploadExcelFile.getInputStream();
//          @SuppressWarnings("resource")
//          Workbook workbook = new XSSFWorkbook(inputStream);
//            if(workbook != null) {
//            Sheet sheet0 = workbook.getSheetAt(0);
//            int num = sheet0.getLastRowNum();
//            System.out.println(num);
//            Row row0 = sheet0.getRow(0);
