-- animal_id, name
-- DATETIME ASC
-- 보호시작일 < 입양일
SELECT ins.animal_id, ins.name
FROM ANIMAL_INS as ins
    JOIN ANIMAL_OUTS as outs
    ON ins.animal_id = outs.animal_id
WHERE ins.datetime > outs.datetime
ORDER BY ins.datetime