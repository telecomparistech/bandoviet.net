package net.bandoviet.tool;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;


/**
 * Tools to work with files.
 * 
 * @author quocanh
 *
 */
@Service
@Validated
public class FileService {
  private static final Logger LOGGER = LoggerFactory.getLogger(FileService.class);
  /**
   * Save the file on the disk at the default folder.
   * 
   * @param file to be saved.
   * @return path to the saved file
   */
  public String saveFile(MultipartFile file) {
    if (file != null && !file.isEmpty()) {
      try {
        byte[] bytes = file.getBytes();
        String name = "/home/quocanh/files/" + file.getOriginalFilename();
        BufferedOutputStream stream = new BufferedOutputStream(
            new FileOutputStream(new File(name)));
        stream.write(bytes);
        stream.close();
        return "You successfully uploaded " + name + "!";
      } catch (Exception e) {
        return "You failed to upload " + file.getOriginalFilename() + " => " + e.getMessage();
      }
    } else {
      return "You failed to upload " + file.getOriginalFilename() + " because the file was empty.";
    }
  }

  /**
   * Save the file on the disk at the place's folder.
   * 
   * @param file 
   * @param id
   * @return
   */
  public static String saveFile(MultipartFile file, Long id, String prefix) {
    String homeDir = System.getProperty("user.home");
    if (file != null && !file.isEmpty()) {
      try {
        String path = homeDir + "/images/" + prefix + String.valueOf(id.longValue())
            + "/";
        prepareFolder(path);
        byte[] bytes = file.getBytes();
        String name = path + getFileName(id, file.getOriginalFilename());
        BufferedOutputStream stream = new BufferedOutputStream(
            new FileOutputStream(new File(name)));
        stream.write(bytes);
        stream.close();
        return name.substring(name.indexOf("images/"));
      } catch (Exception e) {
        LOGGER.error(e.getMessage());
        return "";
      }
    } else {
      return "";
    }
  }

  /**
   * Create the place's folder if it does not exist
   * 
   * @param folder
   */
  private static void prepareFolder(String folder) {

    File f = new File(folder);
    if (f.exists() && f.isDirectory()) {
      ;
    } else {
      f.mkdir();
    }
  }

  /**
   * Naming the saved file which is the place's ID + the file's extension
   * 
   * @param id
   * @param originalFile
   * @return
   */
  private static String getFileName(Long id, String originalFile) {
    return String.valueOf(id.longValue()) + "." + FilenameUtils.getExtension(originalFile);
  }
}