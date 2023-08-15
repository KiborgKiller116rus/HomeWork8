public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Дамир";
        post.patronymic = "Ильдарович";
        post.surname = "Сираев";
        post.birthday.day = 3;
        post.birthday.month = 8;
        post.birthday.year = 1995;
        post.passport = "9999 № 999999";
        post.phone = "+7 (999) 999 99-99";
        post.subscription = true;
    }
}