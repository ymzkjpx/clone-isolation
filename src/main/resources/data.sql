INSERT
INTO
    給与.従業員 (従業員ID)
VALUES
    (1)
  , (2)
  , (3);

INSERT INTO
    給与.就業時間 (就業時間ID ,従業員ID ,勤務日 ,開始日時 ,終了日時 ,休憩時間 ,深夜休憩時間 ,休日)
VALUES
    (1 ,1 ,DATEADD('DAY', -1, CURRENT_DATE) ,CONCAT(TO_CHAR(DATEADD('DAY', -1, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '9:00') ,CONCAT( TO_CHAR(DATEADD('DAY', -1, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '17:00') ,60 ,0 ,'労働日')
  , (1 ,2 ,DATEADD('DAY', -2, CURRENT_DATE) ,CONCAT(TO_CHAR(DATEADD('DAY', -2, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '9:00') ,CONCAT( TO_CHAR(DATEADD('DAY', -2, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '17:00') ,60 ,0 ,'労働日')
  , (1 ,3 ,DATEADD('DAY', -3, CURRENT_DATE) ,CONCAT(TO_CHAR(DATEADD('DAY', -3, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '9:00') ,CONCAT( TO_CHAR(DATEADD('DAY', -3, CURRENT_DATE), 'yyyy-MM-dd'), ' ', '17:00') ,60 ,0 ,'労働日')
;