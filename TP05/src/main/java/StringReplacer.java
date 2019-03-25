public class StringReplacer implements StringTransformer {
    private StringDrink drink;
    private Character toReplace, replaceBy;

    public StringReplacer(StringDrink drink, Character toReplace, Character replaceBy) {
        this.drink = drink;
        this.toReplace = toReplace;
        this.replaceBy = replaceBy;
    }

    public void execute() {
        String text = this.drink.getText();
        String newText = text.replace(toReplace, replaceBy);
        this.drink.setText(newText);
    }

    public void undo() {
        Character temp = replaceBy;
        this.replaceBy =this.toReplace;
        this.toReplace = temp;
        this.execute();
        this.toReplace = this.replaceBy;
        this.replaceBy = temp;
    }
}
