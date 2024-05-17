# TinfInfoUtils

This repository contains utilites for our upcoming programming exam.

## Features

- [x] *`FileUtils`*: Utilities for reading and writing files.
- [ ] *`ArrayUtils`*: Utilities for working with arrays.
- [ ] *`ConsoleUtils`*: Utilities for printing and reading to and from the console.

## How to get started

Every release contains a zip file with the source code. To use the utils just copy the source code into your exam project.

All utils are dependency free.

## How to contribute

Open a new Issue with a feature you want to implement. Fork the project, make your changes and open a pull request linking to your issue. Make sure your feature does not need any external dependencies and is covered by unit tests.

## Automatic versioning

This repository is using [thenativeweb/get-next-version](https://github.com/thenativeweb/get-next-version) to automatically release new versions when commiting on `main`. Therefore it is important to mark commits with a corresponding prefix:
- `chore:` – used for maintenance, does not result in a new version
- `fix:` – used for bug fixes, results in a new patch version (e.g. from `1.2.3` to `1.2.4`)
- `feat:` – used for introducing new features, results in a new minor version (e.g. from `1.2.3` to `1.3.0`)
- `feat!:` – used for breaking changes, results in a new major version (e.g. from `1.2.3` to `2.0.0`)


