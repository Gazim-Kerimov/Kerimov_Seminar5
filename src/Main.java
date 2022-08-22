import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        String checkString = "()()[]{}[]";
        System.out.println("Входная последовательность: \n" + checkString);
        char[] charList = checkString.toCharArray();
        for(int i = 0; i < charList.length; i++){
            stack.push(charList[i]);
        }
        boolean checkFlag = false;
        while (!stack.isEmpty()){
            checkFlag = checkPair(map, stack.pop(),stack.pop());
        }
        if(checkFlag) System.out.println("Последовательность верная");

        else System.out.println("Последовательность неверная");

    }
    public static boolean checkPair(Map map, char value, char key){
        char temporary = (char) map.get(key);
        if(value == temporary){
            return true;
        }
        else return false;
    }
}

