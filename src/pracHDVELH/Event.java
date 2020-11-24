/**
 * File: NodeMultipleEvents.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

import java.util.Scanner;

import myUtils.ErrorNaiveHandler;

/**
 * @author prost
 *
 */
public class Event extends NodeMultiple {
	public static final String ERROR_MSG_UNEXPECTED_END = "Sorry, for some unexpected reason the story ends here...";
	public static final String PROMPT_ANSWER = "Answer: ";
	public static final String WARNING_MSG_INTEGER_EXPECTED = "Please input a integer within range!";
//
	private String texte;
	private GUIManager interf;
	public Event (GUIManager gui,String texte) {
		this.texte = texte;
		this.interf = gui;
	}
	public String run (){
		if (!this.hasDaughters()){
			// renvoie la fin
			return this.getData();
		}
		else {
			//affiche l'évènnement courant
//			System.out.println(this.texte);
			interf.outputln(this.texte);
			//demande le choix a l'utilisateur
			Scanner scan = interf.getInputReader();
			int a;
			a = scan.nextInt();
			//sélèctionne l'évènnement choisi

			//exécution de l'évènnement choisi (fonction run)
		}
	}
//	/**
//	 * @return the playerAnswer
//	 */
//	public String getPlayerAnswer() {
//		/* TO BE COMPLETED */
//		return null;
//	}
//
//	/**
//	 * @param playerAnswer the playerAnswer to set
//	 */
//	public void setPlayerAnswer(String playerAnswer) {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @return the reader
//	 */
//	public Scanner getReader() {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @param reader the reader to set
//	 */
//	public void setReader(Scanner reader) {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @return the chosenPath
//	 */
//	public int getChosenPath() {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @param chosenPath the chosenPath to set
//	 */
//	public void setChosenPath(int chosenPath) {
//		/* TO BE COMPLETED */
//	}
//
//	/* Methods */
//	/**
//	 * @see pracHDVELH.NodeMultiple#getData()
//	 */
	public String getData() {
		return this.texte;
	}
//
//	/**
//	 * @see pracHDVELH.NodeMultiple#setData(Object)
//	 * @param data
//	 */
	public void setData(String data) {
		/* TO BE COMPLETED */
	}
//
//	/**
//	 * @see pracHDVELH.NodeMultiple#getDaughter(int)
//	 */
//	@Override
//	public Event getDaughter(int i) {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @see pracHDVELH.NodeMultiple#setDaughter(NodeMultiple, int)
//	 * @param daughter
//	 * @param i
//	 */
//	public void setDaughter(Event daughter, int i) {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @return the gui
//	 */
//	public GUIManager getGui() {
//		/* TO BE COMPLETED */
//	}
//
//	/**
//	 * @param gui the gui to set
//	 */
//	public void setGui(GUIManager gui) {
//		/* TO BE COMPLETED */
//	}

//	/**
//	 * @return the id
//	 */
//	public int getId() {
//		/* TO BE COMPLETED */
//	}
//
//	/* Methods */
//	/* TO BE COMPLETED */
//}
//
}

// eof