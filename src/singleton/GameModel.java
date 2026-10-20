package singleton;

import e3.chapter3.Card;
import e3.chapter3.Deck;

public final class GameModel {
    // Tạo sẵn và giữ lại một GameModel duy nhất.
    private static final GameModel INSTANCE = new GameModel();

    // Mọi ván đều dùng chung một bộ bài thuộc GameModel duy nhất.
    private final Deck aDeck = new Deck();

    // Chặn việc tạo GameModel từ bên ngoài lớp.
    private GameModel() {
    }

    // Trả về đối tượng Singleton duy nhất.
    public static GameModel instance() {
        return INSTANCE;
    }

    // Đặt lại đủ 52 lá và xáo bài cho ván mới.
    public void newGame() {
        aDeck.shuffle();
    }

    public Card drawCard() {
        return aDeck.draw();
    }

    public int deckSize() {
        return aDeck.getCards().size();
    }
}
