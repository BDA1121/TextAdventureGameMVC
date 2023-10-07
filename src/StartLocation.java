import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
public class StartLocation implements Action {
    @Override
    public List<Object> execute(List<Object> gameFlow,String[] input) {
        ArrayList<String> avl = new ArrayList<>(){{
            add("quit");
        }};
        ArrayList<String> noun = new ArrayList<>(){{
            add("game");
        }};
        if(Objects.equals(input[0], "quit")){
//
            gameFlow.set(0,Boolean.FALSE);
            gameFlow.set(1,"Sorry to have lost you!! Game Over!!");
        } else if(Objects.equals(input[0], "sleep")){
            gameFlow.set(1,"You arrange your bedding and surrender to slumber, casting aside the day's burdens. As dreams envelop you, the realm of imagination takes a chilling turn. The temperature drops sharply, and an icy tremor courses through you. Out of the ethereal mist materializes a menacing dementor, its presence suffocating the warmth around you.");
            avl.add("search");
            avl.add("escape");
            gameFlow.set(3,avl);
            noun.add("room");
            noun.add("room");
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "study")) {
            gameFlow.set(1,"With a sigh, you settle into your study space, the weight of reluctance palpable. As you skim through your notes, a sudden realization strikes: the pending lab assignment that can't be postponed any longer.");
            avl.add("code");
            avl.add("read");
            gameFlow.set(3,avl);
            noun.add("assignment");
            noun.add("pdp");
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "search")) {
            gameFlow.set(1,"Confronted by the looming dementor, panic and uncertainty grip you. Desperately, you scan the surroundings, searching for any means of defense. Your gaze lands on a peculiar stick - could it be a wand, a voice whispers in the recesses of your mind - and a seemingly ordinary broomstick. Both beckon, promising a glimmer of hope in this dire situation.");
            avl.add("use");
            avl.add("grab");
            gameFlow.set(3,avl);
            noun.add("wand");
            noun.add("broomstick");
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "use")) {
            gameFlow.set(1,"Grasping the wand, an unexpected surge of energy courses through you, every fiber of your being tingling with newfound power. Flashbacks of spells and incantations from the Harry Potter tales flood your mind, as if you've always known them. Though confusion swirls within, one thing is clear: you must harness this mysterious force to stand your ground against the dementor.");
            avl.add("defend");
            avl.add("escape");
            gameFlow.set(3,avl);
            noun.add("ExpectoPatronum");
            noun.add("Aparate");
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "defend")) {
            gameFlow.set(1,"With unwavering determination, you raise the wand and confidently chant, \"Expecto Patronum!\" - as if you've been mastering it for years. A dazzling light bursts forth, charging towards the dementor with immense force. The brilliance of the luminescence overwhelms your vision, making it impossible to discern the fate of the dementor. Shielding your eyes against the blinding radiance, you involuntarily blink shut, bracing yourself for what's next.");
            avl.add("search");
            avl.add("open");
            gameFlow.set(3,avl);
            noun.add("room");
            noun.add("door");
            gameFlow.set(5,noun);
            gameFlow.set(2,"HOGWARTS");
        } else if (Objects.equals(input[0], "escape")) {
            gameFlow.set(1,"Despite your valiant efforts, evasion proves futile. The dementor, with an unnerving swiftness, closes the gap and thrusts you to the ground. A chilling dread consumes you, its icy fingers tightening around your heart. With hope dimming, you clasp your eyes shut, sending a silent plea to the universe for salvation.\n" +
                    "\n" +
                    "Then, gradually, the cacophony of your surroundings ebbs away, replaced by an almost eerie silence. Tentatively, you open your eyes, and the sight before you leaves you breathless. Towering spires, ancient stone, and the unmistakable aura of magic. It's Hogwarts. Somehow, inexplicably, you find yourself within the walls of the legendary school of witchcraft and wizardry, nestled in a room steeped in enchantment.");
            avl.add("search");
            avl.add("open");
            gameFlow.set(3,avl);
            noun.add("room");
            noun.add("door");
            gameFlow.set(5,noun);
            gameFlow.set(2,"HOGWARTS");
        } else if (Objects.equals(input[0], "grab")) {
            gameFlow.set(1,"You start flying away on it. Despite your valiant efforts, evasion proves futile. The dementor, with an unnerving swiftness, closes the gap and thrusts you to the ground. A chilling dread consumes you, its icy fingers tightening around your heart. With hope dimming, you clasp your eyes shut, sending a silent plea to the universe for salvation.\n" +
                    "\n" +
                    "Then, gradually, the cacophony of your surroundings ebbs away, replaced by an almost eerie silence. Tentatively, you open your eyes, and the sight before you leaves you breathless. Towering spires, ancient stone, and the unmistakable aura of magic. It's Hogwarts. Somehow, inexplicably, you find yourself within the walls of the legendary school of witchcraft and wizardry, nestled in a room steeped in enchantment.");

            avl.add("search");
            avl.add("open");
            gameFlow.set(3,avl);
            noun.add("room");
            noun.add("door");
            gameFlow.set(5,noun);
            gameFlow.set(2,"HOGWARTS");
        } else if (Objects.equals(input[0], "read")||Objects.equals(input[0], "code")) {
            gameFlow.set(1,"your mind oddly seeks refuge in the familiar realms of design and logic. You begin conceptualizing a game, attempting to structure its intricacies around the MVC (Model-View-Controller) paradigm. It's an escape, a distraction from the immediate danger. But the looming question remains: What should be the central theme? The possibilities are endless, and as you delve deeper into this creative abyss, the surrounding peril momentarily fades, replaced by the captivating allure of game design.\n" +
                    "\n" +
                    "Then, gradually, the cacophony of your surroundings ebbs away, replaced by an almost eerie silence. Tentatively, you open your eyes, and the sight before you leaves you breathless. Towering spires, ancient stone, and the unmistakable aura of magic. It's Hogwarts. Somehow, inexplicably, you find yourself within the walls of the legendary school of witchcraft and wizardry, nestled in a room steeped in enchantment.");
            avl.add("search");
            avl.add("open");
            gameFlow.set(3,avl);
            noun.add("room");
            noun.add("door");
            gameFlow.set(5,noun);
            gameFlow.set(2,"HOGWARTS");
        }
        return gameFlow;
    }
}
