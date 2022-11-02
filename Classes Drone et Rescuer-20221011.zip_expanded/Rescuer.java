package noName;

public class Rescuer {
	private String name;
	private String firstName;
	private int age;
	private String speciality;
	
	public Rescuer(String n, String f, int a, String s) {
		name = n;
		firstName = f;
		age = a;
		speciality = s;
	}
	public String nom() {
		return name;
	}
	public String prenom() {
		return firstName;
	}
	public int age() {
		return age;
	}
	public String specialite() {
		return speciality;
	}
	public void affectationNom(String n) {
		while()
		this.name = n;
	}
	public void affectationPrenom(String f) {
		this.firstName = f;
	}
	public void affectationAge(int a) {
		this.age = a;
	}
	public void affectationSpecialte(String s) {
		this.speciality = s;
	}
	public void afficheCaracteristiquessauveurs() {
		System.out.println(name + " " + firstName + " - " + age + " - " + speciality);
	}
}
