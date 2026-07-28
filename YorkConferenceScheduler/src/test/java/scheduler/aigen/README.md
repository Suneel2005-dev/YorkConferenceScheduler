# AI-generated JUnit tests

The Java test classes use package `scheduler.aigen` because Java package names cannot contain a hyphen, while the files remain in the requested `scheduler/ai-gen` folder.

Run `mvn clean verify` from the project root. Open `target/site/jacoco/index.html` for the coverage report.

JaCoCo enforces at least 80% line coverage for independently testable domain classes. Swing screens, startup code, CSV-backed orchestration singletons, and manager/facade integration classes are excluded from the threshold because they need separate GUI/integration-test isolation.
