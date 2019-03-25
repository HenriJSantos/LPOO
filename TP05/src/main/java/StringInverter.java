public class StringInverter implements StringTransformer {
    private StringDrink drink;

    public StringInverter(StringDrink drink) {
        this.drink = drink;
    }

    public void execute() {
        StringBuffer buff = new StringBuffer();
        buff.append(this.drink.getText());
        buff.reverse();
        this.drink.setText(buff.toString());
    }

    public void undo() {
        this.execute();
    }
}
