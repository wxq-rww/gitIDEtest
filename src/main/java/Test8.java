import java.util.Stack;

public class Test8 {

    public boolean isValid(String s) {
        if (s.length()==0){return  true;}

        Stack<Character>   stack =new Stack<Character>();
        for (char chars: s.toCharArray()){
            if (chars=='('||chars=='{'||chars=='['){
                stack.push(chars);
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char temp=stack.pop();
                    if (chars==')'){
                        if (temp!='('){
                            return  false;
                        }
                    }else if (chars=='}'){
                        if (temp!='{'){
                            return false;
                        }
                    }else if (chars==']'){
                        if (temp!='['){
                            return false;
                        }
                    }



                }



            }
        }
        return stack.isEmpty()? true:false;

    }




}
