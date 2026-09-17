# Stick Nodes Web Renderer / Viewer

A lightweight, standalone Java + libGDX + TeaVM web application that parses and renders real Stick Nodes `.nodes` stickfigures directly in modern web browsers using WebGL.

---

## Technical Stack & Configuration

- **libGDX**: `1.12.1`
- **gdx-teavm**: `1.1.0` (`com.github.xpenatan.gdx-teavm:backend-teavm:1.1.0`)
- **TeaVM**: `0.11.0`
- **Java**: `11`
- **Gradle**: `8.8`

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

## Method-Level Port Checklist & Status Report

### 1. SNShapeRenderer Method Port Report

| Original Method | Ported Status | Notes |
|---|---|---|
| `mySegment(x1, y1, x2, y2, thickness, cosAngle, sinAngle, useGradient, c1, c2)` | **Yes** | Renders quad geometry using `ImmediateModeRenderer20` |
| `mySegmentCurved(...)` | **Yes** | Renders segment with curved joint offsets |
| `myRoundedSegment(...)` | **Yes** | Renders rounded end-caps and quad body |
| `myTrapezoid(...)` | **Yes** | Tessellates trapezoid quad with top/bottom thickness |
| `myRoundedTrapezoid(...)` | **Yes** | Tessellates trapezoid quad with rounded joint caps |
| `myTrapezoidCurved(...)` | **Yes** | Tessellates curved trapezoid segments |
| `circle(cx, cy, radius, segments, c1, c2)` | **Yes** | Radial triangle fan tessellation |
| `circleOutline(...)` | **Yes** | Concentric ring triangle strip tessellation |
| `halfCircle(...)` | **Yes** | Semi-circle radial triangle fan |
| `ellipse(...)` | **Yes** | Scaled ellipse radial fan |
| `halfEllipse(...)` | **Yes** | Scaled semi-ellipse radial fan |
| `polygon(...)` | **Yes** | Regular polygon N-sided fan |
| `triangle(...)` | **Yes** | 3-vertex single triangle |
| `triangleLine(...)` | **Yes** | Triangle outline wireframe |
| `rectLine(...)` | **Yes** | Thick line segment quad |

### 2. StickNode Field & Method Port Report

| Original Method / Field | Ported Status | Notes |
|---|---|---|
| `LIMB_SEGMENT / LIMB_CIRCLE / LIMB_CURVE / LIMB_POLY` | **Yes** | Node limb types ported |
| `drawLimb(...)` / `drawLimbCulled(...)` | **Yes** | Dispatches to `SNShapeRenderer` drawing methods |
| `drawLimbAA(...)` | **Yes** | Anti-aliased multi-pass growth rendering |
| `drawPolyfill(...)` | **Yes** | Polyfill triangulation rendering |
| `readData(in)` | **Yes** | Parses all node options, colors, curves, and children |
| `updateTransforms(parentX, parentY, parentAngle)` | **Yes** | Updates world position & hierarchy orientation |
| `node_type` / `is_static` / `is_stretchy` / `is_smart_stretch` | **Yes** | Node options preserved in `StickNode` |
| `trapezoidThickness1` / `trapezoidThickness2` / `trapezoidRatio` | **Yes** | Trapezoid geometry properties preserved |
| `curveRadius` / `segmentCurveCirculization` | **Yes** | Curve geometry properties preserved |

### 3. Stickfigure Method Port Report

| Original Method | Ported Status | Notes |
|---|---|---|
| `readData(DataInputStream)` | **Yes** | Full version/build binary parser |
| `collectDrawOrder(...)` | **Yes** | Populates draw-ordered node list |
| `updateTransforms(...)` | **Yes** | Recursively computes world transforms |
| `drawLimbs(...)` | **Yes** | Orchestrates rendering of all nodes in draw order |

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
