# Toolbox

<img width="355"  alt="Screenshot 2024-04-09 at 00 14 00" src="https://github.com/matteokosina/java-toolbox/assets/74454734/5a380b1b-5f20-499b-8dc9-9a481addec81" style="display: block; margin-left: auto; margin-right: auto;">


> This repository contains utilites for our upcoming programming exam.

## Features

- [x] *`FileUtils`*: Utilities for reading and writing files.
- [x] *`ArrayUtils`*: Utilities for working with arrays.
- [x] *`ConsoleUtils`*: Utilities for printing and reading to and from the console.
- [ ] *`SwingUtils`*: Pre made components and utilities for working with swing.

## How to use the utilities

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
