drop table qna;

CREATE TABLE qna(
 QnA_NO NUMBER,
 QnA_TITLE VARCHAR2(60),
 QnA_WRITER VARCHAR2(20),
 QnA_DATE DATE DEFAULT SYSDATE,
 QnA_CONTENT VARCHAR2(2048),
 QnA_AVAILABLE NUMBER,
 QnA_READCOUNT NUMBER DEFAULT 0,
 CONSTRAINT PK_QnA PRIMARY KEY (QnA_NO)
);

insert into qna values(1, '���� �Ź� ������ �ʹ� �ñ��ؿ�!', '������', sysdate, 
'��������', 1 , 22);

insert into qna values(2, '����Ű ��ũ �� ��ǰ ���� ������ �������?', '������', sysdate, 
'��������', 1 , 8);

insert into qna values(3, '������ ��︮�� ���� ��õ���ּ���', '������', sysdate, 
'��������', 1 , 4);

insert into qna values(4, '����1 �ø�� ���������� �ߺ��� �г���?', '������', sysdate, 
'��������', 1 , 57);

insert into qna values(5, '��ũ ���Ϲ���Ƽ ���', '������', sysdate, 
'��������', 1 , 8);

insert into qna values(6, '����1 �Թ� ��õ', '������', sysdate, 
'��������', 1 , 51);

insert into qna values(7, '����', '������', sysdate, 
'��������', 1 , 39);

insert into qna values(8, '����', '������', sysdate, 
'��������', 1 , 24);

insert into qna values(9, '����', '������', sysdate, 
'��������', 1 , 1);

insert into qna values(10, '����', '������', sysdate, 
'��������', 1 , 51);

insert into qna values(11, '����', '������', sysdate, 
'��������', 1 , 21);

insert into qna values(12, '����', '������', sysdate, 
'��������', 1 , 19);

commit;
