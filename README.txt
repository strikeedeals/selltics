This is the project for Selltics.
Framework Used : Play 1.2.1
Database Used : in memory DB


Instructions for checking out and deploying to appengine.

use GAE-module 1.1 for deploying to appengine, the same is mentioned in dependencies.yml

- play-> gae 1.1


1) Download play framework 1.2.1 from www.playframework.org

2) unzip the framework to play-1.2.1 directory and call it PLAY_HOME

3) set your PATH env. variable point to PLAY_HOME

	export PATH=$PATH:$PLAY_HOME

4) checkout the code from github 

	git clone https://github.com/strikeedeals/selltics.git


5) install the play-gae modules in your local.	

	$ play install gae-1.1

6) Download google-appengine-sdk 1.4 in your local and extract and call it GAE_HOME.

7) go to Project home directory and run

	play gae:deploy 

Note : GAE_HOME env. variable should be set and should point to appengine home directory.	


Note : the above command will deploy your application to the application identifier specified in 

PROJECT_HOME/war/WEB-INF/appengine-web.xml, change the appid accordingly.








