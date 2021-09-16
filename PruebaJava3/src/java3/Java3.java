package java3;

public class Java3 {



	class Vehiculo{


		// Attributes of the class adding the color one

		private int velocidadRecta;
        private int velocidadCurva;
		private String color;

		//Constructor with fields

		public Vehiculo(int velocidadRecta, int velocidadCurva, String color) {
			super();
			this.velocidadRecta = velocidadRecta;
			this.velocidadCurva = velocidadCurva;
			this.color = color;
		}

		// I have created the getters and setters

		public int getVelocidadRecta() {
			return velocidadRecta;
		}
		public void setVelocidadRecta(int velocidadRecta) {
			this.velocidadRecta = velocidadRecta;
		}
		public int getVelocidadCurva() {
			return velocidadCurva;
		}
		public void setVelocidadCurva(int velocidadCurva) {
			this.velocidadCurva = velocidadCurva;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}



	}

	//I have created the remaining classes with the inheritance of Vehiculos.

	class Coche extends Vehiculo{

		public Coche(int velocidadRecta, int velocidadCurva, String color) {
			super(velocidadRecta, velocidadCurva, color);

		}}
	class Camion extends Vehiculo{

		public Camion(int velocidadRecta, int velocidadCurva, String color) {
			super(velocidadRecta, velocidadCurva, color);

		}}


	class Tren extends Vehiculo{



		int wagons;
		int seats;

		public Tren(int velocidadRecta, int velocidadCurva, String color, int wagons, int seats) {
			super(velocidadRecta, velocidadCurva, color);
			this.wagons = wagons;
			this.seats = seats;
		}

		public int getWagons() {
			return wagons;
		}

		public void setWagons(int wagons) {
			this.wagons = wagons;
		}

		public int getSeats() {
			return seats;
		}

		public void setSeats(int seats) {
			this.seats = seats;
		}

		// method to add wagons

		public int addWagons(){
            this.wagons=this.wagons+1;
            System.out.println("Wagons are :   "+this.wagons);
            return this.wagons;
        }

		// method to remove wagons

		public int removeWagonsRecta(){
            this.wagons=this.wagons-1;
            System.out.println("Wagons are :   "+this.wagons);
            return this.wagons;
        }





	}

	// I have created the remaining Locomotora and Vagon classes with the Tren inheritance.


	class Locomotora extends Tren{

		public Locomotora(int velocidadRecta, int velocidadCurva, String color, int wagons, int seats) {
			super(velocidadRecta, velocidadCurva, color, wagons, seats);

		}







	}


	class Vagon extends Tren{

		public Vagon(int velocidadRecta, int velocidadCurva, String color, int wagons, int seats) {
			super(velocidadRecta, velocidadCurva, color, wagons, seats);





}}}
