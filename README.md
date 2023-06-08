# Kotlin Multiplatform Desktop and Web Template

This is a template for a multiplatform app for desktop and web

I originally took the code from[Jetsnack application](https://github.com/android/compose-samples/tree/main/Jetsnack) and deleted parts of it until it was more like a template

> To learn more about the Jetsnack application, visit the [README.md of the original project](https://github.com/android/compose-samples/tree/main/Jetsnack).

## Setup environment

### IDE

We recommend using [IntelliJ IDEA 2023.1 or later](https://www.jetbrains.com/idea/) to work with the project.
It has Kotlin/Wasm support out of the box.

### Code

You may want to ctrl+shift+F to search for instances of the word "template" and change it to more appropriate things for your project

### Browser (for Kotlin/Wasm target)

Almost all modern browsers already support WebAssembly 1.0.

To run applications built with Kotlin/Wasm in a browser, you need to enable an experimental [garbage collection feature](https://github.com/WebAssembly/gc):

**Chrome**:

For version 109:

  1. Run the application with the `--js-flags=--experimental-wasm-gc` command line argument.

For version 110 or later:

  1. Go to `chrome://flags/#enable-webassembly-garbage-collection` in your browser.
  2. Enable **WebAssembly Garbage Collection**.
  3. Relaunch your browser.

**Firefox Nightly**:

For version 112 or later:

1. Go to `about:config` in your browser.
2. Enable `javascript.options.wasm_function_references` and `javascript.options.wasm_gc` options.
3. Relaunch your browser.

**Edge**:

For version 109 or later:

1. Run the application with the `--js-flags=--experimental-wasm-gc` command line argument.

For more information see https://kotl.in/wasm_help/.

## Build and run

Check out the repository, navigate to the project folder, and use the following commands:

### Run Web version via Gradle

Run the following Gradle command in the terminal: `./gradlew :web:wasmRun`

Once the application starts, open the following URL in your browser: `http://localhost:8080`

### Run Desktop version via Gradle

Run the following Gradle command in the terminal: `./gradlew :desktop:run`

### Install Android application via Gradle

I did not ensure Android would work in this template in the case it does work then:<br>
Run the following Gradle command in the terminal: `./gradlew :android:installDebug`
