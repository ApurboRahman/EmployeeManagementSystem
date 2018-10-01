package programming;

import java.util.*;

/**
 * Created by Apurbo on 11/5/2016.
 */
public class QueuesAndStacks {

    public Stack<Character> charS = new Stack<Character>();
    public Queue<Character> charQ = new LinkedList<Character>();

    void pushCharacter(char c)
    {
        charS.push(c);
    }

    char popCharacter()
    {
        return charS.pop();
    }
    void enqueueCharacter(char c)
    {
        charQ.add(c);
    }

    char dequeueCharacter()
    {
        return charQ.remove();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:

        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}

