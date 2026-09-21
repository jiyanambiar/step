package problem4;

public final class ArenaBattle {
    private ArenaBattle() { }

    public static void resolveDefense(Defendable[] combatants) {
        for (Defendable combatant : combatants) {
            System.out.println(combatant.defend());
        }
    }
}
