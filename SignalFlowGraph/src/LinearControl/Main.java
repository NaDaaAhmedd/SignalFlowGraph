package LinearControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Signal Flow Graph");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Number of vertices : ");
            int numv = sc.nextInt();
            System.out.print("Number of Edges : ");
            int nume = sc.nextInt();
            System.out.print("Start node : ");
            int start = sc.nextInt();
            while (start < 0 || start > numv - 1) {
                System.out.print("Can't be start node, Try again.");
                start = sc.nextInt();
            }
            System.out.print("End node : ");
            int end = sc.nextInt();
            while (end < 0 || end > numv - 1) {
                System.out.print("Can't be end node, Try again.");
                end = sc.nextInt();
            }
            Graph sfg = new Graph(numv, start, end);
            System.out.println("Enter the edges : 'from to weight' ");
            for (int i = 0; i < nume; i++) {
                sfg.addEdge(sc.nextInt(), sc.nextInt(), sc.nextDouble());
            }
            System.out.println("Transfer Function = " + sfg.solveSFG());
            System.out.println("For exit -1" + "\n" + "Try another SFG 0");
            int choice = sc.nextInt();
            while (choice != 0 && choice != 1) {
                System.out.print("Try again. 0 or -1");
                choice = sc.nextInt();
            }
            if (choice == -1) break;
        }

        /*System.out.println("Example 1:");
        Graph sfg1 = new Graph(7, 0, 5);
        sfg1.addEdge(0, 1, 1);
        sfg1.addEdge(1, 2, 5);
        sfg1.addEdge(2, 3, 10);
        sfg1.addEdge(3, 4, 2);
        sfg1.addEdge(4, 5, 1);
        sfg1.addEdge(1, 6, 10);
        sfg1.addEdge(6, 4, 2);
        sfg1.addEdge(6, 6, -1);
        sfg1.addEdge(4, 1, -1);
        sfg1.addEdge(4, 3, -2);
        sfg1.addEdge(3, 2, -1);
        double res = sfg1.solveSFG();
        System.out.println("Transfer function = " + res);

        System.out.println("Example 2:");
        Graph sfg2 = new Graph(8, 0, 7);
        sfg2.addEdge(0, 1, 5);
        sfg2.addEdge(1, 2, 2);
        sfg2.addEdge(2, 1, 1);
        sfg2.addEdge(2, 3, 1);
        sfg2.addEdge(3, 4, 3);
        sfg2.addEdge(4, 3, 4);
        sfg2.addEdge(4, 5, 1);
        sfg2.addEdge(5, 5, 15);
        sfg2.addEdge(5, 6, 2);
        sfg2.addEdge(6, 6, 10);
        sfg2.addEdge(6, 7, 8);
        sfg2.addEdge(0, 5, 10);
        System.out.println("Transfer function = " + sfg2.solveSFG());*/

    }
}
