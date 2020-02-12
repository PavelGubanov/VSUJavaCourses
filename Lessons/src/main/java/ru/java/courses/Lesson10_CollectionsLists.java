package ru.java.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        List<Integer> tmpInt = new ArrayList<>(source);
        Collections.sort(tmpInt);
        int i = 0;
        while (i < tmpInt.size() - 1){
            if (tmpInt.get(i) == tmpInt.get(i + 1)){
                tmpInt.remove(i + 1);
            }
            else {
                i++;
            }
        }

        List<String> resultList = new ArrayList();
        for (Integer n : tmpInt){
            resultList.add(n.toString());
        }
        return resultList;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> inputArrayList = new ArrayList<Integer>(Arrays.asList(array));
        int k = 0;
        for (Integer i : inputArrayList){
            if (i % 2 == 0){
                inputArrayList.set(k, i + 1);
            }
            k++;
        }
        k = 3;
        List<Integer> result = new ArrayList<Integer>();
        while ((k < inputArrayList.size()) && (k < 8)){
            result.add(inputArrayList.get(k));
            k++;
        }
        return result;
    }
}
