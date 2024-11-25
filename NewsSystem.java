import java.util.ArrayList;
import java.util.List;

public class NewsSystem {
    public static void main(String[] args) {
        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");


        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");


        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");


        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(maria);
        subscriberList.add(juan);
        subscriberList.add(oliver);


        NewsAgency news = new NewsAgency();
        news.setBreakingNews("The Philippine vice president publicly threatens to have the president assassinated!");
        news.setSubscriberList(subscriberList);


        System.out.println("NEWS UPDATE!");
        System.out.println(news.notifySubscriber());


        news.unsubscribe(juan);


        Subscriber joaquin = new Subscriber();
        joaquin.setSubscriberName("Joaquin");
        news.subscribe(joaquin);


        System.out.println("\nNEWS RECENTLY!");
        System.out.println(news.notifySubscriber());


        joaquin.updateNewsAgency(news);
    }
}
