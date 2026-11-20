package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale1 = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Saba saba1 =new Saba();
        // Mammal saba2 = new Saba(); //saba는 Mammal을 상속받지않음으로 에러발생

        // ----------------------------------------------------------

        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();
        arr[2] = new Mammal();

        // --------------------------------------------------------
        //업캐스팅 : 자식클래스가 부모클래스 타입으로 캐스팅 되는 것
        // - 부모클래스로 캐스팅 되면 자식클래스에 있는 맴버에는 접근 불가능
        Mammal upCasting1 = new Whale();
        // upCasting1.swimming(); // 자식클래스의 swimming() 접근 불가

        // 다운캐스팅 : 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는 것
        Whale downCasting1  = (Whale) upCasting1;
        downCasting1.swimming(); // 다운캐스팅으로 Whale()의 swimming접근 가능

        // 상위클래스로 선언한 건 하위 클래스로 다운캐스팅 되지 않는다.
        // Mammal mammal1 = new Mammal();
        // Whale whale3 = (Whale) mammal1;
    }
}
