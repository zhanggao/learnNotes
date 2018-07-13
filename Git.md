# Git 常用命令
git checkout branchName // 切换到某个分支
git checkout -- fileName.xx // 放弃对某个文件的修改
git branch branchName // 新建分支
git checkout -b branchName // = git branch branchName + git checkout branchName

git branch -d branchName // 删除本地分支
git push origin --delete branchName // 删除远程分支

git branch -m branchNameA branchNameB // 分支重命名
git push origin [本地分支名]:[远程分支名] // 将本地分支推送到远程并建立跟踪
git push origin [远程分支名] // 将本地分支推送到远程，没有建立跟踪

git branch --set-upstream master origin/next // 指定本地的master分支追踪的origin/next分支

git diff HEAD -- fileName.x // 查看工作区和版本库里最新版本的区别


git stash // 缓存暂存区的修改+git跟踪的但为添加到暂存区的修改，不会缓存新文件和gitignore的文件
git stash -a || git stash --all // 缓存所有修改
git stash save "message"
git stash pop // 将换成堆栈中的第一个stash删除并应用到当前的工作目录下
git stash apply // 将第一个stash应用到当前工作目录，但不删除,后面可以跟名字
git stash list
git stash drop // 移除stash，后面可以跟名字
git stash show // 跟名字查看指定stash的diff
git stash show -p || git stash show --patch // 查看指定stash的全部diff
git stash branch testchanges // 基于储藏工作时的提交创建一个新的分支


git pull // = git fetch + git merge FETCH_HEAD。取回远程某个分支的更新，再与指定的本地分支合并

git pull origin master // 将远程的maser pull到本地当前分支
git pull <远程主机名> <远程分支名>:<本地分支名>
git pull origin next:master // 取回origin主机的next分支，与本地的master分支合并，如果远程分支(next)要与当前的本地分支合并，则某号后面的可省略
// = git fetch origin + git merge origin/next