package practice.java_basic.chapter_2.oop.encapsulation.wallet;

public class Wallet {

      // 지갑이 실제로 가지고 있는 돈(필드)
      // private으로 막아서 외부에서 직접 수정하지 못하게 한다.
    private int money;

      // Wallet 객체를 만들 때 처음 가진 돈을 설정하는 `생성자`
    public Wallet(int money) {

            // 처음 가진 돈이 음수라면 말이 안 되므로 0원으로 설정한다.
        if (money < 0) {
            this.money = 0;

        } else {
            this.money = money;
        }
    }

       // 지갑에 돈을 넣는 `기능`
    public void deposit(int amount) {

             // 0원 이하의 돈은 넣을 수 없으므로 막는다.
        if (amount <= 0) {
            System.out.println("넣을 돈은 0보다 커야 합니다.");
            return;
        }

             // 기존 돈에 새로 넣은 돈을 더한다.
        money = money + amount;

        System.out.println(amount + "원을 지갑에 넣었습니다.");
    }

      // 지갑에서 돈을 빼는 `기능`
    public void withdraw(int amount) {

            // 0원 이하의 돈은 뺄 수 없으므로 막는다.
        if (amount <= 0) {
            System.out.println("뺄 돈은 0보다 커야 합니다.");
            return;
        }

            // 현재 가진 돈보다 많이 뺄 수 없으므로 막는다.
        if (amount > money) {
            System.out.println("지갑에 돈이 부족합니다.");
            return;
        }

            // 기존 돈에서 사용한 돈을 뺀다.
        money = money - amount;

        System.out.println(amount + "원을 지갑에서 뺐습니다.");
    }

        // 현재 지갑에 있는 돈을 조회하는 `기능`.getter
    public int getMoney() {
        return money;
    }
}