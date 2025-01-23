-- 코드를 입력하세요
SELECT animal_id, name
FROM ANIMAL_INS
where name LIKE '%el%' AND ANIMAL_TYPE = 'DOG'
order by name