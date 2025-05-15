//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        자판기 음료수자판기 = new 자판기("포카리스웨트", 100, 0, 3, "현금");

        System.out.println("------시작------");
        음료수자판기.자판기상황();
        음료수자판기.입급하기(100);
        System.out.println("---------------");
        Integer 가격 = 음료수자판기.get가격();
        음료수자판기.자판기상황();
        음료수자판기.음료꺼내기();
        음료수자판기.음료꺼내기();
        System.out.println("---------------");
        음료수자판기.자판기상황();
        System.out.println("------종료------");
    }
}