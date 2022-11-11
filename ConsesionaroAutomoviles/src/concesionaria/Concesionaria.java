package concesionaria;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author oliver
 */
public class Concesionaria {
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double acceselectronicos[];
		double accesexteriores[];
		double accesinteriores[];
		double aros[];
		double autos[];
		double colortapiceria[];
		String error;
		String nameautos[];
		int opc;
		int opc2;
		String opc3;
		int opc4;
		String opc5;
		int opc6;
		String opc7;
		double tipopintext[];
		double tipotrans[];
		double total;
		// Variables globales
		error = "Error! ingrese una opción correcta";
		// Colección de vehículos, almacena los precios de los vehículos 
		autos = new double[9];
		autos[0] = 18940;
		autos[1] = 23570;
		autos[2] = 24100;
		autos[3] = 25100;
		autos[4] = 19350;
		autos[5] = 24100;
		autos[6] = 16190;
		autos[7] = 20150;
		autos[8] = 34700;
		// Coleccion de vehículos, almacena los nombres de las gamas
		nameautos = new String[9];
		nameautos[0] = "Sedán Económico";
		nameautos[1] = "Sedán";
		nameautos[2] = "Deportivo";
		nameautos[3] = "Híbrido";
		nameautos[4] = "Coupe";
		nameautos[5] = "Coupe Deportivo";
		nameautos[6] = "Compacto";
		nameautos[7] = "HatchBack";
		nameautos[8] = "Económico versión Rally";
		// Colección de Amenidades (Tipo de transmisión), almacena el precio de cada tipo de transmisión
		tipotrans = new double[4];
		tipotrans[0] = 0;
		tipotrans[1] = 800;
		tipotrans[2] = 0;
		tipotrans[3] = 800;
		// Colección de Amenidades (Color de Pintura Exterior), almacena el precio de cada tipo de pintura exterior
		tipopintext = new double[12];
		tipopintext[0] = 0;
		tipopintext[1] = 0;
		tipopintext[2] = 0;
		tipopintext[3] = 0;
		tipopintext[4] = 0;
		tipopintext[5] = 0;
		tipopintext[6] = 0;
		tipopintext[7] = 0;
		tipopintext[8] = 0;
		tipopintext[9] = 0;
		tipopintext[10] = 0;
		tipopintext[11] = 0;
		// Colección de Amenidades (Color de Tapicería), almacena el precio de cada tipo de Tapicería
		colortapiceria = new double[4];
		colortapiceria[0] = 0;
		colortapiceria[1] = 0;
		colortapiceria[2] = 0;
		colortapiceria[3] = 0;
		// Colección de Amenidades (Aros), almacena el precio de cada tipo de aro.
		aros = new double[5];
		aros[0] = 0;
		aros[1] = 0;
		aros[2] = 1688;
		aros[3] = 1700;
		aros[4] = 3011;
		// Colección de Amenidades (Accesorios Exteriores), almacena el precio de cada tipo de Accesorios Exteriores.
		accesexteriores = new double[15];
		accesexteriores[0] = 217;
		accesexteriores[1] = 230;
		accesexteriores[2] = 299.99;
		accesexteriores[3] = 42;
		accesexteriores[4] = 84;
		accesexteriores[5] = 285;
		accesexteriores[6] = 185;
		accesexteriores[7] = 50;
		accesexteriores[8] = 70;
		accesexteriores[9] = 325;
		accesexteriores[10] = 158;
		accesexteriores[11] = 138;
		accesexteriores[12] = 104;
		accesexteriores[13] = 350;
		accesexteriores[14] = 520;
		// Colección de Amenidades (Accesorios inteiores), almacena el precio de cada tipo de Accesorios interiores
		accesinteriores = new double[11];
		accesinteriores[0] = 142;
		accesinteriores[1] = 219;
		accesinteriores[2] = 12;
		accesinteriores[3] = 49;
		accesinteriores[4] = 250;
		accesinteriores[5] = 87;
		accesinteriores[6] = 149;
		accesinteriores[7] = 337;
		accesinteriores[8] = 290;
		accesinteriores[9] = 166;
		accesinteriores[10] = 187;
		// Coleccion de Amenidades (Accesorios Electrónicos), almacena el precrio de cada tipo de Accesorios Electrónicos
		acceselectronicos = new double[4];
		acceselectronicos[0] = 305;
		acceselectronicos[1] = 120;
		acceselectronicos[2] = 185;
		acceselectronicos[3] = 514;
		do {
			System.out.println("");
			System.out.println("");
			System.out.println(" ----------------------------");
			System.out.println("|   CONSESIONARIO DE AUTOS   |");
			System.out.println("|     - MENU PRINCIPAL -     |");
			System.out.println(" ----------------------------");
			System.out.println("");
			System.out.println("1.- Seleccionar automovil");
			System.out.println("2.- salir");
			opc = Integer.parseInt(bufEntrada.readLine());
			switch (opc) {
			case 1:
				System.out.println("");
				System.out.println("");
				menuAutos();
				opc2 = Integer.parseInt(bufEntrada.readLine());
				total = autos[opc2-1];
				System.out.println("   ----------------------------");
				System.out.println("|     CONSESIONARIO DE AUTOS     |");
				System.out.println("|- SELECCION DE GAMA DE VEHICULO-|");
				System.out.println("   ----------------------------");
				System.out.println("Ha seleccionado la gama: "+nameautos[opc2-1]);
				System.out.println("¿Desea agregar amenidades? (s/n)");
				opc3 = bufEntrada.readLine();
				if (opc3.equals("s")) {
					do {
						System.out.println("");
						System.out.println("");
						System.out.println("  --------------------------------");
						System.out.println("|       CONSESIONARIO DE AUTOS     |");
						System.out.println("|- SELECCION DE GAMA DE AMENIDADES-|");
						System.out.println("  --------------------------------");
						System.out.println("");
						System.out.println("Ha seleccionado la gama: "+nameautos[opc2-1]);
						System.out.println("");
						System.out.println("Tipo de Amenidades");
						menuAmenidades();
						opc4 = Integer.parseInt(bufEntrada.readLine());
						switch (opc4) {
						case 1:
							tipoTransmision();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+tipotrans[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 2:
							tipoColorPinturaExterior();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+tipopintext[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 3:
							tipoColorTapiceria();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+colortapiceria[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 4:
							tipoAros();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+aros[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 5:
							tipoAccesoriosExteriores();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+accesexteriores[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 6:
							tipoAccesoriosInteriores();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+accesinteriores[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 7:
							tipoaccesorioelectronico();
							opc6 = Integer.parseInt(bufEntrada.readLine());
							total = total+acceselectronicos[opc6-1];
							System.out.println("¿Desea agregar otra amenidad?: (s/n) ");
							opc7 = bufEntrada.readLine();
							if (opc7.equals("n")) {
								System.out.println("");
								System.out.println("Auto seleccionado: "+nameautos[opc2-1]);
								System.out.println("total a pagar ");
								System.out.println("US$ "+total);
							} else {
								if (opc7.equals("s")) {
									System.out.println("");
								} else {
									System.out.println(error);
								}
							}
							break;
						case 8:
							opc4 = 8;
							break;
						default:
							System.out.println(error);
						}
					} while (opc4!=8);
				} else {
					if (opc3.equals("n")) {
						System.out.println("total a pagar ");
						System.out.println("US$ "+total);
					} else {
						System.out.println(error);
					}
				}
				break;
			case 2:
				opc = 2;
				break;
			default:
				System.out.println(error);
			}
		} while (opc!=2);
	}

    // Mostrar menu
	public static void menuAutos() {
		System.out.println("");
		System.out.println("");
		System.out.println("   ----------------------------");
		System.out.println("|     CONSESIONARIO DE AUTOS     |");
		System.out.println("|- SELECCION DE GAMA DE VEHICULO-|");
		System.out.println("   ----------------------------");
		System.out.println("");
		System.out.println("01.- Sedán Económico");
		System.out.println("02.- Sedán ");
		System.out.println("03.- Deportivo");
		System.out.println("04.- Híbrido");
		System.out.println("05.- Coupe");
		System.out.println("06.- Coupe Deportivo");
		System.out.println("07.- Compacto");
		System.out.println("08.- HatchBack");
		System.out.println("09.- Económico versión Rally");
		System.out.println("10.- Regresar al menú principal");
		System.out.println("");
		System.out.println("Ingrese la gama de vehiculos que desea: ");
	}
        public static void menuAmenidades() {
		System.out.println("");
		System.out.println("");
		System.out.println("01.- Tipo de transmisión");
		System.out.println("02.- Color de pintura exterior");
		System.out.println("03.- Color de tapiceria");
		System.out.println("04.- Aros");
		System.out.println("05.- Accesorios exteriores");
		System.out.println("06.- Accesorios interiores");
		System.out.println("07.- Accesorios electricos");
		System.out.println("08.- Regresar a la selección de gama de vehículos");
	}
        public static void tipoTransmision() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("|       - TIPO DE TRANSMISION -      |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de transmision:");
		System.out.println("");
		System.out.println("01.- Manual");
		System.out.println("02.- CVT");
		System.out.println("03.- Manual con Turbo");
		System.out.println("04.- CVT con Turbo");
		System.out.println("");
		System.out.println("Ingrese el tipo de transmision:");
	}
        public static void tipoColorPinturaExterior() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -------------------------------------");
		System.out.println("|        CONSESIONARIO DE AUTOS        |");
		System.out.println("|  - SELECCION DE GAMA DE AMENIDADES-  |");
		System.out.println("|- TIPO DE COLOR DE PINTURA EXTERIOR - |");
		System.out.println("  -------------------------------------");
		System.out.println("");
		System.out.println("Tipos de Color de Pintura Exterior");
		System.out.println("");
		System.out.println("01.- Cosmic Blue");
		System.out.println("02.- Burgundy Night");
		System.out.println("03.- Rallye Red");
		System.out.println("04.- Crystal Black");
		System.out.println("05.- Modern Steel");
		System.out.println("06.- Taffeta White");
		System.out.println("07.- Energy Green");
		System.out.println("08.- Kona Coffee");
		System.out.println("09.- Orange Fury");
		System.out.println("10.- Helios Yellow");
		System.out.println("11.- Sonic Gray");
		System.out.println("12.- Polished Metal");
		System.out.println("");
		System.out.println("Ingrese el tipo de Pintura Exterior: ");
	}
        public static void tipoColorTapiceria() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("|   - TIPO DE COLOR DE TAPICERIA -   |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de color de Tapiceria:");
		System.out.println("");
		System.out.println("01.- Gray Cloth");
		System.out.println("02.- Black Cloth");
		System.out.println("03.- Black/Gray Cloth");
		System.out.println("04.- Red/Black Suede Effect-Fabric");
		System.out.println("");
		System.out.println("Ingrese el tipo de Color de Tapiceria: ");
	}
        public static void tipoAros() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("|          - TIPO DE AROS -          |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de Aros:");
		System.out.println("");
		System.out.println("01.- 15`` ");
		System.out.println("02.- 16`` ");
		System.out.println("03.- 17`` ");
		System.out.println("04.- 18`` ");
		System.out.println("05.- 19`` ");
		System.out.println("");
		System.out.println("Ingrese el tipo de Aros: ");
	}
        public static void tipoAccesoriosExteriores() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("| - TIPO DE ACCESORIOS EXTERIORES -  |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de Accesorios Exteriores");
		System.out.println("");
		System.out.println("01.- Body Side Molding");
		System.out.println("02.- Car Cover");
		System.out.println("03.- Decklid Spoiler");
		System.out.println("04.- Door Edge Film");
		System.out.println("05.- Door Edge Guards");
		System.out.println("06.- Door Trim Chrome");
		System.out.println("07.- Door Visor");
		System.out.println("08.- Front Fender Emblems");
		System.out.println("09.- Rear Bumper Applique");
		System.out.println("10.- Fog Lights");
		System.out.println("11.- Nose Mascs");
		System.out.println("12.- Moonrof Visor");
		System.out.println("13.- Splash Guard Set");
		System.out.println("14.- Dust Cover");
		System.out.println("15.- Door Mirror Cover - Carbon Fiber");
		System.out.println("");
		System.out.println("Ingrese el tipo de Accesorios Exteriores: ");
	}
        public static void tipoAccesoriosInteriores() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("| - TIPO DE ACCESORIOS INTERIORES  - |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de Accesorios Interiores: ");
		System.out.println("");
		System.out.println("01.- All-Seasons Floor Mats");
		System.out.println("02.- Automatic-Dimming Mirror");
		System.out.println("03.- Cargo Hook");
		System.out.println("04.- Cargo Net");
		System.out.println("05.- Console Illumination");
		System.out.println("06.- Cargo Organizer");
		System.out.println("07.- Door Panel Protector");
		System.out.println("08.- Armrest Compartiment");
		System.out.println("09.- Door Sill Trim-Illuminated");
		System.out.println("10.- Cargo Cover");
		System.out.println("11.- Cargo Liner");
		System.out.println("");
		System.out.println("Ingrese el tipo de Accesorio Interior");
	}
        public static void tipoaccesorioelectronico() {
		System.out.println("");
		System.out.println("");
		System.out.println("  -----------------------------------");
		System.out.println("|       CONSESIONARIO DE AUTOS       |");
		System.out.println("| - SELECCION DE GAMA DE AMENIDADES- |");
		System.out.println("|- TIPO DE ACCESORIOS ELECTRONICOS - |");
		System.out.println("  -----------------------------------");
		System.out.println("");
		System.out.println("Tipos de Accesorios Electronicos");
		System.out.println("");
		System.out.println("01.- Wireless Phone Charger");
		System.out.println("02.- USB Charger - 2.1 Amp.");
		System.out.println("03.- Puddle Light");
		System.out.println("04.- Parking Sensors");
		System.out.println("");
		System.out.println("Ingrese el tipo de Accesorio Interior");
	}
        
        
}
