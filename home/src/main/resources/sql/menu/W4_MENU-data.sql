/* 사용자 테이블 데이터 생성 */

INSERT INTO W4_MENU
            (MENU_ID
             , MENU_NM
             , GRP
             , SEQ
             , LEVEL
             , PARENT
             , URL
             , USE_YN
             , REG_USER
             , REG_DT
             , UPT_USER
             , UPT_DT)
VALUES      (#{menuId}
             , #{menuNm}
             , #{grp}
             , #{seq}
             , #{level}
             , #{parent}
             , #{url}
             , #{useYn}
             , #{regUser}
             , #{regDt}
             , #{uptUser}
             , #{uptDt});
             
select CURRENT_DATE() from dual;

delete from W4_MENU;

select CURRENT_TIME() from dual;

select CURRENT_TIMESTAMP() from dual;

SELECT A.*, A.MENU_ID AS ID, A.PARENT AS P_ID, A.MENU_NM AS NAME FROM W4_MENU A;

--mysql용 시퀀스 쿼리
INSERT INTO W4_SEQUENCES
(seq_name, seq_currval) VALUES
('W4_MENU_SEQ', 1);

UPDATE W4_SEQUENCES
SET seq_currval = :seqCurrval
WHERE seq_name = :seqName