import java.util.HashMap;
import java.util.Map;

class MostOccuredStr{


    static String mostOccuredString(String[] str)
    {
        HashMap<String,Integer> map=new HashMap<>();
        for(String x:str){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        String result="";
        int maxCount=0;
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            String currentString=entry.getKey();


            int currentCount=entry.getValue();
            if(currentCount>maxCount||(currentCount==maxCount && currentString.compareTo(result)>0)) {
                maxCount = currentCount;
                result=currentString;
            }

        }
        return result;

    }


}

public class Main {
    public static void main(String[] args) {
        String str[]={"accio","job","accio","job","abc"};
      String result=  MostOccuredStr.mostOccuredString(str);

        System.out.println("most occured String="+result);
    }
}