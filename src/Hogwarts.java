import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Hogwarts implements Action {
    public int i=0;
    @Override
    public List<Object> execute(List<Object> gameFlow, String[] input) {
        int i=0;
        ArrayList<String> avl = new ArrayList<>(){{
            add("quit");
        }};
        ArrayList<String> noun = new ArrayList<>(){{
            add("game");
        }};
        ArrayList<String> bag = new ArrayList<>();
        if(Objects.equals(input[0], "quit")){
            gameFlow.set(0,Boolean.FALSE);
        } else if(Objects.equals(input[0], "search")){
            if(this.i==0||this.i==2||this.i==4){
            avl.add("grab");

            }
            if(this.i==0){
                noun.add("bag");
                gameFlow.set(1,"Curiosity now driving your actions, you begin to meticulously inspect the room. The soft glow from a hovering lantern reveals walls lined with aged portraits, their occupants observing you with a mix of intrigue and caution. You approach an ornate wooden desk, its surface strewn with vials containing mysterious liquids, quills, and parchment.\n" +
                        "\n" +
                        "To one side, an old, dusty bookshelf stands tall, filled with books of various sizes, their spines bearing titles of potions, spells, and magical creatures. A velvet-lined chest sits in a corner, emitting a faint, otherworldly hum. You also spot a peculiar mirror with a gilded frame, its surface shimmering in an otherworldly manner.\n" +
                        "\n" +
                        "Driven by a mix of apprehension and hope, you begin to carefully examine each item, wondering which, if any, could aid in your current predicament.");

            } else if (this.i==2) {
                noun.add("cloak");
                gameFlow.set(1,"As you wander down the hallway, something catches your eye - a silky, shimmering fabric draped over a banister. Upon closer inspection, you recognize it as the legendary Invisibility Cloak. This magical garment, rumored to have been passed down through generations, grants its wearer the power of invisibility.");
            } else if (this.i == 4) {
                noun.add("key");
                gameFlow.set(1,"Further along the hallway, nestled on a velvet cushion inside a small alcove, is an intricately designed key. Its handle is shaped like a pair of wings, and the key itself seems to emanate a soft glow. Beside it, a small plaque reads, \"The Key to the Guardians.\"\n" +
                        "\n" +
                        "Knowledge passed down in whispered tales among the students of Hogwarts speaks of the stone soldiers - legendary guardians crafted from the very bedrock of the castle. They remain dormant, their true power concealed, only to be awakened in the direst of circumstances to defend Hogwarts.");
            }
            if(this.i>0){
                avl.add("walk");
                noun.add("forward");
            }else{
                avl.add("open");
                noun.add("door");
            }
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "open")) {
            gameFlow.set(1,"Gently pushing the door open, a long, dimly lit hallway stretches before you. The stone floor, worn by centuries of footsteps, echoes softly with each step you take. Tall, arched windows line one side, allowing the silver light of the moon to spill in, casting ethereal patterns on the walls. The air is thick with anticipation, filled with the soft whispers of ancient secrets hidden behind the many doors that dot the corridor.\n" +
                    "\n" +
                    "In the distance, the faint glow of floating candles illuminates a bend in the hallway. You hesitantly proceed, the weight of Hogwarts' vast history pressing around you, urging caution, curiosity, and wonder in every footstep.");
            avl.add("walk");
            avl.add("search");
            noun.add("forward");
            noun.add("around");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "grab")) {
            if(this.i==0){
                gameFlow.set(4,Boolean.TRUE);
                gameFlow.add(bag);
                gameFlow.set(1,"Spotting a rather unassuming bag amidst the room's treasures, you soon realize its unique nature. It bears the Infinite Storage enchantment, allowing it to carry far more than its size would suggest. Acknowledging its potential usefulness, you sling it over your shoulder. It's incredibly light, belying its potent magic. Armed with this new asset, you feel a little more prepared to face the challenges that Hogwarts, and this dreamlike state, might throw at you.");
            } else if (this.i==2&&((Boolean) gameFlow.get(4))) {
                Object gameBag = gameFlow.get(6);
                bag = (ArrayList<String>) gameBag;
                bag.add("cloak");
                gameFlow.set(6,bag);
                gameFlow.set(1,"With a sense of reverence, you carefully pick it up, marveling at its lightness and the way it seems to dissolve into nothingness in your hands. Recognizing its invaluable nature, especially in a place as unpredictable as Hogwarts, you neatly fold it and place it into your bag of infinite storage. Its acquisition adds to your growing confidence, and with the cloak safely tucked away, you continue your exploration, armed with yet another tool from the magical world.");
            } else if (this.i==4&&((Boolean) gameFlow.get(4))) {
                Object gameBag = gameFlow.get(6);
                bag = (ArrayList<String>) gameBag;
                bag.add("key");
                gameFlow.set(6,bag);
                gameFlow.set(1,"Realizing the significance of your find, you carefully pick up the key, feeling the weight of its responsibility. With a sense of determination, you store it in your bag alongside the other treasures, understanding that you now hold the power to call upon the castle's mightiest defenders should the need arise.");
            } else if(this.i==2||this.i==4){
                gameFlow.set(1,"As you failed to pick up the bag earlier. you can't store it and have to leave it here");
            }
            avl.add("walk");
            noun.add("forward");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);

        } else if (Objects.equals(input[0], "walk")) {
            gameFlow.set(1,"one step forwards!!");
            this.i++;
            if(this.i<6) {
                avl.add("walk");
                avl.add("search");
                noun.add("forward");
                noun.add("around");
            } else{
                gameFlow.set(1,"From a distance, the soft murmurs of conversation reach your ears");
                avl.add("hear");
                noun.add("conversation");
            }
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);

        } else if (Objects.equals(input[0], "hear")) {
            gameFlow.set(1,"Peeking around a corner, you spot two figures, their faces obscured by the dark shadows of the corridor. Their voices, however, are unmistakably clear.\n" +
                    "\n" +
                    "\"...with Dumbledore out of the way, the path is clear for the Dark Lord,\" one of them says, a sinister undertone to his voice.\n" +
                    "\n" +
                    "The other responds, \"Yes, with Hogwarts under his control, there'll be no stopping him. His army will arrive by nightfall.\"\n" +
                    "\n" +
                    "As the gravity of their words sinks in, a cold shiver runs down your spine. The realization dawns upon you: these are no ordinary witches or wizards; they are followers of Voldemort, the Death Eaters. The stakes have suddenly risen, and the fate of Hogwarts hangs precariously in the balance. With Dumbledore imprisoned and an imminent threat approaching, you understand that you might be one of the few who can make a difference. You retreat silently, keeping the newfound information close, pondering your next move.");
            avl.add("fight");
            avl.add("call");
            Object gameBag = gameFlow.get(6);
            bag = (ArrayList<String>) gameBag;
            if(bag.contains("cloak")){
                avl.add("use");
                noun.add("cloak");
            }
            noun.add("enemies");
            noun.add("forward");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
            gameFlow.set(2,"CHAMBERS");
        }
        return gameFlow;
    }
}
