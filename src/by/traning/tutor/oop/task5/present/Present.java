package by.traning.tutor.oop.task5.present;

import by.traning.tutor.oop.task5.box.Box;
import by.traning.tutor.oop.task5.sweets.Sweetness;

import java.util.List;

public class Present {
    private Box box;
    private List<Sweetness> sweetnesses;

    public Present(Box box, List<Sweetness> sweetnesses) {
        this.box = box;
        this.sweetnesses = sweetnesses;
    }
}
