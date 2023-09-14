package iterator;

public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int number0fItems = 0;
    Notification[] notificationsList;

public NotificationCollection(){
    notificationsList = new Notification[MAX_ITEMS];

    addItem("Notification1");
    addItem("Notification2");
    addItem("Notification3");

}

public void addItem(String str){
Notification notification = new Notification(str);
if (number0fItems >= MAX_ITEMS){
System.err.println("Full");
} else{
    notificationsList[number0fItems]=notification;
    number0fItems = number0fItems + 1;

}

}
public Iterator createIterator(){
    return new NotificationIterator(notificationsList);

}


}
