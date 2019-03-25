public class StringCaseChanger implements StringTransformer {
    private StringDrink drink;

    public StringCaseChanger(StringDrink drink) {
        this.drink = drink;
    }

    public void execute() {
        String text = this.drink.getText();
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if(Character.isLowerCase(text.charAt(i)))
                buff.append(Character.toUpperCase(text.charAt(i)));
            else
                buff.append(Character.toLowerCase(text.charAt(i)));
        }
        this.drink.setText(buff.toString());
    }

    public void undo() {
        this.execute();
    }
}
