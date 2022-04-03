package com.krystynasajak.myquizapp

object Constants {

    // TODO  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Which is the capital of Poland?",
            R.drawable.que_1,
            "Warsaw", "Krakow",
            "Katowice", "Wroclaw", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "How would you say \"Good morning !\" in Polish ?",
            R.drawable.que_2,
            "Do widzenia", "Guten morgen",
            "Dzień dobry", "Dobry den", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Who was Karol Wojtyła?",
            R.drawable.que_3,
            "Famous writer", "An actor",
            "A president", "The Pope", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Which of these cities is not in Poland?",
            R.drawable.que_4,
            "Kielce", "Kiev",
            "Poznań", "Szczecin", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Which are the colours of Polish flag?",
            R.drawable.que_5,
            "Blue and yellow", "Red and blue",
            "White and red", "Green and white", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Which mountains are on the southern border of Poland?",
            R.drawable.que_6,
            "Carpathians", "Alps",
            "Ural", "Apenins", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "The best Polish tennis player is?",
            R.drawable.que_7,
            "Aleksandra Olsza", "Karolina Woźniacki",
            "Agnieszka Radwańska", "Urszula Radwańska", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Who was the producer of Oscar winner  \"Pianista\"?",
            R.drawable.que_8,
            "Andrzej Wajda", "Krzysztof Kieślowski",
            "Sean Penn", "Roman Polański", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Polonez is the name of Polish ?",
            R.drawable.que_9,
            "Bird", "Dance",
            "Plate", "City", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "The Nobel Prize Winner of Polish Literature is?",
            R.drawable.que_10,
            "Czesław Miłosz", "Ernest Hemingway",
            "Heinrich Böll", "Samuel Beckett", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "What is the currency unit of Poland?",
            R.drawable.que_11, "dollar", "euro",
            "zloty", "krona", 3
        )

        questionsList.add(que11)

        val que12 = Question(
            12, "Name the longest river in Poland?",
            R.drawable.que_12, "Danube", "Vistula",
            "Dnieper", "Loire", 2
        )

        questionsList.add(que12)

        val que13 = Question(
            13, "What did Lech Wałesa win in 1983?",
            R.drawable.que_13, "Nobel Peace Prize",
            "Golden Globe Award",  "Pulitzer Prize",
            "Oscar Prize", 1
        )

        questionsList.add(que13)

        val que14 = Question(
            14, "Which polish astronomer proposed the Heliocentric Theory of the universe ?",
            R.drawable.que_14, "Claudius Ptolemy",
            "Galileo Galilei",  "Johannes Kepler",
            "Nicolaus Copernicus", 4
        )

        questionsList.add(que14)

        val que15 = Question(
            15, "Which chemical element is named after Poland?",
            R.drawable.que_15, "Pollenium (Pl)",
            "Polonium (Po)",  "Polandium (Pd)",
            "Polin (Pn)", 2
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "What is this called?",
            R.drawable.que_16, "Bigos",
            "Krupnik",  "Barszcz",
            "Pierogi", 4
        )

        questionsList.add(que16)

        val que17 = Question(
            17, "At what time on the 24th December do the Polish eat their special festive meal?",
            R.drawable.que_17, "When the lady of the house calls them",
            "The same time as usual: at 7 p.m.",  "When the first star appears in the sky.",
            "Noon", 3
        )

        questionsList.add(que17)


        val que18 = Question(
            18, "Which fish dish is traditionally eaten in Poland on Christmas Eve?",
            R.drawable.que_18, "Carp",
            "Salmon",  "Salt Cod",
            "Tuna", 1
        )

        questionsList.add(que18)

        val que19 = Question(
            19, "What language do they speak in Poland?",
            R.drawable.que_19, "German",
            "Polish",  "Russian",
            "Hebrew", 2
        )

        questionsList.add(que19)

        val que20 = Question(
            20, "What is the most practiced religion?",
            R.drawable.que_20, "Presbyterian",
            "Judaism",  "Catholicism",
            "Islam", 3
        )

        questionsList.add(que20)

        val que21 = Question(
            21, "What is Zubrowka?",
            R.drawable.que_21, "A type of vodka with grass",
            "A name of a city in Poland",  "A name of a Polish dish",
            "A name of a Polish wine", 1
        )

        questionsList.add(que21)

        val que22 = Question(
            22, "How do you translate \"Jak sie masz?\" into English? ",
            R.drawable.que_22, "How old are you?",
            "What's the time? ",  "How are you? ",
            "What's up?", 3
        )

        questionsList.add(que22)

        val que23 = Question(
            23, "On Christmas Eve, how many dishes (at least) should there always be on the table?",
            R.drawable.que_23, "12",
            "3",  "10",
            "15", 1
        )

        questionsList.add(que23)

        val que24 = Question(
            24, "What do most Poles always do on Sundays? ",
            R.drawable.que_24, "Go to cinema",
            "Go shopping",  "Have a party with lots of vodka",
            "Go to church", 4
        )

        questionsList.add(que24)

        val que25 = Question(
            25, "How many Poles live in Poland?",
            R.drawable.que_25, "35 million",
            "40 million",  "38 million",
            "37 million", 3
        )

        questionsList.add(que25)



        return questionsList
    }
}




