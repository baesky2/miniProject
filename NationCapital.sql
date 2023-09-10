SELECT * FROM usert;
SELECT * FROM nation;

commit;
CREATE SEQUENCE nation_seq 
    START WITH 102
    INCREMENT BY 1 --증가량
    MAXVALUE 300
    MINVALUE 1
    NOCYCLE
    NOCACHE;
    SELECT *FROM nation;
    
SELECT nation_seq.CURRVAL FROM DUAL;
DESC USERT;
CREATE TABLE USERT (
    ID VARCHAR2(20) PRIMARY KEY,
    PW VARCHAR2(20),
    NAME VARCHAR2(20),
    SC NUMBER(5),
    EMAIL VARCHAR2(100),
    POINT NUMBER(10)
);


CREATE TABLE NATION( --테이블, 컬럼 만들기
    NATION_NUM NUMBER(4),--국가번호
    NATION_NAME VARCHAR2(50),--국가명
    NATION_CONTINENT VARCHAR2(20),--대륙
    NATION_CAPITAL VARCHAR2(50),--수도
    NATION_CONSONANT VARCHAR2(50),--자음
    NATION_LEVEL NUMBER(1)--난이도
    );
COMMIT;
--인설트 한번에 하기
INSERT INTO NATION(NATION_NUM, 
                   NATION_NAME, 
                   NATION_CONTINENT, 
                   NATION_CAPITAL, 
                   NATION_CONSONANT,
                   NATION_LEVEL)
SELECT 1, '네팔', '아시아', '카트만두', 'ㅋㅌㅁㄷ', 1 FROM DUAL UNION ALL
SELECT 2, '대한민국', '아시아', '서울', 'ㅅㅇ', 1 FROM DUAL UNION ALL
SELECT 3, '동티모르', '아시아', '딜리', 'ㄷㄹ', 2 FROM DUAL UNION ALL
SELECT 4, '라오스', '아시아', '비엔티안', 'ㅂㅇㅌㅇ', 2 FROM DUAL UNION ALL
SELECT 5, '레바논', '아시아', '베이루트', 'ㅂㅇㄹㅌ', 2 FROM DUAL UNION ALL
SELECT 6, '몰디브', '아시아', '말레', 'ㅁㄹ', 2 FROM DUAL UNION ALL
SELECT 7, '몽골', '아시아', '울란바토르', 'ㅇㄹㅂㅌㄹ', 2 FROM DUAL UNION ALL
SELECT 8, '미얀마', '아시아', '네피도', 'ㄴㅍㄷ', 2 FROM DUAL UNION ALL
SELECT 9, '바레인', '아시아', '마나마', 'ㅁㄴㅁ', 2 FROM DUAL UNION ALL
SELECT 10, '방글라데시', '아시아', '다카', 'ㄷㅋ', 2 FROM DUAL UNION ALL
SELECT 11, '베트남', '아시아', '하노이', 'ㅎㄴㅇ', 1 FROM DUAL UNION ALL
SELECT 12, '부탄', '아시아', '팀푸', 'ㅌㅍ', 2 FROM DUAL UNION ALL
SELECT 13, '북한', '아시아', '평양', 'ㅍㅇ', 1 FROM DUAL UNION ALL
SELECT 14, '사우디아라비아', '아시아', '리야드', 'ㄹㅇㄷ', 2 FROM DUAL UNION ALL
SELECT 15, '시리아', '아시아', '다마스쿠스', 'ㄷㅁㅅㅋㅅ', 2 FROM DUAL UNION ALL
SELECT 16, '싱가포르', '아시아', '싱가포르', 'ㅅㄱㅍㄹ', 1 FROM DUAL UNION ALL
SELECT 17, '아랍에미리트', '아시아', '아부다비', 'ㅇㅂㄷㅂ', 2 FROM DUAL UNION ALL
SELECT 18, '아르메니아', '아시아', '예레반', 'ㅇㄹㅂ', 3 FROM DUAL UNION ALL
SELECT 19, '아제르바이잔', '아시아', '바쿠', 'ㅂㅋ', 3 FROM DUAL UNION ALL
SELECT 20, '아프가니스탄', '아시아', '카불', 'ㅋㅂ', 2 FROM DUAL UNION ALL
SELECT 21, '예멘', '아시아', '사나', 'ㅅㄴ', 2 FROM DUAL UNION ALL
SELECT 22, '오만', '아시아', '무스카트', 'ㅁㅅㅋㅌ', 3 FROM DUAL UNION ALL
SELECT 23, '요르단', '아시아', '암만', 'ㅇㅁ', 2 FROM DUAL UNION ALL
SELECT 24, '우즈베키스탄', '아시아', '타슈켄트', 'ㅌㅅㅋㅌ', 2 FROM DUAL UNION ALL
SELECT 25, '이라크', '아시아', '바그다드', 'ㅂㄱㄷㄷ', 2 FROM DUAL UNION ALL
SELECT 26, '이란', '아시아', '테헤란', 'ㅌㅎㄹ', 2 FROM DUAL UNION ALL
SELECT 27, '이스라엘', '아시아', '예루살렘', 'ㅇㄹㅅㄹ', 1 FROM DUAL UNION ALL
SELECT 28, '인도', '아시아', '뉴델리', 'ㄴㄷㄹ', 1 FROM DUAL UNION ALL
SELECT 29, '인도네시아', '아시아', '자카르타', 'ㅈㅋㄹㅌ', 1 FROM DUAL UNION ALL
SELECT 30, '일본', '아시아', '도쿄', 'ㄷㅋ', 1 FROM DUAL UNION ALL
SELECT 31, '조지아', '아시아', '트빌리시', 'ㅌㅂㄹㅅ', 2 FROM DUAL UNION ALL
SELECT 32, '중국', '아시아', '베이징', 'ㅂㅇㅈ', 1 FROM DUAL UNION ALL
SELECT 33, '대만', '아시아', '타이베이', 'ㅌㅇㅂㅇ', 1 FROM DUAL UNION ALL
SELECT 34, '카자흐스탄', '아시아', '아스타나', 'ㅇㅅㅌㄴ', 2 FROM DUAL UNION ALL
SELECT 35, '카타르', '아시아', '도하', 'ㄷㅎ', 1 FROM DUAL UNION ALL
SELECT 36, '캄보디아', '아시아', '프놈펜', 'ㅍㄴㅍ', 2 FROM DUAL UNION ALL
SELECT 37, '쿠웨이트', '아시아', '쿠웨이트', 'ㅋㅇㅇㅌ', 2 FROM DUAL UNION ALL
SELECT 38, '키르기스스탄', '아시아', '비슈케크', 'ㅂㅅㅋㅋ', 2 FROM DUAL UNION ALL
SELECT 39, '태국', '아시아', '방콕', 'ㅂㅋ', 1 FROM DUAL UNION ALL
SELECT 40, '타지키스탄', '아시아', '두샨베', 'ㄷㅅㅂ', 3 FROM DUAL UNION ALL
SELECT 41, '투르크메니스탄', '아시아', '아슈하바트', 'ㅇㅅㅎㅂㅌ', 3 FROM DUAL UNION ALL
SELECT 42, '튀르키예', '아시아', '앙카라', 'ㅇㅋㄹ', 2 FROM DUAL UNION ALL
SELECT 43, '파키스탄', '아시아', '이슬라마바드', 'ㅇㅅㄹㅁㅂㄷ', 3 FROM DUAL UNION ALL
SELECT 44, '팔레스타인', '아시아', '라말라', 'ㄹㅁㄹ', 3 FROM DUAL UNION ALL
SELECT 45, '필리핀', '아시아', '마닐라', 'ㅁㄴㄹ', 1 FROM DUAL UNION ALL
SELECT 46, '가나', '아프리카', '아크라', 'ㅇㅋㄹ', 3 FROM DUAL UNION ALL
SELECT 47, '가봉', '아프리카', '리브르빌', 'ㄹㅂㄹㅂ', 3 FROM DUAL UNION ALL
SELECT 48, '감비아', '아프리카', '반줄', 'ㅂㅈ', 3 FROM DUAL UNION ALL
SELECT 49, '기니', '아프리카', '코나크리', 'ㅋㄴㅋㄹ', 3 FROM DUAL UNION ALL
SELECT 50, '기니비사우', '아프리카', '비사우', 'ㅂㅅㅇ', 3 FROM DUAL UNION ALL
SELECT 51, '나미비아', '아프리카', '빈트후크', 'ㅂㅌㅎㅋ', 3 FROM DUAL UNION ALL
SELECT 52, '남수단', '아프리카', '주바', 'ㅈㅂ', 3 FROM DUAL UNION ALL
SELECT 53, '나이지리아', '아프리카', '아부자', 'ㅇㅂㅈ', 3 FROM DUAL UNION ALL
SELECT 54, '니제르', '아프리카', '니아메', 'ㄴㅇㅁ', 3 FROM DUAL UNION ALL
SELECT 55, '라이베리아', '아프리카', '몬로비아', 'ㅁㄴㅂㅇ', 3 FROM DUAL UNION ALL
SELECT 56, '르완다', '아프리카', '키갈리', 'ㅋㄱㄹ', 3 FROM DUAL UNION ALL
SELECT 57, '리비아', '아프리카', '트리폴', 'ㅌㄹㅍ', 3 FROM DUAL UNION ALL
SELECT 58, '마다가스카르', '아프리카', '안타나나리보', 'ㅇㅌㄴㄴㄹㅂ', 3 FROM DUAL UNION ALL
SELECT 59, '말라위', '아프리카', '릴롱궤', 'ㄹㄹㄱ', 3 FROM DUAL UNION ALL
SELECT 60, '말리', '아프리카', '바마코', 'ㅂㅁㅋ', 3 FROM DUAL UNION ALL
SELECT 61, '모로코', '아프리카', '라바트', 'ㄹㅂㅌ', 3 FROM DUAL UNION ALL
SELECT 62, '모리셔스', '아프리카', '포트루이스', 'ㅍㅌㄹㅇㅅ', 3 FROM DUAL UNION ALL
SELECT 63, '모리타니', '아프리카', '누악쇼트', 'ㄴㅇㅅㅌ', 3 FROM DUAL UNION ALL
SELECT 64, '모잠비크', '아프리카', '마푸투', 'ㅁㅍㅌ', 3 FROM DUAL UNION ALL
SELECT 65, '부룬디', '아프리카', '기테가', 'ㄱㅌㄱ', 3 FROM DUAL UNION ALL
SELECT 66, '부르키나파소', '아프리카', '와가두구', 'ㅇㄱㄷㄱ', 3 FROM DUAL UNION ALL
SELECT 67, '상투메프린시페', '아프리카', '상투메', 'ㅅㅌㅁ', 3 FROM DUAL UNION ALL
SELECT 68, '세네갈', '아프리카', '다카르', 'ㄷㅋㄹ', 3 FROM DUAL UNION ALL
SELECT 69, '세이셸', '아프리카', '빅토리아', 'ㅂㅌㄹㅇ', 3 FROM DUAL UNION ALL
SELECT 70, '소말리아', '아프리카', '모가디슈', 'ㅁㄱㄷㅅ', 2 FROM DUAL UNION ALL
SELECT 71, '수단', '아프리카', '하르툼', 'ㅎㄹㅌ', 3 FROM DUAL UNION ALL
SELECT 72, '시에라리온', '아프리카', '프리타운', 'ㅍㄹㅌㅇ', 3 FROM DUAL UNION ALL
SELECT 73, '알제리', '아프리카', '알제', 'ㅇㅈ', 2 FROM DUAL UNION ALL
SELECT 74, '앙골라', '아프리카', '루안다', 'ㄹㅇㄷ', 3 FROM DUAL UNION ALL
SELECT 75, '에리트레아', '아프리카', '아스마라', 'ㅇㅅㅁㄹ', 3 FROM DUAL UNION ALL
SELECT 76, '에티오피아', '아프리카', '아디스아바바', 'ㅇㄷㅅㅇㅂㅂ', 3 FROM DUAL UNION ALL
SELECT 77, '우간다', '아프리카', '캄팔라', 'ㅋㅍㄹ', 3 FROM DUAL UNION ALL
SELECT 78, '이집트', '아프리카', '카이로', 'ㅋㅇㄹ', 1 FROM DUAL UNION ALL
SELECT 79, '잠비아', '아프리카', '루사카', 'ㄹㅅㅋ', 3 FROM DUAL UNION ALL
SELECT 80, '적도기니', '아프리카', '말라보', 'ㅁㄹㅂ', 3 FROM DUAL UNION ALL
SELECT 81, '짐바브웨', '아프리카', '하라레', 'ㅎㄹㄹ', 3 FROM DUAL UNION ALL
SELECT 82, '차드', '아프리카', '은자메나', 'ㅇㅈㅁㄴ', 3 FROM DUAL UNION ALL
SELECT 83, '카메룬', '아프리카', '야운데', 'ㅇㅇㄷ', 3 FROM DUAL UNION ALL
SELECT 84, '카보베르데', '아프리카', '프라이아', 'ㅍㄹㅇㅇ', 3 FROM DUAL UNION ALL
SELECT 85, '케냐', '아프리카', '나이로비', 'ㄴㅇㄹㅂ', 3 FROM DUAL UNION ALL
SELECT 86, '코모로', '아프리카', '모로니', 'ㅁㄹㄴ', 3 FROM DUAL UNION ALL
SELECT 87, '코트디부아르', '아프리카', '야무수크로', 'ㅇㅁㅅㅋㄹ', 3 FROM DUAL UNION ALL
SELECT 88, '탄자니아', '아프리카', '도도마', 'ㄷㄷㅁ', 3 FROM DUAL UNION ALL
SELECT 89, '토고', '아프리카', '로메', 'ㄹㅁ', 3 FROM DUAL UNION ALL
SELECT 90, '그리스', '유럽', '아테네', 'ㅇㅌㄴ', 1 FROM DUAL UNION ALL
SELECT 91, '네덜란드', '유럽', '암스테르담', 'ㅇㅅㅌㄹㄷ', 2 FROM DUAL UNION ALL
SELECT 92, '노르웨이', '유럽', '오슬로', 'ㅇㅅㄹ', 2 FROM DUAL UNION ALL
SELECT 93, '덴마크', '유럽', '코펜하겐', 'ㅋㅍㅎㄱ', 2 FROM DUAL UNION ALL
SELECT 94, '독일', '유럽', '베를린', 'ㅂㄹㄹ', 1 FROM DUAL UNION ALL
SELECT 95, '라트비아', '유럽', '리가', 'ㄹㄱ', 3 FROM DUAL UNION ALL
SELECT 96, '러시아', '유럽', '모스크바', 'ㅁㅅㅋㅂ', 1 FROM DUAL UNION ALL
SELECT 97, '루마니아', '유럽', '부쿠레슈티', 'ㅂㅋㄹㅅㅌ', 2 FROM DUAL UNION ALL
SELECT 98, '룩셈부르크', '유럽', '룩셈부르크', 'ㄹㅅㅂㄹㅋ', 2 FROM DUAL UNION ALL
SELECT 99, '리투아니아', '유럽', '빌뉴스', 'ㅂㄴㅅ', 2 FROM DUAL UNION ALL
SELECT 100, '리히텐슈타인', '유럽', '파두츠', 'ㅍㄷㅊ', 3 FROM DUAL UNION ALL
SELECT 101, '모나코', '유럽', '모나코', 'ㅁㄴㅋ', 2 FROM DUAL UNION ALL
SELECT 102, '몬테네그로', '유럽', '포드고리차', 'ㅍㄷㄱㄹㅊ', 3 FROM DUAL UNION ALL
SELECT 103, '몰도바', '유럽', '키시너우', 'ㅋㅅㄴㅇ', 3 FROM DUAL UNION ALL
SELECT 104, '몰타', '유럽', '발레타', 'ㅂㄹㅌ', 3 FROM DUAL UNION ALL
SELECT 105, '바티칸', '유럽', '바티칸', 'ㅂㅌㅋ', 1 FROM DUAL UNION ALL
SELECT 106, '벨기에', '유럽', '브뤼셀', 'ㅂㄹㅅ', 1 FROM DUAL UNION ALL
SELECT 107, '벨라루스', '유럽', '민스크', 'ㅁㅅㅋ', 2 FROM DUAL UNION ALL
SELECT 108, '보스니아헤르체고비나', '유럽', '사라예보', 'ㅅㄹㅇㅂ', 3 FROM DUAL UNION ALL
SELECT 109, '북마케도니아', '유럽', '스코페', 'ㅅㅋㅍ', 3 FROM DUAL ;

commit;