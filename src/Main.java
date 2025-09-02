import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;
        int total = 0;
        int seleccion = 0;
        int tv =0;
        int internet= 0;
        int radio = 0;
        int tv1 =0;
        int internet1= 0;
        int radio1 = 0;
        int tv2 =0;
        int internet2= 0;
        int radio2 = 0;
        int tv3 =0;
        int internet3= 0;
        int radio3 = 0;

        do {
            System.out.println("Vote por canditado");
            System.out.println("1. Candidato #1 ");
            System.out.println("2. Candidato #2 ");
            System.out.println("3. Candidato #3 ");
            System.out.println("4. voto en blanco");
            System.out.println("5. vaciar las urnas");
            System.out.println("6. Finalizar votación");
            System.out.println("Elige una opción");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    votos1++;
                    total++;
                    System.out.println("Su voto fue por el canditado #1");
                    System.out.println("Por favor indique la influencia de su voto");
                    System.out.println("1. Televisión");
                    System.out.println("2. Internet");
                    System.out.println("3. Radio ");
                    seleccion = sc.nextInt();

                        switch (seleccion){
                            case 1:
                                tv+=600000;
                                tv1+=600000;
                                System.out.println("1. Televisión");
                                break;
                            case 2:
                                internet+=700000;
                                internet1+=700000;
                                System.out.println("2. Internet");
                                break;
                            case 3:
                                radio+=200000;
                                radio1+=200000;
                                System.out.println("3. Radio");
                                break;
                            default:
                                System.out.println("Opcion incrrecta");
                        }
                    break;
                case 2:
                    votos2++;
                    total++;
                    System.out.println("Su voto fue por el canditado #2");
                    System.out.println("Por favor indique la influencia de su voto");
                    System.out.println("1. Televisión");
                    System.out.println("2. Internet");
                    System.out.println("3. Radio ");
                    seleccion = sc.nextInt();
                    switch (seleccion){
                        case 1:
                            tv+=600000;
                            tv2+=600000;
                            System.out.println("1. Televisión");
                            break;
                        case 2:
                            internet+=700000;
                            internet2+=700000;
                            System.out.println("2. Internet");
                            break;
                        case 3:
                            radio+=200000;
                            radio2+=200000;
                            System.out.println("3. Radio");
                            break;
                        default:
                            System.out.println("Opcion incrrecta");
                    }
                    break;
                case 3:
                    votos3++;
                    total++;
                    System.out.println("Su voto fue por el canditado #3");
                    System.out.println("Por favor indique la influencia de su voto");
                    System.out.println("1. Televisión");
                    System.out.println("2. Internet");
                    System.out.println("3. Radio ");
                    seleccion = sc.nextInt();
                    switch (seleccion){
                        case 1:
                            tv+=600000;
                            tv3+=600000;
                            System.out.println("1. Televisión");
                            break;
                        case 2:
                            internet+=700000;
                            internet3+=700000;
                            System.out.println("2. Internet");
                            break;
                        case 3:
                            radio+=200000;
                            radio3+=200000;
                            System.out.println("3. Radio");
                            break;
                        default:
                            System.out.println("Opcion incrrecta");
                    }
                    break;
                case 4:
                    votos4++;
                    total++;
                    System.out.println("Su voto fue en blanco gracias por participar");
                    break;
                case 5:
                    System.out.println("Vaciar las urnas");
                    votos1 = 0;
                    votos2 = 0;
                    votos3 = 0;
                    votos4 = 0;
                    total = 0;
                    seleccion = 0;
                    tv =0;
                    internet= 0;
                    radio = 0;
                    tv1 =0;
                    internet1= 0;
                    radio1 = 0;
                    tv2 =0;
                    internet2= 0;
                    radio2 = 0;
                    tv3 =0;
                    internet3= 0;
                    radio3 = 0;

                case 6:
                    System.out.println("*******************************");
                    System.out.println("Resultados");
                    System.out.println("Candidato #1: " + votos1);
                    System.out.println("Candidato #2: " + votos2);
                    System.out.println("Candidato #3: " + votos3);
                    System.out.println("Voto en blanco: " + votos4);
                    System.out.println("Total de votos: "+ total);
                    System.out.println("*******************************");
                    System.out.println("Costos de campaña");
                    System.out.println("Candidato #1");
                    System.out.println("Radio:  " + radio1);
                    System.out.println("TV:  " + tv1);
                    System.out.println("Internet:  " + internet1);
                    int total1 = radio1+tv1+internet1;
                    System.out.println("TOTAL: " + total1);
                    System.out.println("_______________________________");
                    System.out.println("Candidato #2");
                    System.out.println("Radio:  " + radio2);
                    System.out.println("TV:  " + tv2);
                    System.out.println("Internet:  " + internet2);
                    int total2 = radio2+tv2+internet2;
                    System.out.println("TOTAL: " + total2);
                    System.out.println("_______________________________");
                    System.out.println("Candidato #3");
                    System.out.println("Radio:  " + radio3);
                    System.out.println("TV:  " + tv3);
                    System.out.println("Internet:  " + internet3);
                    int total3 = radio3+tv3+internet3;
                    System.out.println("TOTAL: " + total3);
                    System.out.println("_______________________________");
                    System.out.println("Total campaña general: ");
                    System.out.println("Radio:  " + radio);
                    System.out.println("TV:  " + tv);
                    System.out.println("Internet:  " + internet);
                    int totalg = radio+tv+internet;
                    System.out.println("TOTAL: " + totalg);
                    System.out.println("*****************************");
                    System.out.println("GANADOR");
                    if(votos1 > votos2 && votos1 > votos3){
                        System.out.println("GANADOR CANDIDATO 1");
                    }else if(votos2 > votos1 && votos2 > votos3){
                        System.out.println("GANADOR CANDIDATO 2");
                    }else if(votos3 > votos1 && votos3 > votos2){
                        System.out.println("GANADOR CANDIDATO 3");
                    }
                    System.out.println("****************");
                    System.out.println("PORCENTAJES:");
                    int p1 =(votos1*100)/ total;
                    System.out.println("candidato 1: " +p1);
                    int p2 =(votos2*100)/ total;
                    System.out.println("candidato 1: " +p2);
                    int p3 =(votos3*100)/ total;
                    System.out.println("candidato 1: " +p3);
                    int p4 =(votos4*100)/ total;
                    System.out.println("Voto en blanco: " +p4);

                default:
                    System.out.println("opcion invalida");

            }


        }


        while (opcion != 4);
    }

}