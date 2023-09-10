SELECT * FROM usert;
SELECT * FROM nation;

commit;
CREATE SEQUENCE nation_seq 
    START WITH 102
    INCREMENT BY 1 --������
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


CREATE TABLE NATION( --���̺�, �÷� �����
    NATION_NUM NUMBER(4),--������ȣ
    NATION_NAME VARCHAR2(50),--������
    NATION_CONTINENT VARCHAR2(20),--���
    NATION_CAPITAL VARCHAR2(50),--����
    NATION_CONSONANT VARCHAR2(50),--����
    NATION_LEVEL NUMBER(1)--���̵�
    );
COMMIT;
--�μ�Ʈ �ѹ��� �ϱ�
INSERT INTO NATION(NATION_NUM, 
                   NATION_NAME, 
                   NATION_CONTINENT, 
                   NATION_CAPITAL, 
                   NATION_CONSONANT,
                   NATION_LEVEL)
SELECT 1, '����', '�ƽþ�', 'īƮ����', '��������', 1 FROM DUAL UNION ALL
SELECT 2, '���ѹα�', '�ƽþ�', '����', '����', 1 FROM DUAL UNION ALL
SELECT 3, '��Ƽ��', '�ƽþ�', '����', '����', 2 FROM DUAL UNION ALL
SELECT 4, '�����', '�ƽþ�', '��Ƽ��', '��������', 2 FROM DUAL UNION ALL
SELECT 5, '���ٳ�', '�ƽþ�', '���̷�Ʈ', '��������', 2 FROM DUAL UNION ALL
SELECT 6, '�����', '�ƽþ�', '����', '����', 2 FROM DUAL UNION ALL
SELECT 7, '����', '�ƽþ�', '������丣', '����������', 2 FROM DUAL UNION ALL
SELECT 8, '�̾Ḷ', '�ƽþ�', '���ǵ�', '������', 2 FROM DUAL UNION ALL
SELECT 9, '�ٷ���', '�ƽþ�', '������', '������', 2 FROM DUAL UNION ALL
SELECT 10, '��۶󵥽�', '�ƽþ�', '��ī', '����', 2 FROM DUAL UNION ALL
SELECT 11, '��Ʈ��', '�ƽþ�', '�ϳ���', '������', 1 FROM DUAL UNION ALL
SELECT 12, '��ź', '�ƽþ�', '��Ǫ', '����', 2 FROM DUAL UNION ALL
SELECT 13, '����', '�ƽþ�', '���', '����', 1 FROM DUAL UNION ALL
SELECT 14, '����ƶ���', '�ƽþ�', '���ߵ�', '������', 2 FROM DUAL UNION ALL
SELECT 15, '�ø���', '�ƽþ�', '�ٸ�����', '����������', 2 FROM DUAL UNION ALL
SELECT 16, '�̰�����', '�ƽþ�', '�̰�����', '��������', 1 FROM DUAL UNION ALL
SELECT 17, '�ƶ����̸�Ʈ', '�ƽþ�', '�ƺδٺ�', '��������', 2 FROM DUAL UNION ALL
SELECT 18, '�Ƹ��޴Ͼ�', '�ƽþ�', '������', '������', 3 FROM DUAL UNION ALL
SELECT 19, '������������', '�ƽþ�', '����', '����', 3 FROM DUAL UNION ALL
SELECT 20, '�������Ͻ�ź', '�ƽþ�', 'ī��', '����', 2 FROM DUAL UNION ALL
SELECT 21, '����', '�ƽþ�', '�糪', '����', 2 FROM DUAL UNION ALL
SELECT 22, '����', '�ƽþ�', '����īƮ', '��������', 3 FROM DUAL UNION ALL
SELECT 23, '�丣��', '�ƽþ�', '�ϸ�', '����', 2 FROM DUAL UNION ALL
SELECT 24, '���Ű��ź', '�ƽþ�', 'Ÿ����Ʈ', '��������', 2 FROM DUAL UNION ALL
SELECT 25, '�̶�ũ', '�ƽþ�', '�ٱ״ٵ�', '��������', 2 FROM DUAL UNION ALL
SELECT 26, '�̶�', '�ƽþ�', '�����', '������', 2 FROM DUAL UNION ALL
SELECT 27, '�̽���', '�ƽþ�', '����췽', '��������', 1 FROM DUAL UNION ALL
SELECT 28, '�ε�', '�ƽþ�', '������', '������', 1 FROM DUAL UNION ALL
SELECT 29, '�ε��׽þ�', '�ƽþ�', '��ī��Ÿ', '��������', 1 FROM DUAL UNION ALL
SELECT 30, '�Ϻ�', '�ƽþ�', '����', '����', 1 FROM DUAL UNION ALL
SELECT 31, '������', '�ƽþ�', 'Ʈ������', '��������', 2 FROM DUAL UNION ALL
SELECT 32, '�߱�', '�ƽþ�', '����¡', '������', 1 FROM DUAL UNION ALL
SELECT 33, '�븸', '�ƽþ�', 'Ÿ�̺���', '��������', 1 FROM DUAL UNION ALL
SELECT 34, 'ī���彺ź', '�ƽþ�', '�ƽ�Ÿ��', '��������', 2 FROM DUAL UNION ALL
SELECT 35, 'īŸ��', '�ƽþ�', '����', '����', 1 FROM DUAL UNION ALL
SELECT 36, 'į�����', '�ƽþ�', '������', '������', 2 FROM DUAL UNION ALL
SELECT 37, '�����Ʈ', '�ƽþ�', '�����Ʈ', '��������', 2 FROM DUAL UNION ALL
SELECT 38, 'Ű���⽺��ź', '�ƽþ�', '����ũ', '��������', 2 FROM DUAL UNION ALL
SELECT 39, '�±�', '�ƽþ�', '����', '����', 1 FROM DUAL UNION ALL
SELECT 40, 'Ÿ��Ű��ź', '�ƽþ�', '�μ���', '������', 3 FROM DUAL UNION ALL
SELECT 41, '����ũ�޴Ͻ�ź', '�ƽþ�', '�ƽ��Ϲ�Ʈ', '����������', 3 FROM DUAL UNION ALL
SELECT 42, 'Ƣ��Ű��', '�ƽþ�', '��ī��', '������', 2 FROM DUAL UNION ALL
SELECT 43, '��Ű��ź', '�ƽþ�', '�̽��󸶹ٵ�', '������������', 3 FROM DUAL UNION ALL
SELECT 44, '�ȷ���Ÿ��', '�ƽþ�', '�󸻶�', '������', 3 FROM DUAL UNION ALL
SELECT 45, '�ʸ���', '�ƽþ�', '���Ҷ�', '������', 1 FROM DUAL UNION ALL
SELECT 46, '����', '������ī', '��ũ��', '������', 3 FROM DUAL UNION ALL
SELECT 47, '����', '������ī', '���긣��', '��������', 3 FROM DUAL UNION ALL
SELECT 48, '�����', '������ī', '����', '����', 3 FROM DUAL UNION ALL
SELECT 49, '���', '������ī', '�ڳ�ũ��', '��������', 3 FROM DUAL UNION ALL
SELECT 50, '��Ϻ���', '������ī', '����', '������', 3 FROM DUAL UNION ALL
SELECT 51, '���̺��', '������ī', '��Ʈ��ũ', '��������', 3 FROM DUAL UNION ALL
SELECT 52, '������', '������ī', '�ֹ�', '����', 3 FROM DUAL UNION ALL
SELECT 53, '����������', '������ī', '�ƺ���', '������', 3 FROM DUAL UNION ALL
SELECT 54, '������', '������ī', '�ϾƸ�', '������', 3 FROM DUAL UNION ALL
SELECT 55, '���̺�����', '������ī', '��κ��', '��������', 3 FROM DUAL UNION ALL
SELECT 56, '���ϴ�', '������ī', 'Ű����', '������', 3 FROM DUAL UNION ALL
SELECT 57, '�����', '������ī', 'Ʈ����', '������', 3 FROM DUAL UNION ALL
SELECT 58, '���ٰ���ī��', '������ī', '��Ÿ��������', '������������', 3 FROM DUAL UNION ALL
SELECT 59, '������', '������ī', '���ձ�', '������', 3 FROM DUAL UNION ALL
SELECT 60, '����', '������ī', '�ٸ���', '������', 3 FROM DUAL UNION ALL
SELECT 61, '�����', '������ī', '���Ʈ', '������', 3 FROM DUAL UNION ALL
SELECT 62, '�𸮼Ž�', '������ī', '��Ʈ���̽�', '����������', 3 FROM DUAL UNION ALL
SELECT 63, '��Ÿ��', '������ī', '���Ǽ�Ʈ', '��������', 3 FROM DUAL UNION ALL
SELECT 64, '�����ũ', '������ī', '��Ǫ��', '������', 3 FROM DUAL UNION ALL
SELECT 65, '�η��', '������ī', '���װ�', '������', 3 FROM DUAL UNION ALL
SELECT 66, '�θ�Ű���ļ�', '������ī', '�Ͱ��α�', '��������', 3 FROM DUAL UNION ALL
SELECT 67, '��������������', '������ī', '������', '������', 3 FROM DUAL UNION ALL
SELECT 68, '���װ�', '������ī', '��ī��', '������', 3 FROM DUAL UNION ALL
SELECT 69, '���̼�', '������ī', '���丮��', '��������', 3 FROM DUAL UNION ALL
SELECT 70, '�Ҹ�����', '������ī', '�𰡵�', '��������', 2 FROM DUAL UNION ALL
SELECT 71, '����', '������ī', '�ϸ���', '������', 3 FROM DUAL UNION ALL
SELECT 72, '�ÿ��󸮿�', '������ī', '����Ÿ��', '��������', 3 FROM DUAL UNION ALL
SELECT 73, '������', '������ī', '����', '����', 2 FROM DUAL UNION ALL
SELECT 74, '�Ӱ��', '������ī', '��ȴ�', '������', 3 FROM DUAL UNION ALL
SELECT 75, '����Ʈ����', '������ī', '�ƽ�����', '��������', 3 FROM DUAL UNION ALL
SELECT 76, '��Ƽ���Ǿ�', '������ī', '�Ƶ𽺾ƹٹ�', '������������', 3 FROM DUAL UNION ALL
SELECT 77, '�찣��', '������ī', 'į�ȶ�', '������', 3 FROM DUAL UNION ALL
SELECT 78, '����Ʈ', '������ī', 'ī�̷�', '������', 1 FROM DUAL UNION ALL
SELECT 79, '����', '������ī', '���ī', '������', 3 FROM DUAL UNION ALL
SELECT 80, '�������', '������ī', '����', '������', 3 FROM DUAL UNION ALL
SELECT 81, '���ٺ��', '������ī', '�϶�', '������', 3 FROM DUAL UNION ALL
SELECT 82, '����', '������ī', '���ڸ޳�', '��������', 3 FROM DUAL UNION ALL
SELECT 83, 'ī�޷�', '������ī', '�߿', '������', 3 FROM DUAL UNION ALL
SELECT 84, 'ī��������', '������ī', '�����̾�', '��������', 3 FROM DUAL UNION ALL
SELECT 85, '�ɳ�', '������ī', '���̷κ�', '��������', 3 FROM DUAL UNION ALL
SELECT 86, '�ڸ��', '������ī', '��δ�', '������', 3 FROM DUAL UNION ALL
SELECT 87, '��Ʈ��ξƸ�', '������ī', '�߹���ũ��', '����������', 3 FROM DUAL UNION ALL
SELECT 88, 'ź�ڴϾ�', '������ī', '������', '������', 3 FROM DUAL UNION ALL
SELECT 89, '���', '������ī', '�θ�', '����', 3 FROM DUAL UNION ALL
SELECT 90, '�׸���', '����', '���׳�', '������', 1 FROM DUAL UNION ALL
SELECT 91, '�״�����', '����', '�Ͻ��׸���', '����������', 2 FROM DUAL UNION ALL
SELECT 92, '�븣����', '����', '������', '������', 2 FROM DUAL UNION ALL
SELECT 93, '����ũ', '����', '�����ϰ�', '��������', 2 FROM DUAL UNION ALL
SELECT 94, '����', '����', '������', '������', 1 FROM DUAL UNION ALL
SELECT 95, '��Ʈ���', '����', '����', '����', 3 FROM DUAL UNION ALL
SELECT 96, '���þ�', '����', '��ũ��', '��������', 1 FROM DUAL UNION ALL
SELECT 97, '�縶�Ͼ�', '����', '������Ƽ', '����������', 2 FROM DUAL UNION ALL
SELECT 98, '����θ�ũ', '����', '����θ�ũ', '����������', 2 FROM DUAL UNION ALL
SELECT 99, '�����ƴϾ�', '����', '������', '������', 2 FROM DUAL UNION ALL
SELECT 100, '�����ٽ�Ÿ��', '����', '�ĵ���', '������', 3 FROM DUAL UNION ALL
SELECT 101, '����', '����', '����', '������', 2 FROM DUAL UNION ALL
SELECT 102, '���׳ױ׷�', '����', '�������', '����������', 3 FROM DUAL UNION ALL
SELECT 103, '������', '����', 'Ű�óʿ�', '��������', 3 FROM DUAL UNION ALL
SELECT 104, '��Ÿ', '����', '�߷�Ÿ', '������', 3 FROM DUAL UNION ALL
SELECT 105, '��Ƽĭ', '����', '��Ƽĭ', '������', 1 FROM DUAL UNION ALL
SELECT 106, '���⿡', '����', '���', '������', 1 FROM DUAL UNION ALL
SELECT 107, '����罺', '����', '�ν�ũ', '������', 2 FROM DUAL UNION ALL
SELECT 108, '�����Ͼ��츣ü���', '����', '��󿹺�', '��������', 3 FROM DUAL UNION ALL
SELECT 109, '�ϸ��ɵ��Ͼ�', '����', '������', '������', 3 FROM DUAL ;

commit;