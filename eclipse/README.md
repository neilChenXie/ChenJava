# Start

* [Setting](#setting)
* **[Deploy](#deploy)**
* [Plugin](#plugin)
* [Careful](#odd_problem)


<a id="setting"></a>

## Setting

* Autocomplete

	```
	Preference->Java->Editor->Content Assist
	```

* File Encoding

	```
	Preference->General->Workspace/Content Types
	```

* Maven

	```
	Preference->Maven->User Settings(apache-maven-*.*.*/conf/settings.xml)
	settings.xml: <localRepotory>[Location for store *.jar]</localRepotory>
	```

	[Crucial Setting](https://github.com/neilChenXie/java_dev/blob/master/eclipse/MavenProject.md)

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

## Deploy

* When deploy to **Tomcat**, need set **Deployment Assembly**.

	(project) properties->Deployment Assembly->Add->Java Build Path Entries, add all to the project

<a id="plugin"></a>

## Plugin

* Rinzo(xml)/vrapper(vim)

<a id="odd_problem"></a>

## Careful

* **Delete** the **\*.dtd** in **web.xml**

* **Don't** import **Existing Maven Project**, import **Existing Project**.
