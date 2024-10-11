fn main() {
    let mut n5 = 5;
    let mut n = 3;

    let mut sum = 0;

    while n < 1000 {
        if n > n5 {
            sum = sum + n5;
            n5 = n5 + 5;
        } else if n == n5 {
            n5 = n + 5;
        }
        sum = sum + n;
        n = n + 3;
    }

    println!("{}", sum);
}
