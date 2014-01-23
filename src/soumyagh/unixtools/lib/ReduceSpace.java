package kashishm.unixtools.lib;

public class ReduceSpace {
    public String removeSpaces(String text){
        String result = text.replaceAll(" +"," ");
        result = result.replaceAll("\n","\r\n");
        return result;
    }
}
