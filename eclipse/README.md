# Start

* [Setting](#setting)
* [Deploy](#deploy)
* [Careful](#odd_problem)


<a id="setting"></a>

## Setting

* Auto-complete

	```
	Preference->Java->Editor->Content Assist
    trigger:
    ._qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM
	```

* File Encoding

	```
	Preference->General->Workspace/Content Types
    set to UTF-8
	```

* Maven

	```
	Preference->Maven->User Settings(apache-maven-*.*.*/conf/settings.xml)
	settings.xml: <localRepotory>[Location for store *.jar]</localRepotory>
	```

	[Crucial Setting](https://github.com/neilChenXie/java_dev/blob/master/eclipse/MavenProject.md)

* JDK

    ```
    Preference->Java->User Installed JREs(/jdk*.*.*_*)
    ```

* Package Explore

    ```
    window->show view->other->package explore
    ```

* Code Style

    ```
    window->preference->Java->Code style->code template->comment->Types/Methods
    Types:
    /**
    * @describe
    *
    * @author ${user}
    * @date ${date}
    */

    Method:
    /**
    * @describe
    *
    * @author ${user}
    * @date ${date}
    * @param
    * @return
    */
    ```


<a id="deploy"></a>

## Tips

Useful Hot Key, blow is categorized by different working phase.

### Edit

* Ctrl + D: cut one line
* Alt + Shift + A: block edit
* Shift + Enter / Ctrl + Shift + Enter: vim 'o' / 'O'
* Alt + up/down: move line.
* Ctrl + Alt + up/down: copy line

### Read

* `F3` go to definition, `Alt + <-` go back to previous visited file.
* `Ctrl + Shift + R` **file** level search

### Debug

## Deploy

Server Application

### Jetty

* Install `Jetty eclipse plug-in`

    ```
    Run->Run Configurations->Jetty Webapp->New->project & port number
    ```

### Tomcat

* When deploy to **Tomcat**, need set **Deployment Assembly**.

	(project) properties->Deployment Assembly->Add->Java Build Path Entries, add all to the project


<a id="odd_problem"></a>

## Careful

* **Delete** the **\*.dtd** in **web.xml**

* **Don't** import **Existing Maven Project**, import **Existing Project**.
