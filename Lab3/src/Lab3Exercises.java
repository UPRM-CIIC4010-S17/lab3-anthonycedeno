import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Anthony");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setSize(350, 200);
		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
        myFrame.setVisible(true);
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
	}
}
