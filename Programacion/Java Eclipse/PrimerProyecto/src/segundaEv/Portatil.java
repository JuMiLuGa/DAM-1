package segundaEv;

public class Portatil {

	public String marca;
	public String cpu;
	public int ram;
	public int hd;
	public boolean usbC;
	
	public void visualizar() {
		
		System.out.println("Marca: " + marca);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Disco Duro: " + hd + " GB");
		//System.out.println("Tiene usbC: " + usbC);
		
	}
	
	public void usb() {
		if(usbC) {
			System.out.println("Tiene puertos usb tipo C");
		}else {
			System.out.println("No tiene puertos usb tipo C");
		}
	}
	
	public static void main(String[] args) {
	
		Portatil p1 = new Portatil();
		
		p1.marca = "Acer";
		p1.cpu = "Intel";
		p1.ram = 16;
		p1.hd = 1000;
		p1.usbC = true;
		
		Portatil p2 = new Portatil();
		
		p2.marca = "HP";
		p2.cpu = "Intel";
		p2.ram = 4;
		p2.hd = 500;
		p2.usbC = false;

		System.out.println("----------------------");
		
		p1.visualizar();
		p1.usb();
		
		System.out.println("----------------------");
		
		p2.visualizar();
		p2.usb();
		
		System.out.println("----------------------");
	}

}
