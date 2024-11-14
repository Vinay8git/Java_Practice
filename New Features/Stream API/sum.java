import java.util.*;

class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size Of List: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter: ");
            al.add(sc.nextInt());
        }
        
        int sum = al.stream()
                    .filter(num -> num % 2 == 0)  // Filter even numbers
                    .mapToInt(Integer::intValue)   // Map to an IntStream
                    .sum();                        // Sum the even numbers
        
        System.out.println("Sum of even numbers: " + sum);
    }
}
