package by.epam.javaIntro.task;

import java.util.Arrays;

public class Main {

    /*Cоздать приложение,
     * разбирающее текст (текст хранится в строке) и
     * позволяющее выполнять с текстом три различных операции:
     * отсортировать абзацы по количеству предложений;
     * в каждом предложении отсортировать слова по длине;
     * отсортировать лексемы в предложении по убыванию количества вхождений
     * заданного символа,
     * а в случае равенства – по алфавиту.*/

    public static void main(String [] args) {

        String str = "Six species of Allosaurus have been named: Allosaurus amplus, Allosaurus atrox, Allosaurus europaeus, the type species Allosaurus fragilis, Allosaurus jimmadseni and Allosaurus lucasi. Among these, Daniel Chure and Mark Loewen in 2020 only recognized the species Allosaurus fragilis, Allosaurus europaeus, and the newly-named Allosaurus jimmadseni as being valid species.\n"+
                "Allosaurus fragilis is the type species and was named by Marsh in 1877. It is known from the remains of at least sixty individuals, all found in the Kimmeridgian–Tithonian Upper Jurassic-age Morrison Formation of the United States, spread across the states of Colorado, Montana, New Mexico, Oklahoma, South Dakota, Utah, and Wyoming. Details of the humerus (upper arm) of Allosaurus fragilis have been used as diagnostic among Morrison theropods, but Allosaurus jimmadseni indicates that this is no longer the case at the species level.\n"+
                "Allosaurus jimmadseni has been scientifically described based on two nearly complete skeletons. The first specimen to wear the identification was unearthed in Dinosaur National Monument in northeastern Utah, with the original \"Big Al\" individual subsequently recognized as belonging to the same species. This species differs from Allosaurus fragilis in several anatomical details including a jugal or cheekbone with a straight lower margin. Fossils are confined to the Salt Wash Member of the Morrison Formation, with Allosaurus fragilis only found in the higher Brushy Basin Member.\n"+
                "Allosaurus fragilis, Allosaurus jimmadseni, Allosaurus amplus, and Allosaurus lucasi are all known from remains discovered in the Kimmeridgian Tithonian Upper Jurassic-age Morrison Formation of the United States, spread across the states of Colorado, Montana, New Mexico, Oklahoma, South Dakota, Utah and Wyoming. Allosaurus fragilis is regarded as the most common, known from the remains of at least sixty individuals. For a while in the late 1980s and early 1990s it was common to recognize Allosaurus fragilis as the short-snouted species, with the long-snouted taxon being Allosaurus atrox; however, subsequent analysis of specimens from the Cleveland-Lloyd Dinosaur Quarry, Como Bluff, and Dry Mesa Quarry showed that the differences seen in the Morrison Formation material could be attributed to individual variation. A study of skull elements from the Cleveland-Lloyd site found wide variation between individuals, calling into question previous species-level distinctions based on such features as the shape of the lacrimal horns, and the proposed differentiation of Allosaurus jimmadseni based on the shape of the jugal. Allosaurus europaeus was found in the Kimmeridgian-age Porto Novo Member of the Lourinh Formation, but may be the same as Allosaurus fragilis.";

        TextParse par = new TextParse();

        String[] strPar = par.paragraph(str);//разбор на абзацы


        String [] strSent = par.sentence(str); //разбор на предложения


        String [] strWord = par.word(strSent[1]); // разбор на слова отдельного предложения


        Sort s = new Sort();

        String[] sorted = s.sortPar(strPar); // сортировка абзацев по количеству предложений
        System.out.println(Arrays.toString(strPar));

        String [] sortedWord = s.sortEachSent(strSent[2]); //сортировка слов в предложении по длине
        System.out.println(Arrays.toString(sortedWord));

        String [] sortedLex = s.sortLex(strSent[5], "а"); // сортировка слов в предложении по количеству вхождений заданного символа, при одинаковом - в алфавитном порядке
        System.out.println(Arrays.toString(sortedLex));
    }

}
