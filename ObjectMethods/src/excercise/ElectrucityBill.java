package excercise;

public class ElectrucityBill {
	
	int meterNo;
	String name;
	String address;
	
	public ElectrucityBill(int meterNo, String name, String address) {
		super();
		this.meterNo = meterNo;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		ElectrucityBill eb1 = new ElectrucityBill(1, "Carlos", "Tlatelolco Street #135");
		ElectrucityBill eb2 = new ElectrucityBill(2, "Jahir", "Tlatelolco Street #137");
		
		System.out.println(eb1);
		System.out.println(eb2);
		
		System.out.println(eb1.hashCode());
		System.out.println(eb2.hashCode());
		
		System.err.println(eb1.equals(eb2));
	}
	
	@Override
	public String toString() {
		return "ElectrucityBill No."+meterNo+": "+name+", "+address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.meterNo == ((ElectrucityBill)obj).meterNo)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.meterNo;
	}
	
}
