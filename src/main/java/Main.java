public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = "03";
        post.birthday.month = "8";
        post.birthday.year = "1995";
        post.name = "Дамир";
        post.passport = "4444 № 44444444";
        post.patronymic = "Ильдарович";
        post.phone = "+7 (999) 999-99-99";
        post.surname = "Сираев";
        post.subscription = "true";
    }
}