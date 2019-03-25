import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void execute() {
        for (StringTransformer transformer : transformers) {
            transformer.execute();
        }
    }

    public void undo() {
        for (StringTransformer transformer : transformers) {
            transformer.undo();
        }
    }
}
