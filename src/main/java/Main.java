import ru.netology.Post;
import ru.netology.FormDate;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1989;
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phonenumber = 790698000L;
        post.passportnumber = 9612896332L;
        post.subscription = "true";
    }
}
