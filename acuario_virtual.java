import java.util.Scanner;
public class acuario_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] especies = new String[10];
        int[] edades = new int[10];
        String[] alimentaciones = new String[10];
        String[] habitats = new String[10];
        String[] estadosSalud = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_de_acuario_virtual|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal de acuario virtual");
            System.out.println("1) Registrar animal");
            System.out.println("2) Editar animal");
            System.out.println("3) Listar animales");
            System.out.println("4) Buscar animal");
            System.out.println("5) Eliminar animal");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //----------------------//
                //--|registrar_animal|--//
                //----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del animal");
                    System.out.println("id del animal a registrar: " + id);
                    System.out.print("nombre del animal: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("especie: ");
                    especies[total] = entrada.nextLine();
                    System.out.print("edad: ");
                    edades[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("tipo de alimentacion: ");
                    alimentaciones[total] = entrada.nextLine();
                    System.out.print("habitat: ");
                    habitats[total] = entrada.nextLine();
                    System.out.print("estado de salud: ");
                    estadosSalud[total] = entrada.nextLine();
                    System.out.println("Animal registrado correctamente.");
                    total++;
                    break;
                //-------------------//
                //--|editar_animal|--//
                //-------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen animales registrados.");
                        break;
                    }
                    System.out.println("Datos de los animales");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Especie: " + especies[i] + " | Edad: " + edades[i] + " | Alimentacion: " + alimentaciones[i] + " | Habitat: " + habitats[i] + " | Estado de salud: " + estadosSalud[i]);
                    }
                    System.out.print("Ingrese el ID del animal: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del animal");
                        System.out.print("Nuevo nombre: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("Nueva especie: ");
                        especies[posicion] = entrada.nextLine();
                        System.out.print("Nueva edad: ");
                        edades[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo tipo de alimentacion: ");
                        alimentaciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo habitat: ");
                        habitats[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado de salud: ");
                        estadosSalud[posicion] = entrada.nextLine();
                        System.out.println("Animal actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_animales|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen animales registrados.");
                    } else {
                        System.out.println("Lista de animales");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Especie: " + especies[i] + " | Edad: " + edades[i] + " | Alimentacion: " + alimentaciones[i] + " | Habitat: " + habitats[i] + " | Estado de salud: " + estadosSalud[i]);
                        }
                    }
                    break;
                //-------------------//
                //--|buscar_animal|--//
                //-------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen animales registrados.");
                        break;
                    }
                    System.out.println("busqueda de animal");
                    System.out.print("ingresa la id para buscar animal: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del animal encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Especie: " + especies[posicion] + " | Edad: " + edades[posicion] + " | Alimentacion: " + alimentaciones[posicion] + " | Habitat: " + habitats[posicion] + " | Estado de salud: " + estadosSalud[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|eliminar_animal|--//
                //---------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen animales registrados.");
                        break;
                    }
                    System.out.println("Datos de los animales");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Especie: " + especies[i] + " | Edad: " + edades[i] + " | Alimentacion: " + alimentaciones[i] + " | Habitat: " + habitats[i] + " | Estado de salud: " + estadosSalud[i]);
                    }
                    System.out.print("Ingrese el ID del animal a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            especies[i] = especies[i + 1];
                            edades[i] = edades[i + 1];
                            alimentaciones[i] = alimentaciones[i + 1];
                            habitats[i] = habitats[i + 1];
                            estadosSalud[i] = estadosSalud[i + 1];
                        }
                        total--;
                        System.out.println("Animal eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Acuario Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}