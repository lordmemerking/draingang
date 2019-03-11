import javax.swing.JOptionPane;
// Övning 6.2 sid 131 i Java - steg för steg
public class Bladee {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Första talet?");
		int m = Integer.parseInt(s);
		s = JOptionPane.showInputDialog("Andra talet?");
		int n = Integer.parseInt(s);
		int r;
		while (true) {
			r = m % n;
			if (r == 0)
				break;
			m = n;
			n = r;
		}
		JOptionPane.showMessageDialog(null, "Största gemensamma delare är " + n);
	}
}
