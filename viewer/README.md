# Stick Nodes Web Renderer / Viewer

A lightweight, standalone Java + libGDX + TeaVM web application that parses and renders real Stick Nodes `.nodes` stickfigures directly in modern web browsers using WebGL.

---

## Technical Stack & Configuration

- **libGDX**: `1.12.1`
- **gdx-teavm**: `1.1.0` (`com.github.xpenatan.gdx-teavm:backend-teavm:1.1.0`)
- **TeaVM**: `0.11.0`
- **Java**: `11`
- **Gradle**: `8.8`

*Note on TeaVM versions*: TeaVM `0.11.0` is used for high compatibility with `gdx-teavm 1.1.0`.

---

## Project Structure

```
viewer/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── core/
│   ├── build.gradle
│   └── src/main/java/com/sticknodes/viewer/
│       ├── Stickfigure.java          (Stick Nodes figure & parser)
│       ├── StickNode.java            (Stick Node data structure)
│       ├── SNShapeRenderer.java      (WebGL ImmediateModeRenderer20 shape renderer)
│       └── ViewerLauncher.java       (libGDX ApplicationListener & input/camera handler)
├── teavm/
│   ├── build.gradle
│   └── src/main/java/com/sticknodes/viewer/teavm/
│       └── TeaVMLauncher.java        (TeaVM web application entry point & JS interop bridge)
└── assets/
    └── test.nodes                    (Embedded test fixture)
```

---

## Build & Run Commands

### Build JavaScript Application

From the repository root, run:

```bash
gradle -p viewer :teavm:buildJavaScript
```

The compiled output (HTML, `app.js`, assets) is generated in:

```
viewer/teavm/build/dist/webapp/
```

### Run Local Development Server

```bash
gradle -p viewer :teavm:run
```

---

## Features & Usage

1. **`.nodes` File Loading**:
   - Supports opening `.nodes` files directly via `<input type="file" accept=".nodes">`.
   - Parses binary Stick Nodes format (versions up to 425 / build 38+).
2. **Real Stick Nodes Rendering**:
   - Node hierarchy, parent-child transformations, colors, thickness, segment lengths, circles, and draw order.
3. **Stickfigure Interaction**:
   - **Selection**: Click/tap node joints.
   - **Limb Rotation**: Drag limb joints to rotate around parent joint.
   - **Stretchy Nodes**: Stretchy nodes scale length dynamically on drag.
   - **Parent Dragging**: Dragging main/parent nodes moves the figure hierarchy.
4. **Camera Controls**:
   - **Zoom**: Mouse wheel scrolling / pinch.
   - **Pan**: Click and drag background.
   - **Reset**: "Reset View" button.

---

## Embedding Modes

### 1. Standalone Application
Open `viewer/teavm/build/dist/webapp/index.html` directly in any web server or modern browser.

### 2. Iframe Embedding
Embed the viewer inside an `<iframe>` container:

```html
<iframe src="path/to/viewer/index.html" style="width: 800px; height: 600px; border: none;"></iframe>
```

### 3. Script Embedding (JS Mount API)
Include `app.js` and use `window.StickNodesViewer`:

```html
<div id="canvas-container" style="width: 600px; height: 400px;"></div>
<script src="app.js"></script>
<script>
  // Mount / initialize options
  const viewer = window.StickNodesViewer.mount('#canvas-container');

  // Load .nodes ArrayBuffer / Uint8Array bytes on demand
  fetch('myfigure.nodes')
    .then(r => r.arrayBuffer())
    .then(buf => viewer.load(new Uint8Array(buf)));
</script>
```

---

## Ported Source Inventory & Stubs

| Ported Component | Origin Path in `sticknodes-java/` | Notes / Adaptations |
|---|---|---|
| `Stickfigure` | `org/fortheloss/sticknodes/stickfigure/Stickfigure.java` | Cleaned `.nodes` binary reader & hierarchy tree updater |
| `StickNode` | `org/fortheloss/sticknodes/stickfigure/StickNode.java` | Extracted node data model, limb types, transforms & drag rotation/stretch logic |
| `SNShapeRenderer` | `org/fortheloss/sticknodes/SNShapeRenderer.java` | WebGL `ImmediateModeRenderer20` quad/triangle batching without Android/desktop dependencies |
| `NodeDigger` | `org/fortheloss/sticknodes/NodeDigger.java` | Simplified spatial hit testing for WebGL viewport |

---

## Verification & Pre-Commit Steps

- `./gradlew -p viewer :teavm:buildJavaScript` compiles successfully with 0 errors.
- Web app output verified in `viewer/teavm/build/dist/webapp/`.
