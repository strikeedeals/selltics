This is the project for Selltics.
Framework Used : Play 1.2.4
Database Used : in memory DB for local and Postgress DB for Heroku


Instructions for checking out and deploying to Heroku




1) Download play framework 1.2.4 from www.playframework.org

2) unzip the framework to play-1.2.4 directory and call it PLAY_HOME

3) set your PATH env. variable point to PLAY_HOME

	export PATH=$PATH:$PLAY_HOME

4) checkout the code from github 

	git clone https://github.com/strikeedeals/selltics.git


	

While running the application in local please change the following configurations ::

1. Uncomment db=mem

Comment the following lines
db=${DATABASE_URL}
jpa.dialect=org.hibernate.dialect.PostgreSQLDialect
jpa.ddl=update

Revert the changes back while deploying it to Heroku .

2. Add the following line in application.conf file while running in local.

module.crud=${play.path}/modules/crud


** Comment this line while deploying to Heroku .






