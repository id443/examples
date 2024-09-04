http://имя_сервера/имя_базы/odata/standard.odata/Catalog_ДоговорыКонтрагентов?$select= Дата,ВидДоговора, хлВидДоговораФинансирования&$filter= year(Дата) gt 2018 and  year(Дата) lt 2025 and not IsFolder and not DeletionMark &$format=json
![image](https://github.com/user-attachments/assets/2fcb6999-05a0-49a7-8d07-1d7f241252f9)
