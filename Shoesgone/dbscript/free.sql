drop table free;

CREATE TABLE FREE(
 FREE_NO NUMBER,
 FREE_TITLE VARCHAR2(50),
 FREE_WRITER VARCHAR2(20),
 FREE_DATE DATE DEFAULT SYSDATE,
 FREE_CONTENT VARCHAR2(2048),
 FREE_LIKE NUMBER,
 FREE_READCOUNT NUMBER DEFAULT 0,
 CONSTRAINT PK_FREE PRIMARY KEY (FREE_NO)
);

insert into free values(1, '����', 'ȫ�浿', sysdate, 
'��ũ ��ο� ���� ��Ż!', 1 , 722);

insert into free values(2, '�Խ���', '�̼���', sysdate, 
'Ư������ �� ���� ���̽�.jpg (feat.����Ǯ)', 1 , 87);

insert into free values(3, '�׽�Ʈ', '��Ӹ�', sysdate, 
'��������', 1 , 42);

insert into free values(4, '����1', 'ȫ�浿', sysdate, 
'��ī�� ��ũ �ο� ��ο�', 1 , 157);

insert into free values(5, '����2', '�̼���', sysdate, 
'��������', 1 , 81);

insert into free values(6, '����3', '��Ӹ�', sysdate, 
'��ũ�� �ô밡 ����', 1 , 501);

insert into free values(7, '����4', 'ȫ�浿', sysdate, 
'����Ű / ��ũ �ο� ���, ��ī�� ���� ���� / ���ڰ�Ȩ', 1 , 139);

insert into free values(8, '����5', '�̼���', sysdate, 
'���Ͽ� ����� �����ٷ�', 1 , 124);

insert into free values(9, '����6', '��Ӹ�', sysdate, 
'����Ű / ��ũ�ο� �𽺷��� 3�÷� ��� ���� / ��Ȩ', 1 , 91);

insert into free values(10, '����7', 'ȫ�浿', sysdate, 
'�Ź� ���� ��ȹ�� ����!', 1 , 531);

insert into free values(11, '����8', '�̼���', sysdate, 
'�׽�Ʈ ������', 1 , 121);

insert into free values(12, '����9', '��Ӹ�', sysdate, 
'[ī�ó� ��ũ �ο� ����] �¶��� ����', 1 , 129);

commit;