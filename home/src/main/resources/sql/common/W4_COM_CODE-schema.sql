--DROP TABLE IF EXISTS W4_COM_CODE;

/* 공통코드 테이블 생성 */
CREATE TABLE IF NOT EXISTS W4_COM_CODE
  (
     CODE_ID      VARCHAR(30) NOT NULL PRIMARY KEY
     , CODE_CODE  VARCHAR(50) NOT NULL
     , CODE_DESC  VARCHAR(500) NOT NULL
     , CODE_KOR   VARCHAR(50) NOT NULL
     , CODE_EN    VARCHAR(50) NOT NULL
     , CODE_CH    VARCHAR(50) NOT NULL
     , PARENT     VARCHAR(22)
     , SEQ        INT NOT NULL
     , REG_USER   VARCHAR(20) NOT NULL
     , REG_DT     DATE NOT NULL
     , UPT_USER   VARCHAR(20) NOT NULL
     , UPT_DT     DATE NOT NULL
  );