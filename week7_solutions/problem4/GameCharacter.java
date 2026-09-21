package problem4;

public abstract class GameCharacter {
    private static int nextCharacterNumber = 1;
    private final String characterId;

    protected GameCharacter() {
        characterId = "CHAR-" + nextCharacterNumber++;
    }

    public abstract String getSpecialMove();

    public String getCharacterId() {
        return characterId;
    }
}
