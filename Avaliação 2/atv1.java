import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];

        // Receber as 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Calcular médias semestrais
        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;

        // Calcular média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2.0;

        // Exibir resultados
        System.out.println("\nMédias Bimestrais:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Bimestre %d: %.2f%n", i + 1, mediasBimestrais[i]);
        }

        System.out.printf("\nMédia do 1º Semestre: %.2f%n", mediaSemestre1);
        System.out.printf("Média do 2º Semestre: %.2f%n", mediaSemestre2);
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        scanner.close();
    }
}
