--  시퀀스 생성
  CREATE SEQUENCE W4_MENU_SEQ;
  
--  시퀀스 삭제
  DROP SEQUENCE W4_MENU_SEQ;
  
--  증가 시퀀스
  SELECT NEXTVAL('W4_MENU_SEQ');
  
--  현재 시퀀스 
  SELECT CURRVAL('W4_MENU_SEQ');
  
--  시퀀스 초기화
  ALTER SEQUENCE W4_MENU_SEQ RESTART WITH 1;