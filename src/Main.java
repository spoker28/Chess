import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        boolean game = true;
        boolean hod = true;
//        boolean colorhoda = false;
        char[][] pole = new char[8][9];
        int[][] colorkletki = new int[8][9];// 0 - черная 1 - белая 2 - пустая
        String Alphabet = " A B C D E F G H";
        Scanner sc = new Scanner(System.in);
        Figure p21 = new Peshka('a', 2, '♟', false);// false = black
        Figure p22 = new Peshka('b', 2, '♟', false);// возможно добавить функцию того что съели ли ее ил нет
        Figure p23 = new Peshka('c', 2, '♟', false);// убрать координаты вместо этого просто смотреть на рисунок  в  string
        Figure p24 = new Peshka('d', 2, '♟', false);
        Figure p25 = new Peshka('e', 2, '♟', false);
        Figure p26 = new Peshka('f', 2, '♟', false);
        Figure p27 = new Peshka('g', 2, '♟', false);
        Figure p28 = new Peshka('h', 2, '♟', false);
        Figure l21 = new Ladia('a', 1, '♜', false);
        Figure l22 = new Ladia('h', 1, '♜', false);
        Figure h21 = new Horse('b', 1, '♞', false);
        Figure h22 = new Horse('g', 1, '♞', false);
        Figure e21 = new Elaphant('c', 1, '♝', false);
        Figure e22 = new Elaphant('f', 1, '♝', false);
        Figure f2 = new Ferz('d', 1, '♛', false);
        Figure k2 = new King('e', 1, '♚', false);
        Figure p11 = new Peshka('a', 7, '♙', true);// true = white
        Figure p12 = new Peshka('b', 7, '♙', true);
        Figure p13 = new Peshka('c', 7, '♙', true);
        Figure p14 = new Peshka('d', 7, '♙', true);
        Figure p15 = new Peshka('e', 7, '♙', true);
        Figure p16 = new Peshka('f', 7, '♙', true);
        Figure p17 = new Peshka('g', 7, '♙', true);
        Figure p18 = new Peshka('h', 7, '♙', true);
        Figure l11 = new Ladia('a', 8, '♖', true);
        Figure l12 = new Ladia('h', 8, '♖', true);
        Figure h11 = new Horse('b', 8, '♘', true);
        Figure h12 = new Horse('g', 8, '♘', true);
        Figure e11 = new Elaphant('c', 8, '♗', true);
        Figure e12 = new Elaphant('f', 8, '♗', true);
        Figure f1 = new Ferz('d', 8, '♕', true);
        Figure k1 = new King('e', 8, '♔', true);
        Period p = new Period();
        for (int i = 0; i < 8; ++i) {
            for (int j = 1; j <= 8; ++j) {
                colorkletki[i][j]=2;
                if(i<2 && j<9)
                    colorkletki[i][j]=0;
                else
                if(i>5 && j<9)
                    colorkletki[i][j]=1;
            }
        }
        //while(game){
//        for(int z =1 ;z<8;++z) { // проверка
            System.out.print(Alphabet + '\n');
            for (int i = 0; i < 8; ++i) {
                for (int j = 1; j <= 8; ++j) {
                    pole[i][j] = '▭';
                }
            }
            pole[p21.y1 - 1][p21.x1 - 'a' + 1] = p21.picture;
            pole[p22.y1 - 1][p22.x1 - 'a' + 1] = p22.picture;
            pole[p23.y1 - 1][p23.x1 - 'a' + 1] = p23.picture;
            pole[p24.y1 - 1][p24.x1 - 'a' + 1] = p24.picture;
            pole[p25.y1 - 1][p25.x1 - 'a' + 1] = p25.picture;
            pole[p26.y1 - 1][p26.x1 - 'a' + 1] = p26.picture;
            pole[p27.y1 - 1][p27.x1 - 'a' + 1] = p27.picture;
            pole[p28.y1 - 1][p28.x1 - 'a' + 1] = p28.picture;
            pole[l21.y1 - 1][l21.x1 - 'a' + 1] = l21.picture;
            pole[l22.y1 - 1][l22.x1 - 'a' + 1] = l22.picture;
            pole[h21.y1 - 1][h21.x1 - 'a' + 1] = h21.picture;
            pole[h22.y1 - 1][h22.x1 - 'a' + 1] = h22.picture;
            pole[e21.y1 - 1][e21.x1 - 'a' + 1] = e21.picture;
            pole[e22.y1 - 1][e22.x1 - 'a' + 1] = e22.picture;
            pole[k2.y1 - 1][k2.x1 - 'a' + 1] = k2.picture;
            pole[f2.y1 - 1][f2.x1 - 'a' + 1] = f2.picture;
            pole[p11.y1 - 1][p11.x1 - 'a' + 1] = p11.picture;
            pole[p12.y1 - 1][p12.x1 - 'a' + 1] = p12.picture;
            pole[p13.y1 - 1][p13.x1 - 'a' + 1] = p13.picture;
            pole[p14.y1 - 1][p14.x1 - 'a' + 1] = p14.picture;
            pole[p15.y1 - 1][p15.x1 - 'a' + 1] = p15.picture;
            pole[p16.y1 - 1][p16.x1 - 'a' + 1] = p16.picture;
            pole[p17.y1 - 1][p17.x1 - 'a' + 1] = p17.picture;
            pole[p18.y1 - 1][p18.x1 - 'a' + 1] = p18.picture;
            pole[l11.y1 - 1][l11.x1 - 'a' + 1] = l11.picture;
            pole[l12.y1 - 1][l12.x1 - 'a' + 1] = l12.picture;
            pole[h11.y1 - 1][h11.x1 - 'a' + 1] = h11.picture;
            pole[h12.y1 - 1][h12.x1 - 'a' + 1] = h12.picture;
            pole[e11.y1 - 1][e11.x1 - 'a' + 1] = e11.picture;
            pole[e12.y1 - 1][e12.x1 - 'a' + 1] = e12.picture;
            pole[k1.y1 - 1][k1.x1 - 'a' + 1] = k1.picture;
            pole[f1.y1 - 1][f1.x1 - 'a' + 1] = f1.picture;
            pole[0][0] = 'Ⅰ';// потом поменять местами цифры
            pole[1][0] = 'Ⅱ';
            pole[2][0] = 'Ⅲ';
            pole[3][0] = 'Ⅳ';
            pole[4][0] = 'Ⅴ';
            pole[5][0] = 'Ⅵ';
            pole[6][0] = 'Ⅶ';
            pole[7][0] = 'Ⅷ';
            for (int i = 0; i < 8; ++i) {
                for (int j = 0; j < 9; ++j) {
                    System.out.print(pole[i][j]);
                }
                System.out.println();
            }
       // возможный вариант
        // hod=true;
       // while(hod){
         /*   char x1 = sc.next(".").charAt(0);
            int y1 = sc.nextInt();
            char x2 = sc.next(".").charAt(0);
            int y2 = sc.nextInt();
              if (x1 == p11.x1 && y1 == p11.y1) {
                if (p11.possibility(x1, y1, x2, y2, p11.color) && p.isColorhoda() == p11.color) {
                    p11.x1 = x2;
                    p11.y1 = y2;
                    hod = false;
                    colorkletki[y2-1][x2-'a'+1] =-("false".indexOf("" + p11.color));
                    colorkletki[y1-1][x2-'a'+1] = 2;
                }
            }
            if (x1 == p12.x1 && y1 == p12.y1) {
                if (p12.possibility(x1, y1, x2, y2, p12.color) && p.isColorhoda() == p12.color) {
                    p12.x1 = x2;
                    p12.y1 = y2;
                    hod = false;
                    colorkletki[y2-1][x2-'a'+1] =-("false".indexOf("" + p12.color));
                    colorkletki[y1-1][x2-'a'+1] = 2;
                }
            }















            else
                  System.out.println("Не верный ход");
        }*/
    }
}