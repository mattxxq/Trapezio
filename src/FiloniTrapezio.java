/**
 * <b>classe Trapezio</b>
 * @author Filoni Matteo, the one who will make them regret it all
 *
 */
public class FiloniTrapezio {
	float basemag, basemin, altezza;

	FiloniTrapezio(float bmg,float bmn,float h){
		basemag=bmg;
		basemin=bmn;
		altezza=h;	
	}
	/**
	 * questo bro metodo ti ritorna il valore dell'area
	 * @return valore dell'area
	 */
	public float calcoloArea() {
		return (basemag+basemin)*altezza/2;
	}
	/**
	 * questo metodo bro ti ritorna tutti gli attributi della classe
	 */
	public String toString() {
		return "Valori a disposizione:\nBase maggiore: "+basemag+"\nBase minore: "+basemin+"\nAltezza: "+altezza+"\nArea: "+calcoloArea();
	}
	/**
	 * il bro metodo principale bro
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiloniTrapezio a = new FiloniTrapezio(1,2,4);
		System.out.println(a.calcoloArea());
		System.out.println(a);
		FiloniTrapezio a1 = new FiloniTrapezio(2,3,5);
		System.out.println(a1.calcoloArea());
		System.out.println(a1);
		FiloniTrapezio a2 = new FiloniTrapezio(1.4F,2.6F,4.8F);
		System.out.println(a2.calcoloArea());
		System.out.println(a2);
		FiloniTrapezio a3 = new FiloniTrapezio(1.9F,2.3F,8.9F);
		System.out.println(a3.calcoloArea());
		System.out.println(a3);
	}
}
