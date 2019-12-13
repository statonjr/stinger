# shadow-electron-starter

ClojureScript + shadow-cljs + Electron + Reagent

## Up and running

### Dependencies

```
npm install electron -g
npm install shadow-cljs -g
npm install
```

### Development

Open two terminal windows. In the first terminal:

```
npm run dev
```

This command tells `shadow-cljs` to build `main` and `renderer` and to
watch those files for changes. To accomplish this, `shadow-cljs`
starts up a websocket server and a `nrepl` server.

In the second terminal:

```
electron .
```

This command boots up an Electron app and connects to the `nrepl`
server started by `shadow-cljs`.


## Release

```
npm run build
electron-packager . HelloWorld --platform=darwin --arch=x64 --version=1.4.13
```
