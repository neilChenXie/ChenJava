# Mybatis Tags

## Basic Tags

* CRUD: `<select>`, `<update>`, `<insert>` and `<delete>`
    * parameter: `id`, `resultMap`/`resultType`, `parameterType`
* Result: `<resultMap>`
    * parameter: `id`, `type`
    * optional parameter: `extends`

## More beautiful code

* `<sql>`
    * parameter: `id`
    * use: `<include id="">`
* `<trim>`
    * parameter: `prefix`, `prefixOverrides`, `suffix`, `suffixOverrides`
