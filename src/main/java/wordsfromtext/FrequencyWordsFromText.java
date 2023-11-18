package wordsfromtext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FrequencyWordsFromText {

  public static void getWords(String nameOfFile, int minFrequency, int maxFrequency){
    double start = System.currentTimeMillis();
        try(BufferedReader reader = new BufferedReader(new FileReader(String.format("src/main/resources/%s", nameOfFile)))){
            Map<String, Integer> map = new HashMap<>();
            List<String> book = new ArrayList<>();
            while(reader.ready()){
                book.add(reader.readLine().toLowerCase());
            }

            String str3 = book.toString().toLowerCase().replaceAll("'\\w*", " ");
            String str = str3.replaceAll("[^\\w ]", "");
            String str2 = str.replaceAll("[\\d]", "");
            List <String> arrList = new ArrayList<>(Arrays.asList(str2.split(" ")));
            List <String> arrList2 = new ArrayList<>();
            for(String s : arrList){
                String ss = s.replaceAll(" ", "");
                if(ss.length() < 2 ){
                    continue;
                }
                arrList2.add(ss);
            }
            while(!arrList2.isEmpty()){
                int count = 0;
                int i = 0;
                    for(int j = 1; j < arrList2.size(); j++){
                        if(arrList2.get(i).compareTo(arrList2.get(j)) == 0){
                            count++;
                    }
                }
                    if(count >= minFrequency && count <= maxFrequency){
                        map.put(arrList2.get(i), count);
                    }
                arrList2.removeAll(Collections.singleton(arrList2.get(i)));
            }



            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(System.out::println);
            System.out.printf("frequency count: %d",map.size());

        }catch (IOException e){
            e.printStackTrace();
        }
      System.out.printf("\n\nIt took %.2f seconds to process the file\n", ((double)System.currentTimeMillis() - start) / 1000);
    }





}
