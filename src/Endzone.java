import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Endzone implements Action{
    @Override
    public List<Object> execute(List<Object> gameFlow, String[] input) {
        ArrayList<String> avl = new ArrayList<>();
        if(Objects.equals(input[0], "quit")){
//
            gameFlow.set(0,Boolean.FALSE);
        } else if(Objects.equals(input[0], "awaken")){

            gameFlow.set(1,"With Voldemort and his army approaching, the atmosphere in Hogwarts grew thick with anticipation. Understanding the magnitude of the impending confrontation, you knew it was time to invoke the power of the Guardians of Hogwarts.\n" +
                    "\n" +
                    "Holding the intricate key you found earlier, you made your way to the Grand Hall. At the very center, a hidden pedestal emerged as you approached. Placing the key into a concealed lock, an ancient enchantment was released. The ground trembled, and from various points around the castle, statues of magnificent stone soldiers began to come to life. They were the Guardians - age-old protectors crafted from the heart of the castle, now awakened to defend it once more.\n" +
                    "\n" +
                    "The students, inspired by this powerful reinforcement, rallied with renewed vigor. Spells were reviewed, strategies discussed, and formations decided. The guardians, standing tall and formidable, took their positions at strategic points, ready to defend Hogwarts with their unyielding might."+"\n"+"The war was fierce and grueling, but with the unity of students, staff, and the unwavering might of the Guardians, Hogwarts repelled Voldemort and his forces. The sky, once shadowed by dark magic and uncertainty, slowly cleared, ushering in a new dawn for the magical world.\n" +
                    "\n" +
                    "After the battle, amidst the celebration and relief, you found a moment of quiet with Dumbledore. In the backdrop of a slowly healing Hogwarts, he spoke, \"Your courage and determination have played a crucial role today. Hogwarts could always use someone of your talents.\"\n" +
                    "\n" +
                    "With those words, he handed you a sealed envelope bearing the Hogwarts crest. It was an invitation, offering you a place to study at the esteemed school.\n" +
                    "\n" +
                    "But before you could fully grasp the magnitude of the moment, a sudden rush of sensations overwhelmed you. The world spun, and everything went black.\n" +
                    "\n" +
                    "You awoke with a start, back in your room. It was quiet, the sounds of battle long gone. For a fleeting moment, you dismissed the entire experience as a vivid dream. Yet, as your eyes focused, you noticed an envelope on your bedside table. Picking it up, you recognized the familiar seal of Hogwarts.\n" +
                    "\n" +
                    "The lines between reality and dream blurred. Was it all a fantastical journey of the mind, or had you truly experienced the magic of Hogwarts? One thing was certain, the tale had only just begun, and your adventure in the world of magic awaited.");
            gameFlow.set(0,Boolean.FALSE);
        } else if(Objects.equals(input[0], "protect")){
            gameFlow.set(0,Boolean.FALSE);
            gameFlow.set(1,"The war was fierce and grueling, but with the unity of students, staff, and the unwavering might of the Guardians, Hogwarts repelled Voldemort and his forces. The sky, once shadowed by dark magic and uncertainty, slowly cleared, ushering in a new dawn for the magical world.\n" +
                    "\n" +
                    "After the battle, amidst the celebration and relief, you found a moment of quiet with Dumbledore. In the backdrop of a slowly healing Hogwarts, he spoke, \"Your courage and determination have played a crucial role today. Hogwarts could always use someone of your talents.\"\n" +
                    "\n" +
                    "With those words, he handed you a sealed envelope bearing the Hogwarts crest. It was an invitation, offering you a place to study at the esteemed school.\n" +
                    "\n" +
                    "But before you could fully grasp the magnitude of the moment, a sudden rush of sensations overwhelmed you. The world spun, and everything went black.\n" +
                    "\n" +
                    "You awoke with a start, back in your room. It was quiet, the sounds of battle long gone. For a fleeting moment, you dismissed the entire experience as a vivid dream. Yet, as your eyes focused, you noticed an envelope on your bedside table. Picking it up, you recognized the familiar seal of Hogwarts.\n" +
                    "\n" +
                    "The lines between reality and dream blurred. Was it all a fantastical journey of the mind, or had you truly experienced the magic of Hogwarts? One thing was certain, the tale had only just begun, and your adventure in the world of magic awaited.");
        }
        return gameFlow;
    }
}
