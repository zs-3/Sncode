import struct

def generate_sample_nodes(filename="viewer/assets/test.nodes"):
    buf = bytearray()

    # Header
    buf.extend(struct.pack('>i', 400)) # version
    buf.extend(struct.pack('>i', 38))  # build
    buf.extend(struct.pack('>f', 1.0)) # scale
    buf.extend(struct.pack('>i', 0x00000000)) # color black

    def write_node(local_x, local_y, length, angle, child_count):
        buf.extend(struct.pack('>b', 0)) # limbType
        buf.extend(struct.pack('>i', 0)) # drawOrderIndex
        buf.extend(struct.pack('>b', 0)) # isStatic
        buf.extend(struct.pack('>b', 0)) # isStretchy
        buf.extend(struct.pack('>b', 0)) # isSmartStretch
        buf.extend(struct.pack('>b', 0)) # smartStretchDoNotApply
        buf.extend(struct.pack('>b', 0)) # useSegmentColor
        buf.extend(struct.pack('>b', 0)) # useCircleOutline
        buf.extend(struct.pack('>b', 0)) # circleIsHollow
        buf.extend(struct.pack('>b', 0)) # useGradient
        buf.extend(struct.pack('>b', 0)) # gradientReversed
        buf.extend(struct.pack('>h', 0)) # gradientMode
        buf.extend(struct.pack('>b', 0)) # useSegmentScale
        buf.extend(struct.pack('>f', local_x))
        buf.extend(struct.pack('>f', local_y))
        buf.extend(struct.pack('>f', 1.0)) # segmentScale
        buf.extend(struct.pack('>f', length)) # defaultLength
        buf.extend(struct.pack('>f', length)) # length
        buf.extend(struct.pack('>i', 12)) # defaultThickness
        buf.extend(struct.pack('>i', 12)) # thickness
        buf.extend(struct.pack('>i', 0)) # curveRadius
        buf.extend(struct.pack('>b', 0)) # segmentCurveCirculization
        buf.extend(struct.pack('>h', 1)) # segmentCurvePolyfillPrecision
        buf.extend(struct.pack('>b', 0)) # halfArc
        buf.extend(struct.pack('>h', 0)) # rightTriangleDirection
        buf.extend(struct.pack('>b', 0)) # triangleUpsideDown
        buf.extend(struct.pack('>f', 12.0)) # trapezoidThickness1
        buf.extend(struct.pack('>f', 12.0)) # trapezoidThickness2
        buf.extend(struct.pack('>f', 1.0)) # trapezoidRatio
        buf.extend(struct.pack('>b', 0)) # trapezoidAsymmetric
        buf.extend(struct.pack('>b', 0)) # isBranchLocked
        buf.extend(struct.pack('>b', 0)) # isAngleLocked
        buf.extend(struct.pack('>b', 0)) # isDragLocked
        buf.extend(struct.pack('>f', angle))
        buf.extend(struct.pack('>f', angle))
        buf.extend(struct.pack('>h', 3)) # numPolygonVertices
        buf.extend(struct.pack('>i', child_count))

    # Main node
    write_node(0.0, 0.0, 50.0, 0.0, 1)
    # Child limb
    write_node(0.0, 0.0, 60.0, 45.0, 0)

    # Post tree
    buf.extend(struct.pack('>i', 0)) # polyfillCount
    buf.extend(struct.pack('>i', 0)) # connectorCount

    with open(filename, 'wb') as f:
        f.write(buf)
    print(f"Generated {filename} ({len(buf)} bytes)")

generate_sample_nodes()
