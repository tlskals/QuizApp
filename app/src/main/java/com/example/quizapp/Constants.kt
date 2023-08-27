package com.example.quizapp

object Constants {

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question (
            //1
            1,
            "나는 언제 우리집에 왔게?",
            R.drawable.whenzicocome,
            "2018년 8월 1일",
            "2018년 8월 15일",
            "2018년 8월 26일",
            "2018년 8월 31일",
            3
        )
        questionsList.add(que1)

        val que2 = Question (
            //1
            2,
            "나는 왜 이러고 있었을까?",
            R.drawable.zicosleepy,
            "심심해서",
            "배고파서",
            "졸려서",
            "작은형이 보고싶어서",
            1
        )
        questionsList.add(que2)

        val que3 = Question (
            //1
            3,
            "내가 지금 무슨 꿈을 꾸게~?",
            R.drawable.zicosleeping,
            "엄마의 비싼 옷을 찢는 꿈",
            "아빠의 발가락을 무는 꿈",
            "큰 형의 얼굴에 쉬야를 하는 꿈",
            "소고기를 잔뜩 먹는 꿈",
            4
        )
        questionsList.add(que3)

        val que4 = Question (
            //1
            4,
            "내가 여기에 실례하고 작은 형이 나한테 한 행동은?",
            R.drawable.zicoooooooo,
            "도망치는걸 잡아다가 엉덩이 때리기",
            "칭찬하며 소고기를 구워주기",
            "모든걸 포기한 표정으로 쳐다보기",
            "아무행동도 하지 않음",
            1
        )
        questionsList.add(que4)

        val que5 = Question (
            //1
            5,
            "나는 주로 이런 행동을 싫어해",
            R.drawable.zicoangry,
            "칭찬하기",
            "배를 만져주기",
            "귀찮게 하기",
            "간식주기",
            3
        )
        questionsList.add(que5)

        val que6 = Question (
            //1
            6,
            "내가 왜 이런 모습으로 앉아있는지 알아?",
            R.drawable.zicolosthisnuts,
            "뛰어다니다 다쳤다",
            "멋을 부렸다",
            "하도 사고를 쳐서 엄마가 깔대기를 씌웠다",
            "남자로서 소중한 것을 잃었다",
            4
        )
        questionsList.add(que6)

        val que7 = Question (
            //1
            7,
            "내가 우리 가족 중 누구를 제일 좋아하게?",
            R.drawable.zicoinoutside,
            "아빠",
            "엄마",
            "큰형",
            "정신적 지주이자 멋진 작은형",
            4
        )
        questionsList.add(que7)

        val que8 = Question (
            //1
            8,
            "내가 제일 좋아하는 것은?",
            R.drawable.snowzico,
            "산책하기",
            "누워있기",
            "밥먹기",
            "잠자기",
            1
        )
        questionsList.add(que8)

        return questionsList

    }


}