package iterator;

public class NotificationIterator implements Iterator{
Notification[] notificationsList;
int pos = 0;

public NotificationIterator(Notification[] notificationsList){
this.notificationsList = notificationsList;
}

public boolean hasNext(){
if (pos >= notificationsList.length || notificationsList[pos] == null){
return false;
} else{
return true;
}


}

}
