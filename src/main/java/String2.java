import java.util.ArrayList;
import java.util.List;

public class String2 {

    public List<String> tu(String a) {
        String[] b = a.split("\\s");
        List<String> result = new ArrayList<>();
        for(int i=0; i<b.length; i++){
            boolean x = true;
            for(int j=0; j<b[i].length(); j++){
                char test = b[i].charAt(j);
                if (test >='a' && test <='z' || test>='A' && test<='Z'
                        || test>='0' && test<='9'){}
                else {
                    x=false;
                    break;
                }
            }
            if(x) result.add(b[i]);
        }
        return result;
    }
}
