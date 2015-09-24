import java.util.ArrayList;
import java.io.File;

/**
 * Created by MASK on 17/09/2015.
 */
public class FolderList {

//    String path = "C:\\TestFolder\\";
    ArrayList <String> FileList;

    public void getFileList(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        String str;
        for (File cur_file : listOfFiles) {
            str = cur_file.getName();
            System.out.println(str);
            System.out.println(str.toCharArray().length);
            System.out.println(str.split("\\.")[0]);
        }
    }


}
