package Hello;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Eval {
    public static void main(String a[]) throws ScriptException {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        String str = "1+2+4+23/25*12";
        System.out.println(se.eval(str));


    }
}