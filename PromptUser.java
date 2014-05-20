import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PromptUser {


    /**
     * Input: None
     * Desc: Prompts the user when the prompt is a string
     * Output: None
     * Return: String with input from user
     */
    String PromptForString() {
	String inputFromUser = "";
	try {
	    BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
	    inputFromUser = keyboardInput.readLine();
	}
	catch (IOException ex) {
	    System.out.print("IOException");
	}
	return inputFromUser;
    }

    /**
     * Input: None
     * Desc: Prompts the user when the prompt is a integer
     * Output: None
     * Return: Integer with input from user
     */
    int PromptForInt() {
	int inputFromUse;
	try {
	    BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
	    inputFromUser = Integer.parseInt(keyboardInput.readLine());
	}
	catch (NumberFormatException e) {
	    System.out.println("Invalid Entry. Please re-enter.");
	    System.out.println("> ");
	}
	catch (IOException ex) {
	    System.out.print("IOException");
	}
	return inputFromUser;
    }
}
