package Lab21_22;

public class CreateImageDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        System.out.println(" create image doc");
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println(" open image doc");
        return new ImageDocument();
    }
}
