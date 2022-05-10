package tw.com.fcb.example;

class MemberIdException extends Exception{
    public MemberIdException(String id){
        super("統編 " + id + " 驗證失敗");
    }
    public void show(){
        System.out.println("請聯絡客服");
    }
}

public class CheckIdService {
    public void CheckId(String id) throws MemberIdException{
        if(id.length() < 8){
            throw new MemberIdException(id);
        }
        else{
            System.out.println("Success");
        }
    }
}
