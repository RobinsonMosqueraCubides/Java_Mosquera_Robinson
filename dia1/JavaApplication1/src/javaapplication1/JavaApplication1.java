import java.util.*;

public class CampersApp {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Camper> campers = new HashMap<>();
    static Map<String, Docente> docentes = new HashMap<>();
    static Map<String, Ruta> rutas = new HashMap<>();
    static Map<String, Integer> areas = new HashMap<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        while (true) {
            System.out.println("Ingrese el número de la opción deseada:\n1. Registro\n2. Camper\n3. Docentes\n4. Listas\n5. Salir");
            int selec = manejoINT();

            switch (selec) {
                case 1:
                    System.out.println("Ingrese el número de la opción deseada:\n1. Registrar Camper\n2. Registrar Docente\n3. Crear Rutas\n4. Registrar Área\n5. Asignar fechas a campers\n6. Menú anterior");
                    selec = manejoINT();
                    switch (selec) {
                        case 1:
                            registroCampers();
                            break;
                        case 2:
                            registroDocente();
                            break;
                        case 3:
                            registroRutas();
                            break;
                        case 4:
                            registroArea();
                            break;
                        case 5:
                            registroFecha();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Ingrese un número del 1 al 6");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el número de la opción deseada:\n1. Asignar Ruta\n2. Ingreso Nota selección\n3. Ingreso notas del filtro\n4. Campers inscritos\n5. Campers bajo rendimiento\n6. Registrar fechas de inicio y fin\n7. Menú anterior");
                    selec = manejoINT();
                    switch (selec) {
                        case 1:
                            asignarRuta();
                            break;
                        case 2:
                            notaSeleccion();
                            break;
                        case 3:
                            notasFiltro();
                            break;
                        case 4:
                            campersInscritos();
                            break;
                        case 5:
                            campersBajoRendimiento();
                            break;
                        case 6:
                            registroFecha();
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("Ingrese un número del 1 al 7");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el número de la opción deseada:\n1. Modificar Ruta\n2. Modificar Horario\n3. Modificar área\n4. Docentes vinculados\n5. Menú anterior");
                    selec = manejoINT();
                    switch (selec) {
                        case 1:
                            modificarRuta();
                            break;
                        case 2:
                            modificarHorario();
                            break;
                        case 3:
                            modificarArea();
                            break;
                        case 4:
                            listarDocente();
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Ingrese un número del 1 al 5");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el número de la opción deseada:\n1. Listar docentes y camper por ruta\n2. Listar campers aprobados y reprobados por rutas\n3. Menú anterior");
                    selec = manejoINT();
                    switch (selec) {
                        case 1:
                            listaDocenteCamper();
                            break;
                        case 2:
                            listarCampersAprobados();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Ingrese un número del 1 al 3");
                    }
                    break;

                case 5:
                    return;
                default:
                    System.out.println("Ingrese un número del 1 al 5");
            }
        }
    }

    public static int manejoINT() {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String manejoStr() {
        scanner.nextLine();  // Limpiar buffer
        return scanner.nextLine();
    }

    public static void registroCampers() {
        while (true) {
            System.out.println("Ingrese el número de identificación:");
            String cc = manejoStr();
            System.out.println("Ingrese el nombre:");
            String nombre = manejoStr();
            System.out.println("Ingrese el apellido:");
            String apellido = manejoStr();
            System.out.println("Ingrese la dirección:");
            String direccion = manejoStr();
            System.out.println("Ingrese la edad:");
            int edad = manejoINT();
            String acudiente = null;
            String telAcudiente = null;

            if (edad < 18) {
                System.out.println("Ingrese el nombre del acudiente:");
                acudiente = manejoStr();
                System.out.println("Ingrese el teléfono del acudiente:");
                telAcudiente = manejoStr();
            }

            System.out.println("Ingrese el número de teléfono:");
            List<String> tel = new ArrayList<>();
            tel.add(manejoStr());
            System.out.println("Desea agregar otro número?\n\t1. Sí\n\t2. No");
            int selec = manejoINT();
            if (selec == 1) {
                tel.add(manejoStr());
            }

            Camper camper = new Camper(cc, nombre, apellido, direccion, edad, acudiente, telAcudiente, tel);
            campers.put(cc, camper);

            System.out.println("Desea registrar otro camper?\n\t1. Sí\n\t2. No");
            selec = manejoINT();
            if (selec != 1) {
                break;
            }
        }
        System.out.println(campers);
    }

    public static void registroDocente() {
        while (true) {
            System.out.println("Ingrese el nombre:");
            String nombre = manejoStr();
            System.out.println("Seleccione el horario del docente:\n\t1. 6am a 10am\n\t2. 10am a 2pm\n\t3. 2pm a 6pm\n\t4. 6pm a 10pm");
            int selec = manejoINT();
            String horario = switch (selec) {
                case 1 -> "6am a 10am";
                case 2 -> "10am a 2pm";
                case 3 -> "2pm a 6pm";
                case 4 -> "6pm a 10pm";
                default -> "";
            };

            System.out.println("Seleccione el área de trabajo:\n\t1. Apollo\n\t2. Artemis\n\t3. Sputnik");
            selec = manejoINT();
            String area = switch (selec) {
                case 1 -> "Apollo";
                case 2 -> "Artemis";
                case 3 -> "Sputnik";
                default -> "";
            };

            System.out.println("Seleccione la ruta:\n\t1. NodeJS\n\t2. Java\n\t3. NetCore");
            selec = manejoINT();
            String ruta = switch (selec) {
                case 1 -> "NodeJS";
                case 2 -> "Java";
                case 3 -> "NetCore";
                default -> "";
            };

            Docente docente = new Docente(nombre, horario, area, ruta);
            docentes.put(nombre, docente);

            System.out.println("Desea registrar otro docente?\n\t1. Sí\n\t2. No");
            selec = manejoINT();
            if (selec != 1) {
                break;
            }
        }
        System.out.println(docentes);
    }

    public static void registroRutas() {
        while (true) {
            System.out.println("Seleccione la ruta que desea crear:\n\t1. NodeJS\n\t2. Java\n\t3. NetCore");
            int selec = manejoINT();
            Ruta ruta = new Ruta();
            String rutaNombre = switch (selec) {
                case 1 -> "NodeJS";
                case 2 -> "Java";
                case 3 -> "NetCore";
                default -> "";
            };

            System.out.println("Programación Web:\n\t1. HTML\n\t2. CSS\n\t3. Bootstrap");
            selec = manejoINT();
            String progWeb = switch (selec) {
                case 1 -> "HTML";
                case 2 -> "CSS";
                case 3 -> "Bootstrap";
                default -> "";
            };

            System.out.println("Programación formal:\n\t1. Java\n\t2. JavaScript\n\t3. C#");
            selec = manejoINT();
            String progFormal = switch (selec) {
                case 1 -> "Java";
                case 2 -> "JavaScript";
                case 3 -> "C#";
                default -> "";
            };

            System.out.println("Bases de datos:\n\t1. MySQL\n\t2. MongoDB\n\t3. PostgreSQL");
            selec = manejoINT();
            String bd = switch (selec) {
                case 1 -> "MySQL";
                case 2 -> "MongoDB";
                case 3 -> "PostgreSQL";
                default -> "";
            };

            System.out.println("Backend:\n\t1. NetCore\n\t2. Spring Boot\n\t3. NodeJS\n\t4. Express");
            selec = manejoINT();
            String backend = switch (selec) {
                case 1 -> "NetCore";
                case 2 -> "Spring Boot";
                case 3 -> "NodeJS";
                case 4 -> "Express";
                default -> "";
            };

            ruta.setProgramacionWeb(progWeb);
            ruta.setProgramacionFormal(progFormal);
            ruta.setBasesDeDatos(bd);
            ruta.setBackend(backend);

            rutas.put(rutaNombre, ruta);

            System.out.println("Desea crear otra ruta?\n\t1. Sí\n\t2. No");
            selec = manejoINT();
            if (selec != 1) {
                break;
            }
        }
        System.out.println(rutas);
    }

    public static void registroArea() {
        while (true) {
            System.out.println("Ingrese el documento del Camper:");
            String cc = manejoStr();
            if (campers.containsKey(cc)) {
                Camper camper = campers.get(cc);
                if (camper.getEstado().equals("inscrito")) {
                    System.out.println("Seleccione el área de trabajo:\n\t1. Apollo\n\t2. Artemis\n\t3. Sputnik");
                    int selec = manejoINT();
                    String area = switch (selec) {
                        case 1 -> "Apollo";
                        case 2 -> "Artemis";
                        case 3 -> "Sputnik";
                        default -> "";
                    };

                    areas.putIfAbsent(area, 0);
                    if (areas.get(area) < 33) {
                        areas.put(area, areas.get(area) + 1);
                        camper.setArea(area);
                    } else {
                        System.out.println("Área llena, seleccione otra");
                        continue;
                    }
                }
            }
            System.out.println("Desea asignar otra área?\n\t1. Sí\n\t2. No");
            int selec = manejoINT();
            if (selec != 1) {
                break;
            }
        }
    }

    public static void registroFecha() {
        while (true) {
            System.out.println("Ingrese la cc del camper:");
            String cc = manejoStr();
            if (campers.containsKey(cc)) {
                Camper camper = campers.get(cc);
                if (camper.getEstado().equals("inscrito")) {
                    System.out.println("Ingrese el día de ingreso:");
                    int dia = manejoINT();
                    System.out.println("Ingrese el mes de ingreso:");
                    int mes = manejoINT();
                    System.out.println("Ingrese el año de ingreso:");
                    int anio = manejoINT();
                    System.out.println("Ingrese el día esperado de finalización:");
                    int diaF = manejoINT();
                    System.out.println("Ingrese el mes esperado de finalización:");
                    int mesF = manejoINT();
                    System.out.println("Ingrese el año esperado de finalización:");
                    int anioF = manejoINT();

                    camper.setFechaInicio(dia + "/" + mes + "/" + anio);
                    camper.setFechaFin(diaF + "/" + mesF + "/" + anioF);
                } else {
                    System.out.println("Camper no inscrito");
                }
            } else {
                System.out.println("Camper no registrado");
            }
            System.out.println("Desea ingresar otra fecha?\n\t1. Sí\n\t2. No");
            int selec = manejoINT();
            if (selec != 1) {
                break;
            }
        }
    }

    // Asegúrate de implementar las siguientes funciones para que el código sea completo:
    public static void asignarRuta() { /* ... */ }
    public static void notaSeleccion() { /* ... */ }
    public static void notasFiltro() { /* ... */ }
    public static void campersInscritos() { /* ... */ }
    public static void campersBajoRendimiento() { /* ... */ }
    public static void modificarRuta() { /* ... */ }
    public static void modificarHorario() { /* ... */ }
    public static void modificarArea() { /* ... */ }
    public static void listarDocente() { /* ... */ }
    public static void listaDocenteCamper() { /* ... */ }
    public static void listarCampersAprobados() { /* ... */ }
}
