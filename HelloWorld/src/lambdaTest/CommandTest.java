package lambdaTest;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {1, 2, 3, 4};
        processArray.process(target, (int[] t) ->
        {
            for (int i : t
            ) {
                System.out.println(i);
            }
        });
    }
}
