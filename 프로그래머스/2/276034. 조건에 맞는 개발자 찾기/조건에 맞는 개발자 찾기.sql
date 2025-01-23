-- 코드를 작성해주세요
SELECT id, email, first_name, last_name
FROM DEVELOPERS
WHERE skill_code & (SELECT code from skillcodes where name = 'Python')
    OR skill_code & (SELECT code from skillcodes where name = 'C#')
ORDER BY id