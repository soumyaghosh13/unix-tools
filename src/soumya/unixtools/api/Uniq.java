package soumya.unixtools.api;

public class Uniq{
    public String[] getUniqLines(String lines){

        String[] result = lines.split("\n");
        int length = result.length-1;

        String[] uniqLines = new String[length];
        int j =0;
        for(int i=0; i< length; i++){
            if(!result[i].equals(result[i + 1])){
                uniqLines[j] = result[i];
                j++;
                System.out.println(j);
            }
        }
        uniqLines[j] = result[length];

        return  uniqLines;
    }
}
