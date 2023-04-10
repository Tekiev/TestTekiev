import java.util.Scanner;

public class Main {

    public static String calc(String input) {

        int res = 0;

        String result = "";

        input = input.replaceAll("\\s", "");

        if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {

            if (input.contains("I") || input.contains("V") || input.contains("X")) {

                if (input.contains("1") ||input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("6") || input.contains("7") || input.contains("8") || input.contains("9")) {

                    throw new IllegalArgumentException("Используются одноверменно разные системы счисления");

                }

                if (input.contains("+")) {

                    String[] parts1 = input.split("\\+");

                    if (parts1.length < 3) {

                        if ((RomanNumeral.valueOf(parts1[0]).getV() > 0 && RomanNumeral.valueOf(parts1[0]).getV() <= 10) && (RomanNumeral.valueOf(parts1[1]).getV() > 0 && RomanNumeral.valueOf(parts1[1]).getV() <= 10)) {

                            res = RomanNumeral.valueOf(parts1[0]).getV() + RomanNumeral.valueOf(parts1[1]).getV();

                            result = RomanNumeral.values()[res - 1] + "";

                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");

                        }
                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");

                    }

                } else if (input.contains("-")) {

                    String[] parts1 = input.split("-");

                    if (parts1.length < 3) {

                        if ((RomanNumeral.valueOf(parts1[0]).getV() > 0 && RomanNumeral.valueOf(parts1[0]).getV() <= 10) && (RomanNumeral.valueOf(parts1[1]).getV() > 0 && RomanNumeral.valueOf(parts1[1]).getV() <= 10)) {

                            res = RomanNumeral.valueOf(parts1[0]).getV() - RomanNumeral.valueOf(parts1[1]).getV();

                            if (res > 0) {

                                result = RomanNumeral.values()[res - 1] + "";

                            } else {

                                throw new IllegalArgumentException("В римской системе счисления нет отрицательных чисел");
                            }

                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");

                        }
                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }

                } else if (input.contains("*")) {

                    String[] parts1 = input.split("\\*");

                    if (parts1.length < 3) {

                        if ((RomanNumeral.valueOf(parts1[0]).getV() > 0 && RomanNumeral.valueOf(parts1[0]).getV() <= 10) && (RomanNumeral.valueOf(parts1[1]).getV() > 0 && RomanNumeral.valueOf(parts1[1]).getV() <= 10)) {

                            res = RomanNumeral.valueOf(parts1[0]).getV() * RomanNumeral.valueOf(parts1[1]).getV();

                            result = RomanNumeral.values()[res - 1] + "";
                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");

                        }

                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }

                } else if (input.contains("/")) {

                    String[] parts1 = input.split("/");

                    if (parts1.length < 3) {

                        if ((RomanNumeral.valueOf(parts1[0]).getV() > 0 && RomanNumeral.valueOf(parts1[0]).getV() <= 10) && (RomanNumeral.valueOf(parts1[1]).getV() > 0 && RomanNumeral.valueOf(parts1[1]).getV() <= 10)) {

                            res = RomanNumeral.valueOf(parts1[0]).getV() / RomanNumeral.valueOf(parts1[1]).getV();

                            result = RomanNumeral.values()[res - 1] + "";

                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");
                        }

                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }

                }

            } else {

                if (input.contains("+")) {

                    String[] parts1 = input.split("\\+");

                    if (parts1.length < 3) {

                        if ((Integer.parseInt(parts1[0]) > 0 && Integer.parseInt(parts1[0]) <= 10) && (Integer.parseInt(parts1[1]) > 0 && Integer.parseInt(parts1[1]) <= 10)) {

                            res = Integer.parseInt(parts1[0]) + Integer.parseInt(parts1[1]);

                            result = res + "";
                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");
                        }

                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }

                } else if (input.contains("-")) {

                    String[] parts1 = input.split("-");

                    if (parts1.length < 3) {

                        if ((Integer.parseInt(parts1[0]) > 0 && Integer.parseInt(parts1[0]) <= 10) && (Integer.parseInt(parts1[1]) > 0 && Integer.parseInt(parts1[1]) <= 10)) {

                            res = Integer.parseInt(parts1[0]) - Integer.parseInt(parts1[1]);

                            result = res + "";

                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");
                        }

                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }


                } else if (input.contains("*")) {

                    String[] parts1 = input.split("\\*");

                    if (parts1.length < 3) {

                        if ((Integer.parseInt(parts1[0]) > 0 && Integer.parseInt(parts1[0]) <= 10) && (Integer.parseInt(parts1[1]) > 0 && Integer.parseInt(parts1[1]) <= 10)) {

                            res = Integer.parseInt(parts1[0]) * Integer.parseInt(parts1[1]);

                            result = res + "";
                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");
                        }

                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }


                } else if (input.contains("/")) {

                    String[] parts1 = input.split("/");

                    if (parts1.length < 3) {

                        if ((Integer.parseInt(parts1[0]) > 0 && Integer.parseInt(parts1[0]) <= 10) && (Integer.parseInt(parts1[1]) > 0 && Integer.parseInt(parts1[1]) <= 10)) {

                            res = Integer.parseInt(parts1[0]) / Integer.parseInt(parts1[1]);

                            result = res + "";

                        } else {

                            throw new IllegalArgumentException("Введите значения в пределах от 0 до 10");
                        }
                    } else {

                        throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
                    }
                }
            }
        } else {

            throw new IllegalArgumentException("Строка не является математической операцией");

        }

        return result;
    }

    enum RomanNumeral {

        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10),

        XI(11), XII(12), XIII(13), XIV(14), XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20),

        XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30),

        XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35), XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40),

        XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50),

        LI(51), LII(52), LIII(53), LIV(54), LV(55), LVI(56), LVII(57), LVIII(58), LIX(59), LX(60),

        LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65), LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70),

        LXXI(71), LXXII(72), LXXIII(73), LXXIV(74), LXXV(75), LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80),

        LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85), LXXXVI(86), LXXXVII(87), LXXXVIII(88), LXXXIX(89), XC(90),

        XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95), XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);

        private int v;

        RomanNumeral(int v) {

            this.v = v;

        }
        int getV() {

            return v;

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(calc(s));


    }

}
