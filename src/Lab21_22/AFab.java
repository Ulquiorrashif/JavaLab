package Lab21_22;

public class AFab {
    public ICreateDocument create( String name){
        switch (name){
            case "text":
                return new CreateTextDocument();

            case "music":
                return new CreateMusicDocument();

            case "image":
                 return new CreateImageDocument();

        }
        return new CreateTextDocument();
    };
}
