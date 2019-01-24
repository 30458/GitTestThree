/*
H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree
$ git init
Initialized empty Git repository in C:/Users/H/Documents/eclipse/Workspace/GitTestThree/.git/

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git add .

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git commit -m "Git Three First Commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'H@LAPTOP-DOK5TEHQ.(none)')

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git config h1patel@icloud.com
error: invalid key: h1patel@icloud.com

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git config user.email h1patel@icloud.com

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git config user.name h1patel

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git commit -m "Git Three First Commit"
[master (root-commit) 9746d19] Git Three First Commit
 7 files changed, 89 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 .settings/org.eclipse.jdt.core.prefs
 create mode 100644 .settings/org.eclipse.m2e.core.prefs
 create mode 100644 pom.xml
 create mode 100644 src/test/java/GitThree.java
 create mode 100644 target/test-classes/GitThree.class

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git remote add origin https://github.com/30458/GitTestThree.git

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git remote -V
error: unknown switch `V'
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand


H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git remote -v
origin  https://github.com/30458/GitTestThree.git (fetch)
origin  https://github.com/30458/GitTestThree.git (push)

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master


H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git push origin master
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 8 threads
Compressing objects: 100% (10/10), done.
Writing objects: 100% (15/15), 2.16 KiB | 315.00 KiB/s, done.
Total 15 (delta 0), reused 0 (delta 0)
To https://github.com/30458/GitTestThree.git
 * [new branch]      master -> master

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   src/test/java/GitThree.java
        modified:   target/test-classes/GitThree.class

no changes added to commit (use "git add" and/or "git commit -a")

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git stash
Saved working directory and index state WIP on master: 9746d19 Git Three First Commit

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git status
On branch master
nothing to commit, working tree clean

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git stash pop
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   src/test/java/GitThree.java
        modified:   target/test-classes/GitThree.class

no changes added to commit (use "git add" and/or "git commit -a")
Dropped refs/stash@{0} (238265ff93afc51a1aa53a2e1ed918a12101c19d)

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   src/test/java/GitThree.java
        modified:   target/test-classes/GitThree.class

no changes added to commit (use "git add" and/or "git commit -a")

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git branch
* master

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git branch -b test1
error: unknown switch `b'
usage: git branch [<options>] [-r | -a] [--merged | --no-merged]
   or: git branch [<options>] [-l] [-f] <branch-name> [<start-point>]
   or: git branch [<options>] [-r] (-d | -D) <branch-name>...
   or: git branch [<options>] (-m | -M) [<old-branch>] <new-branch>
   or: git branch [<options>] (-c | -C) [<old-branch>] <new-branch>
   or: git branch [<options>] [-r | -a] [--points-at]
   or: git branch [<options>] [-r | -a] [--format]

Generic options
    -v, --verbose         show hash and subject, give twice for upstream branch
    -q, --quiet           suppress informational messages
    -t, --track           set up tracking mode (see git-pull(1))
    -u, --set-upstream-to <upstream>
                          change the upstream info
    --unset-upstream      Unset the upstream info
    --color[=<when>]      use colored output
    -r, --remotes         act on remote-tracking branches
    --contains <commit>   print only branches that contain the commit
    --no-contains <commit>
                          print only branches that don't contain the commit
    --abbrev[=<n>]        use <n> digits to display SHA-1s

Specific git-branch actions:
    -a, --all             list both remote-tracking and local branches
    -d, --delete          delete fully merged branch
    -D                    delete branch (even if not merged)
    -m, --move            move/rename a branch and its reflog
    -M                    move/rename a branch, even if target exists
    -c, --copy            copy a branch and its reflog
    -C                    copy a branch, even if target exists
    -l, --list            list branch names
    --create-reflog       create the branch's reflog
    --edit-description    edit the description for the branch
    -f, --force           force creation, move/rename, deletion
    --merged <commit>     print only branches that are merged
    --no-merged <commit>  print only branches that are not merged
    --column[=<style>]    list branches in columns
    --sort <key>          field name to sort on
    --points-at <object>  print only branches of the object
    -i, --ignore-case     sorting and filtering are case insensitive
    --format <format>     format to use for the output


H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git branch test1

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git branch
* master
  test1

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git checkout test1
Switched to branch 'test1'
M       src/test/java/GitThree.java
M       target/test-classes/GitThree.class

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test1)
$ git branch
  master
* test1

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test1)
$ git checkout -b test2
Switched to a new branch 'test2'
M       src/test/java/GitThree.java
M       target/test-classes/GitThree.class

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git branch
  master
  test1
* test2

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git status
On branch test2
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   src/test/java/GitThree.java
        modified:   target/test-classes/GitThree.class

no changes added to commit (use "git add" and/or "git commit -a")

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git add .

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git commit -m "commit from test2"
[test2 0c0ff03] commit from test2
 2 files changed, 1 insertion(+)

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git push
fatal: The current branch test2 has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin test2


H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git push origin test2
Logon failed, use ctrl+c to cancel basic credential prompt.
Username for 'https://github.com': h1patel
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (9/9), 715 bytes | 178.00 KiB/s, done.
Total 9 (delta 3), reused 0 (delta 0)
remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
remote:
remote: Create a pull request for 'test2' on GitHub by visiting:
remote:      https://github.com/30458/GitTestThree/pull/new/test2
remote:
To https://github.com/30458/GitTestThree.git
 * [new branch]      test2 -> test2

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git branch master
fatal: A branch named 'master' already exists.

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (test2)
$ git checkout master
Switched to branch 'master'

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git merge test2
Updating 9746d19..0c0ff03
Fast-forward
 src/test/java/GitThree.java        |   1 +
 target/test-classes/GitThree.class | Bin 559 -> 598 bytes
 2 files changed, 1 insertion(+)

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git status
On branch master
nothing to commit, working tree clean

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$ git push origin master
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/30458/GitTestThree.git
   9746d19..0c0ff03  master -> master

H@LAPTOP-DOK5TEHQ MINGW64 ~/Documents/eclipse/Workspace/GitTestThree (master)
$

*/

public class bashCommand {

}
