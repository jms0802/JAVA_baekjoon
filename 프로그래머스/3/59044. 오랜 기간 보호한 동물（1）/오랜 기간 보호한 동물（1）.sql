-- 코드를 입력하세요
-- name, datetime
-- ins.datetime 가장 오래된 것 3개
SELECT ins.name, ins.datetime
FROM ANIMAL_INS AS ins
    LEFT JOIN ANIMAL_OUTS AS outs
    ON ins.animal_id = outs.animal_id
WHERE outs.animal_id IS NULL
ORDER BY ins.datetime
LIMIT 3
