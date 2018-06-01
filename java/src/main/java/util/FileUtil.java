package util;

import java.io.File;

public class FileUtil {

    private FileUtil() {
    }

    public static String RESOURCES_FOLDER_PATH;

    static {
        getResourcesFolderPath();
    }

    private static void getResourcesFolderPath() {
        String projectPath = System.getProperty("user.dir");
        RESOURCES_FOLDER_PATH = projectPath + File.separator + "java" + File.separator + "resources";
    }

}
