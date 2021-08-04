drop table review;

CREATE TABLE REVIEW(
 REVIEW_NO NUMBER,
 REVIEW_TITLE VARCHAR2(50),
 REVIEW_WRITER VARCHAR2(20),
 REVIEW_DATE DATE DEFAULT SYSDATE,
 REVIEW_CONTENT VARCHAR2,
 REVIEW_STAR NUMBER,
 REVIEW_READCOUNT NUMBER DEFAULT 0,
 CONSTRAINT PK_REVIEW PRIMARY KEY (REVIEW_NO)
);

insert into review values(1, '�Ķ������ǰ� ����1�׷��� ����!', 'ȫ�浿', sysdate, 
'����1', 1 , 14);

insert into review values(2, '��ũ ���Ϲ���Ƽ ���', '�̼���', sysdate, 
'����2', 1 , 12);

insert into review values(3, '����Ű / ���� 1 ��Ű�׸� ����', '��Ӹ�', sysdate, 
'����3', 1 , 1);

insert into review values(4, '����1', 'ȫ�浿', sysdate, 
'����4', 1 , default);

insert into review values(5, '����2', '�̼���', sysdate, 
'����5', 1 , 1);

insert into review values(6, '����3', '��Ӹ�', sysdate, 
'����6', 1 , 13);

insert into review values(7, '����4', 'ȫ�浿', sysdate, 
'����7', 1 , default);

insert into review values(8, '����5', '�̼���', sysdate, 
'����8', 1 , 11);

insert into review values(9, '����6', '��Ӹ�', sysdate, 
'����9', 1 , default);

insert into review values(10, '����7', 'ȫ�浿', sysdate, 
'����0', 1 , 1);

insert into review values(11, '����8', '�̼���', sysdate, 
'����1', 1 , 10);

commit;
