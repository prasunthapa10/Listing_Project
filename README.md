# Listing_Project 
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>E;
'E' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\LAB>E:

E:\>dir
 Volume in drive E is PRASUN
 Volume Serial Number is B0CF-9DF4

 Directory of E:\

10/09/2015  10:22 AM    <DIR>          .metadata
10/09/2015  10:22 AM    <DIR>          Prasun
10/26/2015  10:05 AM        12,563,873 introduction-to-java-programming-comprehe
nsive-version-10th-edition.zip
10/26/2015  10:13 AM    <DIR>          Fun_With_Functions
10/26/2015  10:42 AM             2,706 Comment_Line_md.txt
11/02/2015  10:30 AM    <DIR>          Listing_Project
               2 File(s)     12,566,579 bytes
               4 Dir(s)  15,591,997,440 bytes free

E:\>cd Listing_Project

E:\Listing_Project>dir
 Volume in drive E is PRASUN
 Volume Serial Number is B0CF-9DF4

 Directory of E:\Listing_Project

11/02/2015  10:30 AM    <DIR>          .
11/02/2015  10:30 AM    <DIR>          ..
11/02/2015  10:30 AM               391 .project
11/02/2015  10:30 AM    <DIR>          src
11/02/2015  10:30 AM    <DIR>          bin
11/02/2015  10:30 AM               232 .classpath
               2 File(s)            623 bytes
               4 Dir(s)  15,591,997,440 bytes free

E:\Listing_Project>echo # Listing_Project >> README.md

E:\Listing_Project>git init
Initialized empty Git repository in E:/Listing_Project/.git/

E:\Listing_Project>git add .

E:\Listing_Project>git commit -m "First commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'LAB@STF126K-60099PC.(none)')

E:\Listing_Project>git config user.name "Prasun Thapa"

E:\Listing_Project>git config user.email thapap@student.swosu.edu

E:\Listing_Project>git commit -m "First commit"
[master (root-commit) c2369bf] First commit
 5 files changed, 43 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 README.md
 create mode 100644 bin/Listing_Project.class
 create mode 100644 src/Listing_Project.java

E:\Listing_Project>git remote add origin https://github.com/prasunthapa10/Listin
g_Project.git

E:\Listing_Project>git push -u origin master
Username for 'https://github.com': prasunthapa10
Password for 'https://prasunthapa10@github.com':
Counting objects: 9, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (9/9), 1.21 KiB | 0 bytes/s, done.
Total 9 (delta 0), reused 0 (delta 0)
To https://github.com/prasunthapa10/Listing_Project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\Listing_Project>git checkout -b dev
Switched to a new branch 'dev'

E:\Listing_Project>git push -u origin dev
Username for 'https://github.com': prasunthapa10
Password for 'https://prasunthapa10@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/prasunthapa10/Listing_Project.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

E:\Listing_Project>