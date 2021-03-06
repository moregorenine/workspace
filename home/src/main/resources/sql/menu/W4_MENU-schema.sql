--DROP TABLE IF EXISTS W4_MENU;

/* 메뉴 테이블 생성 */
CREATE TABLE IF NOT EXISTS W4_MENU
  (
     MENU_ID    VARCHAR(30) PRIMARY KEY
     , MENU_NM  VARCHAR(50) NOT NULL
     , GRP      BIGINT NOT NULL
     , SEQ      BIGINT NOT NULL
     , LEVEL    BIGINT NOT NULL
     , PARENT   VARCHAR(22)
     , URL      VARCHAR(20)
     , USE_YN   CHAR(1)
     , REG_USER VARCHAR(20) NOT NULL
     , REG_DT   DATE NOT NULL
     , UPT_USER VARCHAR(20) NOT NULL
     , UPT_DT   DATE NOT NULL
  );