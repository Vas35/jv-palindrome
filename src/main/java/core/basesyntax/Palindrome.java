package core.basesyntax;

public class Palindrome {

    /**
     * <p>Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
     * Палиндромом называется строка, которая читается одинаково слева направо
     * и справа налево (в том числе пустая).
     * При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы,
     * знаки препинания, а также регистр символов должны игнорироваться.</p>
     *
     * <p>Подсказки (не читайте, если хотите решить сами):
     * для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться
     * регулярным выражением. Найдите в классе String метод, выполняющий замену по
     * регулярному выражению;
     * для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
     * который находится в классе StringBuilder;
     * в классе String есть методы для преобразования всей строки в верхний и нижний регистр.</p>
     *
     * <p>Пример: Madam, I'm Adam!</p>
     * <p>Результат: true</p>
     */
    public boolean isPalindrome(String text) {
        if (text.length() == 1 || text.length() == 0) {
            return false;
        }
        text = text.toLowerCase();
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String[] arr = text.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (String.valueOf(arr[i].charAt(i)).equals(String.valueOf(arr[j].charAt(i)))) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

