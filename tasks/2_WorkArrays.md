# Одномерные массивы

## Используемый стек технологий

- Java 8

## Предустановка

Для генерации случайных значений использовать объект класса Random.

```java
Random rnd = new Random();
int value = rnd.nextInt();
```

Метод nextInt можно вызвать:

- без параметра, возвращает случайное значение типа int;
- параметр типа int, указывает верхний порог значений, исключая само значение, нижний порог равен 0, включая.

Диапазон случайных значений [10, 100).

Размерность массива 10.

## Задание 1

Создать одномерный массив размером 5 и заполнить его случайными значениями. Вывести массив в строку.

## Задание 2

Найти сумму положительных элементов одномерного массива. Диапазон случайных значений [-50, 51).

## Задание 3

Найти максимальный и минимальный элемент в одномерном массиве.

## Задание 4

Поменять местами минимальный и максимальный элементы одномерного массива.

## Задание 5

Найти среднее арифметическое элементов, стоящих между первым минимальным и первым максимальным значениями в одномерном массиве.