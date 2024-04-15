package algorithms5;
/**
 *
 D. Слоны и ладьи
 Ограничение времени 	1 секунда
 Ограничение памяти 	64Mb
 Ввод 	стандартный ввод или input.txt
 Вывод 	стандартный вывод или output.txt

 На шахматной доске стоят слоны и ладьи, необходимо посчитать, сколько клеток не бьется ни одной из фигур.
 Шахматная доска имеет размеры 8 на 8. Ладья бьет все клетки горизонтали и вертикали, проходящих через клетку,
 где она стоит, до первой встретившейся фигуры. Слон бьет все клетки обеих диагоналей, проходящих через клетку,
 где он стоит, до первой встретившейся фигуры.

 Формат ввода
 В первых восьми строках ввода описывается шахматная доска. Первые восемь символов каждой из этих строк описывают
 состояние соответствующей горизонтали: символ B (заглавная латинская буква) означает, что в клетке стоит слон,
 символ R — ладья, символ * — что клетка пуста. После описания горизонтали в строке могут идти пробелы, однако
 длина каждой строки не превышает 250 символов. После описания доски в файле могут быть пустые строки.

 Формат вывода
 Выведите количество пустых клеток, которые не бьются ни одной из фигур.

 Пример 1
 Ввод
 ********
 ********
 *R******
 ********
 ********
 ********
 ********
 ********
 Вывод
 49

 Пример 2
 Ввод
 ********
 ********
 ******B*
 ********
 ********
 ********
 ********
 ********
 Вывод
 54

 Пример 3
 Ввод
 ********
 *R******
 ********
 *****B**
 ********
 ********
 ********
 ********
 Вывод
 40
 */

import java.util.Scanner;

public class Task1D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] chessBoardInitial = new String[8];
        for (int i = 0; i < chessBoardInitial.length; i++) {
        chessBoardInitial[i] = s.nextLine();
        }

        char [][] chBo = new char [8][8];
        for (int i = 0; i < chBo.length; i++) {
            for (int j = 0; j < chBo.length; j++) {
                chBo [i][j] = chessBoardInitial [i].charAt(j);
            }
        }

        char [][] chessB = new char [10][10];
        for (int i = 0; i < chessB.length; i++) {
            for (int j = 0; j < chessB.length; j++) {
                if (i == 0 | j == 0 | i == chessB.length - 1 | j == chessB.length - 1){
                    chessB [i][j] = 'E';
                }
                else {
                    chessB [i][j] = chBo [i-1][j-1];
                }
            }
        }

        for (int i = 0; i < chessB.length; i++) {
            for (int j = 0; j < chessB.length; j++) {
                if (chessB[i][j] == 'B'){
                    int k = i, l = j;
                    while (chessB[k-1][l-1] == '*' | chessB[k-1][l-1] == 'X'){
                        chessB[k-1][l-1] = 'X';
                        k--;
                        l--;
                    }
                    k = i;
                    l = j;
                    while (chessB[k-1][l+1] == '*' | chessB[k-1][l+1] == 'X'){
                        chessB[k-1][l+1] = 'X';
                        k--;
                        l++;
                    }
                    k = i;
                    l = j;
                    while (chessB[k+1][l-1] == '*' | chessB[k+1][l-1] == 'X'){
                        chessB[k+1][l-1] = 'X';
                        k++;
                        l--;
                    }
                    k = i;
                    l = j;
                    while (chessB[k+1][l+1] == '*' | chessB[k+1][l+1] == 'X'){
                        chessB[k+1][l+1] = 'X';
                        k++;
                        l++;
                    }
                }
                if (chessB[i][j] == 'R'){
                    int k = i, l = j;
                    while (chessB[k-1][l] == '*' | chessB[k-1][l] == 'X'){
                        chessB[k-1][l] = 'X';
                        k--;

                    }
                    k = i;
                    while (chessB[k][l+1] == '*' | chessB[k][l+1] == 'X'){
                        chessB[k][l+1] = 'X';

                        l++;
                    }
                    l = j;
                    while (chessB[k+1][l] == '*' | chessB[k+1][l] == 'X'){
                        chessB[k+1][l] = 'X';
                        k++;

                    }
                    k = i;
                    while (chessB[k][l-1] == '*' | chessB[k][l-1] == 'X'){
                        chessB[k][l-1] = 'X';

                        l--;
                    }
                }

            }
        }

        int sum = 0;
        for (int i = 0; i < chessB.length; i++) {
            for (int j = 0; j < chessB.length; j++) {
                if (chessB[i][j] == '*'){
                    sum++;
                }
            }
        }

        System.out.println(sum);

    }

}
