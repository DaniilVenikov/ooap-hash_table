public abstract class HashTableATD {

    // конструктор
    //постусловие: создана новая хэш таблица с заданным максимальным размером
    public abstract HashTableATD HashTableATD(int maxSize);

    // команды

    // предусловие: смогли найти ячейку для нового значение
    // постусловие: добавлено новое значение
    public abstract void put(Object value);

    // преусловие: такой значение есть в хэш таблице
    // постусловие: переданное значение удалено из таблицы
    public abstract void remove(Object value);

    // запросы

    // постусловие: вохвращает корректный индекс слота
    public abstract int hash(Object value);
    public abstract boolean contains(Object value);
    public abstract int getPutStatus();//успешно; не смогли найти ячейку
    public abstract int getRemoveStatus();//успешно; такого значения нет в таблице
}
