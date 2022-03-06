package task1;

    public class Alg5 {
        public static void main(String[] args) {
            Alg5 alg5 = new Alg5();
            alg5.choice();
        }

        private void choice() {
            int[] a = new int[]{0, 1, 1, 4, 5, 2, 7, 11, 9, 10};

            for (int i = 1; i < a.length; i++) {
                if (a[i] > i) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }


