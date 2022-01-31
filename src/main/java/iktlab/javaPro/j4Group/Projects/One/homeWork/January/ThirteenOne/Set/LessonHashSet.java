package iktlab.javaPro.j4Group.Projects.One.homeWork.January.ThirteenOne.Set;
import java.util.*;

public class LessonHashSet {
    public static void main(String[] args) {
        HashSet Hash = new HashSet(); // HashSet yaratma
        Hash.add(12); // Add etme
        Hash.add("Salam");
        Hash.add(12.87);
        Hash.add(13.67f);
        Hash.add(true);
        Hash.add('a');
        Hash.add(null);
        Hash.clear(); // temizleme
        Hash.remove(12);//Silme
        Hash.contains(12);//yoxlama
        /*
        Iterator it = Hash.iterator(); // iterasia etmek
        while (it.hasNext()){ //While Hash.size() qeder davam edecek
            System.out.println(it.next());
        }*/
        Hash.forEach(item -> System.out.println(item));//forEach ile cap etmek


    }
}
