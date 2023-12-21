import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        //人数
        int n = r.nextInt();
        int m = r.nextInt();
        Volunteer[] volunteers = new Volunteer[n];
        for (int i = 0; i < n; i++) {
            int id = r.nextInt();
            int score = r.nextInt();
            volunteers[i] = new Volunteer(id, score);
        }

        Arrays.sort(volunteers);
        int index = (int) (m * 1.5);
        if (index > n) {
            index = n;
        }
        int okScore = volunteers[index - 1].score;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (volunteers[i].score < okScore) {
                break;
            } else {
                count++;
            }
        }
        for (int i = 0; i < count-1; i++) {
            for (int j = 0; j < count-i-1; j++) {
                if (volunteers[j].score == volunteers[j+1].score) {
                    if (volunteers[j].id > volunteers[j+1].id) {
                        // 交换 volunteers[j] 和 volunteers[j+1]
                        Volunteer tmp = volunteers[j];
                        volunteers[j] = volunteers[j+1];
                        volunteers[j+1] = tmp;
                    }
                }
            }
        }

            System.out.println(okScore + " " + count);
            for (int i = 0; i < count; i++) {
                System.out.println(volunteers[i].id + " " + volunteers[i].score);
            }
        }


    }

class Volunteer implements Comparable<Volunteer> {
    int id;
    int score;

    public Volunteer() {

    }

    public Volunteer(int id, int score) {
        this.id = id;
        this.score = score;
    }


    @Override
    public int compareTo(Volunteer o) {
        if (o.score > this.score) {
            return 1;
        } else if (o.score < this.score) {
            return -1;
        } else {
            return 0;
        }

    }
}