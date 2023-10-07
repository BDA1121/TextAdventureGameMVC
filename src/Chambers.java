import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Chambers implements Action{
    private int i =0;
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
        } else if(Objects.equals(input[0], "fight")){
            gameFlow.set(1,"With courage swelling in your chest, you square your shoulders and step into the dim light of the corridor, revealing yourself to the two Death Eaters. Wand raised and at the ready, you boldly challenge them, determination evident in your eyes.\n" +
                    "\n" +
                    "\"Well, well, what have we here?\" one of them sneers, a hint of surprise in his voice but trying to maintain a confident facade.\n" +
                    "\n" +
                    "\"I suggest you leave this place and free Dumbledore,\" you say with resolute calmness, not letting their sinister presence waver your determination.\n" +
                    "\n" +
                    "The other Death Eater chuckles darkly, \"And why would we listen to you?\"\n" +
                    "\n" +
                    "You hold your wand even higher, your stance unyielding, \"Because I won't let Hogwarts fall into the hands of the Dark Lord.\"\n" +
                    "\n" +
                    "A tense silence fills the corridor, the atmosphere thick with anticipation. The next moments are crucial, and you're prepared to defend the legacy and safety of Hogwarts to the very end.");
            avl.add("stupify");
            noun.add("enemies");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
        } else if (Objects.equals(input[0], "use")) {
            gameFlow.set(1,"Recognizing the odds stacked against you in a direct confrontation, you quickly revise your strategy. Quietly retrieving the Invisibility Cloak from your pocket, you drape it over yourself, vanishing from the sight of the unsuspecting Death Eaters.\n" +
                    "\n" +
                    "As you move silently, the soft whispers of their continued conversation fill your ears, but they remain completely oblivious to your ghostly passage. Heart pounding, you use this advantage to slip past them, ensuring not to make the slightest noise or disturb the environment.");
            avl.add("save");
            noun.add("dumbledore");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);

        } else if (Objects.equals(input[0], "call")) {
            gameFlow.set(1,"With the weight of the information pressing on you, you know that unity is Hogwarts' strongest defense.\n"+
                    "\n" +
                    "In the Room of Requirement, a makeshift war room is set up. Students practice spells, brew potions, and set protective enchantments. The room responds to the students' needs, providing them with weapons, books, and other resources.");
            Object gameBag = gameFlow.get(6);
            ArrayList<String> bag = (ArrayList<String>) gameBag;
            if(bag.contains("key")){
                avl.add("awaken");
                noun.add("army");
            }
            avl.add("protect");
            noun.add("hogwarts");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
            gameFlow.set(2,"ENDZONE");
        } else if (Objects.equals(input[0], "save")) {
            gameFlow.set(1,"Guided by whispers and clues gathered from your confrontation with the Death Eaters, you determine the location of Dumbledore's imprisonment. Armed with your wand, the Invisibility Cloak, and the determination to free Hogwarts' greatest protector, you embark on a clandestine mission.\n" +
                    "\n" +
                    "The dungeon where Dumbledore is held is heavily guarded and filled with dark enchantments. Using the Invisibility Cloak, you stealthily navigate through, evading Death Eaters and circumventing traps. As you delve deeper, the oppressive atmosphere of dark magic grows thicker, but you press on.\n" +
                    "\n" +
                    "Finally, you find a dimly lit cell. Inside, bound by magical chains and looking weakened yet still regal, is Albus Dumbledore. His eyes, though weary, sparkle with the same intelligence and resolve.\n" +
                    "\n" +
                    "Using a combination of spells you've learned and the innate power coursing through you, you manage to break the chains and dispel the dark magic holding Dumbledore captive. He stands, stretching his limbs, gratitude evident in his eyes.\n" +
                    "\n" +
                    "\"Thank you,\" he says, his voice firm despite his recent ordeal. \"Now, let's save our school.\"\n" +
                    "\n" +
                    "Together, with renewed hope and the formidable Albus Dumbledore by your side, you head back to rally the students and face the impending threat head-on.");
            avl.add("protect");
            noun.add("hogwarts");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
            gameFlow.set(2,"ENDZONE");
        } else if (Objects.equals(input[0], "stupify")) {
            gameFlow.set(1,"You attack the death eater. The other death eater attacks you next");
            if(this.i==1||this.i==3){
                gameFlow.set(0,Boolean.FALSE);
            }
            avl.add("stupify");
            avl.add("defend");
            noun.add("enemies");
            noun.add("yourself");
            if(this.i==4){
                gameFlow.set(1,"You successfully defeat them and move ahead!");
                avl.clear();
                avl.add("save");
                noun.clear();
                noun.add("Dumbledore");
            }
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
            this.i++;

        } else if (Objects.equals(input[0], "defend")) {
            gameFlow.set(1,"Phew! That was close.");
            avl.add("stupify");
            avl.add("defend");
            noun.add("enemies");
            noun.add("yourself");
            gameFlow.set(3,avl);
            gameFlow.set(5,noun);
            this.i++;
        }
        return gameFlow;
    }
}
