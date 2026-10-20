package singleton;

public class Main {
    public static void main(String[] args) {
        // Lấy model hai lần để kiểm tra Singleton trả về cùng một đối tượng.
        GameModel first = GameModel.instance();
        GameModel second = GameModel.instance();

        System.out.println("first == second: " + (first == second));

        // Cả hai tham chiếu cùng thấy thay đổi trên một bộ bài.
        first.newGame();
        System.out.println("So la khi bat dau: " + first.deckSize());
        System.out.println("La bai vua rut: " + first.drawCard());
        System.out.println("So la xem qua second: " + second.deckSize());

        second.newGame();
        System.out.println("So la sau khi bat dau van moi: " + first.deckSize());
    }
}
