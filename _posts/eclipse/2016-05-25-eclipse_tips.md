---
layout: post
title: Eclipse Editor Checklist
date: 2016-05-25 10:30:15 +0800
category: Eclipse
tags: [checklist]
---

Useful Hot Key, blow is categorized by different working phase.

## Edit

### Vim compare

| eclipse | vim |
| ------- | --- |
| Ctrl + D | dd |
| Alt + Shift + A | block edit |
| Shift + Enter / Ctrl + Shift + Enter | 'o' / 'O' |
| Alt + up/down | dd+p/P, `:m n_lines` |
| Ctrl + Alt + up/down | yy+p/P |
| Ctrl + o | Taglist |
| Ctrl + l | line# + G/gg |
| Ctrl + q | g + ; |
| Ctrl + e | ：b $BufferName |

### Java Special

Ctrl+t: jump to supertype/subtype

### Specific

Getter/Setter  

> `source->generate Getter and Setter`

## Read

* `F3` go to definition, `Alt + <-` go back to previous visited file.
* `Ctrl + Shift + R` **file** level search
* `ctrl+alt+H` where it is called

### Debug

Step into:

> <F5>

Step over

> <F6>

Continue

> <F8>