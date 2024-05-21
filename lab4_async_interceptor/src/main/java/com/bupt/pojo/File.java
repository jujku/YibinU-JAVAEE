package com.bupt.pojo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class File {
    private List<String> fileName;
    private List<String> description;
    private List<MultipartFile> file;
}
