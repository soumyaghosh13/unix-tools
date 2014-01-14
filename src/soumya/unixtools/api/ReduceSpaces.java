package soumya.unixtools.api;


public class ReduceSpaces{
    public String trimSpace(String text){
        return text.replaceAll("\\ +", " ").trim();
    }
}
