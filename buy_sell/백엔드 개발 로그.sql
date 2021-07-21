-- ��ü ��ǰ ��ȸ(�ֽ� ��� ��)
select * from item_reg_sta
order by item_reg_sta_no desc;

-- ��ü ��ǰ ��ȸ + ���� ��ȸ
select rownum rnum, item_reg_sta_no, user_no, user_id, item_no, shoes_size, reg_date, price
from (select * from item_reg_sta
      order by item_reg_sta_no desc);

-- ����¡ ó���� ����
select * 
from (select rownum rnum, item_reg_sta_no, user_no, user_id, item_no, shoes_size, reg_date, price
      from (select * from item_reg_sta
      order by item_reg_sta_no desc))
where rnum >= 1 and rnum <= 10;

-- ��� ��ǰ ���� ó���� ������
create sequence reg_seq
start with 1
INCREMENT BY 1
NOMAXVALUE
NOCYCLE
NOCACHE;

-- item_reg_sta�� �ݼ��ּ� �÷� �߰�
alter table item_reg_sta
add (
    address varchar2(1000) not null
);

commit;

-- orders ���̺� �߰� ��û���� �÷� �߰�
alter table orders
add (
    etc varchar2(3000)
);

commit;