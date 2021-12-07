import java.util.Scanner;

public class App{
    private static int contador = 0; // variavel global que vai ser usada nas estatisticas(usada em aula)

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        String[][] lugaresPorTipoOcupados = { //matriz que vai receber os lugares por tipo livres
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"---", "---", "---", "---"},
                {"---", "---", "---", "   ", "   ", "---", "---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"   ", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"---", "---", "---", "---", "---", "---", "---"},

            };

        String[][] lugaresPorTipoLivres = { //matriz de tipos de assento CMM(comum) PRE(premium) CAD(cadeirante)
                {"CMM", "CMM", "CMM", "CMM", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "CMM", "CMM", "CMM", "CMM"},//A
                {"CMM", "CMM", "CMM", "CMM", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "CMM", "CMM", "CMM", "CMM"},//B
                {"CMM", "CMM", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "CMM", "CMM"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM"},//K
                {"CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "   " ,"   " ,"   " ,"   " ,"   " ,"CMM", "CMM", "CMM", "CMM"},
                {"CAD", "CAD", "CAD", "   ", "   ", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "   " ,"   " ,"   " ,"   " ,"   " ,"   ", "CAD", "CAD", "CAD"},//M
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE", "PRE"},
                {"CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM"},
                {"CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"CMM", "CMM", "CMM", "CMM", "CMM", "CMM", "CMM"},

            };

        String[][] lugaresOcupados = { //matriz que vai receber os assentos quando forem ocupados na lugaresLivres
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"---", "---", "---", "---"},
                {"---", "---", "---", "   ", "   ", "---", "---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"   ", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},
                {"---", "---", "---", "---", "---", "---", "---", "   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"---", "---", "---", "---", "---", "---", "---"},

            };

        String[][] lugaresLivres = { //matriz com lugares livres
                {"A01", "A02", "A03", "A04", "A05", "A06", "A07", "A08", "A09", "A10", "A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20", "A21", "A22"},
                {"B01", "B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", "B10", "B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20", "B21", "B22"},
                {"C01", "C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", "C10", "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20", "C21", "C22"},
                {"D01", "D02", "D03", "D04", "D05", "D06", "D07", "D08", "D09", "D10", "D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20", "D21", "D22"},
                {"E01", "E02", "E03", "E04", "E05", "E06", "E07", "E08", "E09", "E10", "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20", "E21", "E22"},
                {"F01", "F02", "F03", "F04", "F05", "F06", "F07", "F08", "F09", "F10", "F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20", "F21", "F22"},
                {"G01", "G02", "G03", "G04", "G05", "G06", "G07", "G08", "G09", "G10", "G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20", "G21", "G22"},
                {"H01", "H02", "H03", "H04", "H05", "H06", "H07", "H08", "H09", "H10", "H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20", "H21", "H22"},
                {"I01", "I02", "I03", "I04", "I05", "I06", "I07", "I08", "I09", "I10", "I11", "I12", "I13", "I14", "I15", "I16", "I17", "I18", "I19", "I20", "I21", "I22"},
                {"J01", "J02", "J03", "J04", "J05", "J06", "J07", "J08", "J09", "J10", "J11", "J12", "J13", "J14", "J15", "J16", "J17", "J18", "J19", "J20", "J21", "J22"},
                {"K01", "K02", "K03", "K04", "K05", "K06", "K07", "K08", "K09", "K10", "K11", "K12", "K13", "K14", "K15", "K16", "K17", "K18", "K19", "K20", "K21", "K22"},
                {"L01", "L02", "L03", "L04", "L05", "L06", "L07", "L08", "L09", "L10", "L11", "L12", "L13", "   " ,"   " ,"   " ,"   " ,"   " ,"L19", "L20", "L21", "L22"},
                {"M01", "M02", "M03", "   ", "   ", "M06", "M07", "M08", "M09", "M10", "M11", "M12", "M13", "   " ,"   " ,"   " ,"   " ,"   " ,"   ", "M20", "M21", "M22"},
                {"N01", "N02", "N03", "N04", "N05", "N06", "N07", "N08", "N09", "N10", "N11", "N12", "N13", "N14", "N15", "N16", "N17", "N18", "N19", "N20", "N21", "N22"},
                {"O01", "O02", "O03", "O04", "O05", "O06", "O07", "O08", "O09", "O10", "O11", "O12", "O13", "O14", "O15", "O16", "O17", "O18", "O19", "O20", "O21", "O22"},
                {"P01", "P02", "P03", "P04", "P05", "P06", "P07", "P08", "P09", "P10", "P11", "P12", "P13", "P14", "P15", "P16", "P17", "P18", "P19", "P20", "P21", "P22"},
                {"Q01", "Q02", "Q03", "Q04", "Q05", "Q06", "Q07", "Q08", "Q09", "Q10", "Q11", "Q12", "Q13", "Q14", "Q15", "Q16", "Q17", "Q18", "Q19", "Q20", "Q21", "Q22"},
                {"R01", "R02", "R03", "R04", "R05", "R06", "R07", "   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"   " ,"R16" ,"R17" ,"R18", "R19", "R20", "R21", "R22"},

            };

        String inicializador = "1";

        while(!inicializador.equals("0")){
            System.out.println("==================MENU==================");
            System.out.printf(" 1) Visualizar o mapa de assentos.\n 2) Reservar um assento.\n 3) Liberar uma reserva.\n 4) Encontrar o primeiro assento livre.\n 5) Exibir estatísticas.\n");
            System.out.println();
            System.out.println("==========================================");
            System.out.println("Atenção, para encerrar o programa digite 0.");
            System.out.println("==========================================");
            System.out.println("Digite o numero da opção escolhida:");
            String opcaoUsuario = teclado.nextLine();
            inicializador = opcaoUsuario;

            switch(opcaoUsuario){
                case "0":
                    System.out.println("Fim do programa.");
                    break;
                    
                case "1":
                    mostrarAssentos(lugaresLivres);
                    break;

                case "2":
                    System.out.println("Reservando um assento");
                    reservarAssento(lugaresLivres, lugaresOcupados, lugaresPorTipoLivres, lugaresPorTipoOcupados);
                    mostrarAssentos(lugaresLivres);
                    break;

                case "3":
                    System.out.println("Liberando uma reserva");
                    liberarReserva(lugaresLivres, lugaresOcupados, lugaresPorTipoLivres, lugaresPorTipoOcupados);
                    mostrarAssentos(lugaresLivres);
                    break;

                case "4":
                    System.out.println("Encontrando primeiro assento disponivel");
                    procurarAssentoLivrePorTipo(lugaresLivres,lugaresOcupados, lugaresPorTipoLivres, lugaresPorTipoOcupados);
                    mostrarAssentos(lugaresLivres);
                    break;

                case "5":
                    System.out.println("Exibindo estatistica:");
                    exibirEstatistica(lugaresPorTipoOcupados);
                    mostrarAssentos(lugaresPorTipoLivres);
                    break;

                default:
                    System.out.println("Erro.");
                    break;
            }
        }

    }

    public static void mostrarAssentos (String[][] assentos){
        System.out.println("Visualizar o mapa de assentos");
        //mostrar matriz
        for (int l=0; l<assentos.length; l++)

        {   
            for (int c=0; c<assentos[0].length; c++)
            {
                System.out.printf(" %s ", assentos[l][c]);
            }
            System.out.println(); // quebra a linha
        }

    }

    public static String reservarAssento (String[][] lugaresLivres, String[][] lugaresOcupados, String[][] lugaresPorTipoLivres, String[][] lugaresPorTipoOcupados){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o assento:");
        String assento = teclado.nextLine().toUpperCase();

        int assentosOcupados = 0;
        String lugarOcupado = "---";

        for (int l=0; l<lugaresLivres.length; l++){   
            for (int c=0; c<lugaresLivres[0].length; c++){
                //o lugar escolhido ja estiver ocupado, ele vai saber pela matriz lugaresOcupados e ir para o else
                if(!assento.equals(lugaresOcupados[l][c])){
                    //se o lugar livre for igual ao que o usuario escreveu, a matriz lugaresOcupados recebe o assento escolhido
                    if(lugaresLivres[l][c].equals(assento)){ 
                        lugaresOcupados[l][c] = assento; 
                        lugaresLivres[l][c] = lugarOcupado;
                        //a matriz lugaresPorTipoOcupado vai receber a categoria do assento que o usuario escolheu e a lugaresPorTipoLivres vai receber o "---"
                        lugaresPorTipoOcupados[l][c] = lugaresPorTipoLivres[l][c];
                        lugaresPorTipoLivres[l][c] = lugarOcupado;
                        assentosOcupados++;
                    }
                } else {
                    System.out.println("Lugar ocupado, retorne ao menu.");
                }
            }
        }
        contador += assentosOcupados;
        return lugarOcupado;
    }

    public static String liberarReserva (String[][] lugaresLivres, String[][] lugaresOcupados, String[][] lugaresPorTipoLivres, String[][] lugaresPorTipoOcupados){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o assento:");
        String assento = teclado.nextLine().toUpperCase();

        String lugarOcupado = "---";
        int assentosOcupados = 0;
        for (int l=0; l<lugaresOcupados.length; l++){   
            for (int c=0; c<lugaresOcupados[0].length; c++){
                //se lugaresOcupados for igual ao que o usuario escreveu, lugaresOcupados volta a estar com o assento vazio
                if(lugaresOcupados[l][c].equals(assento)){
                    lugaresOcupados[l][c] = lugarOcupado;
                    lugaresLivres[l][c] = assento;
                    //a matriz lugaresPorTipoLivres vai receber de volta sua categoria e a matriz lugaresPorTipoOcupados vai voltar a estar desocupada naquele assento
                    lugaresPorTipoLivres[l][c] = lugaresPorTipoOcupados[l][c];
                    lugaresPorTipoOcupados[l][c] = lugarOcupado;
                    assentosOcupados --;
                }

            }
        }

        contador += assentosOcupados;
        return lugarOcupado;
    }

    public static String procurarAssentoLivrePorTipo (String[][] lugaresLivres, String[][] lugaresOcupados, String[][] lugaresPorTipoLivres, String[][] lugaresPorTipoOcupados){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tipo do assento: CMM(COMUM), PRE(PREMIUM), CAD(CADEIRANTE)");
        String tipoAssento = teclado.nextLine().toUpperCase();
        String lugarOcupado = "---";
        int assentosOcupados = 0;

        if(tipoAssento.equals("CMM") || tipoAssento.equals("PRE") || tipoAssento.equals("CAD")){
            for (int l=0; l<lugaresLivres.length; l++){   
                for (int c=0; c<lugaresLivres[0].length; c++){
                    // procura correspondencia do tipo de assento em cada elemento da matriz
                    if(lugaresPorTipoLivres[l][c].equals(tipoAssento)){
                        lugaresOcupados[l][c] = lugaresLivres[l][c];
                        lugaresPorTipoOcupados[l][c] = tipoAssento;
                        System.out.println("O primeiro assento livre escolhido foi: " + lugaresLivres[l][c]);
                        lugaresLivres[l][c] = lugarOcupado;
                        lugaresPorTipoLivres[l][c] = lugarOcupado;
                        tipoAssento = "";
                        assentosOcupados++;
                    }

                }
            }
        } else{
            System.out.println("Tipo de assento inexistente. vá para o menu novamente.");
        }

        contador += assentosOcupados;
        return lugarOcupado;
    }

    public static String exibirEstatistica (String[][] lugaresPorTipoOcupados){
        int qtdTotalDeAssentos = 375;
        System.out.printf("Lugares ocupados: %d\n", contador); 
        System.out.printf("Percentual de lugares ocupados: %f\n", (double)contador / qtdTotalDeAssentos);

        int faturamento = 0;
        for (int l=0; l<lugaresPorTipoOcupados.length; l++){   
            for (int c=0; c<lugaresPorTipoOcupados[0].length; c++){
                //pega a categoria de cada assento ocupado e soma o valor da respectiva
                if(lugaresPorTipoOcupados[l][c].equals("CMM")){ 
                    faturamento += 60;
                }

                if(lugaresPorTipoOcupados[l][c].equals("PRE")){
                    faturamento += 100;
                }

                if(lugaresPorTipoOcupados[l][c].equals("CAD")){
                    faturamento += 50;
                }

            }
        }
        System.out.printf("Faturamento: %s%.2f.\n","R$",(double)faturamento);

        return "";
    }
}