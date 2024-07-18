import re
from docx import Document
test_doc = Document('categoriemanzoni.docx')
docu_Regex = re.compile(r"\[.*\[")

tags = docu_Regex.findall(test_doc)
print(tags)
