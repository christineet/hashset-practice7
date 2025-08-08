import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // список пользователей (логинов) которые посещали сайт за сегодняшний день
        List<String> siteVisitsList = new ArrayList<>();
        // посещения идут в хронологическом порядке
        // (некоторые логины появляются несколько раз,
        // это значит, что пользователь посещал сайт несколько раз в разное время)
        siteVisitsList.add("legioner");
        siteVisitsList.add("anna9");
        siteVisitsList.add("unique_sun");
        siteVisitsList.add("hurricane");
        siteVisitsList.add("walker");
        siteVisitsList.add("sonya1997");
        siteVisitsList.add("unique_sun");
        siteVisitsList.add("legioner");
        siteVisitsList.add("anna9");
        siteVisitsList.add("legioner");

        // выведем статистику посещения сайта на консоль
        System.out.println("Все визиты: " + siteVisitsList);
        System.out.println("Всего визитов: " + siteVisitsList.size() + System.lineSeparator());

        // превратим список в множество - вызовем конструктор HashSet
        Set<String> uniqueVisitors = new HashSet<>(siteVisitsList);

        // выведем уникальные логины и их количество
        System.out.println("Уникальные пользователи: " + uniqueVisitors);
        System.out.println("Всего уникальных пользователей: " + uniqueVisitors.size());

        System.out.println("Пуст ли список? " + uniqueVisitors.isEmpty());
         uniqueVisitors.remove("anna9");
         System.out.println("Теперь количество уникальных пользователей равно: " + uniqueVisitors.size());
    }
}