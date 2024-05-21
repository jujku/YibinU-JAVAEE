package com.bupt.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class InterceptorController {

    @PostMapping("/gotoTest")
    public com.bupt.pojo.File gotoTest(com.bupt.pojo.File files, HttpServletRequest request){

        com.bupt.pojo.File response = new com.bupt.pojo.File();


        String path = "D:\\ideaProject\\lab4_async_interceptor\\src\\main\\resources\\uploads";
        File targetDir = new File(path);
        if (!targetDir.exists()){
            targetDir.mkdirs();
        }

        List<String> description = new ArrayList<>();
        List<String> filename = new ArrayList<>();
        for(int i = 0;i < files.getFile().size();i++) {

            filename.add(files.getFile().get(i).getOriginalFilename());
            description.add(files.getDescription().get(i));

            File targetFile = new File(path,files.getFile().get(i).getOriginalFilename());
            try {
                files.getFile().get(i).transferTo(targetFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        response.setDescription(description);
        response.setFileName(filename);

        return response;
    }

}
