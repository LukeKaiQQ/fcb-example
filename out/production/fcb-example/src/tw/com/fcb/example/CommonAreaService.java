package tw.com.fcb.example;

import java.util.ArrayList;
import java.util.List;

public class CommonAreaService {
    List<CommonArea> lists = new ArrayList<CommonArea>();

    public void addList(CommonArea commonArea){
        commonArea.setAmountS();
        lists.add(commonArea);
    }

    public void showList(){
        System.out.println(lists.toString());
    }

    public List<CommonArea> getLists(){
        return lists;
    }
}
