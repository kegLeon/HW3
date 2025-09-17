public class Main {
    public static void main(String[] args) {

        // Задание 1 - Объявление переменных
        byte    valueByte   = 0;
        short   valueShort  = 0;
        int     valueInt    = 0;
        long    valueLong   = 0L;
        float   valueFloat  = 0.0F;
        double  valueDouble = 0.0D;

        System.out.println("Задача 1");
        System.out.println("Значение переменной valueByte   с типом данных Byte   = " + valueByte);
        System.out.println("Значение переменной valueShort  с типом данных Short  = " + valueShort);
        System.out.println("Значение переменной valueInt    с типом данных Int    = " + valueInt );
        System.out.println("Значение переменной valueLong   с типом данных Long   = " + valueLong);
        System.out.println("Значение переменной valueFloat  с типом данных Float  = " + valueFloat);
        System.out.println("Значение переменной valueDouble с типом данных Double = " + valueDouble);


        // Задание 2 инициализация переменных
        valueFloat      = 27.12F;
        valueLong       = 987678965549L;
        valueDouble     = 2.786;
        valueInt        = 569;
        valueShort      = -159;
        int valueInt2   = 27897;
        valueByte       = 67;

        System.out.println("\nЗадача 2");
        System.out.println("Вывод значений не требуется условиями задания.");


        // Задание 3 Задача Учителя
        System.out.println("\nЗадача 3");
        short teacher1 = 23; // ученика(оф) у Людмила Павловна
        short teacher2 = 27; // ученика(оф) у АннаСергеевна
        short teacher3 = 30; // ученика(оф) у ЕкатеринаАндреевна

        System.out.println("На каждого ученика расчитано " + 480 / (teacher1 + teacher2 + teacher3) + " листов бумаги.");


        // Задание 4 - Задача - Производительность машины.
        System.out.println("\nЗадача 4");
        short proizvoditelnoct = 16 / 2; // Производительность в минуту

        short time1 = 20;       // 20 Минут
        short time2 = 60*24;    // Сутки
        short time3 = 60*24*3;  // 3 дня
        int   time4 = 60*24*30; // Месяц = 30 дней

        System.out.println("За 20 минут машина произвела " + time1 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За Сутки машина произвела " + time2 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + time3 * proizvoditelnoct + " штук бутылок.");
        System.out.println("За Месяц машина произвела " + time4 * proizvoditelnoct + " штук бутылок.");
        // Задание 5 - Задача - Ремонт школы, банки с краской.
        System.out.println("\nЗадача 5");
        short danokKrackiTotal = 120; // шт. - Все банок краски.
        short banokKrackiWhite = 2; // шт. - Белой краски на класс
        short banokKrackiBrown = 4; // шт. - Коричневой краски на класс.
        // Находим количество классов
        short symClasses = (short) (danokKrackiTotal / (banokKrackiWhite + banokKrackiBrown));
        System.out.println("В школе, где " + symClasses + " классов, нужно " + banokKrackiWhite * symClasses +
                " шт банок Белой краски и " + banokKrackiBrown * symClasses +" шт банок Коричневой краски");


        // Задание 6 - Задача - Вес коктейля
        System.out.println("\nЗадача 6");
        var weightBanana     =  5 * 80;           // грамм. - 1 банан весин 80 грамм
        var weightMilk       =  200 / 100 * 105;  // грамм. - 100 мл = 105 грамм
        var weightIceCream   =  2 * 100;          // грамм. - 1 брикет 100 грамм
        var weightEggs   =  4 * 70;           // грамм. - 1 яйцо 70 грамм

        short weightCocktail = (short) (weightBanana + weightMilk + weightIceCream + weightEggs);
        System.out.println("Вес коктейля составит " + weightCocktail + " грамм ");
        System.out.println("Вес коктейля составит " + (float) weightCocktail / 1000 + " кг ");


        // Задание 7 - Задача - Похудание
        System.out.println("\nЗадача 7");
        short deyWeighLoss250 = 7 * 1000 / 250;
        short deyWeighLoss500 = 7 * 1000 / 500;
        short deyWeighLossAverage = (short) ((deyWeighLoss250 + deyWeighLoss500) / 2);
        System.out.println("Если спортсмен будет худеть на 250грамм в день, то для того что бы сбросить 7 кг ему потребуется " + deyWeighLoss250 + " дней.");
        System.out.println("Если спортсмен будет худеть на 500грамм в день, то для того что бы сбросить 7 кг ему потребуется " + deyWeighLoss500 + " дней.");
        System.out.println("В среднем у спортсмена для того что бы сбросить 7 кг уйдет " + (short) ((deyWeighLoss250 + deyWeighLoss500) / 2) + " день.");


        // Задание 8  Повышение з/п
        System.out.println("\nЗадача 8");
        // Заработок - Был
        float  finance_Masha    = 67760f; // руб/мес
        float  finance_Denis    = 83690f; // руб/мес
        float  finance_Kristina = 76230f; // руб/мес

        System.out.println("Зароботок Маши     составлял " + finance_Masha + " руб");
        System.out.println("Зароботок Денис    составлял " + finance_Denis + " руб");
        System.out.println("Зароботок Кристина составлял " + finance_Kristina + " руб");

        float  nuwFinance_Masha    = finance_Masha + (finance_Masha * 0.1f);        // руб/мес
        float  nuwFinance_Denis    = finance_Denis + (finance_Denis * 0.1f);        // руб/мес
        float  nuwFinance_Kristina = finance_Kristina + (finance_Kristina * 0.1f);  // руб/мес

        System.out.println("\nТеперь Маша     будет получать " + nuwFinance_Masha + " руб. Её  годовой доход вырос на " + (float)((nuwFinance_Masha * 12)-(finance_Masha * 12)) + " рублей");
        System.out.println("Теперь Денис    будет получать " + nuwFinance_Denis + " руб. Его годовой доход вырос на " + (float)((nuwFinance_Denis * 12)-(finance_Denis * 12)) + " рублей");
        System.out.println("Теперь Кристина будет получать " + nuwFinance_Kristina + " руб. Её  годовой доход вырос на " + (float)((nuwFinance_Kristina * 12)-(finance_Kristina * 12)) + " рублей");

    }
}