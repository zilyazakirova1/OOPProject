import ru.netology.Post;
import ru.netology.FormDate;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phonenumber = "+7(999)9999999";
        post.passportnumber = "4444 № 44444444";
        post.subscription = "true";
    }
}
