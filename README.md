# surefire-1851-demo

_This repository is now archived because the bug has been fixed._

Minimal repository to demonstrate bug [SUREFIRE-1851](https://issues.apache.org/jira/browse/SUREFIRE-1851). This shows that throwing odd errors (for example, if they are mocked) can break the Maven test runner, resulting in false positive results.

Simply clone and run `mvn test`. You can also see the result of this in [GitHub Actions](https://github.com/domdomegg/surefire-1851-demo/actions).

`ExampleTest.aFailingTest()` *should* fail, which *should* cause the `mvn test` command to fail. However, due to a bug (tracked by SUREFIRE-1851) this failing test breaks the runner, and Maven reports that all tests were successful 😬
