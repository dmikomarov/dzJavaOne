package guru.qa;

public class Math {
  public static void main(String[] args) {

    byte first = 122;
    byte second = 121;
    System.out.println(first + second);
    System.out.println(first - second);
    System.out.println(first * second);
    System.out.println(first / second);
    System.out.println(first % second);
    System.out.println(first++);
    System.out.println(first--);
    System.out.println(--second);
    System.out.println(++second);

    System.out.println("Space");
    short three = 32156;
    short four = 32095;
    System.out.println(three + four);
    System.out.println(three - four);
    System.out.println(three * four);
    System.out.println(three / four);
    System.out.println(three % four);
    System.out.println(three++);
    System.out.println(three--);
    System.out.println(++four);
    System.out.println(--four);

    System.out.println("Space");
    int big = 16666666;
    int bigger = 222222222;
    System.out.println(big + bigger);
    System.out.println(big - bigger);
    System.out.println(big * bigger);
    System.out.println(big / bigger);
    System.out.println(big % bigger);

    System.out.println("Space");
    long longest = 999999999;
    long longer = 999999991;
    System.out.println(longest + longer);
    System.out.println(longest - longer);
    System.out.println(longest * longer);
    System.out.println(longest / longer);
    System.out.println(longest % longer);

    System.out.println("Space");
    float flo = 56.5f;
    float flor = 99.3f;
    System.out.println(flor + flo);
    System.out.println(flor - flo);
    System.out.println(flor * flo);
    System.out.println(flor / flo);
    System.out.println(flor % flo);

    System.out.println("Space");
    double dou = 33.22;
    double dot = 66.99;
    System.out.println(dot + dou);
    System.out.println(dot - dou);
    System.out.println(dot * dou);
    System.out.println(dot / dou);
    System.out.println(dot % dou);

    System.out.println("Space");
    char chaaa = 'f';
    char chis = 'u';
    System.out.println(chaaa + chis);
    System.out.println(chaaa - chis);
    System.out.println(chaaa * chis);
    System.out.println(chaaa / chis);
    System.out.println(chaaa % chis);

    System.out.println("Space");
    //для разных примитивов
    System.out.println(first + chaaa);
    System.out.println(first - dou);
    System.out.println(dou * longer);
    System.out.println(first / flor);
    System.out.println(big % dot);

    System.out.println("Space");
    //побитовые операторы
    System.out.println(first & chaaa);
    System.out.println(first | longer);
    System.out.println(first ^ big);
    System.out.println(~second);
    System.out.println(second>>2);
    System.out.println(second>>>3);


    System.out.println("Space");
    //логические операторы
    boolean a = true;
    boolean b = false;
    System.out.println(a && b);
    System.out.println(a || b);
    System.out.println(!(a && b));

  }


}
