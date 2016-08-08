# ngnix

the note is based on:
1. [How nginx processes a request](http://nginx.org/en/docs/http/request_processing.html)

## Server

Virtual Server

### listen

specify port

### Server_name

To find which server should handle the request, when multiple server are
listening the same port.

If no match, nginx will use the first one as default or the one with `default`.

prevent no server_name request in \[1\].

## Location

###location search order:
1. 

### location modifiers
    * = exact the same
    * ~ case-sensitive reg
    * ~* Case-insensitive reg
    * ^~ stop reg, if the most specific match.

### proxy_set_header

set HTTP Header field

* [X-Real-IP & X-Forwarded-For](https://imququ.com/post/x-forwarded-for-header-in-http.html)

### proxy_pass

## Files path

* Linux

    ```
    # Absolute Path for nginx root dir
    location / {
        alias /var/www/static;
    }
    ```

* Windows

    ```
    # Relative Path for "nginx root" dir
    location / {
        alias html;
    }
    ```


## Test

```bash
#Test Configuration files
ngnix -t -c <path-to-ngnix.conf>
```
