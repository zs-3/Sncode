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
│       ├── StickNode.java            (Stick Node data structure & polyfill triangulation)
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

## Detailed Method-Level Port Checklist & Status Report

### 1. SNShapeRenderer Method Port Report

| Method Signature | Ported Status | Implementation Detail |
|---|---|---|
| `mySegment(x1, y1, x2, y2, thickness, cosAngle, sinAngle, useGradient, c1, c2)` | **Yes** | Quad tessellation via `ImmediateModeRenderer20` with per-vertex color & gradient interpolation |
| `mySegmentCurved(x1, y1, x2, y2, thickness, radius, c1, c2)` | **Yes** | Curved quadratic Bézier-style segment subdivision based on `cbrt(radius)` formula |
| `myRoundedSegment(...)` | **Yes** | Quad body + end-cap circles at joint endpoints |
| `myTrapezoid(...)` | **Yes** | Asymmetric quad tessellation with `t1` and `t2` start/end thickness |
| `myRoundedTrapezoid(...)` | **Yes** | Asymmetric trapezoid quad + start/end joint end-caps |
| `myTrapezoidCurved(...)` | **Yes** | Curved trapezoid segment subdivision |
| `circle(cx, cy, radius, segments, c1, c2)` | **Yes** | Radial triangle fan |
| `circleOutline(cx, cy, outerRadius, innerRadius, segments, color)` | **Yes** | Concentric ring triangle strip |
| `halfCircle(cx, cy, radius, segments, startAngle, c1, c2)` | **Yes** | Semi-circle radial fan |
| `ellipse(cx, cy, rx, ry, segments, rotation, c1, c2)` | **Yes** | Transformed ellipse radial fan |
| `halfEllipse(cx, cy, rx, ry, segments, rotation, c1, c2)` | **Yes** | Transformed semi-ellipse radial fan |
| `polygon(cx, cy, radius, sides, angle, c1, c2)` | **Yes** | N-sided regular polygon fan |
| `triangle(x1, y1, x2, y2, x3, y3, c1, c2)` | **Yes** | Single triangle |
| `triangleLine(...)` | **Yes** | 3-line segment outline quad batching |
| `rectLine(x1, y1, x2, y2, thickness, color)` | **Yes** | Line segment quad with explicit thickness |

### 2. StickNode Method & Field Port Report

| Field / Method | Ported Status | Implementation Detail |
|---|---|---|
| All 8 Limb Types (`LIMB_ROUNDED_SEGMENT`=0, `LIMB_SEGMENT`=1, `LIMB_CIRCLE`=2, `LIMB_TRIANGLE`=3, `LIMB_FILLED_CIRCLE`=4, `LIMB_ELLIPSE`=5, `LIMB_TRAPEZOID`=6, `LIMB_POLYGON`=7) | **Yes** | Dispatches to corresponding `SNShapeRenderer` methods in `drawLimb()` |
| `drawLimb(...)` | **Yes** | Main dispatch for all 8 limb geometry types |
| `drawLimbCulled(...)` | **Yes** | Culled variant dispatch |
| `drawLimbAA(...)` | **Yes** | Multi-pass anti-aliasing with thickness growth (`i * 0.18666667f`) and pass iteration |
| `drawPolyfill(...)` | **Yes** | Triangulates polynodes via `EarClippingTriangulator` and renders filled triangles |
| `drawPolyfillAA(...)` | **Yes** | 5-point sub-pixel jitter pass rendering |
| `getCurveNodes()` | **Yes** | Calculates sub-point coordinates along curve using `cbrt` count formula |
| `recalculatePolyfillTriangles()` | **Yes** | Computes ear-clipping index array from child polynode positions |
| `readData(version, build, in)` | **Yes** | Full binary option parser for all 30+ node options |
| `updateTransforms(...)` | **Yes** | Recursive world-space transform calculations |

### 3. Stickfigure Method & Field Port Report

| Method / Collection | Ported Status | Implementation Detail |
|---|---|---|
| `from_bytes(byte[])` / `to_bytes()` | **Yes** | Binary stream serialization & deserialization |
| `readData(in)` | **Yes** | Full version/build reader parsing nodes, polyfills, and connectors |
| `POLYFILLS` | **Yes** | Retains anchor index, color, useColor flag, and polynode index array (`PolyfillData`) |
| `CONNECTORS` | **Yes** | Retains start and end node index references (`ConnectorData`) |
| `drawLimbs(...)` | **Yes** | Renders draw-ordered nodes, polyfills, and connectors |
| `renderStickfigure(...)` | **Yes** | Draw-limbs dispatcher helper |

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
  const viewer = window.StickNodesViewer.mount('#canvas-container');
  fetch('myfigure.nodes')
    .then(r => r.arrayBuffer())
    .then(buf => viewer.load(new Uint8Array(buf)));
</script>
```
