-- 코드를 작성해주세요
SELECT A.id, A.genotype, B.genotype as parent_genotype
FROM ECOLI_DATA A, ECOLI_DATA B
WHERE A.parent_id = B.id
AND A.genotype & B.genotype = B.genotype
ORDER BY ID