package cmdLine;

public class CmdCalculator {
    public static void main(String[] args) {
        int result = 0;
        String operator = args[0];

        switch(operator){
            case "+":
                for(int i=1;i<args.length;i++){
                    result += Integer.parseInt(args[i]);
                }
                break;
            
            case "-":
                for(int i=1;i<args.length;i++){
                    result -= Integer.parseInt(args[i]);
                }
                break;

            case "*":
                result = 1;
                for(int i=1;i<args.length;i++){
                    result *= Integer.parseInt(args[i]);
                }
                break;

            case "/":
                for(int i=1;i<args.length;i++){
                    result /= Integer.parseInt(args[i]);
                }
                break;
        }
    }

}
