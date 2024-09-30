# Fix append writing not working

`FileUtils.write(path, content, true)` throwing a StackOverflow exception is not fixed.
