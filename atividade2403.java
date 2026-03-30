import java.util.ArrayList;
import java.util.Scanner;

public class atividade2403 {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        int[] numeros = new int[15];
        int[] unicos = new int[15];
        int tamanhoUnicos = 0;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            boolean existe = false;


            for(int j = 0; j < tamanhoUnicos; j++){
                if(numeros[i] == unicos[j]){
                    existe = true;
                    break;
                }
            }

            if (!existe){
                unicos[tamanhoUnicos] = numeros[i];
                tamanhoUnicos++;
            }
        }
        System.out.println("\nvalores Unicos: ");
        for(int i = 0; i < tamanhoUnicos; i++){
            System.out.println(unicos[i]);
        }
        sc.close();
    }


    public static void main2(String[] args) {

       

        int numeros1[] = new int[10];
        int numeros2[] = new int[10];
        int juntos[] = new int[20];
        int tamanho = 0;

        // leitura
        for (int i = 0; i < numeros1.length; i++) {
            System.out.print("Digite um numero: ");
            numeros1[i] = sc.nextInt();

            System.out.print("Digite outro: ");
            numeros2[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros1.length; i++) {

            for (int j = 0; j < numeros2.length; j++) {

                if (numeros1[i] == numeros2[j]) {

                    juntos[tamanho] = numeros1[i];
                    tamanho++;
                    break; 
                }
            }
        }

  
        System.out.println("\nElementos em comum:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(juntos[i]);
        }

        sc.close();
    }


    public static void main3(String[] args) {
      

        int[] array = new int[8];
        int[] resultado = new int[8];

        
        System.out.println("Digite 8 números:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        
        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();


        N = N % array.length;

       
        for (int i = 0; i < array.length; i++) {
            int novaPosicao = (i + N) % array.length;
            resultado[novaPosicao] = array[i];
        }

        System.out.println("Array rotacionado:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        sc.close();
    }


    public static void main4(String[] args) {
        

        int[] numeros = new int[20];
        boolean[] contado = new boolean[20];

        System.out.println("Digite 20 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        
        for (int i = 0; i < numeros.length; i++) {

            if (contado[i]) {
                continue; 
            }

            int contador = 1;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                    contado[j] = true;
                }
            }

            System.out.println(numeros[i] + " aparece " + contador + " vezes");
        }

        sc.close();
    }


    public static void main5(String[] args) {


        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

       
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            numeros.add(num);
        }

        
        for (int i = 0; i < numeros.size(); i++) {

            int valor = numeros.get(i);

            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

    
        System.out.println("\nPares:");
        for (int i = 0; i < pares.size(); i++) {
            System.out.println(pares.get(i));
        }

        System.out.println("\nÍmpares:");
        for (int i = 0; i < impares.size(); i++) {
            System.out.println(impares.get(i));
        }

        sc.close();
    }
    public static void main6(String[] args) {

        
        ArrayList<Integer> numeros = new ArrayList<>();

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(sc.nextInt());
        }

        
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size() - 1; j++) {

                if (numeros.get(j) > numeros.get(j + 1)) {

                    // troca
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nOrdenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        sc.close();
    }
    public static void main7(String[] args) {

       

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();

        System.out.print("Quantos elementos na lista 1? ");
        int n1 = sc.nextInt();

        System.out.print("Quantos elementos na lista 2? ");
        int n2 = sc.nextInt();

        System.out.println("Digite os valores da lista 1:");
        for (int i = 0; i < n1; i++) {
            lista1.add(sc.nextInt());
        }

    
        System.out.println("Digite os valores da lista 2:");
        for (int i = 0; i < n2; i++) {
            lista2.add(sc.nextInt());
        }

        int i = 0;

      
        while (i < lista1.size() || i < lista2.size()) {

            if (i < lista1.size()) {
                resultado.add(lista1.get(i));
            }

            if (i < lista2.size()) {
                resultado.add(lista2.get(i));
            }

            i++;
        }

    
        System.out.println("\nLista intercalada:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        sc.close();
    }
    public static void main8(String[] args) {

        
        ArrayList<Integer> numeros = new ArrayList<>();

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(sc.nextInt());
        }

      
        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        double media = (double) soma / numeros.size();

       
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < media) {
                numeros.remove(i);
                i--; 
            }
        }

       
        System.out.println("\nMédia: " + media);
        System.out.println("Lista após remoção:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }

        sc.close();
    }
    public static void main9(String[] args) {

        

        System.out.print("Tamanho do array: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

       
        System.out.println("Digite os numeros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int somaAtual = numeros[0];
        int maiorSoma = numeros[0];

        int inicioTemp = 0;
        int inicio = 0;
        int fim = 0;

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > somaAtual + numeros[i]) {
                somaAtual = numeros[i];
                inicioTemp = i;
            } else {
                somaAtual += numeros[i];
            }

            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
                inicio = inicioTemp;
                fim = i;
            }
        }

        System.out.println("\nMaior soma: " + maiorSoma);
        System.out.print("Sublista: ");

        for (int i = inicio; i <= fim; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
      public static void main10(String[] args) {

     
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir nome");
            System.out.println("2 - Buscar nome");
            System.out.println("3 - Atualizar nome");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Mostrar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    break;

                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();

                    if (nomes.contains(busca)) {
                        System.out.println("Nome encontrado!");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome que deseja atualizar: ");
                    String antigo = sc.nextLine();

                    int indice = nomes.indexOf(antigo);

                    if (indice != -1) {
                        System.out.print("Digite o novo nome: ");
                        String novo = sc.nextLine();
                        nomes.set(indice, novo);
                        System.out.println("Nome atualizado!");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome para remover: ");
                    String remover = sc.nextLine();

                    if (nomes.remove(remover)) {
                        System.out.println("Removido com sucesso!");
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\nLista de nomes:");
                    for (String n : nomes) {
                        System.out.println(n);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

      

