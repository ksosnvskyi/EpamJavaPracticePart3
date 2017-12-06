    public class Part3 {

        public static void main(String[] args) {
            System.out.println("nod: " + nod(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }

        private static int nod(int a, int b) {
            int nod = 0;

		/* Argument checking */
            if (a < 0 || b < 0) {
                System.out.println("Number(s) not positive! Resoult - " + nod);
                return nod;
            } else {
			/* Algorim of Evclid */
                if (b == 0) {
                    return a;
                } else {
                    return nod(b, a % b);
                }
            }
        }
    }