void main() {
    for (int i = 1; i <= 5; i++) {
        System.out.print(i + " ");
    }

    int j = 1;
    while (j <= 5) {
        System.out.print(j + " ");
        j++;
    }

    int k = 1;
    do {
        System.out.print(k + " ");
        k++;
    } while (k <= 5);

    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break;
        }
        System.out.print(i + " ");
    }

    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            continue;
        }
        System.out.print(i + " ");
    }

    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    System.out.println("Элементы двумерного массива:");
    for (int i = 0; i< matrix.length; i++) {
        for (int n = 0; j < matrix[n].length; n++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();

    }
}