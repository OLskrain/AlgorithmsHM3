
public class LineFlip {

    private String textMirror;

    LineFlip(){
        this.textMirror = "";
    }

    public String coup(String textEntered){
       char[] stack = textEntered.toCharArray();
        for (int i = stack.length - 1; i >= 0 ; i--) {
            textMirror += stack[i];
        }
        return textMirror;
    }
}
