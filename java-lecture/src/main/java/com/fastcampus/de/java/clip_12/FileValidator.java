package com.fastcampus.de.java.clip_12;

import java.io.File;

public class FileValidator {

    public static boolean validate(String path){
        if(path.startsWith("/Users/")){
             // success
            File file = new File(path);
            return file.exists();
        } else {
            throw new IllegalPathAccessError(path);
        }
    }

}
