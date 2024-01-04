package cmo.yuanshen.regexPa;

public class Demo4 {
    public static void main(String[] args) {
        String regex1="(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("bsdf3b".matches(regex1));
        System.out.println("------------------------");

        String regex2="(.+).+\\1";
        System.out.println("ab123ab".matches(regex2));
        System.out.println("ba234bac".matches(regex2));
        System.out.println("ada123ada".matches(regex2));

        System.out.println("----------------------------");
        String regex3="((.)+).+\\1";
        //这里注意要看左括号来判断组数
        String regex4="((.)\\2+).+\\1";
        System.out.println("ab123ab".matches(regex3));
        System.out.println("ba234bac".matches(regex3));
        System.out.println("ada123ada".matches(regex3));




    }
}
