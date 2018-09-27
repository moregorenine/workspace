--시퀀스 관리 테이블 for MySql
CREATE TABLE IF NOT EXISTS W4_SEQUENCES (
SEQ_NM VARCHAR(20) NOT NULL,
SEQ_CURRVAL BIGINT UNSIGNED NOT NULL,
REG_USER   VARCHAR(20) NOT NULL,
REG_DT     DATE NOT NULL,
UPT_USER   VARCHAR(20) NOT NULL,
UPT_DT     DATE NOT NULL,  PRIMARY KEY(SEQ_NM)
) COMMENT='시퀀스 마스터' COLLATE='utf8_bin';

--시퀀스 증가 함수 생성
DELIMITER ;;
CREATE FUNCTION nextval(p_seq_name CHAR(20) CHARSET UTF8) RETURNS BIGINT UNSIGNED MODIFIES SQL DATA SQL SECURITY INVOKER DETERMINISTIC BEGIN
INSERT INTO W4_SEQUENCES SET SEQ_NAME= IFNULL(p_seq_name,'DEFAULT'), SEQ_CURRVAL=(@v_current_value:=1) ON DUPLICATE KEY
UPDATE SEQ_CURRVAL=(@v_current_value:=seq_currval+1); RETURN @v_current_value; END ;;

--시퀀스 현재값 조회 함수 생성
DELIMITER ;;
DROP FUNCTION IF EXISTS currval;
CREATE FUNCTION currval(p_seq_name VARCHAR(20) CHARSET UTF8) RETURNS BIGINT BEGIN DECLARE result BIGINT DEFAULT 0;
SELECT SEQ_CURRVAL INTO result
FROM W4_SEQUENCES where SEQ_NAME = p_seq_name; RETURN @result; END ;;
