package Lab21_22;

public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        System.out.println(" create misic doc");
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println(" open misic doc");
        return new MusicDocument();
    }
}
