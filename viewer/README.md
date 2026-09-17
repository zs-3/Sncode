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

### 1. SNShapeRenderer Method Port Checklist

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

### 2. StickNode Field & Method Port Checklist

| Original Method / Field | Ported Status | Notes |
|---|---|---|
| All 8 Limb Types (`LIMB_ROUNDED_SEGMENT`=0, `LIMB_SEGMENT`=1, `LIMB_CIRCLE`=2, `LIMB_TRIANGLE`=3, `LIMB_FILLED_CIRCLE`=4, `LIMB_ELLIPSE`=5, `LIMB_TRAPEZOID`=6, `LIMB_POLYGON`=7) | **Yes** | All 8 node types supported |
| `drawLimb(renderer, x, y, scale, isSelected)` | **Yes** | Dispatches to `SNShapeRenderer` drawing methods for all 8 limb types |
| `drawLimbCulled(renderer, x, y, scale)` | **Yes** | Culled variant rendering |
| `drawLimbAA(renderer, x, y, scale)` | **Yes** | Anti-aliased multi-pass growth rendering with standard 0.14 growth factor and pass iteration |
| `drawPolyfill(renderer, x, y, scale)` | **Yes** | Polyfill triangulation rendering |
| `drawPolyfillAA(renderer, x, y, scale)` | **Yes** | Polyfill anti-aliased jitter rendering |
| `getCurveNodes()` | **Yes** | `cbrt` curve subdivision formula calculation |
| `recalculatePolyfillTriangles()` | **Yes** | Polyfill triangulation recalculation |
| `updatePosition(stickfigure)` | **Yes** | World transform update helper |
| `writeData(out)` | **Yes** | Serialization stub method |
| `getGlobalX()` / `getGlobalY()` / `getGlobalAngle()` | **Yes** | World transform accessors |
| `getLocalX()` / `getLocalY()` | **Yes** | Local coordinate accessors |
| `getDisplayColor()` / `getEffectiveThickness()` | **Yes** | Effective styling accessors |

### 3. Stickfigure Method Port Checklist

| Original Method | Ported Status | Notes |
|---|---|---|
| `from_bytes(byte[])` / `to_bytes()` | **Yes** | Serialization & deserialization helpers |
| `readData(DataInputStream)` | **Yes** | Full version/build binary parser |
| `drawLimbs(renderer, batch, filterBundle, x, y, scale, isSelected, selectedNode, isCulled, isAA)` | **Yes** | Orchestrates rendering of all nodes in draw order |
| `renderStickfigure(renderer, x, y, scale)` | **Yes** | Private dispatcher helper |
| `applyFilters()` | **Yes** | Post-processing filter stub |
| `addRootNode()` / `addNode(...)` | **Yes** | Hierarchy node builder methods |
| `addPolyfill(...)` / `addConnector(...)` | **Yes** | Model element builders |
| `getChildren(...)` / `getParent(...)` / `getSiblings(...)` | **Yes** | Hierarchy tree query accessors |
| `get_all_nodes()` / `all_draw_indices()` / `missing_draw_indices()` | **Yes** | Index and node array accessors |
| `POLYFILLS` / `CONNECTORS` / `JOINS` | **Yes** | Model lists retained and updated |

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
