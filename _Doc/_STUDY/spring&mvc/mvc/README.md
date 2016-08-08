#SpringMVC

## Controller

@RequestMapping(value = "/users/{userId}", method = RequestMethod.POST)
public String getUserProfile(@PathVariable String userId)

* URL redirect

```java
return "redirect:/users/";
```

## Session
