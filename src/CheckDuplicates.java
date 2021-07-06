import java.util.List;

public class CheckDuplicates {
    public boolean check(List<String> dependencies){
        int count = 0;
        for (String i : dependencies){
            for (String j : dependencies){
                if (j.equals(i)){
                    count++;
                }
            }
            if (count > 1){
                
                return false;
            }
            count = 0;
        }
        return true;
    }
}
