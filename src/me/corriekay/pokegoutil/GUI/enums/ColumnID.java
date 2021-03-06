package me.corriekay.pokegoutil.GUI.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * data types:
 * 0 String - Nickname
 * 1 Integer - Pokemon Number
 * 2 String - Type / Pokemon
 * 3 String(Percentage) - IV Rating
 * 4 Double - Level
 * 5 Integer - Attack
 * 6 Integer - Defense
 * 7 Integer - Stamina
 * 8 String - Type 1
 * 9 String - Type 2
 * 10 String - Move 1
 * 11 String - Move 2
 * 12 Integer - CP
 * 13 Integer - HP
 * 14 Integer - Max CP (Current)
 * 15 Integer - Max CP
 * 16 Integer - Max Evolved CP (Current)
 * 17 Integer - Max Evolved CP
 * 18 Integer - Candies of type
 * 19 String(Nullable Int) - Candies to Evolve
 * 20 Integer - Star Dust to level
 * 21 String - Pokeball Type
 * 22 String(Date) - Caught at
 * 23 Boolean - Favorite
 * 24 Long - duelAbility
 * 25 Integer - gymOffense
 * 26 Integer - gymDefense
 * 27 String(Percentage) - Move 1 Rating
 * 28 String(Percentage) - Move 2 Rating
 * 29 String(Nullable Int) - CP Evolved
 * 30 String(Nullable Int) - Evolvable
 * 31 Long - duelAbility IV
 * 32 Double - gymOffense IV
 * 33 Long - gymDefense IV
 */
public enum ColumnID {
    NUMBER("Number"),
    NICKNAME("Nickname"),
    SPECIES("Species"),
    IV("IV %"),
    LEVEL("Lvl"),
    ATTACK("Atk"),
    DEFENSE("Def"),
    STAMINA("Stam"),
    TYPE1("Type 1"),
    TYPE2("Type 2"),
    MOVE1("Move 1"),
    MOVE2("Move 2"),
    CP("CP"),
    HP("HP"),
    MAXCPCURRENT("Max CP (Current)"),
    MAXCP("Max CP"),
    MAXEVOLVEDCPCURRENT("Max Evolved CP (Current)"),
    MAXEVOLVEDCP("Max Evolved CP"),
    CANDIES("Candies"),
    CANDIES2EVOLVE("To evolve"),
    STARDUST2LVL("Stardust"),
    CAUGHTPOKEBALL("Caught With"),
    CAUGHTDATE("Time Caught"),
    FAVORITE("Favorite"),
    DUELABILITY("Duel Ability"),
    GYMOFFENSE("Gym Offense"),
    GYMDEFENSE("Gym Defense"),
    MOVE1RATING("Move 1 Rating"),
    MOVE2RATING("Move 2 Rating"),
    CPEVOLVED("CP Evolved"),
    EVOLVABLE("Evolvable"),
    DUELABILITYIV("Duel Ability IV"),
    GYMOFFENSEIV("Gym Offense IV"),
    GYMDEFENSEIV("Gym Defense IV");

    private static final Map<String,ColumnID> titleMap = new HashMap<String, ColumnID>();

    static {
        for(ColumnID id : ColumnID.values())
            titleMap.put(id.getTitle(),id);
    }

    private String title;

    private ColumnID(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }

    public static ColumnID get(String title) {
        return titleMap.get(title);
    }
}
