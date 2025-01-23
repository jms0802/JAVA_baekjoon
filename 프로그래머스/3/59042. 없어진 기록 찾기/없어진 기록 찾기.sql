-- ANIMAL_ID ASC, NAME
SELECT outs.animal_id, outs.name
FROM ANIMAL_OUTS AS outs
    LEFT JOIN ANIMAL_INS AS ins 
    ON outs.animal_id = INS.animal_id
WHERE ins.animal_id is NULL