# Git Commands

* **To Crete a repo and push to remote**
    *   git init 
    *   git add . 
    *   git commit -m "First commit"
    *   git branch -M main 
    *   git add remote origin https://github.com/sachinsarvesh/JAVA_PRACTISE.git
    *   git push -u origin main 

- **To remove IntelliJ files**
  * add .idea/ and *.iml in .gitignore
  * git rm -r --cached .idea 
  * git rm --cached POST_AUTOMATION.iml
  * git add . 
  * git commit -m "Remove IntelliJ files from repo"
  * git push
