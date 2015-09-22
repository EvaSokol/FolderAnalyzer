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
        for (File cur_file : listOfFiles) {
            System.out.println(cur_file.getName());
            System.out.println(cur_file.getName().split(".").length);
//            System.out.println(cur_file.getName().split(".")[1]);
        }
    }


}
