void main() {
    boolean a = true;
    boolean b = false;

//    System.out.println(a & b);
//    System.out.println(a && b);
    // false && true .... && true
//    System.out.println(a | b);
//    System.out.println(a || b);

//    System.out.println(!a);

    // XOR
//    System.out.println(a ^ b);
//    System.out.println(a ^ a);
//    System.out.println(b ^ b);

    // a ^ a ^ a
    // true ^ true ^ true
    // false ^ true
    // true
//    System.out.println(a ^ a ^ a);






    // if-else
//    int age = 16;
//    if (age >= 18) {
//        System.out.println("ინებეთ");
//    } else {
//        System.out.println("ვერ იყიდით");
//    }


    // Scoring
//    int score = 96;
//    if (score > 90) {
//        System.out.println("A");
//    } else if (score > 80) {
//        System.out.println("B");
//    } else if (score > 70) {
//        System.out.println("C");
//    } else if (score > 60) {
//        System.out.println("D");
//    } else {
//        System.out.println("F");
//    }


//    int weekday = 20;
//    switch (weekday) {
//        case 1:
//            System.out.println("ორშაბათი");
//            break;
//        case 2:
//            System.out.println("სამშაბათი");
//            break;
//        case 3:
//            System.out.println("ოთხშაბათი");
//            break;
//        case 4:
//            System.out.println("ხუთშაბათი");
//            break;
//        case 5:
//            System.out.println("პარასკევი");
//            break;
//        case 6:
//            System.out.println("შაბათი");
//            break;
//        case 7:
//            System.out.println("კვირა");
//            break;
//        default:
//            System.out.println("ასეთი კვირის დღე არ არსებობს");
//    }





//    String childName = "";
//    String gender = "f";
//    if (gender == "m") {
//        childName = "ბადრი";
//    } else {
//        childName = "თეკლა";
//    }
//    System.out.println(childName);




//    String gender = "m";
//    String childName = (gender == "m") ? "ბადრი" : "თეკლა";
//    System.out.println(childName);




    // compare | and ||
    System.out.println(method1() || method2());
    System.out.println("_____________________________________");
    System.out.println(method1() | method2());
}

boolean method1() {
    System.out.println("method 1");
    return true;
}
boolean method2() {
    System.out.println("method 2");
    return false;
}