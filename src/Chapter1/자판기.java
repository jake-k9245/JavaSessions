package Chapter1;

public class 자판기 {

    // 속성
    private String 음료수;
    private Integer 가격;
    private Integer 잔액;
    private Integer 재고;
    private String 지불방법;

    // 생성자
    public 자판기(String 음료수, Integer 가격, Integer 잔액, Integer 재고, String 지불방법) {

        this.음료수 = 음료수;
        this.가격 = 가격;
        this.잔액 = 잔액;
        this.재고 = 재고;
        this.지불방법 = 지불방법;

    }

    // 메소드(기능)
    public void 음료꺼내기() {
        if(this.잔액 >= this.가격 && this.재고 > 0) {
            this.재고 -= 1;
            this.잔액 -= this.가격;
        } else {
            System.out.println("잔액이 없습니다.");
        }

    }

    public void 메뉴보여주기() {


    }

    public void 잔돈_반환() {


    }

    public void 풀절알림() {


    }

    public void 전력사용() {


    }

    public void 온도조절() {


    }

    public void 고장여부() {


    }

        public void 입급하기(Integer 입금) {
            if(입금 > 0) {
                this.잔액 += 입금;
            }

    }

    public void 자판기상황() {
        System.out.println("------------");
        System.out.println("현재 자판기 재고는 : " + this.재고);
        System.out.println("현재 자판기 잔액은 : " + this.잔액);
        System.out.println("현재 자판기 음료수는 : " + this.음료수);
        System.out.println("현재 자판기 가격은 : " + this.가격);
        System.out.println("------------");
    }

    public Integer get가격() {
        return this.가격;
    }
}
